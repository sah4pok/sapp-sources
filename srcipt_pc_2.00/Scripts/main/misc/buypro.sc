MISSION_START
			  
mission_start_buypro1: // *********************************SHOWROOM***********************************************

SCRIPT_NAME	BUYPRO1

flag_player_on_mission = 1

WAIT 0
{

LVAR_INT property_is_hotel_room	

property_is_hotel_room = 0			

	SET_FADING_COLOUR 0 0 1
	SET_PLAYER_CONTROL player1 OFF
	SWITCH_WIDESCREEN ON

	SWITCH buying_property_switch		   

		CASE PROP_BUY0
			SET_FIXED_CAMERA_POSITION -1990.9690 292.2734 35.1049 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT -1990.0530 291.9333 35.3176 JUMP_CUT
			//PRINT_WITH_NUMBER_BIG CNTBUY1 showroom_price 50000 6 //"SHOWROOM purchased: $ 15000"
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[0] 
			START_NEW_SCRIPT steal_mission_loop
			REMOVE_BLIP steal_contact_blip
			ADD_SPRITE_BLIP_FOR_CONTACT_POINT stealX stealY stealZ steal_blip_icon steal_contact_blip
			REMOVE_BLIP showroom_contact_blip
			PLAYER_MADE_PROGRESS 1
		BREAK

		CASE PROP_BUY1
			SET_FIXED_CAMERA_POSITION -2255.7051 131.9585 38.5998 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT -2254.7161 132.0048 38.4589 JUMP_CUT
			//PRINT_WITH_NUMBER_BIG CNTBUY2 zero_price 50000 6 //"ZEROS purchased: $ 15000"
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[1]
			REMOVE_BLIP zero_contact_blip
			SWITCH_ENTRY_EXIT RCPLAY TRUE //ZEROS
			zeros_property_bought = 1
			PLAYER_MADE_PROGRESS 1
		BREAK
		
		CASE PROP_BUY2
			SET_FIXED_CAMERA_POSITION 445.1280 2540.4360 25.6202 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT 444.1882 2540.1421 25.4462 JUMP_CUT
			//PRINT_WITH_NUMBER_BIG CNTBUY3 airstrip_price 50000 6 //"AIRSTRIP purchased: $ 15000"
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[2]
			REMOVE_BLIP	airstrip_contact_blip
			START_NEW_SCRIPT pilot_school_loop
			REMOVE_BLIP	desert2_contact_blip
			REMOVE_BLIP save_house_blip[2]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT save_pickupX[2] save_pickupY[2] save_pickupZ[2] RADAR_SPRITE_SAVEHOUSE save_house_blip[2]
			CHANGE_BLIP_DISPLAY save_house_blip[2] BLIP_ONLY
			REMOVE_BLIP	pilot_contact_blip
			ADD_SPRITE_BLIP_FOR_CONTACT_POINT pilotx piloty pilotz pilot_blip_icon pilot_contact_blip
			CHANGE_BLIP_DISPLAY pilot_contact_blip BLIP_ONLY
			ACTIVATE_GARAGE cn2gar2 //HIDEOUT_FIVE
			ACTIVATE_GARAGE dhangar //hanger
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[2] propertyY[2] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE

			PLAYER_MADE_PROGRESS 1
		BREAK

		CASE PROP_BUY3
			SET_FIXED_CAMERA_POSITION 316.0747 -1786.7572 5.0712 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT 316.1206 -1785.7781 5.2692 JUMP_CUT
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[3]
			REMOVE_BLIP	prop_save_house_blip[3]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[3] propertyY[3] propertyZ[3] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[3]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[3] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[3] propertyY[3] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE
			ACTIVATE_GARAGE beacsv //HIDEOUT_TWO
			PLAYER_MADE_PROGRESS 1
		BREAK

		CASE PROP_BUY4
			SET_FIXED_CAMERA_POSITION 2430.8694 698.3348 12.9763 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT 2431.7886 697.9644 12.8430 JUMP_CUT
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[4]
			REMOVE_BLIP	prop_save_house_blip[4]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[4] propertyY[4] propertyZ[4] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[4]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[4] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[4] propertyY[4] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE
			ACTIVATE_GARAGE vEsvgrg //HIDEOUT_THREE
			PLAYER_MADE_PROGRESS 1
		BREAK

		CASE PROP_BUY5
			SET_FIXED_CAMERA_POSITION -362.3164 1152.6638 21.4821 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT -362.6989 1153.5872 21.5142 JUMP_CUT
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[5]
			REMOVE_BLIP	prop_save_house_blip[5]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[5] propertyY[5] propertyZ[5] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[5]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[5] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[5] propertyY[5] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE
			ACTIVATE_GARAGE cn2gar1 //HIDEOUT_FOUR
			PLAYER_MADE_PROGRESS 1
		BREAK

		CASE PROP_BUY6
			SET_FIXED_CAMERA_POSITION 1295.9816 2525.5703 14.1002 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT 1294.9943 2525.7239 14.0597 JUMP_CUT
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[6]
			REMOVE_BLIP	prop_save_house_blip[6]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[6] propertyY[6] propertyZ[6] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[6]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[6] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[6] propertyY[6] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE
			ACTIVATE_GARAGE blob69 //HIDEOUT_SEVEN
			PLAYER_MADE_PROGRESS 1
		BREAK

		CASE PROP_BUY7
			SET_FIXED_CAMERA_POSITION 908.9885 2006.1508 17.7914 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT 909.9134 2006.1431 17.4113 JUMP_CUT
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[7]
			REMOVE_BLIP	prop_save_house_blip[7]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[7] propertyY[7] propertyZ[7] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[7]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[7] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[7] propertyY[7] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE
			ACTIVATE_GARAGE blob7	//HIDEOUT_EIGHT
			PLAYER_MADE_PROGRESS 1
		BREAK

		CASE PROP_BUY8
			SET_FIXED_CAMERA_POSITION 2233.1401 152.5748 33.5239 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT 2233.1599 153.5324 33.2366 JUMP_CUT
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[8]
			REMOVE_BLIP	prop_save_house_blip[8]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[8] propertyY[8] propertyZ[8] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[8]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[8] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[8] propertyY[8] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE
			ACTIVATE_GARAGE burbdoo //HIDEOUT_NINE
			PLAYER_MADE_PROGRESS 1
		BREAK

		CASE PROP_BUY9
			SET_FIXED_CAMERA_POSITION 1385.5187 1901.3131 14.5901 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT 1386.4720 1901.0758 14.4041 JUMP_CUT
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[9]
			REMOVE_BLIP	prop_save_house_blip[9]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[9] propertyY[9] propertyZ[9] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[9]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[9] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[9] propertyY[9] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE
			ACTIVATE_GARAGE blob6 //HIDEOUT_TEN
			PLAYER_MADE_PROGRESS 1
		BREAK

		CASE PROP_BUY10
			SET_FIXED_CAMERA_POSITION 1689.1176 -2120.1648 18.6369 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT 1689.1876 -2119.1870 18.4393 JUMP_CUT
  			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[10]
			REMOVE_BLIP	prop_save_house_blip[10]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[10] propertyY[10] propertyZ[10] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[10]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[10] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[10] propertyY[10] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE
			ACTIVATE_GARAGE carlas1 //HIDEOUT_ELEVEN
			PLAYER_MADE_PROGRESS 1
		BREAK

		CASE PROP_BUY11
			SET_FIXED_CAMERA_POSITION -2098.9670 923.2947 80.2446 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT -2098.9861 922.2994 80.3401 JUMP_CUT
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[11]
			REMOVE_BLIP	prop_save_house_blip[11]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[11] propertyY[11] propertyZ[11] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[11]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[11] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[11] propertyY[11] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE
			ACTIVATE_GARAGE sav1sfe //HIDEOUT_THIRTEEN
			PLAYER_MADE_PROGRESS 1
		BREAK

		CASE PROP_BUY12
			SET_FIXED_CAMERA_POSITION 1325.9745 -598.7552 116.1597 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT 1326.2544 -599.7052 116.0219 JUMP_CUT
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[12]
			REMOVE_BLIP	prop_save_house_blip[12]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[12] propertyY[12] propertyZ[12] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[12]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[12] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[12] propertyY[12] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE
			ACTIVATE_GARAGE CEsafe1 //HIDEOUT_TWELVE
			PLAYER_MADE_PROGRESS 1
		BREAK

		CASE PROP_BUY13
			SET_FIXED_CAMERA_POSITION -2700.6575 791.4500 70.2223 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT -2700.6614 792.4032 69.9203 JUMP_CUT
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[13]
			REMOVE_BLIP	prop_save_house_blip[13]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[13] propertyY[13] propertyZ[13] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[13]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[13] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[13] propertyY[13] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE
			ACTIVATE_GARAGE sav1sfw //HIDEOUT_FOURTEEN
			PLAYER_MADE_PROGRESS 1
		BREAK

		CASE PROP_BUY14
			SET_FIXED_CAMERA_POSITION -2476.4321 -127.2039 26.6779 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT -2475.4575 -127.2469 26.8974 JUMP_CUT
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[14]
			REMOVE_BLIP	prop_save_house_blip[14]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[14] propertyY[14] propertyZ[14] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[14]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[14] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[14] propertyY[14] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE
			ACTIVATE_GARAGE svgsfs1 //HIDEOUT_SIXTEEN
			PLAYER_MADE_PROGRESS 1
		BREAK



		// SAVEHOUSES WITHOUT GARAGE***********************************************************
		CASE PROP_BUY15
			SET_FIXED_CAMERA_POSITION 894.7908 -1663.9961 20.2020 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT 894.8030 -1663.0026 20.0891 JUMP_CUT
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[15]
			REMOVE_BLIP	prop_save_house_blip[15]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[15] propertyY[15] propertyZ[15] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[15]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[15] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[15] propertyY[15] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE
			PLAYER_MADE_PROGRESS 1
		BREAK

		CASE PROP_BUY16
			SET_FIXED_CAMERA_POSITION 2036.7603 1623.0739 13.4128 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT 2035.8002 1623.0870 13.6921 JUMP_CUT
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[16]
			REMOVE_BLIP	prop_save_house_blip[16]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[16] propertyY[16] propertyZ[16] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[16]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[16] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[16] propertyY[16] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE
			PLAYER_MADE_PROGRESS 1
			property_is_hotel_room = 1
		BREAK

		CASE PROP_BUY17
			SET_FIXED_CAMERA_POSITION 2146.1653 1286.2496 33.6386 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT 2147.1636 1286.2180 33.5943 JUMP_CUT
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[17]
			REMOVE_BLIP	prop_save_house_blip[17]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[17] propertyY[17] propertyZ[17] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[17]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[17] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[17] propertyY[17] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE
			PLAYER_MADE_PROGRESS 1
			property_is_hotel_room = 1
		BREAK

		CASE PROP_BUY18
			SET_FIXED_CAMERA_POSITION -2213.1877 744.9976 50.0240 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT -2213.2732 744.0281 50.2540 JUMP_CUT
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[18]
			REMOVE_BLIP	prop_save_house_blip[18]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[18] propertyY[18] propertyZ[18] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[18]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[18] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[18] propertyY[18] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE
			PLAYER_MADE_PROGRESS 1
		BREAK

		CASE PROP_BUY19
			SET_FIXED_CAMERA_POSITION -1437.1841 -1507.7319 103.8198 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT -1437.0469 -1508.7114 103.9666 JUMP_CUT
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[19]
			REMOVE_BLIP	prop_save_house_blip[19]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[19] propertyY[19] propertyZ[19] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[19]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[19] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[19] propertyY[19] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE
			PLAYER_MADE_PROGRESS 1
		BREAK

		CASE PROP_BUY20
			SET_FIXED_CAMERA_POSITION -2000.4270 -64.4142 40.0479 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT -2001.2571 -63.8685 40.1625 JUMP_CUT
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[20]
			REMOVE_BLIP	prop_save_house_blip[20]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[20] propertyY[20] propertyZ[20] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[20]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[20] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[20] propertyY[20] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE
			PLAYER_MADE_PROGRESS 1
		BREAK

		CASE PROP_BUY21
			SET_FIXED_CAMERA_POSITION -2379.8542 312.8534 34.2136 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT -2380.6831 313.3110 34.5349 JUMP_CUT
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[21]
			REMOVE_BLIP	prop_save_house_blip[21]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[21] propertyY[21] propertyZ[21] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[21]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[21] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[21] propertyY[21] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE
			PLAYER_MADE_PROGRESS 1
			property_is_hotel_room = 1
		BREAK

		CASE PROP_BUY22
			SET_FIXED_CAMERA_POSITION -2079.0613 -2298.0559 35.1500 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT -2078.8796 -2299.0286 35.0066 JUMP_CUT
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[22]
			REMOVE_BLIP	prop_save_house_blip[22]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[22] propertyY[22] propertyZ[22] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[22]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[22] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[22] propertyY[22] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE
			PLAYER_MADE_PROGRESS 1
		BREAK

		CASE PROP_BUY23
			SET_FIXED_CAMERA_POSITION -1545.0934 2663.0557 61.0133 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT -1544.2816 2662.5093 60.8075 JUMP_CUT
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[23]
			REMOVE_BLIP	prop_save_house_blip[23]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[23] propertyY[23] propertyZ[23] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[23]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[23] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[23] propertyY[23] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE
			PLAYER_MADE_PROGRESS 1
		BREAK

		CASE PROP_BUY24
			SET_FIXED_CAMERA_POSITION -1035.1910 1568.4561 39.7221 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT -1035.9714 1567.8857 39.4659 JUMP_CUT
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[24]
			REMOVE_BLIP	prop_save_house_blip[24]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[24] propertyY[24] propertyZ[24] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[24]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[24] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[24] propertyY[24] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE
			PLAYER_MADE_PROGRESS 1
		BREAK

		//HAS A GARAGE******************************************************************
		CASE PROP_BUY25
			SET_FIXED_CAMERA_POSITION 789.7151 -529.9901 20.7400 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT 789.8545 -529.0045 20.6445 JUMP_CUT
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[25]
			REMOVE_BLIP	prop_save_house_blip[25]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[25] propertyY[25] propertyZ[25] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[25]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[25] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[25] propertyY[25] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE
			ACTIVATE_GARAGE burbdo2 //HIDEOUT_SIX
			PLAYER_MADE_PROGRESS 1
		BREAK

		//NO GARAGE******************************************************************
		CASE PROP_BUY26
			SET_FIXED_CAMERA_POSITION 2114.3787 -1299.7422 32.8721 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT 2114.3047 -1298.8331 32.4622 JUMP_CUT
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[26]
			REMOVE_BLIP	prop_save_house_blip[26]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[26] propertyY[26] propertyZ[26] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[26]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[26] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[26] propertyY[26] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE
			PLAYER_MADE_PROGRESS 1
		BREAK
		
		CASE PROP_BUY27
			SET_FIXED_CAMERA_POSITION 2342.4958 2140.6616 11.3215 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT 2343.2434 2141.2720 11.5827 JUMP_CUT
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[27]
			REMOVE_BLIP	prop_save_house_blip[27]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[27] propertyY[27] propertyZ[27] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[27]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[27] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[27] propertyY[27] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE
			PLAYER_MADE_PROGRESS 1
			property_is_hotel_room = 1
		BREAK
		
		CASE PROP_BUY28	//CLOWNS POCKET
			SET_FIXED_CAMERA_POSITION 2119.7388 1767.8353 26.2058 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT 2120.5295 1768.4473 26.1978 JUMP_CUT
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[28]
			REMOVE_BLIP	prop_save_house_blip[28]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[28] propertyY[28] propertyZ[28] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[28]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[28] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[28] propertyY[28] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE
			PLAYER_MADE_PROGRESS 1
			property_is_hotel_room = 1
		BREAK

		CASE PROP_BUY29	//VEGAS FLAT
			SET_FIXED_CAMERA_POSITION 2820.3608 2174.8303 19.0746 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT 2820.3840 2173.8342 18.9889 JUMP_CUT
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[29]
			REMOVE_BLIP	prop_save_house_blip[29]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[29] propertyY[29] propertyZ[29] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[29]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[29] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[29] propertyY[29] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE
			PLAYER_MADE_PROGRESS 1
		BREAK
		
		CASE PROP_BUY30	//COMPRON HOOSE
			SET_FIXED_CAMERA_POSITION 2484.9707 -2013.0071 17.5718 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT 2484.9600 -2012.0312 17.3533 JUMP_CUT
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[30]
			REMOVE_BLIP	prop_save_house_blip[30]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[30] propertyY[30] propertyZ[30] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[30]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[30] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[30] propertyY[30] 10.0 ENTRYEXITS_FLAG_ENABLED TRUE
			PLAYER_MADE_PROGRESS 1
		BREAK

		CASE PROP_BUY31	//NORTH BADLANDS 
			SET_FIXED_CAMERA_POSITION 189.8908 -107.1989 5.7226 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT 190.8559 -107.2361 5.4634 JUMP_CUT
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[31]
			REMOVE_BLIP	prop_save_house_blip[31]
			ADD_SHORT_RANGE_SPRITE_BLIP_FOR_CONTACT_POINT propertyX[31] propertyY[31] propertyZ[31] RADAR_SPRITE_SAVEHOUSE prop_save_house_blip[31]
			CHANGE_BLIP_DISPLAY prop_save_house_blip[31] BLIP_ONLY
			SET_CLOSEST_ENTRY_EXIT_FLAG propertyX[31] propertyY[31] 5.0 ENTRYEXITS_FLAG_ENABLED TRUE
			PLAYER_MADE_PROGRESS 1
		BREAK
		
		CASE PROP_BUY32
			SET_FIXED_CAMERA_POSITION 1553.435, 693.2147, 25.6585 0.0 0.0 0.0
			POINT_CAMERA_AT_POINT 1611.496, 727.6816, 10.1995 JUMP_CUT
			//PRINT_WITH_NUMBER_BIG CNTBUY4 save_houseprice[32] 50000 6 //"SUNSHINE AUTOS purchased: $ 75000"
			INCREMENT_INT_STAT PROPERTY_BUDGET save_houseprice[32] 
			//START_NEW_SCRIPT steal_mission_loop
			REMOVE_BLIP steal_contact_blip
			//ADD_SPRITE_BLIP_FOR_CONTACT_POINT 1613.077 727.642 10.1961  steal_blip_icon steal_contact_blip
			REMOVE_BLIP sunshine_contact_blip
			ACTIVATE_GARAGE LVCAR1 //HIDEOUT_FIVE
			ACTIVATE_GARAGE LVCAR2 //hanger

			PLAYER_MADE_PROGRESS 1
		BREAK

	ENDSWITCH

	IF property_is_hotel_room = 0
		PRINT_BIG ( BUYPRO ) 5000 2
	ELSE
		PRINT_BIG ( HSUITE ) 5000 2
	ENDIF

	PLAY_MISSION_PASSED_TUNE 2

	WAIT 5000

	IF NOT IS_PLAYER_PLAYING player1
		TERMINATE_THIS_SCRIPT
	ENDIF

	CLEAR_PRINTS
	SET_CAMERA_BEHIND_PLAYER
	RESTORE_CAMERA_JUMPCUT

	SET_PLAYER_CONTROL player1 ON
	SET_EVERYONE_IGNORE_PLAYER player1 FALSE
	SWITCH_WIDESCREEN OFF

	flag_player_on_mission = 0
	GET_GAME_TIMER timer_mobile_start

MISSION_HAS_FINISHED
MISSION_END

}
RETURN 

