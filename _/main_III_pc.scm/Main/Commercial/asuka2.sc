MISSION_START
// *****************************************************************************************
// *****************************************************************************************
// *****************************************************************************************
// ****************************************Asuka mission 2********************************** 
// **************************************Sniper Surveillance********************************
// *****************************************************************************************
// *****************************************************************************************

// Mission start stuff

GOSUB mission_start_asuka2

IF HAS_DEATHARREST_BEEN_EXECUTED
	GOSUB mission_asuka2_failed
ENDIF

GOSUB mission_cleanup_asuka2

MISSION_END
 
// Variables for mission

VAR_INT tail_car_asuka2

VAR_INT blip1_FBI1 blip2_FBI2 blip3_FBI3 blip4_FBI4 blip5_FBI5 blip6_FBI6 blip7_FBI7 blip8_FBI8 blip9_FBI9 blip10_FBI10 blip1_FBI_VAN 

VAR_INT countdown_as2 FBI1health FBI2health FBI3health FBI4health FBI7health FBI8health FBI9health FBI10health

VAR_INT FBI1 FBI2 FBI3 FBI4 FBI5 FBI6 FBI7 FBI8 FBI9 FBI10 FBI_VAN1

VAR_INT sniper_asuka been_damaged_before

VAR_INT number_of_feds_killed fed1_already_dead fed2_already_dead fed3_already_dead fed4_already_dead fed5_already_dead fed6_already_dead 

VAR_INT fed7_already_dead fed8_already_dead fed9_already_dead fed10_already_dead

VAR_INT fedvan1_already_dead fbi_spotted_player fbi_spotted_player2

// ****************************************Mission Start************************************

mission_start_asuka2:

REGISTER_MISSION_GIVEN
flag_player_on_mission = 1
flag_player_on_asuka_mission = 1
SCRIPT_NAME asuka2
WAIT 0

number_of_feds_killed = 0
been_damaged_before = 0
fbi_spotted_player = 0
fbi_spotted_player2 = 0

{

LOAD_SPECIAL_MODEL cut_obj1 PLAYERH
LOAD_SPECIAL_MODEL cut_obj2 ASUKAH
LOAD_SPECIAL_MODEL cut_obj3 KENJIH
LOAD_SPECIAL_CHARACTER 1 asuka
LOAD_SPECIAL_CHARACTER 2 kenji
REQUEST_MODEL condo_ivy
REQUEST_MODEL kmricndo01


LOAD_ALL_MODELS_NOW

WHILE NOT HAS_SPECIAL_CHARACTER_LOADED 1
OR NOT HAS_SPECIAL_CHARACTER_LOADED 2
OR NOT HAS_MODEL_LOADED cut_obj1
OR NOT HAS_MODEL_LOADED cut_obj2
OR NOT HAS_MODEL_LOADED cut_obj3
	WAIT 0

ENDWHILE

WHILE NOT HAS_MODEL_LOADED condo_ivy
OR NOT HAS_MODEL_LOADED	kmricndo01
	WAIT 0
ENDWHILE

LOAD_CUTSCENE A3_SS
SET_CUTSCENE_OFFSET 523.102 -636.96 15.616

CREATE_CUTSCENE_OBJECT PED_PLAYER cs_player
SET_CUTSCENE_ANIM cs_player player

CREATE_CUTSCENE_OBJECT PED_SPECIAL1 cs_asuka
SET_CUTSCENE_ANIM cs_asuka asuka

CREATE_CUTSCENE_OBJECT PED_SPECIAL2 cs_kenji
SET_CUTSCENE_ANIM cs_kenji kenji

CREATE_CUTSCENE_HEAD cs_player CUT_OBJ1 cs_playerhead
SET_CUTSCENE_HEAD_ANIM cs_playerhead player

CREATE_CUTSCENE_HEAD cs_asuka CUT_OBJ2 cs_asukahead
SET_CUTSCENE_HEAD_ANIM cs_asukahead asuka

CREATE_CUTSCENE_HEAD cs_kenji CUT_OBJ3 cs_kenjihead
SET_CUTSCENE_HEAD_ANIM cs_kenjihead kenji

CLEAR_AREA 523.6 -639.4 16.6 1.0 TRUE
SET_PLAYER_COORDINATES player 523.6 -639.4 16.0

SET_PLAYER_HEADING player 180.0

DO_FADE 1500 FADE_IN

SWITCH_RUBBISH OFF
SWITCH_STREAMING ON
START_CUTSCENE

// Displays cutscene text


GET_CUTSCENE_TIME cs_time


WHILE cs_time < 1892
	WAIT 0
	GET_CUTSCENE_TIME cs_time
ENDWHILE

PRINT_NOW ( AM2_A ) 10000 1 

WHILE cs_time < 4983
	WAIT 0
	GET_CUTSCENE_TIME cs_time
ENDWHILE

PRINT_NOW ( AM2_A2 ) 10000 1 

WHILE cs_time < 8705
	WAIT 0
	GET_CUTSCENE_TIME cs_time
ENDWHILE

PRINT_NOW ( AM2_B ) 10000 1 

WHILE cs_time < 10494
	WAIT 0
	GET_CUTSCENE_TIME cs_time
ENDWHILE

PRINT_NOW ( AM2_C ) 10000 1 

WHILE cs_time < 16940
	WAIT 0
	GET_CUTSCENE_TIME cs_time
ENDWHILE

PRINT_NOW ( AM2_D ) 10000 1 

WHILE cs_time < 22566
	WAIT 0
	GET_CUTSCENE_TIME cs_time
ENDWHILE

PRINT_NOW ( AM2_E ) 10000 1 

WHILE cs_time < 26394
	WAIT 0
	GET_CUTSCENE_TIME cs_time
ENDWHILE

PRINT_NOW ( AM2_E2 ) 10000 1 

WHILE cs_time < 28456
	WAIT 0
	GET_CUTSCENE_TIME cs_time
ENDWHILE

PRINT_NOW ( AM2_F ) 10000 1 

WHILE cs_time < 32144
	WAIT 0
	GET_CUTSCENE_TIME cs_time
ENDWHILE

PRINT_NOW ( AM2_G ) 10000 1 

WHILE cs_time < 36663
	WAIT 0
	GET_CUTSCENE_TIME cs_time
ENDWHILE

CLEAR_PRINTS

WHILE cs_time < 39000
	WAIT 0
	GET_CUTSCENE_TIME cs_time
ENDWHILE

DO_FADE 1500 FADE_OUT

WHILE NOT HAS_CUTSCENE_FINISHED
	WAIT 0

ENDWHILE

CLEAR_PRINTS

WHILE GET_FADING_STATUS
	WAIT 0
ENDWHILE

SWITCH_RUBBISH ON
CLEAR_CUTSCENE
SET_CAMERA_IN_FRONT_OF_PLAYER

WAIT 500

DO_FADE 1500 FADE_IN

MARK_MODEL_AS_NO_LONGER_NEEDED CUT_OBJ1
MARK_MODEL_AS_NO_LONGER_NEEDED CUT_OBJ2
MARK_MODEL_AS_NO_LONGER_NEEDED CUT_OBJ3
MARK_MODEL_AS_NO_LONGER_NEEDED condo_ivy
MARK_MODEL_AS_NO_LONGER_NEEDED kmricndo01
UNLOAD_SPECIAL_CHARACTER 1
UNLOAD_SPECIAL_CHARACTER 2

REQUEST_MODEL PED_GANG_MAFIA_A
REQUEST_MODEL PED_GANG_MAFIA_B
REQUEST_MODEL CAR_RUMPO
		    
WHILE NOT HAS_MODEL_LOADED PED_GANG_MAFIA_A
OR NOT HAS_MODEL_LOADED PED_GANG_MAFIA_B
OR NOT HAS_MODEL_LOADED CAR_RUMPO
	WAIT 0
ENDWHILE
						  	

// MISSION START

fed1_already_dead = 0
fed2_already_dead = 0
fed3_already_dead = 0
fed4_already_dead = 0
fed5_already_dead = 0
fed6_already_dead = 0
fed7_already_dead = 0
fed8_already_dead = 0
fed9_already_dead = 0
fed10_already_dead = 0
fedvan1_already_dead = 0


//ADD_BLIP_FOR_COORD 430.0 -1448.7 -100.0 blip1_FBI1

countdown_as2 = 391000
DISPLAY_ONSCREEN_TIMER countdown_as2


//FEDS ON TOWER BLOCK*****************************************************************************
   		
CREATE_CHAR PEDTYPE_CIVMALE PED_GANG_MAFIA_A 383.0 -1447.9 51.4 FBI1	//Floor4
SET_CHAR_HEADING FBI1 304.0
SET_CHAR_THREAT_SEARCH FBI1 THREAT_PLAYER1
GIVE_WEAPON_TO_CHAR FBI1 WEAPONTYPE_M16 600
SET_CHAR_STAY_IN_SAME_PLACE FBI1 TRUE
SET_CHAR_PERSONALITY FBI1 PEDSTAT_TOUGH_GUY
ADD_BLIP_FOR_CHAR FBI1 blip1_FBI1 
//ADD_ARMOUR_TO_CHAR FBI1 99

CREATE_CHAR PEDTYPE_CIVMALE PED_GANG_MAFIA_B 381.2 -1438.2 63.4 FBI2	//floor6
SET_CHAR_HEADING FBI2 304.0
SET_CHAR_THREAT_SEARCH FBI2 THREAT_PLAYER1
GIVE_WEAPON_TO_CHAR FBI2 WEAPONTYPE_M16 600
SET_CHAR_STAY_IN_SAME_PLACE FBI2 TRUE
SET_CHAR_PERSONALITY FBI2 PEDSTAT_TOUGH_GUY
ADD_BLIP_FOR_CHAR FBI2 blip2_FBI2 
//ADD_ARMOUR_TO_CHAR FBI2 99

CREATE_CHAR PEDTYPE_CIVMALE PED_GANG_MAFIA_A 383.5 -1452.3 69.4 FBI3	//floor7
SET_CHAR_HEADING FBI3 304.0
SET_CHAR_THREAT_SEARCH FBI3 THREAT_PLAYER1
GIVE_WEAPON_TO_CHAR FBI3 WEAPONTYPE_M16 600
SET_CHAR_STAY_IN_SAME_PLACE FBI3 TRUE
SET_CHAR_PERSONALITY FBI3 PEDSTAT_TOUGH_GUY
ADD_BLIP_FOR_CHAR FBI3 blip3_FBI3
//ADD_ARMOUR_TO_CHAR FBI3 99

CREATE_CHAR PEDTYPE_CIVMALE PED_GANG_MAFIA_B 381.6 -1451.7 57.5 FBI8	//floor5
SET_CHAR_HEADING FBI8 304.0
SET_CHAR_THREAT_SEARCH FBI8 THREAT_PLAYER1
GIVE_WEAPON_TO_CHAR FBI8 WEAPONTYPE_M16 600
SET_CHAR_STAY_IN_SAME_PLACE FBI8 TRUE
SET_CHAR_PERSONALITY FBI8 PEDSTAT_TOUGH_GUY
ADD_BLIP_FOR_CHAR FBI8 blip8_FBI8
//ADD_ARMOUR_TO_CHAR FBI8 99

CREATE_CHAR PEDTYPE_CIVMALE PED_GANG_MAFIA_A 381.4 -1443.5 75.5 FBI9	//floor8
SET_CHAR_HEADING FBI9 304.0
SET_CHAR_THREAT_SEARCH FBI9 THREAT_PLAYER1
GIVE_WEAPON_TO_CHAR FBI9 WEAPONTYPE_M16 600
SET_CHAR_STAY_IN_SAME_PLACE FBI9 TRUE
SET_CHAR_PERSONALITY FBI9 PEDSTAT_TOUGH_GUY
ADD_BLIP_FOR_CHAR FBI9 blip9_FBI9
//ADD_ARMOUR_TO_CHAR FBI9 99

CREATE_CHAR PEDTYPE_CIVMALE PED_GANG_MAFIA_B 379.0 -1449.6 81.4 FBI10 //floor9 (Top)
SET_CHAR_HEADING FBI10 304.0
SET_CHAR_THREAT_SEARCH FBI10 THREAT_PLAYER1
GIVE_WEAPON_TO_CHAR FBI10 WEAPONTYPE_M16 600
SET_CHAR_STAY_IN_SAME_PLACE FBI10 TRUE
SET_CHAR_PERSONALITY FBI10 PEDSTAT_TOUGH_GUY
ADD_BLIP_FOR_CHAR FBI10 blip10_FBI10
//ADD_ARMOUR_TO_CHAR FBI10 99

//FEDS AT PARK**********************************************************************************

CREATE_CHAR PEDTYPE_CIVMALE PED_GANG_MAFIA_A 48.4 -642.8 29.0 FBI4 //Park
SET_CHAR_HEADING FBI4 169.0
SET_CHAR_THREAT_SEARCH FBI4 THREAT_PLAYER1
GIVE_WEAPON_TO_CHAR FBI4 WEAPONTYPE_CHAINGUN 100
SET_CHAR_STAY_IN_SAME_PLACE FBI4 TRUE
SET_CHAR_PERSONALITY FBI4 PEDSTAT_TOUGH_GUY
ADD_BLIP_FOR_CHAR FBI4 blip4_FBI4
//ADD_ARMOUR_TO_CHAR FBI4 99

CREATE_CHAR PEDTYPE_CIVMALE PED_GANG_MAFIA_B 42.2 -641.3 27.8 FBI7 //Park
SET_CHAR_HEADING FBI7 208.0
SET_CHAR_THREAT_SEARCH FBI7 THREAT_PLAYER1
GIVE_WEAPON_TO_CHAR FBI7 WEAPONTYPE_CHAINGUN 100
SET_CHAR_STAY_IN_SAME_PLACE FBI7 TRUE
SET_CHAR_PERSONALITY FBI7 PEDSTAT_TOUGH_GUY
ADD_BLIP_FOR_CHAR FBI7 blip7_FBI7
//ADD_ARMOUR_TO_CHAR FBI7 99

//FEDS IN VAN**********************************************************************************

CREATE_CAR CAR_RUMPO 61.3 -1389.4 26.3 FBI_VAN1
CHANGE_CAR_COLOUR FBI_VAN1 CARCOLOUR_BLACK CARCOLOUR_BLACK
SET_CAR_ONLY_DAMAGED_BY_PLAYER FBI_VAN1 True
LOCK_CAR_DOORS FBI_VAN1 CARLOCK_LOCKED
SET_CAR_HEADING FBI_VAN1 151.0
	CREATE_CHAR_INSIDE_CAR FBI_VAN1 PEDTYPE_CIVMALE PED_GANG_MAFIA_A FBI5
	ADD_BLIP_FOR_CHAR FBI5 blip5_FBI5
	CREATE_CHAR_AS_PASSENGER FBI_VAN1 PEDTYPE_CIVMALE PED_GANG_MAFIA_B 2 FBI6
	ADD_BLIP_FOR_CHAR FBI6 blip6_FBI6
	CAR_SET_IDLE FBI_VAN1         
	SET_CHAR_THREAT_SEARCH FBI5 THREAT_PLAYER1
	SET_CHAR_THREAT_SEARCH FBI6 THREAT_PLAYER1
	SET_CHAR_PERSONALITY FBI5 PEDSTAT_TOUGH_GUY
	SET_CHAR_PERSONALITY FBI6 PEDSTAT_TOUGH_GUY
	GIVE_WEAPON_TO_CHAR FBI5 WEAPONTYPE_CHAINGUN 100
	GIVE_WEAPON_TO_CHAR FBI6 WEAPONTYPE_CHAINGUN 100

	/*
	LOAD_MISSION_AUDIO A3_A

	WHILE NOT HAS_MISSION_AUDIO_LOADED
		WAIT 0
	ENDWHILE
	*/

WHILE NOT number_of_feds_killed = 10
 
	WAIT 0

	IF IS_CHAR_DEAD FBI1
	AND fed1_already_dead = 0
		REMOVE_BLIP blip1_FBI1
		number_of_feds_killed ++
		fed1_already_dead = 1	
	ENDIF

	IF IS_CHAR_DEAD FBI2
	AND fed2_already_dead = 0
		REMOVE_BLIP blip2_FBI2
		number_of_feds_killed ++
		fed2_already_dead = 1	
	ENDIF

	IF IS_CHAR_DEAD FBI3
	AND fed3_already_dead = 0
		REMOVE_BLIP blip3_FBI3
		number_of_feds_killed ++
		fed3_already_dead = 1	
	ENDIF

	IF IS_CHAR_DEAD FBI4
	AND fed4_already_dead = 0
		REMOVE_BLIP blip4_FBI4
		number_of_feds_killed ++
		fed4_already_dead = 1	
	ENDIF

	IF IS_CHAR_DEAD FBI5
	AND fed5_already_dead = 0
		REMOVE_BLIP blip5_FBI5
		number_of_feds_killed ++
		fed5_already_dead = 1	
	ENDIF

	IF IS_CHAR_DEAD FBI6
	AND fed6_already_dead = 0
		REMOVE_BLIP blip6_FBI6
		number_of_feds_killed ++
		fed6_already_dead = 1	
	ENDIF

	IF IS_CHAR_DEAD FBI7
	AND fed7_already_dead = 0
		REMOVE_BLIP blip7_FBI7
		number_of_feds_killed ++
		fed7_already_dead = 1	
	ENDIF

	IF IS_CHAR_DEAD FBI8
	AND fed8_already_dead = 0
		REMOVE_BLIP blip8_FBI8
		number_of_feds_killed ++
		fed8_already_dead = 1	
	ENDIF

	IF IS_CHAR_DEAD FBI9
	AND fed9_already_dead = 0
		REMOVE_BLIP blip9_FBI9
		number_of_feds_killed ++
		fed9_already_dead = 1	
	ENDIF

	IF IS_CHAR_DEAD FBI10
	AND fed10_already_dead = 0
		REMOVE_BLIP blip10_FBI10
		number_of_feds_killed ++
		fed10_already_dead = 1	
	ENDIF

	//CHECK PED HEALTH
	IF NOT IS_CHAR_DEAD FBI1
		GET_CHAR_HEALTH FBI1 FBI1health
	ENDIF
	IF NOT IS_CHAR_DEAD	FBI2
		GET_CHAR_HEALTH FBI2 FBI2health
	ENDIF
	IF NOT IS_CHAR_DEAD	FBI3
		GET_CHAR_HEALTH FBI3 FBI3health
	ENDIF
	IF NOT IS_CHAR_DEAD	FBI4
		GET_CHAR_HEALTH FBI4 FBI4health
	ENDIF
	IF NOT IS_CHAR_DEAD	FBI7
		GET_CHAR_HEALTH FBI7 FBI7health
	ENDIF
	IF NOT IS_CHAR_DEAD	FBI8
		GET_CHAR_HEALTH FBI8 FBI8health
	ENDIF
	IF NOT IS_CHAR_DEAD	FBI9
		GET_CHAR_HEALTH FBI9 FBI9health
	ENDIF
	IF NOT IS_CHAR_DEAD	FBI10
		GET_CHAR_HEALTH FBI10 FBI10health
	ENDIF


	//PARK
	IF FBI4health < 100
	OR FBI7health <	100

		IF fbi_spotted_player2 = 0

		IF NOT IS_CHAR_DEAD FBI4
			SET_CHAR_OBJ_KILL_PLAYER_ON_FOOT FBI4 Player
			SET_CHAR_ACCURACY FBI4 70
		ENDIF
		IF NOT IS_CHAR_DEAD FBI7
			SET_CHAR_OBJ_KILL_PLAYER_ON_FOOT FBI7 Player
			SET_CHAR_ACCURACY FBI7 70
		ENDIF

			fbi_spotted_player2 = 1

		ENDIF

	ENDIF

	//PARK
	IF IS_CHAR_DEAD FBI4
	OR IS_CHAR_DEAD FBI7

		IF fbi_spotted_player2 = 0

			IF NOT IS_CHAR_DEAD FBI4
				SET_CHAR_OBJ_KILL_PLAYER_ON_FOOT FBI4 Player
				SET_CHAR_ACCURACY FBI4 70
			ENDIF
			IF NOT IS_CHAR_DEAD FBI7
				SET_CHAR_OBJ_KILL_PLAYER_ON_FOOT FBI7 Player
				SET_CHAR_ACCURACY FBI7 70
			ENDIF

			fbi_spotted_player2 = 1

		ENDIF

	ENDIF


	//ROOFTOP
	IF FBI1health < 100
	OR FBI2health <	100
	OR FBI3health <	100
	OR FBI8health <	100
	OR FBI9health <	100
	OR FBI10health < 100

		IF fbi_spotted_player = 0

			//PLAY_MISSION_AUDIO

			IF NOT IS_CHAR_DEAD FBI1
				SET_CHAR_OBJ_KILL_PLAYER_ON_FOOT FBI1 Player
				SET_CHAR_ACCURACY FBI1 50
			ENDIF

			IF NOT IS_CHAR_DEAD FBI2
				SET_CHAR_OBJ_KILL_PLAYER_ON_FOOT FBI2 Player
				SET_CHAR_ACCURACY FBI2 50
			ENDIF

			IF NOT IS_CHAR_DEAD FBI3
	 				WAIT 500
				IF NOT IS_CHAR_DEAD FBI3
					SET_CHAR_OBJ_KILL_PLAYER_ON_FOOT FBI3 Player
					SET_CHAR_ACCURACY FBI3 50
				ENDIF
			ENDIF

			IF NOT IS_CHAR_DEAD FBI8
				SET_CHAR_OBJ_KILL_PLAYER_ON_FOOT FBI8 Player
				SET_CHAR_ACCURACY FBI8 50
			ENDIF

			IF NOT IS_CHAR_DEAD FBI9
					WAIT 1000
				IF NOT IS_CHAR_DEAD FBI9
					SET_CHAR_OBJ_KILL_PLAYER_ON_FOOT FBI9 Player
					SET_CHAR_ACCURACY FBI9 50
				ENDIF
			ENDIF

			IF NOT IS_CHAR_DEAD FBI10
					WAIT 1000
				IF NOT IS_CHAR_DEAD FBI10
					SET_CHAR_OBJ_KILL_PLAYER_ON_FOOT FBI10 Player
					SET_CHAR_ACCURACY FBI10 70
				ENDIF
			ENDIF

			fbi_spotted_player = 1

		ENDIF

	ENDIF

	//ROOFTOP
	IF IS_CHAR_DEAD FBI1
	OR IS_CHAR_DEAD FBI2
	OR IS_CHAR_DEAD FBI3
	OR IS_CHAR_DEAD FBI8
	OR IS_CHAR_DEAD FBI9
	OR IS_CHAR_DEAD FBI10

		IF fbi_spotted_player = 0

			//PLAY_MISSION_AUDIO

			IF NOT IS_CHAR_DEAD FBI1
				SET_CHAR_OBJ_KILL_PLAYER_ON_FOOT FBI1 Player
				SET_CHAR_ACCURACY FBI1 40
			ENDIF

			IF NOT IS_CHAR_DEAD FBI2
				SET_CHAR_OBJ_KILL_PLAYER_ON_FOOT FBI2 Player
				SET_CHAR_ACCURACY FBI2 40
			ENDIF

			IF NOT IS_CHAR_DEAD FBI3
	 				WAIT 500
				IF NOT IS_CHAR_DEAD FBI3
					SET_CHAR_OBJ_KILL_PLAYER_ON_FOOT FBI3 Player
					SET_CHAR_ACCURACY FBI3 50
				ENDIF
			ENDIF

			IF NOT IS_CHAR_DEAD FBI8
				SET_CHAR_OBJ_KILL_PLAYER_ON_FOOT FBI8 Player
				SET_CHAR_ACCURACY FBI8 40
			ENDIF

			IF NOT IS_CHAR_DEAD FBI9
					WAIT 1000
				IF NOT IS_CHAR_DEAD FBI9
					SET_CHAR_OBJ_KILL_PLAYER_ON_FOOT FBI9 Player
					SET_CHAR_ACCURACY FBI9 50
				ENDIF
			ENDIF

			IF NOT IS_CHAR_DEAD FBI10
					WAIT 1000
				IF NOT IS_CHAR_DEAD FBI10
					SET_CHAR_OBJ_KILL_PLAYER_ON_FOOT FBI10 Player
					SET_CHAR_ACCURACY FBI10 70
				ENDIF
			ENDIF


			fbi_spotted_player = 1

		ENDIF

	ENDIF

	IF NOT IS_CAR_DEAD FBI_VAN1
		IF NOT IS_CAR_HEALTH_GREATER FBI_VAN1 999
		AND been_damaged_before = 0
			IF NOT IS_CHAR_DEAD FBI5
			AND NOT IS_CHAR_DEAD FBI6 
				SET_CAR_ONLY_DAMAGED_BY_PLAYER FBI_VAN1 false
				SET_CHAR_OBJ_KILL_PLAYER_ANY_MEANS FBI5 Player
				SET_CHAR_OBJ_KILL_PLAYER_ANY_MEANS FBI6 Player
				LOCK_CAR_DOORS FBI_VAN1 CARLOCK_UNLOCKED
				been_damaged_before = 1
			ENDIF
		ENDIF
	ENDIF

	IF countdown_as2 = 0
		GOTO mission_asuka2_failed	
	ENDIF 

ENDWHILE

}

GOTO mission_asuka2_passed 


// Mission asuka2 failed

mission_asuka2_failed:
PRINT_BIG ( M_FAIL ) 5000 1 //"Mission Failed"
RETURN

   

// mission asuka2 passed

mission_asuka2_passed:

flag_asuka_mission2_passed = 1
PLAY_MISSION_PASSED_TUNE 1
PRINT_WITH_NUMBER_BIG ( M_PASS ) 15000 5000 1 //"Mission Passed!"
CLEAR_WANTED_LEVEL player
ADD_SCORE player 15000
REGISTER_MISSION_PASSED	AM2
PLAYER_MADE_PROGRESS 1
ADD_SPRITE_BLIP_FOR_CONTACT_POINT 459.1 -1413.0 26.1 RADAR_SPRITE_KENJI kenji_contact_blip //TEST STUFF
REMOVE_BLIP com_ammu_nation2
REMOVE_BLIP com_sprayshop2
START_NEW_SCRIPT asuka_mission3_loop
START_NEW_SCRIPT kenji_mission1_loop
RETURN
		


// mission cleanup

mission_cleanup_asuka2:

flag_player_on_mission = 0
flag_player_on_asuka_mission = 0
MARK_MODEL_AS_NO_LONGER_NEEDED PED_GANG_MAFIA_A
MARK_MODEL_AS_NO_LONGER_NEEDED PED_GANG_MAFIA_B
MARK_MODEL_AS_NO_LONGER_NEEDED CAR_RUMPO
REMOVE_BLIP blip1_FBI1
REMOVE_BLIP blip2_FBI2
REMOVE_BLIP blip3_FBI3
REMOVE_BLIP blip4_FBI4
REMOVE_BLIP blip5_FBI5
REMOVE_BLIP blip6_FBI6
REMOVE_BLIP blip7_FBI7
REMOVE_BLIP blip8_FBI8
REMOVE_BLIP blip9_FBI9
REMOVE_BLIP blip10_FBI10
CLEAR_ONSCREEN_TIMER countdown_as2
MISSION_HAS_FINISHED
RETURN
		


