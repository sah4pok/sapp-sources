// Title   :  Non-standard dff converter for Gmax/KAMS
// Version :  "2010.09.21"
// Author  :  ponz (http://ponz2009.web.fc2.com/)
// Build   :
//   Borland C++ 5.5.1 for Win32 Copyright (c) 1993, 2000 Borland
//   option "-WC -6 -O2 -w- -AT -pc -H- -k -b"
//   on BCC Developer v1.2.21

#include <windows>
#include <stdio>
#include <iostream>
#include <fstream>
#include <string>
#include <ctype>
#include <vector>
#include <sstream>
using namespace std;

void get_conv_name(char* fnsrc,char* fnconv);
void wait_key(void);
int check_atoi(char* str,int min,int max);
void test01(ifstream& fpin,ofstream& fpout);

// --- constant ---
const char VERSION[] = "2010.09.21";
const int RW_VER_SA     = 0x1803FFFF; //SA
const int RW_VER_VCW    = 0x1003FFFF; //VC WORLD
const int RW_VER_VCV    = 0x0C02FFFF; //VC VEHICLE/HUMAN
const int RW_VER_GTA3   = 0x0800FFFF; //GTA3?
const int RW_VER_UNK    = 0x0003FFFF; //GTA3?
const int RW_VER[] = {RW_VER_SA,RW_VER_VCW,RW_VER_VCV,RW_VER_GTA3,RW_VER_UNK};
const int RW_VER_SIZE = sizeof(RW_VER)/sizeof(int);
const short GEOMETRY_TRISTRIP  = 1   ;
const short GEOMETRY_POSITIONS = 2   ;
const short GEOMETRY_UVTEXTURE = 4   ;
const short GEOMETRY_PRELIT    = 8   ;
const short GEOMETRY_NORMALS   = 16  ;
const short GEOMETRY_LIGHT     = 32  ;
const short GEOMETRY_MODULATE  = 64  ;
const short GEOMETRY_ETEXTURE  = 128 ;
const int BUFF_SIZE = 512;
const int UVSEL_FLG = 0;

// --- class : rw_header ---
class rw_header{
public:
	int sec_id;
	int size;
	int ver_id;
	int init;
	int pos;
	int next;
	void read(ifstream& fp,int ref_id);
	int check(ifstream& fp);
	void read_data(ifstream& fp);
	void write(ofstream& fp);
	void write(stringstream& ss);
	void write_data(ofstream& fp);
	void write_data(stringstream& ss);
	void add_section(rw_header& head);
	void add_remain(ifstream& fp);
	void add_data(ifstream& fp,int nchar);
	stringstream data;
};

// --- class : rw_header ---
void rw_header::read(ifstream& fp,int ref_id = -1){
	// read
	init = fp.tellg();
	fp.read((char*)&sec_id,4);
	fp.read((char*)&size,4);
	fp.read((char*)&ver_id,4);
	pos = fp.tellg();
	next = pos + size;
	
	// check section ID
	int sec_chk_flg = 0;
	if(-1 != ref_id){
		if(ref_id != sec_id){
			sec_chk_flg = 1;
		}
	}
	
	// check version ID
	int ver_chk_flg = 1;
	for(int i=0;i<RW_VER_SIZE;i++){
		if(RW_VER[i] == ver_id){
			ver_chk_flg = 0;
			break;
		}
	}
	
	// error message & Exit
	if(sec_chk_flg){
		fprintf(stderr,"\n------------\n");
		fprintf(stderr,"Error       : Unexpected Section ID (0x%X)\n",sec_id);
		fprintf(stderr,"expected ID : 0x%X\n",ref_id);
	}
	if(ver_chk_flg){
		fprintf(stderr,"\n------------\n");
		fprintf(stderr,"Error       : Wrong RW_VER ID (0x%X)\n",ver_id);
	}
	if(sec_chk_flg || ver_chk_flg){
		fprintf(stderr,"address     : 0x%X\n",init);
		fprintf(stderr,"------------\n");
		fprintf(stderr,"conversion : aborted.\n");
		wait_key();
		exit(1);
	}
}

int rw_header::check(ifstream& fp){
	int cur_pos = fp.tellg();
	fp.seekg(0,ios::end);
	int sizeof_file = fp.tellg();
	fp.seekg(cur_pos,ios::beg);
	if(cur_pos + 12 > sizeof_file){
		return 1;
	}
	// check version ID
	fp.seekg(8,ios::cur);
	fp.read((char*)&ver_id,4);
	for(int i=0;i<RW_VER_SIZE;i++){
		if(RW_VER[i] == ver_id){
			fp.seekg(cur_pos,ios::beg);
			return 0;
		}
	}
	fp.seekg(cur_pos,ios::beg);
	return 1;
}

void rw_header::read_data(ifstream& fp){
	char* buff;
	int sizeof_buff = size;
	buff = (char*)malloc(sizeof_buff);
	fp.read(buff,sizeof_buff);
	data.write(buff,sizeof_buff);
	free(buff);
}

void rw_header::write(ofstream& fp){
	size = data.str().length();
	fp.write((char*)&sec_id,4);
	fp.write((char*)&size,4);
	fp.write((char*)&ver_id,4);
}

void rw_header::write(stringstream& ss){
	size = data.str().length();
	ss.write((char*)&sec_id,4);
	ss.write((char*)&size,4);
	ss.write((char*)&ver_id,4);
}

void rw_header::write_data(ofstream& fp){
	char* buff;
	int sizeof_buff = data.str().length();
	write(fp);
	if(sizeof_buff){
		buff = (char*)malloc(sizeof_buff);
		data.seekg(0);
		data.read(buff,sizeof_buff);
		fp.write(buff,sizeof_buff);
		free(buff);
	}
}

void rw_header::write_data(stringstream& ss){
	char* buff;
	int sizeof_buff = data.str().length();
	write(ss);
	if(sizeof_buff){
		buff = (char*)malloc(sizeof_buff);
		data.seekg(0);
		data.read(buff,sizeof_buff);
		ss.write(buff,sizeof_buff);
		free(buff);
	}
}

void rw_header::add_section(rw_header& head){
	head.write_data(data);
}

void rw_header::add_remain(ifstream& fp){
	int sizeof_buff = next - fp.tellg();
	if(0 < sizeof_buff){
		char* buff;
		buff = (char*)malloc(sizeof_buff);
		fp.read(buff,sizeof_buff);
		data.write(buff,sizeof_buff);
		free(buff);
	}
}

void rw_header::add_data(ifstream& fp,int nchar){
	char* buff;
	int sizeof_buff = nchar;
	buff = (char*)malloc(sizeof_buff);
	fp.read(buff,sizeof_buff);
	data.write(buff,sizeof_buff);
	free(buff);
}

// --- functions ---
void get_conv_name(char* fnsrc,char* fnconv){
	if(strcmp(".dff",strrchr(fnsrc,'.'))){
		fprintf(stderr,"------------\n");
		fprintf(stderr,"Error : invalid filename.\n");
		fprintf(stderr,"        source file must have [.dff] extension.\n");
		fprintf(stderr,"------------\n");
		wait_key();
		exit(1);
	}
	int base_length = strlen(fnsrc) - strlen(strrchr(fnsrc,'.'));
	strncpy(fnconv,fnsrc,base_length);
	strcat(fnconv,"_z2g");
	strcat(fnconv,strrchr(fnsrc,'.'));
}

void wait_key(void){
	char tmp;
	fprintf(stderr,"\n*** enter any key to exit. ***\n");
	gets(&tmp);
}

int check_atoi(char* str,int min,int max){
	for(int i = 0 ; strlen(str) > i ; i ++){
		if(!isdigit(str[i])){
			return 1;
		}
	}
	int tmp_int = atoi(str);
	if(min > tmp_int || max < tmp_int){
		return 2;
	}
	return 0;
}

void test01(ifstream& fpin,ofstream& fpout){
	int time_init = GetTickCount();
	int sizeof_srcfile;
	int nclump = 0;
	int ngeom_skipuv = 0;
	int ngeom_fixvert = 0;
	int nullbytes = 0;
	
	fpin.seekg(0,ios::end);
	sizeof_srcfile = fpin.tellg();
	fpin.seekg(0,ios::beg);
	
	while(sizeof_srcfile > fpin.tellg()){
		//clump
		rw_header head_clump;
		if(head_clump.check(fpin)){
			nullbytes = sizeof_srcfile - fpin.tellg();
			break;
		}
		head_clump.read(fpin);
		if(0x10 != head_clump.sec_id){
			head_clump.add_remain(fpin);
			head_clump.write_data(fpout);
			continue;
		}
		
		if(!nclump) fprintf(stderr,"RW version : 0x%08X\n\n",head_clump.ver_id);
		fprintf(stderr,"---\nClump #%d\n",nclump);
		int nobj;
		int ngeometry;
		
		// Clump > Struct
		rw_header head_struct;
		head_struct.read(fpin,0x01);
		head_struct.read_data(fpin);
		// read object count
		head_struct.data.seekg(0);
		head_struct.data.read((char*)&nobj,4);
		
		// Clump > Frame List
		rw_header head_framelist;
		head_framelist.read(fpin,0x0E);
		head_framelist.read_data(fpin);
		
		// Clump > Geometry List
		rw_header head_geometrylist;
		head_geometrylist.read(fpin,0x1A);
		
		// Clump > Geometry List > Struct
		rw_header head_geometrylist_struct;
		head_geometrylist_struct.read(fpin,0x01);
		head_geometrylist_struct.read_data(fpin);
		// read geometry count
		head_geometrylist_struct.data.seekg(0);
		head_geometrylist_struct.data.read((char*)&ngeometry,4);
		fprintf(stderr,"Geometry Count : %d\n",ngeometry);
		head_geometrylist.add_section(head_geometrylist_struct);
		
		// Clump > Geometry List > Geometry
		for(int igeometry = 0 ; ngeometry > igeometry ; igeometry ++){
			fprintf(stderr,"Geometry #%02d\n",igeometry);
			// Geometry
			rw_header head_geometry;
			head_geometry.read(fpin,0x0F);
			
			// Geometry > Struct
			struct geometry_info{
				short flags;
				short nuvmap;
				int nface;
				int nvert;
				int nframe;
			}geometry_info;
			rw_header head_geometry_struct;
			head_geometry_struct.read(fpin,0x01);
			// read struct data
			fpin.read((char*)&geometry_info,sizeof(geometry_info));
			int tmp_nuvmap = geometry_info.nuvmap;
			if(0 < geometry_info.nuvmap){
				geometry_info.nuvmap = 1;
			}
			head_geometry_struct.data.write((char*)&geometry_info,sizeof(geometry_info));
			if((RW_VER_VCW == head_geometry_struct.ver_id)||(RW_VER_VCV == head_geometry_struct.ver_id)||(RW_VER_GTA3 == head_geometry_struct.ver_id)){ // for VC dff
				head_geometry_struct.add_data(fpin,4 * 3);  //  float x3 : Ambient color, Diffuse color, Specular color
			}
			
			// read VCOLs
			if(geometry_info.flags & GEOMETRY_PRELIT){ // VCOL flag
				head_geometry_struct.add_data(fpin,geometry_info.nvert * 4 * 1);  //  nVert x RGBA x CHAR
			}
			// read UVs
			if(geometry_info.flags & GEOMETRY_UVTEXTURE){ // UV flag
				int tmp_iuvmap = 0;
				if(1 < tmp_nuvmap){
					char tmpc[BUFF_SIZE];
					fprintf(stderr,"  UVmap count  : %d\n"  ,tmp_nuvmap);
					if(UVSEL_FLG){
						int time_tmp = GetTickCount() - time_init;
						fprintf(stderr,"  Select Import UV map #[0 - %d]: ",tmp_nuvmap - 1);
						while(true){
							gets(tmpc);
							if(!check_atoi(tmpc,0,tmp_nuvmap -1)){
								tmp_iuvmap = atoi(tmpc);
								break;
							}
							fprintf(stderr,"  %s : Invalid Input.\n",tmpc);
							fprintf(stderr,"  ReEnter number [0 - %d]: ",tmp_nuvmap - 1);
						}
						time_init = GetTickCount() - time_tmp;
					}
					ngeom_skipuv ++ ;
				}
				for(int iuvmap = 0 ; tmp_nuvmap > iuvmap ; iuvmap ++){
					if(tmp_iuvmap == iuvmap){
						head_geometry_struct.add_data(fpin,geometry_info.nvert * 2 * 4);  //  nVert x UV x SHORT
					}else{
						fpin.ignore(geometry_info.nvert * 2 * 4);  //  nVert x UV x SHORT
						fprintf(stderr,"    [Skip] Multi UV MAP #%02d.\n",iuvmap);
					}
				}
			}
			// read Faces
			short* faces;
			int sizeof_faces = geometry_info.nface * 4 * 2;  //  nFace x (3verts + material ID) x SHORT
			faces = (short*)malloc(sizeof_faces);
			fpin.read((char*)faces,sizeof_faces);
			head_geometry_struct.data.write((char*)faces,sizeof_faces);
			
			// read Remain (Struct)
			head_geometry_struct.add_remain(fpin);
			head_geometry.add_section(head_geometry_struct);
			
			// Geometry > Material List
			rw_header head_geometry_materiallist;
			head_geometry_materiallist.read(fpin,0x08);
			head_geometry_materiallist.read_data(fpin);
			head_geometry.add_section(head_geometry_materiallist);
			
			// Geometry > Extension
			rw_header head_geometry_extension;
			head_geometry_extension.read(fpin,0x03);
			while(head_geometry_extension.next > fpin.tellg()){
				rw_header head_tmp;
				head_tmp.read(fpin);
				if(0x50E == head_tmp.sec_id){
					// Geometry > Extension > Bin Mesh PLG
					struct binmesh_info{
						int facetype;
						int nsplit;
						int nindex;
					}binmesh_info;
					fpin.read((char*)&binmesh_info,sizeof(binmesh_info));
					head_tmp.data.write((char*)&binmesh_info,sizeof(binmesh_info));
					for(int isplit = 0 ; binmesh_info.nsplit > isplit ; isplit ++){
						// read material split
						struct split_info{
							int nindex;
							int material;
						}split_info;
						fpin.read((char*)&split_info,sizeof(split_info));
						head_tmp.data.write((char*)&split_info,sizeof(split_info));
						// check vertex order at first face
						int sp_face[3];
						int tmp_pos = fpin.tellg();
						fpin.read((char*)sp_face,sizeof(sp_face));
						fpin.seekg(tmp_pos);
						int face_order[6][3] = {{0,1,2},{0,2,1},{1,2,0},{1,0,2},{2,0,1},{2,1,0}};
						int order_id = -1;
						for(int id = 0 ; 6 > id ; id ++){
							for(int iface = 0 ; geometry_info.nface > iface ; iface++){
								if(sp_face[face_order[id][0]] == (int)faces[iface*4 + 1]){
									if(sp_face[face_order[id][1]] == (int)faces[iface*4 + 0]){
										if(sp_face[face_order[id][2]] == (int)faces[iface*4 + 3]){
											order_id = id;
											break;
										}
									}
								}
							}
						}
						if(-1 == order_id){
							fprintf(stderr,"\n------------\n");
							fprintf(stderr,"Error       : cant fix vertex-order of split faces.\n");
							fprintf(stderr,"------------\n");
							wait_key();
							exit(1);
						}
						if(!isplit){
							if(order_id){
								fprintf(stderr,"  vertex order : %d %d %d\n",face_order[order_id][0],face_order[order_id][1],face_order[order_id][2]);
								fprintf(stderr,"    [Fix] Vertex Order for Material Split.\n");
								ngeom_fixvert ++ ;
							}
						}
						for(int iface = 0 ; (int)(split_info.nindex/3) > iface ; iface++){
							int reorder_face[3];
							fpin.read((char*)sp_face,sizeof(sp_face));
							for(int i = 0 ; 3 > i ; i ++){
								reorder_face[i] = sp_face[face_order[order_id][i]];
							}
							head_tmp.data.write((char*)reorder_face,sizeof(reorder_face));
						}
					}
					head_tmp.add_remain(fpin);
				}else{
					head_tmp.read_data(fpin);
				}
				head_geometry_extension.add_section(head_tmp);
			}
			head_geometry.add_section(head_geometry_extension);
			free(faces);
			
			// add Geometry to Geometry List
			head_geometry.add_remain(fpin);
			head_geometrylist.add_section(head_geometry);
		}
		// write Clump
		head_clump.add_section(head_struct);
		head_clump.add_section(head_framelist);
		head_clump.add_section(head_geometrylist);
		head_clump.add_remain(fpin);
		head_clump.write_data(fpout);
		nclump ++ ;
	}
	if(!ngeom_skipuv && !ngeom_fixvert && !nullbytes){
		fprintf(stderr,"\n---\nconversion : done with no changes.\n");
		fprintf(stderr,"  this source file seems to be a standard dff.\n");
	}else{
		fprintf(stderr,"\n---\nconversion : done successfully.\n");
		if(ngeom_skipuv){
			fprintf(stderr,"  removed multiple UV maps : in %d Geometries.\n",ngeom_skipuv);
		}
		if(ngeom_fixvert){
			fprintf(stderr,"  fixed vertex orders      : in %d Geometries.\n",ngeom_fixvert);
		}
		if(nullbytes){
			fprintf(stderr,"  deleted NULL data        : %d bytes.\n",nullbytes);
		}
	}
	fprintf(stderr,    "\n---\n");
	if(sizeof_srcfile > int(fpout.tellp())){
		fprintf(stderr,"File-Size redused : %d to %d bytes\n",sizeof_srcfile,int(fpout.tellp()));
	}
	fprintf(stderr,    "Elapsed Time      : %d msec\n",GetTickCount() - time_init);
	return;
}

// --- main ---
int main(int argc,char** argv){
	char fnin[BUFF_SIZE]  = "";
	char fnout[BUFF_SIZE] = "";
	int end_of_fpin;
	fprintf(stderr,"*** Non-standard dff converter for Gmax/Kams (build:%s) ***\n",VERSION);
	
	if(2>argc){
		fprintf(stderr,"Usage : Drag-and-Drop source dff file into the icon of this program.\n");
		wait_key();
		return 1;
	}
	if(2<argc){
		fprintf(stderr,"------------\n");
		fprintf(stderr,"Error : too many files were dropped.\n");
		fprintf(stderr,"        only one dff file can be accepted\n");
		fprintf(stderr,"------------\n");
		wait_key();
		return 1;
	}
	
	strcpy(fnin,argv[1]);
	ifstream fpin(fnin,ios::binary|ios::in);
	if(!fpin){
		fprintf(stderr,"------------\n");
		fprintf(stderr,"Error : can't open : %s\n",fnin);
		fprintf(stderr,"------------\n");
		return 1;
	}
	fprintf(stderr,"source file : %s\n",fnin);
	fpin.seekg(0,ios::end);
	end_of_fpin = fpin.tellg();
	fpin.seekg(0,ios::beg);
	
	get_conv_name(fnin,fnout);
	ofstream fpout(fnout,ios::binary|ios::out);
	if(!fpout){
		fprintf(stderr,"------------\n");
		fprintf(stderr,"Error : can't open : %s\n",fnout);
		fprintf(stderr,"------------\n");
		fprintf(stderr,"conversion aborted.\n");
		return 1;
	}
	fprintf(stderr,"target file : %s\n\n",fnout);
	
	test01(fpin,fpout);
	
	fpin.close();
	fpout.close();
	wait_key();
	return 0;
}



