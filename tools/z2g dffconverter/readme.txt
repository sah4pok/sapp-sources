Non-standard DFF converter for Gmax/KAMS

���͂��߂�
�{�v���O�����́A"Non-standard DFF!"�̃G���[�ɂ��
Gmax/KAMS�ŃC���|�[�g�ł��Ȃ�dff�t�@�C����
�C���|�[�g�\�ȃt�H�[�}�b�g�ɕϊ�������̂ł��B

���g�p���@
1.�ϊ�����dff�t�@�C����{�v���O�����̃A�C�R���܂��̓V���[�g�J�b�g�ɂ�Drag&Drop����B
2.�ϊ���dff�Ɠ����t�H���_�Ɂu�t�@�C����+"_z2g.dff"�v�Ƃ����t�@�C������
�@�ϊ��t�@�C�����o�͂����B

���ϊ����ɃR���\�[��������A�ϊ�������I�������ꍇ�́A
�@�uconversion : done successfully�v�ƕ\������܂��B
�@�Ȃɂ��G���[���������ꍇ�A������ۂ����b�Z�[�W���\������܂��B

���R���\�[���͂Ȃɂ��L�[����͂��邱�Ƃŕ��܂��B


��������
�E�{�v���O�����͎��̔c������͈͂̃G���[�v�����C��������̂ł���A
�@�S�Ă�"Non-standard DFF"���C���ł���Ƃ͌���܂���B

�EKAMS�G���[�v���̂ЂƂł���"2nd UV MAP"������dff�t�@�C���ɑ΂��ẮA
�@�Е���UV MAP���폜���邱�Ƃɂ����KAMS�Ή��`���ɕϊ����܂��B
�@�������̂������g�p���������B

�E�{�v���O�����̓v���O�C���Ԃ̎d�l�����C��������̂ł���A
�@dff�t�@�C����ҏW�������̈Ӑ}�ɂ��ݒ肳�ꂽ�u���b�N�v������������̂ł͂���܂���B

���ϊ��ɂ��C����
1.�u���b�V���\�z�p��face�f�[�^��vertex�� �v�Ɓumaterial split�ɗp����face�f�[�^��vertex���v��
�@�s����������ꍇ�Amaterial split�p��face�f�[�^���C�����܂��B
�@��vertex�L�ڏ��̕ύX�̂݁B���̕ϊ��ɂ�郂�f�����̕ω��͂���܂���B

2.dff��"2nd UV MAP"���ݒ肳��Ă���ꍇ�A���UV MAP�̂��������ꂩ���폜���܂��B

3.�t�@�C���I�[(Clump�O)��RW�w�b�_�̖����k���f�[�^�񂪂������ꍇ�A������폜���܂��B
�@���ꍇ�ɂ���Ă�dff�t�@�C���T�C�Y�������ȉ��ɂȂ�ꍇ������܂����A
�@�@���̊m�F�����͈͂ł́A�폜�����̂�'0'�̃f�[�^��ŁA
�@�@����Ė�肪�N���邱�Ƃ͂���܂���ł����B

��uvsel�t�H���_�ɂ���
�@"z2g_dffconverter"��2nd UV Map�����o�����Ƃ��ɁA�ЂƂ߂�UV Map���c���悤���삵�܂����A
�@uvsel�t�H���_�ɓ��������u"z2g_dffconverter_uvsel"�v�́A�ǂ����UV Map���c�����I�����邱�Ƃ��ł��܂��B
�@2nd UV Map�����o����ƁA�R���\�[���ɁuSelect Import UV map�v�ƕ\������܂��̂ŁA
�@���l�L�[���͂�UV Map��I�����Ă��������B
�@���̑��̓����"z2g_dffconverter"�Ɠ����ł��B

���R���p�C����
  Borland C++ 5.5.1 for Win32 Copyright (c) 1993, 2000 Borland
    option : -WC -3 -O2 -w- -AT -pc -H- -k -b
  on BCC Developer v1.2.21
  

���X�V����
2010.9.21
�@- VC�pdff�ɑΉ�
�@�@�ERW�w�b�_��Version ID:0x0C02FFFF,0x1003FFFF,0x0800FFFF�ɑΉ�
�@�@�E��Ldff�́uGeometry > Struct�v������
�@�@�@"Ambient color", "Diffuse color", "Specular color" (float x3)
�@�@�@�̓ǂݏ�����ǉ�
�@- �R���\�[���\�����C��

---
2010.9.21 (�X�V)VC�pdff�ɑΉ�
2010.7.5
������
http://ponz2009.web.fc2.com/