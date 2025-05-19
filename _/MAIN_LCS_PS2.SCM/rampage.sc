:RAMPAGE
0116: set_deatharrest_state 0
03A9: script_name 'RAMPAGE' // RAMPAGE
1@ = 1
0411: is_german_game
jf @RAMPAGE_81
12@ = 13
$_168 = 1
$_170 = 1
$_173 = 1
$_174 = 1
$_177 = 1
$_179 = 1
$_182 = 1
goto @RAMPAGE_86

:RAMPAGE_81
12@ = 20

:RAMPAGE_86
$2602 = 5000
$2603 = 0
$2604 = 0
$2645 = 30
$2646 = 10
$2647 = 25
$2648 = 25
$2649 = 7
$2650 = 30
$2651 = 10
$2652 = 25
$2653 = 25
$2654 = 30
$2655 = 40
$2656 = 30
$2657 = 30
$2658 = 25
$2659 = 35
$2660 = 10
$2661 = 25
$2662 = 10
$2663 = 30
$2664 = 40
$2665 = 861.748
$2685 = -663.76
$2705 = 15.632
$2666 = 849.0
$2686 = -476.0
$2706 = 15.2
$2667 = 967.45
$2687 = -65.0
$2707 = 7.75
$2668 = 1344.0
$2688 = -383.0
$2708 = 47.6
$2669 = 1184.0
$2689 = -146.0
$2709 = 14.75
$2670 = 1253.78
$2690 = -530.23
$2710 = 29.85
$2671 = 189.84
$2691 = -642.3
$2711 = 28.0
$2672 = 104.0
$2692 = -962.75
$2712 = 28.75
$2673 = 244.32
$2693 = -1188.05
$2713 = 20.05
$2674 = 130.25
$2694 = -41.0
$2714 = 17.0
$2675 = 65.01
$2695 = -1589.96
$2715 = 28.34
$2676 = 47.0
$2696 = -640.6
$2716 = 28.9
$2677 = -163.5
$2697 = -1406.5
$2717 = 25.9
$2678 = -1082.5
$2698 = -24.5
$2718 = 49.0
$2679 = -1205.5
$2699 = 551.0
$2719 = 68.5
$2680 = -848.75
$2700 = -184.5
$2720 = 41.86
$2681 = -1040.82
$2701 = -271.38
$2721 = 49.78
$2682 = -501.0
$2702 = -44.5
$2722 = 3.9
$2683 = -458.21
$2703 = 287.37
$2723 = 73.4
$2684 = -544.1
$2704 = 34.3
$2724 = 3.93
040D: set_total_rampages_to 12@
0@ = 0

:RAMPAGE_724
$_163(0@,20) == 0
jf @RAMPAGE_768
0218: create_pickup #KILLFRENZY type 3 at $2665(0@,20) $2685(0@,20) $2705(0@,20) store_to $2605(0@,20)
goto @RAMPAGE_774

:RAMPAGE_768
$2604 += 1

:RAMPAGE_774
0@ += 1
0@ >= 20
jf @RAMPAGE_724

:RAMPAGE_791
wait 100
0@ = 0

:RAMPAGE_799
0219: has_pickup_been_collected $2605(0@,20)
jf @RAMPAGE_2936
$_163(0@,20) == 0
jf @RAMPAGE_2936
021A: remove_pickup $2605(0@,20)
$ONMISSION = 1
05AE: args 0 out 0 locals_base_index 13 call_func @MDLMAC_2797 
811D:   not is_char_dead $PLAYER_ACTOR
jf @RAMPAGE_2867
00BA: print_big 'RAMPAGE' time 1000 style 2 // RAMPAGE
025B: is_player_playing $PLAYER_CHAR
jf @RAMPAGE_890
01B9: set_player_control $PLAYER_CHAR to 0

:RAMPAGE_890
05AE: args 1 out 0 locals_base_index 13 call_func @MDLMAC_2446 500 
0@ == 0
jf @RAMPAGE_921
RAMPAGE_3230()

:RAMPAGE_921
0@ == 1
jf @RAMPAGE_940
RAMPAGE_3482()

:RAMPAGE_940
0@ == 2
jf @RAMPAGE_959
RAMPAGE_3600()

:RAMPAGE_959
0@ == 3
jf @RAMPAGE_978
RAMPAGE_3849()

:RAMPAGE_978
0@ == 4
jf @RAMPAGE_997
RAMPAGE_4048()

:RAMPAGE_997
0@ == 5
jf @RAMPAGE_1016
RAMPAGE_4175()

:RAMPAGE_1016
0@ == 6
jf @RAMPAGE_1035
RAMPAGE_4281()

:RAMPAGE_1035
0@ == 7
jf @RAMPAGE_1054
RAMPAGE_4408()

:RAMPAGE_1054
0@ == 8
jf @RAMPAGE_1073
RAMPAGE_4535()

:RAMPAGE_1073
0@ == 9
jf @RAMPAGE_1092
RAMPAGE_4996()

:RAMPAGE_1092
0@ == 10
jf @RAMPAGE_1111
RAMPAGE_5301()

:RAMPAGE_1111
0@ == 11
jf @RAMPAGE_1130
RAMPAGE_5407()

:RAMPAGE_1130
0@ == 12
jf @RAMPAGE_1149
RAMPAGE_5525()

:RAMPAGE_1149
0@ == 13
jf @RAMPAGE_1168
RAMPAGE_5989()

:RAMPAGE_1168
0@ == 14
jf @RAMPAGE_1187
RAMPAGE_6241()

:RAMPAGE_1187
0@ == 15
jf @RAMPAGE_1206
RAMPAGE_6359()

:RAMPAGE_1206
0@ == 16
jf @RAMPAGE_1225
RAMPAGE_6477()

:RAMPAGE_1225
0@ == 17
jf @RAMPAGE_1244
RAMPAGE_6603()

:RAMPAGE_1244
0@ == 18
jf @RAMPAGE_1263
RAMPAGE_6741()

:RAMPAGE_1263
0@ == 19
jf @RAMPAGE_1282
RAMPAGE_6918()

:RAMPAGE_1282
01FF: read_kill_frenzy_status $2603

:RAMPAGE_1286
$2603 == 1
jf @RAMPAGE_1555
wait 0
01FF: read_kill_frenzy_status $2603
if or
0@ == 5
0@ == 18
0@ == 10
jf @RAMPAGE_1411
025B: is_player_playing $PLAYER_CHAR
jf @RAMPAGE_1411
80E5:   not is_player_in_any_car $PLAYER_CHAR
jf @RAMPAGE_1385
1@ == 1
jf @RAMPAGE_1385
00BD: print_soon 'RAMPKA' time 5000 flag 1 // ~w~You need a vehicle for this rampage.
1@ = 0

:RAMPAGE_1385
00E5: is_player_in_any_car $PLAYER_CHAR
jf @RAMPAGE_1411
03DA: clear_this_print 'RAMPKA' // ~w~You need a vehicle for this rampage.
1@ = 1

:RAMPAGE_1411
if or
0@ == 5
0@ == 10
0@ == 18
jf @RAMPAGE_1548
025B: is_player_playing $PLAYER_CHAR
jf @RAMPAGE_1548
01FA: get_player_char $PLAYER_CHAR store_to 2@
04C9: get_offset_from_char_in_world_coords 2@ offset -10.0 10.0 -10.0 store_to 6@ 7@ 8@
04C9: get_offset_from_char_in_world_coords 2@ offset 10.0 -10.0 10.0 store_to 9@ 10@ 11@
02E1: get_random_char_in_area from 6@ 7@ to 9@ 10@ civilian 1 gang 1 criminal/prostitute 1 store_to 4@
0572: does_char_exist 4@
jf @RAMPAGE_1548
00E5: is_player_in_any_car $PLAYER_CHAR
jf @RAMPAGE_1545
03C6: store_car_player_is_in_no_save $PLAYER_CHAR store_to 3@
020E: generate_random_int_in_range 1 4 store_to 5@
5@ == 4
jf @RAMPAGE_1545
05F6: set_char_evasive_dive char 4@ vehicle 3@

:RAMPAGE_1545
01C7: mark_char_as_no_longer_needed 4@

:RAMPAGE_1548
goto @RAMPAGE_1286

:RAMPAGE_1555
$2603 == 2
jf @RAMPAGE_2274
$_163(0@,20) == 0
jf @RAMPAGE_2034

:RAMPAGE_1582
0@ == 0
jf @RAMPAGE_1604
0311: player_made_progress 1
goto @RAMPAGE_2034

:RAMPAGE_1604
0@ == 1
jf @RAMPAGE_1627
0311: player_made_progress 1
goto @RAMPAGE_2034

:RAMPAGE_1627
0@ == 2
jf @RAMPAGE_1650
0311: player_made_progress 1
goto @RAMPAGE_2034

:RAMPAGE_1650
0@ == 3
jf @RAMPAGE_1673
0311: player_made_progress 1
goto @RAMPAGE_2034

:RAMPAGE_1673
0@ == 4
jf @RAMPAGE_1696
0311: player_made_progress 1
goto @RAMPAGE_2034

:RAMPAGE_1696
0@ == 5
jf @RAMPAGE_1719
0311: player_made_progress 1
goto @RAMPAGE_2034

:RAMPAGE_1719
0@ == 6
jf @RAMPAGE_1742
0311: player_made_progress 1
goto @RAMPAGE_2034

:RAMPAGE_1742
0@ == 7
jf @RAMPAGE_1765
0311: player_made_progress 1
goto @RAMPAGE_2034

:RAMPAGE_1765
0@ == 8
jf @RAMPAGE_1788
0311: player_made_progress 1
goto @RAMPAGE_2034

:RAMPAGE_1788
0@ == 9
jf @RAMPAGE_1811
0311: player_made_progress 1
goto @RAMPAGE_2034

:RAMPAGE_1811
0@ == 10
jf @RAMPAGE_1834
0311: player_made_progress 1
goto @RAMPAGE_2034

:RAMPAGE_1834
0@ == 11
jf @RAMPAGE_1857
0311: player_made_progress 1
goto @RAMPAGE_2034

:RAMPAGE_1857
0@ == 12
jf @RAMPAGE_1880
0311: player_made_progress 1
goto @RAMPAGE_2034

:RAMPAGE_1880
0@ == 13
jf @RAMPAGE_1903
0311: player_made_progress 1
goto @RAMPAGE_2034

:RAMPAGE_1903
0@ == 14
jf @RAMPAGE_1926
0311: player_made_progress 1
goto @RAMPAGE_2034

:RAMPAGE_1926
0@ == 15
jf @RAMPAGE_1949
0311: player_made_progress 1
goto @RAMPAGE_2034

:RAMPAGE_1949
0@ == 16
jf @RAMPAGE_1972
0311: player_made_progress 1
goto @RAMPAGE_2034

:RAMPAGE_1972
0@ == 17
jf @RAMPAGE_1995
0311: player_made_progress 1
goto @RAMPAGE_2034

:RAMPAGE_1995
0@ == 18
jf @RAMPAGE_2018
0311: player_made_progress 1
goto @RAMPAGE_2034

:RAMPAGE_2018
0@ == 19
jf @RAMPAGE_2034
0311: player_made_progress 1

:RAMPAGE_2034
$_163(0@,20) = 1
0411: is_german_game
jf @RAMPAGE_2260
0@ == 0
jf @RAMPAGE_2081
0@ = 5
goto @RAMPAGE_1582
goto @RAMPAGE_2260

:RAMPAGE_2081
0@ == 1
jf @RAMPAGE_2112
0@ = 7
goto @RAMPAGE_1582
goto @RAMPAGE_2260

:RAMPAGE_2112
0@ == 2
jf @RAMPAGE_2143
0@ = 11
goto @RAMPAGE_1582
goto @RAMPAGE_2260

:RAMPAGE_2143
0@ == 3
jf @RAMPAGE_2174
0@ = 14
goto @RAMPAGE_1582
goto @RAMPAGE_2260

:RAMPAGE_2174
0@ == 4
jf @RAMPAGE_2205
0@ = 16
goto @RAMPAGE_1582
goto @RAMPAGE_2260

:RAMPAGE_2205
0@ == 6
jf @RAMPAGE_2236
0@ = 19
goto @RAMPAGE_1582
goto @RAMPAGE_2260

:RAMPAGE_2236
0@ == 8
jf @RAMPAGE_2260
0@ = 10
goto @RAMPAGE_1582

:RAMPAGE_2260
RAMPAGE_2994()
goto @RAMPAGE_2312

:RAMPAGE_2274
00BA: print_big 'RAMP_F' time 1000 style 1 // RAMPAGE FAILED!
0218: create_pickup #KILLFRENZY type 3 at $2665(0@,20) $2685(0@,20) $2705(0@,20) store_to $2605(0@,20)

:RAMPAGE_2312
0411: is_german_game
jf @RAMPAGE_2481
0@ == 5
jf @RAMPAGE_2344
0@ = 0
goto @RAMPAGE_2481

:RAMPAGE_2344
0@ == 7
jf @RAMPAGE_2368
0@ = 1
goto @RAMPAGE_2481

:RAMPAGE_2368
0@ == 11
jf @RAMPAGE_2392
0@ = 2
goto @RAMPAGE_2481

:RAMPAGE_2392
0@ == 14
jf @RAMPAGE_2416
0@ = 3
goto @RAMPAGE_2481

:RAMPAGE_2416
0@ == 16
jf @RAMPAGE_2440
0@ = 4
goto @RAMPAGE_2481

:RAMPAGE_2440
0@ == 19
jf @RAMPAGE_2464
0@ = 6
goto @RAMPAGE_2481

:RAMPAGE_2464
0@ == 10
jf @RAMPAGE_2481
0@ = 8

:RAMPAGE_2481
0@ == 0
jf @RAMPAGE_2499
RAMPAGE_3462()

:RAMPAGE_2499
0@ == 1
jf @RAMPAGE_2518
RAMPAGE_3593()

:RAMPAGE_2518
0@ == 2
jf @RAMPAGE_2537
RAMPAGE_3829()

:RAMPAGE_2537
0@ == 3
jf @RAMPAGE_2556
RAMPAGE_4028()

:RAMPAGE_2556
0@ == 4
jf @RAMPAGE_2575
RAMPAGE_4163()

:RAMPAGE_2575
0@ == 5
jf @RAMPAGE_2594
RAMPAGE_4279()

:RAMPAGE_2594
0@ == 6
jf @RAMPAGE_2613
RAMPAGE_4396()

:RAMPAGE_2613
0@ == 7
jf @RAMPAGE_2632
RAMPAGE_4523()

:RAMPAGE_2632
0@ == 8
jf @RAMPAGE_2651
RAMPAGE_4976()

:RAMPAGE_2651
0@ == 9
jf @RAMPAGE_2670
RAMPAGE_5281()

:RAMPAGE_2670
0@ == 10
jf @RAMPAGE_2689
RAMPAGE_5405()

:RAMPAGE_2689
0@ == 11
jf @RAMPAGE_2708
RAMPAGE_5518()

:RAMPAGE_2708
0@ == 12
jf @RAMPAGE_2727
RAMPAGE_5969()

:RAMPAGE_2727
0@ == 13
jf @RAMPAGE_2746
RAMPAGE_6221()

:RAMPAGE_2746
0@ == 14
jf @RAMPAGE_2765
RAMPAGE_6352()

:RAMPAGE_2765
0@ == 15
jf @RAMPAGE_2784
RAMPAGE_6470()

:RAMPAGE_2784
0@ == 16
jf @RAMPAGE_2803
RAMPAGE_6591()

:RAMPAGE_2803
0@ == 17
jf @RAMPAGE_2822
RAMPAGE_6734()

:RAMPAGE_2822
0@ == 18
jf @RAMPAGE_2841
RAMPAGE_6908()

:RAMPAGE_2841
0@ == 19
jf @RAMPAGE_2860
RAMPAGE_7033()

:RAMPAGE_2860
goto @RAMPAGE_2895

:RAMPAGE_2867
wait 10000
0218: create_pickup #KILLFRENZY type 3 at $2665(0@,20) $2685(0@,20) $2705(0@,20) store_to $2605(0@,20)

:RAMPAGE_2895
$ONMISSION = 0
05AE: args 1 out 0 locals_base_index 13 call_func @Noname_1_7026 1 
05AE: args 1 out 0 locals_base_index 13 call_func @Noname_1_7026 2 
05AE: args 1 out 0 locals_base_index 13 call_func @Noname_1_7026 3 

:RAMPAGE_2936
0@ += 1
0@ >= 20
jf @RAMPAGE_799
$2604 == 20
jf @RAMPAGE_2973
goto @RAMPAGE_2980

:RAMPAGE_2973
goto @RAMPAGE_791

:RAMPAGE_2980
05AE: args 0 out 0 locals_base_index 13 call_func @Noname_1_2814 
00DD: mission_has_finished
004E: terminate_this_script

:RAMPAGE_2994
$2604 += 1
0084: $2602 = $2604  // (int)
$2602 *= 50
0115: clear_wanted_level $PLAYER_CHAR
010E: add_score $PLAYER_CHAR value $2602 // money
01E8: print_with_number_big 'REWARD' number $2602 time 5000 style 6 // ~w~Reward: $~1~
00BA: print_big 'RAMP_P' time 1000 style 1 // RAMPAGE PASSED!
0399: play_mission_passed_tune 1
20 > $2604
jf @RAMPAGE_3078
goto @RAMPAGE_3228

:RAMPAGE_3078
$_212 == 0
jf @RAMPAGE_3228
01E8: print_with_number_big 'RAMP_A' number $2602 time 5000 style 6 // ~w~ALL RAMPAGES COMPLETED! $~1~
$_212 = 1
$2265 == 1
jf @RAMPAGE_3152
0330: create_pickup_with_ammo #M60 type 15 ammo 120 at 1154.54 -228.87 16.96 store_to $2264

:RAMPAGE_3152
$2277 == 1
jf @RAMPAGE_3191
0330: create_pickup_with_ammo #M60 type 15 ammo 120 at 276.36 -446.86 25.8 store_to $2276

:RAMPAGE_3191
$2288 == 1
jf @RAMPAGE_3228
0330: create_pickup_with_ammo #M60 type 15 ammo 120 at -847.96 313.11 40.0 store_to $2287

:RAMPAGE_3228
return 

:RAMPAGE_3230
024C: request_model #AK47
024C: request_model #GANG03
024C: request_model #GANG04
0390: load_all_models_now
01FE: start_kill_frenzy 'PAGE_00' weapon 27 time 120000 targets $2645 models 81 82 -1 -1 completed_text 0 // .
025B: is_player_playing $PLAYER_CHAR
jf @RAMPAGE_3295
01B9: set_player_control $PLAYER_CHAR to 1
01FC: set_police_ignore_player $PLAYER_CHAR to 0

:RAMPAGE_3295
80E5:   not is_player_in_any_car $PLAYER_CHAR
jf @RAMPAGE_3317
057E: stop_char $PLAYER_ACTOR
0377: set_char $PLAYER_ACTOR anim 0 wait_state_time -1 ms

:RAMPAGE_3317
03CC: set_wanted_multiplier 0.3
05AE: args 1 out 0 locals_base_index 13 call_func @MDLMAC_2477 500 
01E9: print_with_number 'PAGE_01' number $2645 time 5000 flag 2 // Gun down ~1~ Triads in 2 minutes!
0161: set_zone_ped_info 'CHINA_N' time_of_day 1 30 0 600 0 0 0 0 0 0 0 2
0161: set_zone_ped_info 'CHINA_N' time_of_day 0 30 0 600 0 0 0 0 0 0 0 2
0161: set_zone_ped_info 'CHINA_S' time_of_day 1 30 0 600 0 0 0 0 0 0 0 2
0161: set_zone_ped_info 'CHINA_S' time_of_day 0 30 0 600 0 0 0 0 0 0 0 2
return 

:RAMPAGE_3462
03CC: set_wanted_multiplier 1.0
024E: mark_model_as_no_longer_needed #AK47
024E: mark_model_as_no_longer_needed #GANG03
024E: mark_model_as_no_longer_needed #GANG04
return 

:RAMPAGE_3482
024C: request_model #ROCKETLA
0390: load_all_models_now
01FE: start_kill_frenzy 'PAGE_00' weapon 30 time 120000 targets $2646 models -2 -1 -1 -1 completed_text 0 // .
025B: is_player_playing $PLAYER_CHAR
jf @RAMPAGE_3539
01B9: set_player_control $PLAYER_CHAR to 1
01FC: set_police_ignore_player $PLAYER_CHAR to 0

:RAMPAGE_3539
80E5:   not is_player_in_any_car $PLAYER_CHAR
jf @RAMPAGE_3561
057E: stop_char $PLAYER_ACTOR
0377: set_char $PLAYER_ACTOR anim 0 wait_state_time -1 ms

:RAMPAGE_3561
05AE: args 1 out 0 locals_base_index 13 call_func @MDLMAC_2477 500 
01E9: print_with_number 'PAGE_02' number $2646 time 5000 flag 2 // Blow up ~1~ vehicles in 2 minutes!
return 

:RAMPAGE_3593
024E: mark_model_as_no_longer_needed #ROCKETLA
return 

:RAMPAGE_3600
024C: request_model #FLAME
024C: request_model #GANG05
024C: request_model #GANG06
0390: load_all_models_now
01FE: start_kill_frenzy 'PAGE_00' weapon 31 time 120000 targets $2647 models 83 84 -1 -1 completed_text 0 // .
025B: is_player_playing $PLAYER_CHAR
jf @RAMPAGE_3665
01B9: set_player_control $PLAYER_CHAR to 1
01FC: set_police_ignore_player $PLAYER_CHAR to 0

:RAMPAGE_3665
80E5:   not is_player_in_any_car $PLAYER_CHAR
jf @RAMPAGE_3687
057E: stop_char $PLAYER_ACTOR
0377: set_char $PLAYER_ACTOR anim 0 wait_state_time -1 ms

:RAMPAGE_3687
03CC: set_wanted_multiplier 0.5
05AE: args 1 out 0 locals_base_index 13 call_func @MDLMAC_2477 500 
01E9: print_with_number 'PAGE_03' number $2647 time 5000 flag 2 // Incinerate ~1~ Diablos in 2 minutes!
0161: set_zone_ped_info 'HARWOOD' time_of_day 1 20 0 0 600 0 0 0 0 0 0 2 // Harwood
0161: set_zone_ped_info 'HARWOOD' time_of_day 0 20 0 0 600 0 0 0 0 0 0 2 // Harwood
0161: set_zone_ped_info 'TOWERS' time_of_day 1 20 0 0 600 0 0 0 0 0 0 2 // Hepburn Heights
0161: set_zone_ped_info 'TOWERS' time_of_day 0 20 0 0 600 0 0 0 0 0 0 2 // Hepburn Heights
return 

:RAMPAGE_3829
03CC: set_wanted_multiplier 1.0
024E: mark_model_as_no_longer_needed #FLAME
024E: mark_model_as_no_longer_needed #GANG05
024E: mark_model_as_no_longer_needed #GANG06
return 

:RAMPAGE_3849
024C: request_model #CHROMEGUN
024C: request_model #GANG01
024C: request_model #GANG02
0390: load_all_models_now
01FE: start_kill_frenzy 'PAGE_00' weapon 19 time 120000 targets $2648 models 79 80 -1 -1 completed_text 0 // .
025B: is_player_playing $PLAYER_CHAR
jf @RAMPAGE_3914
01B9: set_player_control $PLAYER_CHAR to 1
01FC: set_police_ignore_player $PLAYER_CHAR to 0

:RAMPAGE_3914
80E5:   not is_player_in_any_car $PLAYER_CHAR
jf @RAMPAGE_3936
057E: stop_char $PLAYER_ACTOR
0377: set_char $PLAYER_ACTOR anim 0 wait_state_time -1 ms

:RAMPAGE_3936
03CC: set_wanted_multiplier 0.3
05AE: args 1 out 0 locals_base_index 13 call_func @MDLMAC_2477 500 
01E9: print_with_number 'PAGE_04' number $2648 time 5000 flag 2 // Kill ~1~ Leone mafia in 2 minutes!
0161: set_zone_ped_info 'LITTLEI' time_of_day 1 20 600 0 0 0 0 0 0 0 0 2 // Saint Mark's
0161: set_zone_ped_info 'LITTLEI' time_of_day 0 20 600 0 0 0 0 0 0 0 0 2 // Saint Mark's
return 

:RAMPAGE_4028
03CC: set_wanted_multiplier 1.0
024E: mark_model_as_no_longer_needed #CHROMEGUN
024E: mark_model_as_no_longer_needed #GANG01
024E: mark_model_as_no_longer_needed #GANG02
return 

:RAMPAGE_4048
024C: request_model #MOLOTOV
0390: load_all_models_now
01FE: start_kill_frenzy 'PAGE_00' weapon 15 time 120000 targets $2649 models -2 -1 -1 -1 completed_text 0 // .
025B: is_player_playing $PLAYER_CHAR
jf @RAMPAGE_4105
01B9: set_player_control $PLAYER_CHAR to 1
01FC: set_police_ignore_player $PLAYER_CHAR to 0

:RAMPAGE_4105
80E5:   not is_player_in_any_car $PLAYER_CHAR
jf @RAMPAGE_4127
057E: stop_char $PLAYER_ACTOR
0377: set_char $PLAYER_ACTOR anim 0 wait_state_time -1 ms

:RAMPAGE_4127
03CC: set_wanted_multiplier 0.5
05AE: args 1 out 0 locals_base_index 13 call_func @MDLMAC_2477 500 
01E9: print_with_number 'PAGE_05' number $2649 time 5000 flag 2 // Burn ~1~ vehicles in 2 minutes!
return 

:RAMPAGE_4163
03CC: set_wanted_multiplier 1.0
024E: mark_model_as_no_longer_needed #MOLOTOV
return 

:RAMPAGE_4175
01FE: start_kill_frenzy 'PAGE_00' weapon 40 time 120000 targets $2650 models -1 -1 -1 -1 completed_text 0 // .
025B: is_player_playing $PLAYER_CHAR
jf @RAMPAGE_4225
01B9: set_player_control $PLAYER_CHAR to 1
01FC: set_police_ignore_player $PLAYER_CHAR to 0

:RAMPAGE_4225
80E5:   not is_player_in_any_car $PLAYER_CHAR
jf @RAMPAGE_4247
057E: stop_char $PLAYER_ACTOR
0377: set_char $PLAYER_ACTOR anim 0 wait_state_time -1 ms

:RAMPAGE_4247
05AE: args 1 out 0 locals_base_index 13 call_func @MDLMAC_2477 500 
01E9: print_with_number 'PAGE_06' number $2650 time 5000 flag 2 // Run over ~1~ pedestrians in 2 minutes!
return 

:RAMPAGE_4279
return 

:RAMPAGE_4281
024C: request_model #GRENADE
0390: load_all_models_now
01FE: start_kill_frenzy 'PAGE_00' weapon 12 time 120000 targets $2651 models -2 -1 -1 -1 completed_text 0 // .
025B: is_player_playing $PLAYER_CHAR
jf @RAMPAGE_4338
01B9: set_player_control $PLAYER_CHAR to 1
01FC: set_police_ignore_player $PLAYER_CHAR to 0

:RAMPAGE_4338
80E5:   not is_player_in_any_car $PLAYER_CHAR
jf @RAMPAGE_4360
057E: stop_char $PLAYER_ACTOR
0377: set_char $PLAYER_ACTOR anim 0 wait_state_time -1 ms

:RAMPAGE_4360
03CC: set_wanted_multiplier 0.5
05AE: args 1 out 0 locals_base_index 13 call_func @MDLMAC_2477 500 
01E9: print_with_number 'PAGE_07' number $2651 time 5000 flag 2 // Destroy ~1~ vehicles in 2 minutes!
return 

:RAMPAGE_4396
03CC: set_wanted_multiplier 1.0
024E: mark_model_as_no_longer_needed #GRENADE
return 

:RAMPAGE_4408
024C: request_model #CHNSAW
0390: load_all_models_now
01FE: start_kill_frenzy 'PAGE_00' weapon 11 time 120000 targets $2652 models -1 -1 -1 -1 completed_text 0 // .
025B: is_player_playing $PLAYER_CHAR
jf @RAMPAGE_4465
01B9: set_player_control $PLAYER_CHAR to 1
01FC: set_police_ignore_player $PLAYER_CHAR to 0

:RAMPAGE_4465
80E5:   not is_player_in_any_car $PLAYER_CHAR
jf @RAMPAGE_4487
057E: stop_char $PLAYER_ACTOR
0377: set_char $PLAYER_ACTOR anim 0 wait_state_time -1 ms

:RAMPAGE_4487
03CC: set_wanted_multiplier 0.5
05AE: args 1 out 0 locals_base_index 13 call_func @MDLMAC_2477 500 
01E9: print_with_number 'PAGE_08' number $2652 time 5000 flag 2 // Massacre ~1~ pedestrians in 2 minutes!
return 

:RAMPAGE_4523
03CC: set_wanted_multiplier 1.0
024E: mark_model_as_no_longer_needed #CHNSAW
return 

:RAMPAGE_4535
024C: request_model #FLAME
024C: request_model #GANG07
024C: request_model #GANG08
0390: load_all_models_now
01FE: start_kill_frenzy 'PAGE_00' weapon 31 time 120000 targets $2653 models 85 86 -1 -1 completed_text 0 // .
025B: is_player_playing $PLAYER_CHAR
jf @RAMPAGE_4600
01B9: set_player_control $PLAYER_CHAR to 1
01FC: set_police_ignore_player $PLAYER_CHAR to 0

:RAMPAGE_4600
80E5:   not is_player_in_any_car $PLAYER_CHAR
jf @RAMPAGE_4622
057E: stop_char $PLAYER_ACTOR
0377: set_char $PLAYER_ACTOR anim 0 wait_state_time -1 ms

:RAMPAGE_4622
03CC: set_wanted_multiplier 0.5
05AE: args 1 out 0 locals_base_index 13 call_func @MDLMAC_2477 500 
01E9: print_with_number 'PAGE_09' number $2653 time 5000 flag 2 // Burn ~1~ Yakuza in 2 minutes!
0161: set_zone_ped_info 'SHOPING' time_of_day 1 25 0 0 0 600 0 0 0 0 0 2 // Bedford Point
0161: set_zone_ped_info 'SHOPING' time_of_day 0 25 0 0 0 600 0 0 0 0 0 2 // Bedford Point
0161: set_zone_ped_info 'YAKUSE1' time_of_day 1 25 0 0 0 600 0 0 0 0 0 2
0161: set_zone_ped_info 'YAKUSE1' time_of_day 0 25 0 0 0 600 0 0 0 0 0 2
0161: set_zone_ped_info 'YAKUSE2' time_of_day 1 25 0 0 0 600 0 0 0 0 0 2
0161: set_zone_ped_info 'YAKUSE2' time_of_day 0 25 0 0 0 600 0 0 0 0 0 2
0161: set_zone_ped_info 'YAKUSE3' time_of_day 1 25 0 0 0 600 0 0 0 0 0 2
0161: set_zone_ped_info 'YAKUSE3' time_of_day 0 25 0 0 0 600 0 0 0 0 0 2
0161: set_zone_ped_info 'YAKUSE4' time_of_day 1 25 0 0 0 600 0 0 0 0 0 2
0161: set_zone_ped_info 'YAKUSE4' time_of_day 0 25 0 0 0 600 0 0 0 0 0 2
0161: set_zone_ped_info 'YAKUSAW' time_of_day 1 25 0 0 0 600 0 0 0 0 0 2
0161: set_zone_ped_info 'YAKUSAW' time_of_day 0 25 0 0 0 600 0 0 0 0 0 2
return 

:RAMPAGE_4976
03CC: set_wanted_multiplier 1.0
024E: mark_model_as_no_longer_needed #FLAME
024E: mark_model_as_no_longer_needed #GANG07
024E: mark_model_as_no_longer_needed #GANG08
return 

:RAMPAGE_4996
024C: request_model #M4
024C: request_model #GANG15
024C: request_model #GANG16
0390: load_all_models_now
01FE: start_kill_frenzy 'PAGE_00' weapon 26 time 120000 targets $2654 models 93 94 -1 -1 completed_text 0 // .
025B: is_player_playing $PLAYER_CHAR
jf @RAMPAGE_5061
01B9: set_player_control $PLAYER_CHAR to 1
01FC: set_police_ignore_player $PLAYER_CHAR to 0

:RAMPAGE_5061
80E5:   not is_player_in_any_car $PLAYER_CHAR
jf @RAMPAGE_5083
057E: stop_char $PLAYER_ACTOR
0377: set_char $PLAYER_ACTOR anim 0 wait_state_time -1 ms

:RAMPAGE_5083
03CC: set_wanted_multiplier 0.3
05AE: args 1 out 0 locals_base_index 13 call_func @MDLMAC_2477 500 
01E9: print_with_number 'PAGE_10' number $2654 time 5000 flag 2 // Assassinate ~1~ Forellis in 2 minutes!
0161: set_zone_ped_info 'STADIUM' time_of_day 1 20 0 0 0 0 0 0 0 500 0 2 // Aspatria
0161: set_zone_ped_info 'STADIUM' time_of_day 0 20 0 0 0 0 0 0 0 500 0 2 // Aspatria
0161: set_zone_ped_info 'HOSPI_2' time_of_day 1 20 0 0 0 0 0 0 0 500 0 2 // Rockford
0161: set_zone_ped_info 'HOSPI_2' time_of_day 0 20 0 0 0 0 0 0 0 500 0 2 // Rockford
0161: set_zone_ped_info 'UNIVERS' time_of_day 1 20 0 0 0 0 0 0 0 500 0 2 // Liberty Campus
0161: set_zone_ped_info 'UNIVERS' time_of_day 0 20 0 0 0 0 0 0 0 500 0 2 // Liberty Campus
return 

:RAMPAGE_5281
03CC: set_wanted_multiplier 1.0
024E: mark_model_as_no_longer_needed #M4
024E: mark_model_as_no_longer_needed #GANG15
024E: mark_model_as_no_longer_needed #GANG16
return 

:RAMPAGE_5301
01FE: start_kill_frenzy 'PAGE_00' weapon 40 time 120000 targets $2655 models -1 -1 -1 -1 completed_text 0 // .
025B: is_player_playing $PLAYER_CHAR
jf @RAMPAGE_5351
01B9: set_player_control $PLAYER_CHAR to 1
01FC: set_police_ignore_player $PLAYER_CHAR to 0

:RAMPAGE_5351
80E5:   not is_player_in_any_car $PLAYER_CHAR
jf @RAMPAGE_5373
057E: stop_char $PLAYER_ACTOR
0377: set_char $PLAYER_ACTOR anim 0 wait_state_time -1 ms

:RAMPAGE_5373
05AE: args 1 out 0 locals_base_index 13 call_func @MDLMAC_2477 500 
01E9: print_with_number 'PAGE_11' number $2655 time 5000 flag 2 // Run over ~1~ pedestrians in 2 minutes!
return 

:RAMPAGE_5405
return 

:RAMPAGE_5407
024C: request_model #CHROMEGUN
0390: load_all_models_now
01FE: start_kill_frenzy 'PAGE_00' weapon 19 time 120000 targets $2656 models -1 -1 -1 -1 completed_text 0 // .
025B: is_player_playing $PLAYER_CHAR
jf @RAMPAGE_5464
01B9: set_player_control $PLAYER_CHAR to 1
01FC: set_police_ignore_player $PLAYER_CHAR to 0

:RAMPAGE_5464
80E5:   not is_player_in_any_car $PLAYER_CHAR
jf @RAMPAGE_5486
057E: stop_char $PLAYER_ACTOR
0377: set_char $PLAYER_ACTOR anim 0 wait_state_time -1 ms

:RAMPAGE_5486
05AE: args 1 out 0 locals_base_index 13 call_func @MDLMAC_2477 500 
01E9: print_with_number 'PAGE_12' number $2656 time 5000 flag 2 // Murder ~1~ pedestrians in 2 minutes!
return 

:RAMPAGE_5518
024E: mark_model_as_no_longer_needed #CHROMEGUN
return 

:RAMPAGE_5525
024C: request_model #BUDDYSHOT
024C: request_model #GANG07
024C: request_model #GANG08
0390: load_all_models_now
01FE: start_kill_frenzy 'PAGE_00' weapon 21 time 120000 targets $2657 models 85 86 -1 -1 completed_text 0 // .
025B: is_player_playing $PLAYER_CHAR
jf @RAMPAGE_5590
01B9: set_player_control $PLAYER_CHAR to 1
01FC: set_police_ignore_player $PLAYER_CHAR to 0

:RAMPAGE_5590
80E5:   not is_player_in_any_car $PLAYER_CHAR
jf @RAMPAGE_5612
057E: stop_char $PLAYER_ACTOR
0377: set_char $PLAYER_ACTOR anim 0 wait_state_time -1 ms

:RAMPAGE_5612
03CC: set_wanted_multiplier 0.3
05AE: args 1 out 0 locals_base_index 13 call_func @MDLMAC_2477 500 
01E9: print_with_number 'PAGE_13' number $2657 time 5000 flag 2 // Kill ~1~ Yakuza in 2 minutes!
0161: set_zone_ped_info 'SHOPING' time_of_day 1 20 0 0 0 600 0 0 0 0 0 2 // Bedford Point
0161: set_zone_ped_info 'SHOPING' time_of_day 0 20 0 0 0 600 0 0 0 0 0 2 // Bedford Point
0161: set_zone_ped_info 'YAKUSE1' time_of_day 1 20 0 0 0 600 0 0 0 0 0 2
0161: set_zone_ped_info 'YAKUSE1' time_of_day 0 20 0 0 0 600 0 0 0 0 0 2
0161: set_zone_ped_info 'YAKUSE2' time_of_day 1 20 0 0 0 600 0 0 0 0 0 2
0161: set_zone_ped_info 'YAKUSE2' time_of_day 0 20 0 0 0 600 0 0 0 0 0 2
0161: set_zone_ped_info 'YAKUSE3' time_of_day 1 20 0 0 0 600 0 0 0 0 0 2
0161: set_zone_ped_info 'YAKUSE3' time_of_day 0 20 0 0 0 600 0 0 0 0 0 2
0161: set_zone_ped_info 'YAKUSE4' time_of_day 1 20 0 0 0 600 0 0 0 0 0 2
0161: set_zone_ped_info 'YAKUSE4' time_of_day 0 20 0 0 0 600 0 0 0 0 0 2
0161: set_zone_ped_info 'YAKUSAW' time_of_day 1 20 0 0 0 600 0 0 0 0 0 2
0161: set_zone_ped_info 'YAKUSAW' time_of_day 0 20 0 0 0 600 0 0 0 0 0 2
return 

:RAMPAGE_5969
03CC: set_wanted_multiplier 1.0
024E: mark_model_as_no_longer_needed #BUDDYSHOT
024E: mark_model_as_no_longer_needed #GANG07
024E: mark_model_as_no_longer_needed #GANG08
return 

:RAMPAGE_5989
024C: request_model #BUDDYSHOT
024C: request_model #GANG11
024C: request_model #GANG12
0390: load_all_models_now
01FE: start_kill_frenzy 'PAGE_00' weapon 21 time 120000 targets $2658 models 89 90 -1 -1 completed_text 0 // .
025B: is_player_playing $PLAYER_CHAR
jf @RAMPAGE_6054
01B9: set_player_control $PLAYER_CHAR to 1
01FC: set_police_ignore_player $PLAYER_CHAR to 0

:RAMPAGE_6054
80E5:   not is_player_in_any_car $PLAYER_CHAR
jf @RAMPAGE_6076
057E: stop_char $PLAYER_ACTOR
0377: set_char $PLAYER_ACTOR anim 0 wait_state_time -1 ms

:RAMPAGE_6076
03CC: set_wanted_multiplier 0.3
05AE: args 1 out 0 locals_base_index 13 call_func @MDLMAC_2477 500 
01E9: print_with_number 'PAGE_14' number $2658 time 5000 flag 2 // Blow away ~1~ Colombian gangsters in 2 minutes!
0161: set_zone_ped_info 'SUBINDE' time_of_day 1 20 0 0 0 0 0 500 0 0 0 2
0161: set_zone_ped_info 'SUBINDE' time_of_day 0 20 0 0 0 0 0 500 0 0 0 2
0161: set_zone_ped_info 'SUBINDW' time_of_day 1 20 0 0 0 0 0 500 0 0 0 2
0161: set_zone_ped_info 'SUBINDW' time_of_day 0 20 0 0 0 0 0 500 0 0 0 2
return 

:RAMPAGE_6221
03CC: set_wanted_multiplier 1.0
024E: mark_model_as_no_longer_needed #CHROMEGUN
024E: mark_model_as_no_longer_needed #GANG11
024E: mark_model_as_no_longer_needed #GANG12
return 

:RAMPAGE_6241
024C: request_model #CHNSAW
0390: load_all_models_now
01FE: start_kill_frenzy 'PAGE_00' weapon 11 time 120000 targets $2659 models -1 -1 -1 -1 completed_text 0 // .
025B: is_player_playing $PLAYER_CHAR
jf @RAMPAGE_6298
01B9: set_player_control $PLAYER_CHAR to 1
01FC: set_police_ignore_player $PLAYER_CHAR to 0

:RAMPAGE_6298
80E5:   not is_player_in_any_car $PLAYER_CHAR
jf @RAMPAGE_6320
057E: stop_char $PLAYER_ACTOR
0377: set_char $PLAYER_ACTOR anim 0 wait_state_time -1 ms

:RAMPAGE_6320
05AE: args 1 out 0 locals_base_index 13 call_func @MDLMAC_2477 500 
01E9: print_with_number 'PAGE_15' number $2659 time 5000 flag 2 // Massacre ~1~ pedestrians in 2 minutes!
return 

:RAMPAGE_6352
024E: mark_model_as_no_longer_needed #CHNSAW
return 

:RAMPAGE_6359
024C: request_model #ROCKETLA
0390: load_all_models_now
01FE: start_kill_frenzy 'PAGE_00' weapon 30 time 120000 targets $2660 models -2 -1 -1 -1 completed_text 0 // .
025B: is_player_playing $PLAYER_CHAR
jf @RAMPAGE_6416
01B9: set_player_control $PLAYER_CHAR to 1
01FC: set_police_ignore_player $PLAYER_CHAR to 0

:RAMPAGE_6416
80E5:   not is_player_in_any_car $PLAYER_CHAR
jf @RAMPAGE_6438
057E: stop_char $PLAYER_ACTOR
0377: set_char $PLAYER_ACTOR anim 0 wait_state_time -1 ms

:RAMPAGE_6438
05AE: args 1 out 0 locals_base_index 13 call_func @MDLMAC_2477 500 
01E9: print_with_number 'PAGE_16' number $2660 time 5000 flag 2 // Destroy ~1~ vehicles in 2 minutes!
return 

:RAMPAGE_6470
024E: mark_model_as_no_longer_needed #ROCKETLA
return 

:RAMPAGE_6477
024C: request_model #SNIPER
0390: load_all_models_now
01FE: start_kill_frenzy 'PAGE_00' weapon 28 time 120000 targets $2661 models -1 -1 -1 -1 completed_text 0 // .
025B: is_player_playing $PLAYER_CHAR
jf @RAMPAGE_6534
01B9: set_player_control $PLAYER_CHAR to 1
01FC: set_police_ignore_player $PLAYER_CHAR to 0

:RAMPAGE_6534
80E5:   not is_player_in_any_car $PLAYER_CHAR
jf @RAMPAGE_6556
057E: stop_char $PLAYER_ACTOR
0377: set_char $PLAYER_ACTOR anim 0 wait_state_time -1 ms

:RAMPAGE_6556
03CC: set_wanted_multiplier 0
05AE: args 1 out 0 locals_base_index 13 call_func @MDLMAC_2477 500 
01E9: print_with_number 'PAGE_17' number $2661 time 5000 flag 2 // Snipe ~1~ pedestrians in 2 minutes!
return 

:RAMPAGE_6591
03CC: set_wanted_multiplier 1.0
024E: mark_model_as_no_longer_needed #SNIPER
return 

:RAMPAGE_6603
024C: request_model #SHOTGSPA

:RAMPAGE_6608
824D:   not has_model_loaded #SHOTGSPA
jf @RAMPAGE_6630
wait 0
goto @RAMPAGE_6608

:RAMPAGE_6630
01FE: start_kill_frenzy 'PAGE_00' weapon 20 time 120000 targets $2662 models -2 -1 -1 -1 completed_text 0 // .
025B: is_player_playing $PLAYER_CHAR
jf @RAMPAGE_6680
01B9: set_player_control $PLAYER_CHAR to 1
01FC: set_police_ignore_player $PLAYER_CHAR to 0

:RAMPAGE_6680
80E5:   not is_player_in_any_car $PLAYER_CHAR
jf @RAMPAGE_6702
057E: stop_char $PLAYER_ACTOR
0377: set_char $PLAYER_ACTOR anim 0 wait_state_time -1 ms

:RAMPAGE_6702
05AE: args 1 out 0 locals_base_index 13 call_func @MDLMAC_2477 500 
01E9: print_with_number 'PAGE_18' number $2662 time 5000 flag 2 // Destroy ~1~ vehicles in 2 minutes!
return 

:RAMPAGE_6734
024E: mark_model_as_no_longer_needed #SHOTGSPA
return 

:RAMPAGE_6741
024C: request_model #GANG11
024C: request_model #GANG12
0390: load_all_models_now
01FE: start_kill_frenzy 'PAGE_00' weapon 40 time 120000 targets $2663 models 89 90 -1 -1 completed_text 0 // .
025B: is_player_playing $PLAYER_CHAR
jf @RAMPAGE_6801
01B9: set_player_control $PLAYER_CHAR to 1
01FC: set_police_ignore_player $PLAYER_CHAR to 0

:RAMPAGE_6801
80E5:   not is_player_in_any_car $PLAYER_CHAR
jf @RAMPAGE_6823
057E: stop_char $PLAYER_ACTOR
0377: set_char $PLAYER_ACTOR anim 0 wait_state_time -1 ms

:RAMPAGE_6823
05AE: args 1 out 0 locals_base_index 13 call_func @MDLMAC_2477 500 
01E9: print_with_number 'PAGE_19' number $2663 time 5000 flag 2 // Run over ~1~ Colombian gang bangers in 2 minutes!
0161: set_zone_ped_info 'SWANKS' time_of_day 1 20 0 0 0 0 0 600 0 0 0 2 // Cedar Grove
0161: set_zone_ped_info 'SWANKS' time_of_day 0 20 0 0 0 0 0 600 0 0 0 2 // Cedar Grove
return 

:RAMPAGE_6908
024E: mark_model_as_no_longer_needed #GANG11
024E: mark_model_as_no_longer_needed #GANG12
return 

:RAMPAGE_6918
024C: request_model #MOLOTOV
0390: load_all_models_now
01FE: start_kill_frenzy 'PAGE_00' weapon 15 time 120000 targets $2664 models -1 -1 -1 -1 completed_text 0 // .
025B: is_player_playing $PLAYER_CHAR
jf @RAMPAGE_6975
01B9: set_player_control $PLAYER_CHAR to 1
01FC: set_police_ignore_player $PLAYER_CHAR to 0

:RAMPAGE_6975
80E5:   not is_player_in_any_car $PLAYER_CHAR
jf @RAMPAGE_6997
057E: stop_char $PLAYER_ACTOR
0377: set_char $PLAYER_ACTOR anim 0 wait_state_time -1 ms

:RAMPAGE_6997
03CC: set_wanted_multiplier 0.5
05AE: args 1 out 0 locals_base_index 13 call_func @MDLMAC_2477 500 
01E9: print_with_number 'PAGE_20' number $2664 time 5000 flag 2 // Burn ~1~ pedestrians in 2 minutes!
return 

:RAMPAGE_7033
03CC: set_wanted_multiplier 1.0
024E: mark_model_as_no_longer_needed #MOLOTOV
return 