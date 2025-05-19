MISSION_START

SCRIPT_NAME initil3


// *************************************VARIABLES********************************************
/*
VAR_INT gate_slide_loop skip_flag mansion_blip remove_hycobuy_pickup remove_ochebuy_pickup view_of_ocean_view
VAR_INT controlmode lawyer_blip1 mansion_save_pickup remove_mansion_pickup remove_lnkvbuy_pickup
VAR_INT mission_trigger_wait_time switch_off_starfish_gates	car_help_played	buddycar remove_taxiwar_save_pickup
VAR_INT breakout_timer breakout_timer_start breakout_diff played_reminder_help remove_washbuy_pickup
VAR_INT audio_is_loading audio_has_loaded print_help_for_jacking remove_nbmnbuy_pickup remove_strpbuy_pickup
VAR_INT first_two_samples second_two_samples third_two_samples forth_two_samples fifth_two_samples sixth_two_samples
VAR_INT print_save_game_help print_first_help print_help_for_radar drive_by_help bike_help remove_boatbuy_pickup remove_icecream_pickup
VAR_INT import_car_generator1_created import_car_generator2_created import_car_generator3_created import_car_generator4_created
VAR_INT flag_kickstart_passed_1stime buddy_blip_active buddy_blip skip_timer1_acive	colar_cuffs_blip remove_skumbuy_pickup
VAR_INT button_pressed serg_mission3_start baron_blip1 fastest_boat fastest_boat_blip goto_hotel_contact_blip
VAR_INT remove_carshow_pickup carshow_save_pickup remove_vcptbuy_pickup taxiwar_save_pickup
VAR_INT remove_printers_pickup remove_porn_pickup remove_malibu_pickup printers_pickup porn_pickup malibu_pickup
VAR_INT star_gun3 star_gun4	star_health3 star_arm1 cokerun_trigger stop_in_marker
*/

//VAR_INT flag_intro  timer_intro_start intro_time_lapsed	timer_intro_now

VAR_INT buddys_lambo police_chopper	Storm_Warning camera_help_played
VAR_INT deluxo_prize_car_gen sabretur_prize_car_gen	sandking_prize_car_gen Hotring_prize_car_gen created_final_shirt

VAR_INT south_beach_hunter  
hunter_created = 0
/*
// ********* 4x4 VARIABLES ***************************************************************************

VAR_INT player_4x4 wanted_4x4
VAR_INT counter_4x4_pickups 
VAR_INT timer_4x4_secs	
VAR_INT checkpoint_time_limit
VAR_INT flag_intro_jump
VAR_INT pcj_minutes
VAR_INT pcj_reward
VAR_INT flag_timer timer_4x4 timer_bonus 

VAR_INT flag_truck_1 flag_truck_2 truck_1 truck_2 truck_driver1 truck_driver2
VAR_INT blip_1 blip_2 blip_3
VAR_INT blip_4 blip_5 blip_6
VAR_INT blip_7 blip_8 blip_9
VAR_INT blip_10 blip_11 blip_12
VAR_INT blip_13 blip_14 blip_15
VAR_INT blip_16 blip_17 blip_18
VAR_INT blip_19 blip_20 blip_21 
VAR_INT blip_22 blip_23	blip_24

VAR_INT flag_blip_1 flag_blip_2 flag_blip_3 flag_blip_4 
VAR_INT flag_blip_5 flag_blip_6 flag_blip_7 flag_blip_8 
VAR_INT flag_blip_9 flag_blip_10 flag_blip_11 flag_blip_12
VAR_INT flag_blip_13 flag_blip_14 flag_blip_15 flag_blip_16
VAR_INT flag_blip_17 flag_blip_18 flag_blip_19 flag_blip_20
VAR_INT flag_blip_21 flag_blip_22 flag_blip_23 flag_blip_24

VAR_FLOAT x_1 y_1 z_1 
VAR_FLOAT x_2 y_2 z_2 
VAR_FLOAT x_3 y_3 z_3 
VAR_FLOAT x_4 y_4 z_4 
VAR_FLOAT x_5 y_5 z_5 
VAR_FLOAT x_6 y_6 z_6 
VAR_FLOAT x_7 y_7 z_7 
VAR_FLOAT x_8 y_8 z_8 
VAR_FLOAT x_9 y_9 z_9 
VAR_FLOAT x_10 y_10 z_10 
VAR_FLOAT x_11 y_11 z_11 
VAR_FLOAT x_12 y_12 z_12 
VAR_FLOAT x_13 y_13 z_13 
VAR_FLOAT x_14 y_14 z_14 
VAR_FLOAT x_15 y_15 z_15 
VAR_FLOAT x_16 y_16 z_16 
VAR_FLOAT x_17 y_17 z_17 
VAR_FLOAT x_18 y_18 z_18 
VAR_FLOAT x_19 y_19 z_19 
VAR_FLOAT x_20 y_20 z_20 
VAR_FLOAT x_21 y_21 z_21 
VAR_FLOAT x_22 y_22 z_22 
VAR_FLOAT x_23 y_23 z_23 
VAR_FLOAT x_24 y_24 z_24 
VAR_FLOAT cam_4x4_X 
VAR_FLOAT cam_4x4_y 
VAR_FLOAT cam_4x4_z
*/

VAR_INT counter_laps counter_gates
VAR_INT time_lapsed time_now time_start
VAR_INT time_off_bike time_bailed time_left_to_find_bike time_left_to_find_bike_secs
VAR_INT record_bmx_1
VAR_INT counter_bmx_1_reward bmx_1_reward
VAR_INT flag_bmx1_print	bmx1_minutes
VAR_INT kwayzee_biker1 kwayzee_biker2 kwayzee_biker3
VAR_INT kwayzee_moto1 kwayzee_moto2 kwayzee_moto3
VAR_INT flag_kwayzee1 flag_kwayzee2 flag_kwayzee3
VAR_INT var_kwayzee var_moto var_flag

VAR_INT record_bmx_2
VAR_INT flag_bmx2_print
VAR_INT counter_bmx_2_reward bmx_2_reward
VAR_INT bmx2_minutes

VAR_INT irrate_bloke blokes_car

/*
VAR_FLOAT one_sixteenth one_thirtysecond one_sixtyfourth   
VAR_FLOAT player_x player_y player_z ground_z
VAR_FLOAT clothes_shopX clothes_shopY clothes_shopZ game_percentage

VAR_INT wasted_help wanted_help  police_bribe_help wanted_star_help  // flag names

VAR_INT flag_played_rock3_before // Used so player can skip the first part of the mission if they have played it once.

VAR_INT player_had_reload_award // Used to give the player the fast reload award once he has got a score over 50 in the range oddjob

VAR_INT flag_played_bank2_before // Used for the player to be able to skip the text bit

remove_carshow_pickup = 0
*/

//MI1**************************************************
//VAR_INT flag_phil_mission_counter phil_contact_blip

//missions
VAR_FLOAT hotelX hotelY hotelZ
VAR_FLOAT lawyerX lawyerY lawyerZ
VAR_FLOAT generalX generalY generalZ
VAR_FLOAT baronX baronY baronZ
VAR_FLOAT sergioX sergioY sergioZ
VAR_FLOAT bankjobX bankjobY bankjobZ
VAR_FLOAT pornX pornY pornZ
VAR_FLOAT counterX counterY counterZ
VAR_FLOAT bikersX bikersY bikersZ
VAR_FLOAT cubanX cubanY cubanZ
VAR_FLOAT haitianX haitianY haitianZ
VAR_FLOAT rockX rockY rockZ
VAR_FLOAT taxiwarX taxiwarY taxiwarZ 
VAR_FLOAT philX philY philZ
VAR_FLOAT icecreamX icecreamY icecreamZ 
VAR_FLOAT heli1X heli1Y heli1Z 
VAR_FLOAT heli2X heli2Y heli2Z 
VAR_FLOAT heli3X heli3Y heli3Z 
VAR_FLOAT heli4X heli4Y heli4Z 
VAR_FLOAT baron2X baron2Y baron2Z
VAR_FLOAT kentX kentY kentZ

//blips
VAR_FLOAT ammu1X ammu1Y ammu1Z 
VAR_FLOAT ammu2X ammu2Y ammu2Z 
VAR_FLOAT ammu3X ammu3Y ammu3Z
VAR_FLOAT hard1X hard1Y hard1Z 
VAR_FLOAT hard2X hard2Y hard2Z 
VAR_FLOAT hard3X hard3Y hard3Z

VAR_FLOAT printbuyX printbuyY printbuyZ
VAR_FLOAT carbuyX carbuyY carbuyZ
VAR_FLOAT pornbuyX pornbuyY pornbuyZ
VAR_FLOAT icebuyX icebuyY icebuyZ
VAR_FLOAT taxibuyX taxibuyY taxibuyZ
VAR_FLOAT bankbuyX bankbuyY bankbuyZ
VAR_FLOAT boatbuyX boatbuyY boatbuyZ
VAR_FLOAT strpbuyX strpbuyY strpbuyZ
VAR_FLOAT nbmnbuyX nbmnbuyY nbmnbuyZ

VAR_FLOAT porncashX porncashY porncashZ
VAR_FLOAT boatcashX boatcashY boatcashZ
VAR_FLOAT taxicashX taxicashY taxicashZ
VAR_FLOAT lnkvbuyX lnkvbuyY lnkvbuyZ
VAR_FLOAT hycobuyX hycobuyY hycobuyZ
VAR_FLOAT ochebuyX ochebuyY ochebuyZ
VAR_FLOAT washbuyX washbuyY washbuyZ
VAR_FLOAT vcptbuyX vcptbuyY vcptbuyZ
VAR_FLOAT skumbuyX skumbuyY skumbuyZ

lnkvbuyX = 304.5
lnkvbuyY = 376.3 
lnkvbuyZ = 12.7

hycobuyX = -834.8  
hycobuyY = 1306.9
hycobuyZ = 11.0

ochebuyX = 14.0 
ochebuyY = -1500.7 
ochebuyZ = 12.7

washbuyX = 88.5 
washbuyY = -804.7 
washbuyZ = 11.2

vcptbuyX = 531.4 
vcptbuyY = 1273.7 
vcptbuyZ = 17.6

skumbuyX = -560.1 
skumbuyY = 703.6 
skumbuyZ = 20.5

hotelX = 209.5
hotelY = -1288.9
hotelZ = 12.4

sergioX = 257.1 //190.5
sergioY = -231.7 //-366.2
sergioZ	= 10.0//10.0

printbuyX =	-1059.6
printbuyY =	-274.5
printbuyZ =	11.4

carbuyX = -1007.3
carbuyY = -869.9
carbuyZ = 12.8

pornbuyX = 15.2
pornbuyY = 962.6
pornbuyZ = 10.9

icebuyX = -864.3
icebuyY = -576.6
icebuyZ = 11.0

taxibuyX = -1011.7
taxibuyY = 203.9
taxibuyZ = 11.2

bankbuyX = 487.2  
bankbuyY = -81.5
bankbuyZ = 11.4

boatbuyX = -685.8
boatbuyY = -1495.6
boatbuyZ = 12.5

taxiwarX = -1003.1
taxiwarY = 207.0
taxiwarz = 10.0

generalX = -246.6 
generalY = -1360.5 
generalZ = 7.3 

baronX = -378.5
baronY = -551.3
baronZ = 18.2

bankjobX = 463.9  // 496.3
bankjobY = -58.5 // -84.0
bankjobZ = 10.5 // 9.4

philX = -1101.1
philY = 343.2
philZ = 10.2

pornX = -69.4
pornY = 932.7
pornZ = 9.9

counterX = -1062.6
counterY = -278.8
counterZ = 11.0

lawyerX = 119.2
lawyerY = -826.9
lawyerZ = 9.7		  
				 
kentX = 488.6 // 491.0 
kentY = -75.4 // -77.7
kentZ = 10.4 // 10.4

bikersX = -597.3
bikersY = 652.9
bikersZ	= 10.0

rockX = -875.5
rockY = 1159.3
rockZ = 10.2

cubanX = -1170.0  
cubanY = -606.9
cubanZ = 10.6

haitianX = -962.4	  
haitianY = 143.0
haitianZ = 8.2

strpbuyX = 99.5
strpbuyY = -1468.5
strpbuyZ = 9.9

nbmnbuyX = 428.4
nbmnbuyY = 605.9
nbmnbuyZ = 12.2

icecreamX =	-865.9  
icecreamY =	-571.9 
icecreamZ =	11.0

porncashX =	-1.9 
porncashY =	959.9 
porncashZ =	10.9

boatcashX =	-640.8 
boatcashY =	-1491.8 
boatcashZ =	13.7

taxicashX =	-997.1 
taxicashY =	189.8 
taxicashZ =	11.4

ammu1X = 8186.788 
ammu1Y = -9731.92 
ammu1Z = 6.4386
//ammu1Z = 4.4

ammu2X = 8615.088
ammu2Y = -7194.42
ammu2Z = 13.2

ammu3X = 7573.188
ammu3Y = -7044.52
ammu3Z = 5.0

hard1X = 8452.888
hard1Y = -8724.22
hard1Z = 5.1

hard2X = 8615.088 // 8614.988
hard2Y = -7172.12 //  -7163.62
hard2Z = 13.0 // 16.0
 
hard3X = 7282.688 
hard3Y = -8943.32
hard3Z = 5.3

VAR_INT weapon_shop2_blip weapon_shop3_blip 
VAR_INT hardware_shop1 hardware_shop2 hardware_shop3
VAR_INT spray_shop11 spray_shop12 spray_shop13 spray_shop14	

VAR_INT flag_player_in_stripclub flag_player_in_mall player_car_interiors
flag_player_in_mall = 0

ADD_SHORT_RANGE_SPRITE_BLIP_FOR_COORD ammu1X ammu1Y ammu1Z RADAR_SPRITE_GUN weapon_shop1_blip
ADD_SHORT_RANGE_SPRITE_BLIP_FOR_COORD ammu2X ammu2Y ammu2Z RADAR_SPRITE_GUN weapon_shop2_blip
ADD_SHORT_RANGE_SPRITE_BLIP_FOR_COORD ammu3X ammu3Y ammu3Z RADAR_SPRITE_GUN weapon_shop3_blip
ADD_SHORT_RANGE_SPRITE_BLIP_FOR_COORD hard1X hard1Y hard1Z 65 hardware_shop1
ADD_SHORT_RANGE_SPRITE_BLIP_FOR_COORD hard2X hard2Y hard2Z 65 hardware_shop2
ADD_SHORT_RANGE_SPRITE_BLIP_FOR_COORD hard3X hard3Y hard3Z 65 hardware_shop3

ADD_SHORT_RANGE_SPRITE_BLIP_FOR_COORD -3.8 -1265.8 12.0 64 spray_shop11 //South beach
ADD_SHORT_RANGE_SPRITE_BLIP_FOR_COORD 319.0 441.3 12.0 64 spray_shop12 //Vice Point
ADD_SHORT_RANGE_SPRITE_BLIP_FOR_COORD -903.0 -1261.1 12.0 64 spray_shop13 //Docks
ADD_SHORT_RANGE_SPRITE_BLIP_FOR_COORD -876.2 -105.5 12.0 64 spray_shop14 //Main road haiti
//CHANGE_BLIP_DISPLAY hotel_contact_blip BLIP_ONLY


///////////////////////////////////////////////////
// 	VICE CITY PICKUPS
///////////////////////////////////////////////////

//POLICE BRIBES********************************************************************************

VAR_INT beach_bribe1 beach_bribe2 beach_bribe3 beach_bribe4 beach_bribe5 beach_bribe6 porn_bribe1 
VAR_INT main_bribe1 main_bribe2 main_bribe3 main_bribe4 main_bribe5 main_bribe6

//BEACH
CREATE_PICKUP bribe PICKUP_ON_STREET_SLOW 393.9 -60.2 11.5 beach_bribe1 //Not far from Construction Site behind some houses
CREATE_PICKUP bribe PICKUP_ON_STREET_SLOW 116.0 -1313.1 4.4 beach_bribe2 //Through Underground Shopping mall (washinton)
CREATE_PICKUP bribe PICKUP_ON_STREET_SLOW 393.7 -660.6 10.7 beach_bribe3 //Middle of alleyways at back of Ocean Drive
CREATE_PICKUP bribe PICKUP_ON_STREET_SLOW 470.7 70.1 10.8 beach_bribe4 //Just down from Pizza Hut in Vice Point
CREATE_PICKUP bribe PICKUP_ON_STREET_SLOW 382.7 364.1 10.8 beach_bribe5 //In Alleyway in centre of Vice Point
CREATE_PICKUP bribe PICKUP_ON_STREET_SLOW 422.4 971.2 12.1 beach_bribe6 //Near garages at Big Mall
 
//PORN ISLAND
CREATE_PICKUP bribe PICKUP_ON_STREET_SLOW 89.1 887.4 10.5 porn_bribe1 //Down Unused street on Prawn Island
    
//GOLF ISLAND

//STAR ISLAND

//MAINLAND
CREATE_PICKUP bribe PICKUP_ON_STREET_SLOW -822.7 1304.5 11.7 main_bribe1 //Between shortcut in downtown
CREATE_PICKUP bribe PICKUP_ON_STREET_SLOW -900.69 251.4 17.1 main_bribe2 //over jump at top of Little Hiati into Move Over Miami Sign
CREATE_PICKUP bribe PICKUP_ON_STREET_SLOW -973.7 61.0 10.4 main_bribe3 //in little haiti close by auntie poulets hut
CREATE_PICKUP bribe PICKUP_ON_STREET_SLOW -937.9 -114.1 17.0 main_bribe4 //Over little aquaduct in little hiati
CREATE_PICKUP bribe PICKUP_ON_STREET_SLOW -1015.9 -627.9 11.2 main_bribe5 //Through alleyway in little havana
CREATE_PICKUP bribe PICKUP_ON_STREET_SLOW -906.3 -834.0 15.7 main_bribe6 //Over jump from main drag into car yard

// ****************************************OBJECTS***********************************************

// ***************************BRIDGE BLOCKS***********************************

//STARFISH GATES

VAR_INT	strike_gate	star_gate_1 star_gate_2

CREATE_OBJECT_NO_OFFSET comgate1closed 7534.918 -8739.689 7.549 star_gate_1
DONT_REMOVE_OBJECT star_gate_1
CREATE_OBJECT_NO_OFFSET comgate2closed 8068.549 -8722.61 6.353 star_gate_2
SET_OBJECT_HEADING star_gate_2 102.0
DONT_REMOVE_OBJECT star_gate_2

//PORN STUDIO ROADBLOCK
VAR_INT porn_roadblock

CREATE_OBJECT_NO_OFFSET nt_roadblockCI 8152.7 -7188.2 6.6 porn_roadblock
DONT_REMOVE_OBJECT porn_roadblock

//GOLF COURSE ROADBLOCK
VAR_INT golf_roadblock
									   
CREATE_OBJECT_NO_OFFSET nt_roadblockGF 8168.54 -8168.642 16.04 golf_roadblock
//SET_OBJECT_HEADING golf_roadblock 35.0
DONT_REMOVE_OBJECT golf_roadblock

//GOLF COURSE GATES
VAR_INT golf_gates_closed

CREATE_OBJECT_NO_OFFSET golf_gatesclosed 8357.671 -8477.729 15.634 golf_gates_closed
DONT_REMOVE_OBJECT golf_gates_closed



// ***************************************CAR GENERATORS***************************************

CREATE_CAR_GENERATOR -1022.6 -868.6 12.2 175.0 deluxo -1 -1 TRUE 0 0 0 10000 deluxo_prize_car_gen
SWITCH_CAR_GENERATOR deluxo_prize_car_gen 0

CREATE_CAR_GENERATOR -1014.1 -869.4 12.2 188.0 sabretur -1 -1 TRUE 0 0 0 10000 sabretur_prize_car_gen
SWITCH_CAR_GENERATOR sabretur_prize_car_gen 0

CREATE_CAR_GENERATOR -1014.3 -868.8 17.9 195.0 sandking -1 -1 TRUE 0 0 0 10000 sandking_prize_car_gen
SWITCH_CAR_GENERATOR sandking_prize_car_gen 0

CREATE_CAR_GENERATOR -1023.2 -868.1 17.9 172.0 Hotring -1 -1 TRUE 0 0 0 10000 Hotring_prize_car_gen
SWITCH_CAR_GENERATOR Hotring_prize_car_gen 0

CREATE_CAR_GENERATOR -379.0 -632.1 10.2 187.2 seaspar -1 -1 0 0 0 0 10000 gen_car148 //behind mansion
SWITCH_CAR_GENERATOR gen_car148 0

CREATE_CAR_GENERATOR -1720.3 -239.6 14.8 92.0 rhino -1 -1 0 0 0 0 10000 gen_car149 //at army barracks
SWITCH_CAR_GENERATOR gen_car149 0

CREATE_CAR_GENERATOR -1681.2 -103.7 14.7 180.0 hunter -1 -1 0 0 0 0 10000 gen_car150 //at army barracks
SWITCH_CAR_GENERATOR gen_car150 0

//DOWNTOWN
CREATE_CAR_GENERATOR 7824.0 -6837.5 5.5 80.0 LANDSTAL  -1 -1 TRUE 0 0 0 10000 gen_car177 //BMX TRACK 
SWITCH_CAR_GENERATOR gen_car177 101

CREATE_CAR_GENERATOR 7824.388 -6843.12 4.8 80.0 SANCHEZ  -1 -1 TRUE 0 0 0 10000 gen_car157 //BMX TRACK 
SWITCH_CAR_GENERATOR gen_car157 101

CREATE_CAR_GENERATOR -72.4 -1607.9 12.7 0.0 hunter -1 -1 0 0 0 0 10000 south_beach_hunter //at south beach
SWITCH_CAR_GENERATOR south_beach_hunter 0

CREATE_CAR_GENERATOR 8758.6140 -8556.7850 8.3775 176.0 pcj600 -1 -1 TRUE 0 0 0 10000 gen_car9 //End of Ocean Drive! (4x4 mission car)
SWITCH_CAR_GENERATOR gen_car9 101

/*
//OCEAN BEACH
CREATE_CAR_GENERATOR 242.6 -1274.6 10.0 165.0 OCEANIC CARCOLOUR_TAXIYELLOW CARCOLOUR_WHITE 0 0 0 0 10000 gen_car3 //Outside the hotel
SWITCH_CAR_GENERATOR gen_car3 101

CREATE_CAR_GENERATOR 11.5 -1382.0 9.6 261.0 -1 -1 -1 0 0 0 0 10000 gen_car24 //Mini car park round from scarface flat  
SWITCH_CAR_GENERATOR gen_car24 101


CREATE_CAR_GENERATOR 19.8 -991.8 9.7 0.0 -1 -1 -1 0 0 0 0 10000 gen_car27 //Mini mall
SWITCH_CAR_GENERATOR gen_car27 101

CREATE_CAR_GENERATOR -6.4 -991.3 9.7 180.0 -1 -1 -1 0 0 0 0 10000 gen_car28 //Mini mall
SWITCH_CAR_GENERATOR gen_car28 101

CREATE_CAR_GENERATOR 12.8 -1015.1 9.7 180.0 -1 -1 -1 0 0 0 0 10000 gen_car29 //Mini mall
SWITCH_CAR_GENERATOR gen_car29 101

CREATE_CAR_GENERATOR -35.7 -1013.6 9.7 0.0 -1 -1 -1 0 20 0 0 10000 gen_car78 //Mini mall
SWITCH_CAR_GENERATOR gen_car78 101

CREATE_CAR_GENERATOR 81.3 -871.8 9.7 57.0 -1 -1 -1 0 0 0 0 10000 gen_car79 //round the corner from Mini mall
SWITCH_CAR_GENERATOR gen_car79 101

CREATE_CAR_GENERATOR -7.1 -1205.1 9.6 181.0 PCJ600 -1 -1 0 0 0 0 10000 gen_car80 //in car park next to chris's double insane jump
SWITCH_CAR_GENERATOR gen_car80 101

CREATE_CAR_GENERATOR 37.9 -1320.4 9.6 355.0 HERMES -1 -1 0 0 0 0 10000 gen_car81 //Outside flats
SWITCH_CAR_GENERATOR gen_car81 101

CREATE_CAR_GENERATOR 127.0 -1158.0 32.0 180.0 STALLION -1 -1 0 0 0 0 10000 gen_car8 //Top of multistorey, South Washington Drive (4x4 mission car)
SWITCH_CAR_GENERATOR gen_car8 101

CREATE_CAR_GENERATOR 507.4 -308.8 12.8 176.0 PCJ600 -1 -1 0 0 0 0 10000 gen_car9 //End of Ocean Drive! (4x4 mission car)
SWITCH_CAR_GENERATOR gen_car9 101

CREATE_CAR_GENERATOR 19.8 -1246.9 10.1 0.0 BANSHEE -1 -1 0 70 0 0 10000 gen_car10 //Back of Washington (4x4 mission car)
SWITCH_CAR_GENERATOR gen_car10 101

CREATE_CAR_GENERATOR 307.9 1254.6 27.5 180.5 TOPFUN -1 -1 0 0 0 0 10000 gen_car30 //RC plane race ontop of car park
SWITCH_CAR_GENERATOR gen_car30 101

CREATE_CAR_GENERATOR 277.4 -1175.3 11.0 350.0 -1 -1 -1 0 30 0 0 10000 gen_car32 // Ocean Drive
SWITCH_CAR_GENERATOR gen_car32 101

CREATE_CAR_GENERATOR 278.8 -1074.0 11.0 172.0 -1 -1 -1 0 30 0 0 10000 gen_car33 // Ocean Drive
SWITCH_CAR_GENERATOR gen_car33 101

CREATE_CAR_GENERATOR 365.3 -837.9 11.0 335.0 -1 -1 -1 0 60 0 0 10000 gen_car74 // Ocean Drive
SWITCH_CAR_GENERATOR gen_car74 101

CREATE_CAR_GENERATOR 237.2 -1377.5 10.9 170.0 -1 -1 -1 0 50 0 0 10000 gen_car82 // Ocean Drive
SWITCH_CAR_GENERATOR gen_car82 101
					 
CREATE_CAR_GENERATOR 127.4 -818.5 9.5 250.6 FAGGIO -1 -1 0 0 0 0 10000 gen_car83 // Lawyers office
SWITCH_CAR_GENERATOR gen_car83 0


CREATE_CAR_GENERATOR 382.2 -632.8 11.0 9.9 FAGGIO -1 -1 0 0 0 0 10000 gen_car75 //Washington
SWITCH_CAR_GENERATOR gen_car75 101

CREATE_CAR_GENERATOR 235.7 -893.3 11.0 150.0 -1 -1 -1 0 0 0 0 10000 gen_car76 //Washington
SWITCH_CAR_GENERATOR gen_car76 101

CREATE_CAR_GENERATOR 150.6 -995.6 11.0 353.0 -1 -1 -1 0 0 0 0 10000 gen_car77 //Washington
SWITCH_CAR_GENERATOR gen_car77 101

CREATE_CAR_GENERATOR 122.3 -1107.7 9.7 175.0 -1 -1 -1 0 0 0 0 10000 gen_car85 //Washington
SWITCH_CAR_GENERATOR gen_car85 101


CREATE_CAR_GENERATOR -313.4 -1236.4 5.0 180.0 RIO -1 -1 0 0 0 0 10000 gen_car34 // Boat
SWITCH_CAR_GENERATOR gen_car34 101

CREATE_CAR_GENERATOR -328.4 -1317.7 5.0 0.0 SPEEDER -1 -1 0 0 0 0 10000 gen_car35 // Boat
SWITCH_CAR_GENERATOR gen_car35 101

CREATE_CAR_GENERATOR -286.8 -1353.1 5.0 90.0 REEFER -1 -1 0 0 0 0 10000 gen_car36 // Boat
SWITCH_CAR_GENERATOR gen_car36 101

CREATE_CAR_GENERATOR -314.0 -1318.3 5.0 0.0 MARQUIS -1 -1 0 0 0 0 10000 gen_car37 // Boat
SWITCH_CAR_GENERATOR gen_car37 101

CREATE_CAR_GENERATOR 376.9 477.0 11.2 282.0 FAGGIO -1 -1 0 0 0 0 10000 gen_car55 // next to rooftop chase
SWITCH_CAR_GENERATOR gen_car55 101

CREATE_CAR_GENERATOR 718.4650 701.3998 12.3940 320.7776 TOPFUN  -1 -1 0 0 0 0 10000 gen_car22 //RC car race, ON the beach 
SWITCH_CAR_GENERATOR gen_car22 101

CREATE_CAR_GENERATOR  -256.6 -1275.4 7.4 348.0 PCJ600 -1 -1 0 0 0 0 10000 gen_car26 //Bike generator next to Colonels boat
SWITCH_CAR_GENERATOR gen_car26 101

CREATE_CAR_GENERATOR -236.6 -1374.6 7.1 280.3 CHEETAH -1 -1 0 0 0 0 10000 gen_car120 //next to Colonels boat
SWITCH_CAR_GENERATOR gen_car120 101
 
CREATE_CAR_GENERATOR -168.9 -1392.2 3.1 280.0 -1 -1 -1 0 30 0 0 10000 gen_car121 //next to Colonels boat
SWITCH_CAR_GENERATOR gen_car121 101

CREATE_CAR_GENERATOR -140.2 -1414.1 3.1 108.7 -1 -1 -1 0 60 0 0 10000 gen_car122 //next to Colonels boat
SWITCH_CAR_GENERATOR gen_car122 101

CREATE_CAR_GENERATOR -142.1 -1373.0 3.1 287.3 -1 -1 -1 0 0 0 0 10000 gen_car123 //next to Colonels boat
SWITCH_CAR_GENERATOR gen_car123 101

CREATE_CAR_GENERATOR 393.9 -1736.4 8.8 249.6 CADDY  -1 -1 0 0 0 0 10000 gen_car31 //Lighthouse (Hidden)
SWITCH_CAR_GENERATOR gen_car31 101
*/


//WEAPONS********************************************************************************

VAR_INT gun_beach1 gun_beach2 gun_beach3 gun_beach4 gun_beach5 gun_beach6 gun_beach7 gun_beach8 gun_beach9 gun_beach10  
VAR_INT	gun_beach11 gun_beach12 gun_beach13 gun_beach14 gun_beach15 gun_beach16 prawn_gun1 prawn_gun2 golf_gun1 star_gun1 star_gun2 star_gun5 
VAR_INT	gun_main1 gun_main2 gun_main3 gun_main4 gun_main5 gun_main6 gun_main7 gun_main8 gun_main9 gun_main10 gun_main11 gun_main12 gun_main13 gun_main14 Chainsaw1 
VAR_INT gun_beach17

//BEACH
CREATE_PICKUP chnsaw PICKUP_ON_STREET 30.0 -1330.9 13.0 Chainsaw1	//Scarface chainsaw room
CREATE_PICKUP bat PICKUP_ON_STREET 206.7 -1254.4 12.0 gun_beach1 //Behind Ocean View
CREATE_PICKUP_WITH_AMMO colt45 PICKUP_ON_STREET_SLOW 34 -228.4 -1318.2 9.1 gun_beach2 //down the Ocean Bay Marina
CREATE_PICKUP_WITH_AMMO colt45 PICKUP_ON_STREET_SLOW 34 340.5 -249.5 12.5 gun_beach3 //At Construction Site (Tex's)
CREATE_PICKUP_WITH_AMMO chromegun PICKUP_ON_STREET_SLOW 16 42.3 -959.2 21.8 gun_beach4 //Top of Small Mall  
CREATE_PICKUP_WITH_AMMO chromegun PICKUP_ON_STREET_SLOW 16 568.9 -449.3 11.1 gun_beach5 //Top of the walway along Beach
CREATE_PICKUP_WITH_AMMO tec9 PICKUP_ON_STREET_SLOW 100 287.9 50.7 10.8 gun_beach6 //Just off small road that used to lead onto golfcourse
CREATE_PICKUP_WITH_AMMO grenade PICKUP_ON_STREET_SLOW 4 362.2 -500.5 12.3 gun_beach7 //behind police station
CREATE_PICKUP cleaver PICKUP_ON_STREET_SLOW 402.6 102.5 11.4 gun_beach8 //Behind North Pizza Hut
CREATE_PICKUP_WITH_AMMO ruger PICKUP_ON_STREET_SLOW 60 8669.088 -7660.22 13.3 gun_beach9 //On top of swank house 
CREATE_PICKUP katana PICKUP_ON_STREET_SLOW 476.9 1014.9 19.2 gun_beach10 //Inside Tarbrush Coffee   
CREATE_PICKUP nitestick PICKUP_ON_STREET_SLOW 402.4 -488.3 12.4 gun_beach11 //Inside Police Station   
CREATE_PICKUP brassknuckle PICKUP_ON_STREET_SLOW 224.0 -1207.5 11.0 gun_beach13 //behind Moonlite Hotel on Ocean Drive
CREATE_PICKUP knifecur PICKUP_ON_STREET_SLOW 118.7 -1546.1 10.8 gun_beach14 //behind Northstar Hotel on Ocean Drive
CREATE_PICKUP machete PICKUP_ON_STREET_SLOW 56.6 -459.3 11.4 gun_beach15 //On bridge leadign to star island 
CREATE_PICKUP_WITH_AMMO uzi PICKUP_ON_STREET_SLOW 60 5.4 -1277.0 10.4 gun_beach16 //Behind paint n spray in washington
CREATE_PICKUP_WITH_AMMO uzi PICKUP_ON_STREET_SLOW 60 157.0 -895.3 12.3 gun_beach17 //in middle of washington next to swimming pool
CREATE_PICKUP_WITH_AMMO bomb PICKUP_ON_STREET_SLOW 4 556.6 207.4 14.5 gun_beach12 //building tall hotel next to beach in South vice point

//PORN ISLAND
CREATE_PICKUP_WITH_AMMO m4 PICKUP_ON_STREET_SLOW 60 -32.8 1019.2 13.0 prawn_gun1 //Inside Studio B   
CREATE_PICKUP_WITH_AMMO uzi PICKUP_ON_STREET_SLOW 60 17.3 1145.7 23.5 prawn_gun2 //At front of Street Gang building   

//GOLF ISLAND
CREATE_PICKUP golfclub PICKUP_ON_STREET 8344.3910 -7970.9410 16.7320 golf_gun1 //On Golf Course


//STAR ISLAND
CREATE_PICKUP_WITH_AMMO flame PICKUP_ON_STREET_SLOW 300 -546.0 -418.9 9.8 star_gun1 //In the star of R* symbol 
CREATE_PICKUP_WITH_AMMO sniper PICKUP_ON_STREET_SLOW 20 -476.4 -571.2 12.9 star_gun2 //In the Maze 
CREATE_PICKUP katana PICKUP_ON_STREET_SLOW -554.11 -547.7 10.7 star_gun5 //Inside garage of house next to mansion   

//MAINLAND
CREATE_PICKUP_WITH_AMMO molotov PICKUP_ON_STREET_SLOW 4 -755.7 1347.5 11.8 gun_main1 //Taco Shop   
CREATE_PICKUP_WITH_AMMO uzi PICKUP_ON_STREET_SLOW 60 -545.8 694.6 11.0 gun_main2 //Across from biker bar   
CREATE_PICKUP_WITH_AMMO m4 PICKUP_ON_STREET_SLOW 60 -980.4 118.7 9.3 gun_main3 //Between Haitain Houses
CREATE_PICKUP_WITH_AMMO m4 PICKUP_ON_STREET_SLOW 60 -1221.0 -641.6 11.7 gun_main4 //Behind house across from Umberto's
CREATE_PICKUP_WITH_AMMO sniper PICKUP_ON_STREET_SLOW 20 -742.1 -949.9 9.9 gun_main5 //Behind Toll Booth on last bridge on way to Beach
CREATE_PICKUP_WITH_AMMO rocketla PICKUP_ON_STREET_SLOW 4 -995.1 -1178.1 13.6 gun_main6 //In Hooker Inn Swimming Pool.
CREATE_PICKUP_WITH_AMMO ingramsl PICKUP_ON_STREET_SLOW 60 -713.3 -1466.0 11.2 gun_main7 //Across from fastest boat Boat Shed
CREATE_PICKUP_WITH_AMMO flame PICKUP_ON_STREET_SLOW 300 7235.088 -9643.02 6.5 gun_main8 //beside Bomb SHop in Docks
CREATE_PICKUP_WITH_AMMO shotgspa PICKUP_ON_STREET_SLOW 14 6891.188 -8992.32 9.9 gun_main9 //Across from main terminal at airport   
CREATE_PICKUP_WITH_AMMO M60 PICKUP_ON_STREET_SLOW 100 6505.288 -8539.02 24.7 gun_main10 //left hand tower at Army Hanger   
CREATE_PICKUP_WITH_AMMO grenade PICKUP_ON_STREET_SLOW 4 7310.388 -7785.22 5.9 gun_main11 //In basketball courts close to ice cream factory   
CREATE_PICKUP_WITH_AMMO python PICKUP_ON_STREET_SLOW 12 7067.488 -8311.22 6.4  gun_main12 //South Across water from junkyard   
//6.4
CREATE_PICKUP_WITH_AMMO buddyshot PICKUP_ON_STREET_SLOW 10 -1305.2 177.1 11.4 gun_main13 //Behind large hanger from junkyard   
CREATE_PICKUP_WITH_AMMO laser PICKUP_ON_STREET_SLOW 14 7135.888 -8852.12 21.0 gun_main14 //Next to Kaufmann cabs sign in Lttle Havana (close to cuban cafe)   




//HEALTH********************************************************************************
VAR_INT beach_health1 beach_health2 beach_health3 beach_health4 beach_health5 beach_health8 beach_health9   
VAR_INT	porn_health1 golf_health1 star_health1 star_health2 main_health1 main_health2 main_health3 main_health4 main_health5 main_health6 
VAR_INT	main_health7 main_health9 main_health10 main_health11 main_health12 main_health13 main_health14 health_pickup  

//BEACH
CREATE_PICKUP health PICKUP_IN_SHOP -113.2 -975.7 10.4 beach_health1 //Ocean View Hospital
CREATE_PICKUP health PICKUP_ON_STREET_SLOW -225.1 -1158.1 9.1 beach_health2 //On Windy Path Along from marina
CREATE_PICKUP health PICKUP_ON_STREET_SLOW 456.2 -471.4 16.6 beach_health3 //On roof next to Protect the Deal shootout
CREATE_PICKUP health PICKUP_ON_STREET_SLOW 377.4 467.7 11.6 beach_health4 //Next to garbage can where THE CHASE guy falls onto
CREATE_PICKUP health PICKUP_IN_SHOP 469.6 697.4 11.7 beach_health5 //Shady Palms Hospital
CREATE_PICKUP health PICKUP_ON_STREET_SLOW 385.3 1210.9 19.4 beach_health8 //Inside Cup in Big Mall (behind free car)
CREATE_PICKUP health PICKUP_IN_SHOP 384.3 756.6 11.7 beach_health9 //Inside Dispensary at middle of Vice Point

//PORN ISLAND
CREATE_PICKUP health PICKUP_ON_STREET_SLOW 10.7 1099.0 16.6 porn_health1 //In front of Fish Fountain
    
//GOLF ISLAND
CREATE_PICKUP health PICKUP_ON_STREET_SLOW 85.3 402.7 19.8 golf_health1 //On Bridge near tennis Courts

//STAR ISLAND
CREATE_PICKUP health PICKUP_ON_STREET_SLOW -711.7 -501.7 11.3 star_health1 //Near Mainland gate
CREATE_PICKUP health PICKUP_ON_STREET_SLOW -404.0 -588.0 11.6 star_health2 //In bottom of Mansion 
CREATE_PICKUP health PICKUP_ON_STREET -406.2503 -566.4947 19.5804 health_pickup //in mansion (for chris' finale)

//MAINLAND
CREATE_PICKUP health PICKUP_ON_STREET_SLOW -478.1 1438.5 16.1 main_health1 //Dirtbike Track
CREATE_PICKUP health PICKUP_ON_STREET_SLOW -675.0 1263.3 25.1 main_health2 //On top of Roof in Downtown near Fight for Harley
CREATE_PICKUP health PICKUP_ON_STREET_SLOW -821.8 1144.8 26.1 main_health3 //Near Fifth Jump in G-Spotlight Course 
CREATE_PICKUP health PICKUP_ON_STREET_SLOW -1139.4 55.4 11.2 main_health4 //Next to steps leading out of haitian Drug Factory
CREATE_PICKUP health PICKUP_ON_STREET_SLOW -1290.9 91.9 26.9 main_health5 //Top of Garbage Lift in Garbage Dump
CREATE_PICKUP health PICKUP_IN_SHOP -885.4 -483.4 13.1 main_health6 //Westhaven Hospital
CREATE_PICKUP health PICKUP_ON_STREET_SLOW -925.1 -638.3 16.0 main_health7 //Roof leading to Ice Cream roofs
CREATE_PICKUP health PICKUP_ON_STREET_SLOW -692.4 -1283.8 11.1 main_health9 //underneath stairs leading to ship
CREATE_PICKUP health PICKUP_ON_STREET_SLOW -655.1 -1506.3 8.1 main_health10 //Off jetty at fastest boat yard
CREATE_PICKUP health PICKUP_ON_STREET_SLOW -1399.4 -865.9 20.9 main_health11 //Upstairs in Airport terminal
CREATE_PICKUP health PICKUP_IN_SHOP -822.6 1137.3 12.4 main_health12 //Downtown Hospital
CREATE_PICKUP health PICKUP_IN_SHOP -851.4 -78.8 11.5 main_health13 //In pharmacy 
CREATE_PICKUP health PICKUP_IN_SHOP -834.2 740.6 11.3 main_health14 //In DOWNTOWN dispensary 



//ARMOUR********************************************************************************

VAR_INT beach_arm1 beach_arm2 beach_arm3 beach_arm4 beach_arm5 beach_arm6 beach_arm7 beach_arm8	porn_arm1 golf_arm2
VAR_INT	main_arm1 main_arm2 main_arm3 main_arm4 main_arm5 main_arm8 main_arm10 main_arm11 

//BEACH
CREATE_PICKUP bodyarmour PICKUP_ON_STREET_SLOW 4.9 -1239.2 19.2 beach_arm1 //Up stairs in middle of Washington (behind pay n spray)
CREATE_PICKUP bodyarmour PICKUP_ON_STREET_SLOW 205.7 -885.7 12.2 beach_arm2 //End of swimming pool middle of washington
CREATE_PICKUP bodyarmour PICKUP_ON_STREET_SLOW 148.8 -349.9 8.7 beach_arm3 //In Construction Yard
CREATE_PICKUP bodyarmour PICKUP_ON_STREET_SLOW 520.2 -171.2 13.9 beach_arm4 //Standing Vice point Hotel (not far from Club)
CREATE_PICKUP bodyarmour PICKUP_ON_STREET_SLOW 430.8 162.1 11.8 beach_arm5 //Close to basketball courts in middle of Vice Point
CREATE_PICKUP bodyarmour PICKUP_ON_STREET_SLOW 416.1 517.7 11.2 beach_arm6 //In centre of Wooden Drinks Shack @ swank house in vice point
CREATE_PICKUP bodyarmour PICKUP_ON_STREET_SLOW 350.2 884.8 25.5 beach_arm7 //In House Near Big Mall with ramp inside it
CREATE_PICKUP bodyarmour PICKUP_ON_STREET_SLOW 535.3 1214.1 18.9 beach_arm8 //Near Big Mall Garages
 
//PORN ISLAND
CREATE_PICKUP bodyarmour PICKUP_ON_STREET_SLOW 42.8 951.1 11.0 porn_arm1 //Across from porn studios in run down back yard

//GOLF ISLAND
CREATE_PICKUP bodyarmour PICKUP_ON_STREET_SLOW -70.8 510.6 11.6 golf_arm2 //In Bunker at golf course

//STAR ISLAND

//MAINLAND
CREATE_PICKUP bodyarmour PICKUP_ON_STREET_SLOW -1695.6 -289.4 29.7 main_arm1 //In the Right Tower at the army hanger
CREATE_PICKUP bodyarmour PICKUP_ON_STREET_SLOW -567.6 1370.36 16.4 main_arm2 //Next to flip down ladder on gspotlight course
CREATE_PICKUP bodyarmour PICKUP_ON_STREET_SLOW -921.9 722.9 11.0 main_arm3 //Behind Rock City
CREATE_PICKUP bodyarmour PICKUP_ON_STREET_SLOW -1058.9 -240.6 18.2 main_arm5 //Upstairs from Printing Studios 
CREATE_PICKUP bodyarmour PICKUP_ON_STREET_SLOW -625.5 622.2 11.7 main_arm8 //Behind Bikers bar
CREATE_PICKUP bodyarmour PICKUP_ON_STREET_SLOW -733.5 -1294.7 12.4 main_arm10 //Across from Plates Ship 
CREATE_PICKUP bodyarmour PICKUP_ON_STREET_SLOW -1177.0 -915.3 14.9 main_arm11 //Airport Car Park 
CREATE_PICKUP bodyarmour PICKUP_ON_STREET_SLOW -1171.0 -457.4 10.7 main_arm4 //Airport Car Park 



//ADRENALINE********************************************************************************

VAR_INT beach_adrn1 beach_adrn2 beach_adrn3 beach_adrn4 beach_adrn5 beach_adrn6 star_adrn1 star_adrn2
VAR_INT	main_adrn1 main_adrn2 main_adrn3 main_adrn4 main_adrn5 main_adrn6 main_adrn7 main_adrn8

//BEACH
CREATE_PICKUP adrenaline PICKUP_ON_STREET_SLOW -37.7 -938.3 10.5 beach_adrn1 //In Small Mall
CREATE_PICKUP adrenaline PICKUP_ON_STREET_SLOW 471.1 -444.1 10.6 beach_adrn2 //In the alleyway behind Ocean Drive (close to the Protect the Deal location)
CREATE_PICKUP adrenaline PICKUP_ON_STREET_SLOW 448.6 16.6 11.0 beach_adrn3 //Behind Sex Pad 
CREATE_PICKUP adrenaline PICKUP_ON_STREET_SLOW 425.6 221.1 16.2 beach_adrn4 //Across from The Chase House 
CREATE_PICKUP adrenaline PICKUP_ON_STREET_SLOW 428.4 947.5 13.2 beach_adrn5 //Across from The Big Mall 
CREATE_PICKUP adrenaline PICKUP_IN_SHOP 385.6 752.3 11.7 beach_adrn6 //Inside Dispensary at middle of Vice Point
																									  
//PORN ISLAND
    
//GOLF ISLAND

//STAR ISLAND
CREATE_PICKUP adrenaline PICKUP_ON_STREET_SLOW -366.6 -500.3 11.3 star_adrn1 //In Front of Mansion in trees 
CREATE_PICKUP adrenaline PICKUP_ON_STREET_SLOW -342.2 -591.5 36.9 star_adrn2 //On top of Mansion 

//MAINLAND
CREATE_PICKUP adrenaline PICKUP_ON_STREET_SLOW -381.2 1065.2 13.0 main_adrn1 //Next to main bridge in downtown 
CREATE_PICKUP adrenaline PICKUP_ON_STREET_SLOW -730.1 1226.3 24.2 main_adrn2 //On "Free the Harley" roof in downtown between ramps  
CREATE_PICKUP adrenaline PICKUP_ON_STREET_SLOW -1095.1 99.4 12.3 main_adrn3 //Up steps close to cuban shop next to Haitian Drugs Factory
CREATE_PICKUP adrenaline PICKUP_ON_STREET_SLOW -967.1 -62.6 11.0 main_adrn4 //Across from second drugs pickup point from Hait 1
CREATE_PICKUP adrenaline PICKUP_ON_STREET_SLOW -1022.1 -547.0 11.2 main_adrn5 //Across the road from the Assassin phone behind the drugs factory
CREATE_PICKUP adrenaline PICKUP_ON_STREET_SLOW -882.0 111.2 9.3 main_adrn6 //Close to the Dirty Lickin's roof
CREATE_PICKUP adrenaline PICKUP_IN_SHOP -857.1 -83.6 11.5 main_adrn7 //In pharmacy 
CREATE_PICKUP adrenaline PICKUP_IN_SHOP -839.0 740.6 11.3 main_adrn8 //In DOWNTOWN dispensary 

///////////////////////////////////////////////////
// 	END OF VICE CITY PICKUPS
///////////////////////////////////////////////////


// OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO
//     OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO 
// OOOO    OOOO    OOOO    OOOO    OOOO         COP SET PIECES             OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO
//     OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO    OOOO 
//ADD_SET_PIECE SetPieceType ActivationMinX ActivationMinY ActivationMaxX ActivationMaxY Generation1X Generation1Y Helper1X Helper1Y Generation2X Generation2Y Helper2X Helper2Y


// ************************** VICE BEACH *************************************************************************************************

//COP CARS IN ALLEY
ADD_SET_PIECE SETPIECE_TWOCOPCARSINALLEY  225.0 -1244.0 227.4 -1248.5 249.0 -1255.0 246.0 -1250.6 208.4 -1238.4 209.6 -1243.5 


//COP CARS BLOCKING PLAYER
ADD_SET_PIECE SETPIECE_TWOCARSBLOCKINGPLAYERFROMSIDE   235.3 -1299.6 261.1 -1270.7    212.2 -1309.6 228.0 -1311.3   221.2 -1309.6 228.0 -1311.3 //Ocean Drive outside Ocean View 
ADD_SET_PIECE SETPIECE_TWOCARSBLOCKINGPLAYERFROMSIDE   220.0 -1144.0 232.0 -1136.0    190.5 -1101.5 185.5 -1122.7   278.8 -1112.0 269.0 -1140.5 //big alleyway between Ocean Dr. and Washington
ADD_SET_PIECE SETPIECE_TWOCARSBLOCKINGPLAYERFROMSIDE   -112.5 -1275.0 -120.5 -1267.0    -37.7 -1244.15 -36.7 -1270.0   -189.5 -1295.4 -190.0 -1279.3 // Road perpendicular to Colonel docks


//COP CARS RAMMING PLAYER FROM THE SIDE
ADD_SET_PIECE SETPIECE_CARRAMMINGPLAYERFROMSIDE   324.0 -735.5 332.0 -727.5    361.6 -715.0 338.6 -705.5   -189.5 -1295.4 -190.0 -1279.3 // Washington drive
ADD_SET_PIECE SETPIECE_CARRAMMINGPLAYERFROMSIDE   385.6 -602.2 377.6 -594.2    374.6 -559.0 394.6 -571.5   -189.5 -1295.4 -190.0 -1279.3 // washington drive nr cop shop

ADD_SET_PIECE SETPIECE_CARRAMMINGPLAYERFROMSIDE   146.6 -450.2 154.6 -440.2    183.9 -480.0 184.6 -447.5   -189.5 -1295.4 -190.0 -1279.3 // road from star island towards beach.
ADD_SET_PIECE SETPIECE_CARRAMMINGPLAYERFROMSIDE   250.6 -457.2 240.6 -449.2    346.8 -466.4 311.5 -461.5   -189.5 -1295.4 -190.0 -1279.3 // following on from above

ADD_SET_PIECE SETPIECE_TWOCARSRAMMINGPLAYERFROMSIDE    171.0 -549.2 179.0 -557.2    161.8 -693.4 168.5 -650.5   169.5 -693.4 173.0 -660.0 // humpbacked bridge supeer doubler!
ADD_SET_PIECE SETPIECE_CARBLOCKINGPLAYERFROMSIDE   305.6 -183.2 315.6 -191.2    269.2 -197.8 276.6 -180.5   -189.5 -1295.4 -190.0 -1279.3 
ADD_SET_PIECE SETPIECE_TWOCARSBLOCKINGPLAYERFROMSIDE   316.5 -65.0 322.5 -58.0    296.5 6.9 315.7 -11.0   369.5 12.2 342.0 -9.7 // 

ADD_SET_PIECE SETPIECE_TWOCARSRAMMINGPLAYERFROMSIDE    364.0 236.2 372.0 244.2    336.1 271.4 337.8 249.5   401.5 213.4 401.0 234.0 // humpbacked bridge super doubler!
ADD_SET_PIECE SETPIECE_TWOCARSBLOCKINGPLAYERFROMSIDE   364.5 169.0 372.5 177.0    406.7 151.15 398.7 170.0   326.5 182.4 346.0 164.3 // Road perpendicular to Colonel docks

ADD_SET_PIECE SETPIECE_TWOCARSBLOCKINGPLAYERFROMSIDE   -87.0 -937.0 -99.0 -947.0    -136.0 -912.15 -115.0 -901.6   -56.0 -875.0 -95.5 -893.3 // Road perpendicular to Colonel docks
ADD_SET_PIECE SETPIECE_TWOCARSRAMMINGPLAYERFROMSIDE    536.0 696.2 546.0 706.2    516.0 753.6 541.5 753.5   506.2 654.4 534.0 657.0 // humpbacked bridge supeer doubler!

ADD_SET_PIECE SETPIECE_CARBLOCKINGPLAYERFROMSIDE   314.0 906.0 322.0 914.0    348.3 864.0 316.0 870.8   -189.5 -1295.4 -190.0 -1279.3 
ADD_SET_PIECE SETPIECE_TWOCARSRAMMINGPLAYERFROMSIDE    356.0 748.0 364.0 756.0    335.0 667.6 356.2 685.2   388.5 846.2 366.0 828.0 // humpbacked bridge supeer doubler!

// ****************** PRAWN ISLAND ***************************************************************************************************
ADD_SET_PIECE SETPIECE_TWOCARSBLOCKINGPLAYERFROMSIDE 8216.0 -7209.0 8224.0 -7201.0    8273.3 -7175.0 28.0 1030.8   35.5 993.4 39.0 1023.3
ADD_SET_PIECE SETPIECE_CARBLOCKINGPLAYERFROMSIDE   16.0 930.0 24.0 938.0    28.3 874.0 10.0 881.8   -189.5 -1295.4 -190.0 -1279.3 
 
// ****************** STARFISH ISLAND ***************************************************************************************************

ADD_SET_PIECE SETPIECE_TWOCARSBLOCKINGPLAYERFROMSIDE    -368.0 -480.0 -378.0 -490.0    -253.5 -439.0 -252.5 -470.5   -451.2 -452.4 -442.0 -480.0 
ADD_SET_PIECE SETPIECE_TWOCARSBLOCKINGPLAYERFROMSIDE    -533.0 -480.0 -543.0 -490.0    -647.0 -449.0 -637.5 -481.5   -451.2 -452.4 -457.0 -480.0 

ADD_SET_PIECE SETPIECE_TWOCARSBLOCKINGPLAYERFROMSIDE    -255.0 -435.0 -245.0 -443.0    -210.8 -470.0 -241.5 -472.0   -298.2 -485.0 -257.0 -477.5 
ADD_SET_PIECE SETPIECE_TWOCARSBLOCKINGPLAYERFROMSIDE    -645.0 -446.0 -637.0 -454.0    -610.8 -482.0 -635.5 -472.0   -684.2 -492.0 -651.0 -480.5 


// ****************** MAINLAND (docks) ***************************************************************************************************

ADD_SET_PIECE SETPIECE_CARRAMMINGPLAYERFROMSIDE   -790.0 -1490.2 -798.0 -1498.2    -815.8 -1450.5 -822.0 -1469.0   -189.5 -1295.4 -190.0 -1279.3 
ADD_SET_PIECE SETPIECE_TWOCARSBLOCKINGPLAYERFROMSIDE   -809.0 -1436.7 -800.0 -1428.0    -853.3 -1466.0 -824.5 -1474.8   -808.5 -1382.4 -788.0 -1392.3
ADD_SET_PIECE SETPIECE_TWOCARSRAMMINGPLAYERFROMSIDE   -870.0 -1335.7 -862.0 -1327.0    -902.3 -1343.0 -882.5 -1348.8   -880.5 -1297.4 -860.0 -1307.3
ADD_SET_PIECE SETPIECE_CARRAMMINGPLAYERFROMSIDE   -924.0 -1248.0 -916.0 -1240.0    -909.8 -1270.5 -920.0 -1265.0   -189.5 -1295.4 -190.0 -1279.3 
ADD_SET_PIECE SETPIECE_CARRAMMINGPLAYERFROMSIDE   -1224.0 -788.0 -1216.0 -780.0    -1260.8 -737.5 -1258.0 -780.0   -189.5 -1295.4 -190.0 -1279.3
ADD_SET_PIECE SETPIECE_CARRAMMINGPLAYERFROMSIDE   -884.0 -1070.0 -876.0 -1078.0    -925.0 -1044.5 -901.0 -1074.0   -189.5 -1295.4 -190.0 -1279.3 
 

// ****************** MAINLAND (L Havana) ***************************************************************************************************

ADD_SET_PIECE SETPIECE_TWOCARSBLOCKINGPLAYERFROMSIDE   -1130.0 -711.7 -1138.0 -719.7    -1111.3 -683.0 -1134.5 -686.4   -1166.0 -691.4 -1144.7 -690.3
ADD_SET_PIECE SETPIECE_TWOCARSBLOCKINGPLAYERFROMSIDE   -986.0 -713.0 -978.0 -721.0    -1011.8 -577.4 -989.7 -575.4   -945.5 -660.0 -969.4 -661.6
ADD_SET_PIECE SETPIECE_TWOCARSBLOCKINGPLAYERFROMSIDE   -1012.0 -392.0 -1004.0 -384.0    -1044.3 -337.8 -1023.7 -336.4   -975.0 -444.0 -1000.4 -445.6
ADD_SET_PIECE SETPIECE_TWOCARSBLOCKINGPLAYERFROMSIDE   -1112.0 -372.0 -1104.0 -364.0    -1078.3 -337.0 -1101.5 -339.4   -1138.0 -348.4 -1117.3 -346.3

// ****************** MAINLAND (airport) ***************************************************************************************************

ADD_SET_PIECE SETPIECE_TWOCARSRAMMINGPLAYERFROMSIDE   -1635.0 -1260.7 -1615.0 -1240.0    -1565.8 -1249.7 -1575.5 -1278.8   -880.5 -1297.4 -860.0 -1307.3
ADD_SET_PIECE SETPIECE_CARRAMMINGPLAYERFROMSIDE   -1714.0 -1364.2 -1706.0 -1356.2    -1686.8 -1334.5 -1708.0 -1334.6   -189.5 -1295.4 -190.0 -1279.3 
ADD_SET_PIECE SETPIECE_TWOCARSRAMMINGPLAYERFROMSIDE   -1330.0 -835.7 -1300.0 -805.0    -1388.2 -8906.7 -1362.5 -875.8   -1231.5 -889.4 -1258.0 -891.3

MISSION_END
