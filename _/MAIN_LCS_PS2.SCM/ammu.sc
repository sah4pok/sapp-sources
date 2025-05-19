:AMNAT
wait 1000
$1909 == 0
jf @AMNAT_483
025B: is_player_playing $PLAYER_CHAR
jf @AMNAT_483
0126: is_player_in_zone $PLAYER_CHAR zone 'SWANKS' // Cedar Grove
jf @AMNAT_483
if or
0057: player $PLAYER_CHAR coords -367.3 241.0 59.0 to -358.8 259.6 65.0 sphere 0
$1908 == 1
jf @AMNAT_296
if or
$1907 == 1
0057: player $PLAYER_CHAR coords -367.3 251.0 59.0 to -358.8 259.6 65.0 sphere 0
jf @AMNAT_289
$1904 == 0
jf @AMNAT_176
0191: add_one_off_sound -363.05 250.455 61.355 sound 68
$1904 = 1

:AMNAT_176
if and
8353:   not slide_object $1293 to -370.05 250.455 61.355 speed 0.1 0 0 collision_check 0
$1909 == 0
jf @AMNAT_229
wait 0
goto @AMNAT_176

:AMNAT_229
$1906 == 1
jf @AMNAT_252
$1905 = 0
$1906 = 0

:AMNAT_252
$1905 == 0
jf @AMNAT_289
0191: add_one_off_sound -370.05 250.455 61.355 sound 69
$1905 = 1

:AMNAT_289
goto @AMNAT_483

:AMNAT_296
$1904 == 1
jf @AMNAT_328
0191: add_one_off_sound -370.05 250.455 61.355 sound 68

:AMNAT_328
if and
8353:   not slide_object $1293 to -363.05 250.455 61.355 speed 0.1 0 0 collision_check 1
$1909 == 0
jf @AMNAT_382
wait 0
goto @AMNAT_328

:AMNAT_382
01C0: get_object_coordinates $1293 store_to $1880 $1881 $1882
$1905 == 1
jf @AMNAT_478
$1906 = 1
if and
$1880 == -363.05
$1881 == 250.455
$1882 == 61.355
jf @AMNAT_478
0191: add_one_off_sound -363.05 250.455 61.355 sound 69
$1905 = 0
$1906 = 0

:AMNAT_478
$1904 = 0

:AMNAT_483
goto @AMNAT
03A9: script_name 'AMNAT'

:AMNAT_500
004F: start_new_script @INDAMMU 
004F: start_new_script @COMAMMU 
004F: start_new_script @PHIAMMU 
return 

:INDAMMU
03A9: script_name 'INDAMMU'
$1930 = 0
$1931 = 0
$1932 = 0
$1933 = 0
$1939 = 0
$1941 = 0
$1951 = 0
$1947 = 0
$1935 = -1

:INDAMMU_56
wait 0
825B:   not is_player_playing $PLAYER_CHAR
jf @INDAMMU_99
$1941 = 0
$1937 = 0
INDAMMU_4040()
wait 500
goto @INDAMMU_56

:INDAMMU_99
01FF: read_kill_frenzy_status $1949
$1949 == 1
jf @INDAMMU_135
INDAMMU_4040()
wait 500
goto @INDAMMU_56

:INDAMMU_135
03CB: is_collision_in_memory island_id 1
jf @INDAMMU_3902
if or
0126: is_player_in_zone $PLAYER_CHAR zone 'LITTLEI' // Saint Mark's
0126: is_player_in_zone $PLAYER_CHAR zone 'REDLIGH' // Red Light District
jf @INDAMMU_3883
00FA: locate_char_any_means_3d $PLAYER_CHAR coord 1065.47 -397.85 13.93 radius 90.0 90.0 20.0 sphere 0
jf @INDAMMU_3864
$1944 == 0
jf @INDAMMU_369
$1941 == 1
jf @INDAMMU_276
  $1939 <> 0
jf @INDAMMU_276
001F: TIMERA > $1939
jf @INDAMMU_276
$1941 = 0
$1937 = 0

:INDAMMU_276
  $1937 <> 0
jf @INDAMMU_369
  $1938 <> 0
jf @INDAMMU_369
80FA:   not locate_char_any_means_3d $PLAYER_CHAR coord 1065.47 -397.85 13.93 radius 30.0 30.0 30.0 sphere 0
jf @INDAMMU_369
001F: TIMERA > $1938
jf @INDAMMU_369
$1937 = 0
811D:   not is_char_dead $1934
jf @INDAMMU_369
01BE: set_current_char_weapon $1934 to 0

:INDAMMU_369
$1930 == 0
jf @INDAMMU_431
010C: create_object #GLOCK17 at 1072.55 -397.2 16.4 store_to $1910
0397: set_object_dynamic $1910 0
0458: set_object_rotation $1910 to 0 11.0 90.0
0555: freeze_object_position $1910 to 1
$1930 = 1

:INDAMMU_431
$1931 == 0
jf @INDAMMU_492
010C: create_object #UZI at 1072.55 -398.5 16.4 store_to $1911
0397: set_object_dynamic $1911 0
0458: set_object_rotation $1911 to 0 4.0 90.0
0555: freeze_object_position $1911 to 1
$1931 = 1

:INDAMMU_492
if and
8572:   not does_char_exist $1934
$1941 == 0
jf @INDAMMU_662
$1932 == 0
jf @INDAMMU_546
029B: unload_special_character 9
0241: load_special_character 9 model 'GUN_ASS'
$1932 = 1

:INDAMMU_546
$1933 == 0
jf @INDAMMU_569
024C: request_model #CHROMEGUN
$1933 = 1

:INDAMMU_569
if and
0242: has_special_character_loaded 9
024D: has_model_loaded #CHROMEGUN
jf @INDAMMU_662
if and
00FA: locate_char_any_means_3d $PLAYER_CHAR coord 1065.47 -397.85 13.93 radius 30.0 30.0 30.0 sphere 0
00C2: is_point_on_screen 1065.47 -397.85 13.93 radius 2.0
jf @INDAMMU_655
goto @INDAMMU_662

:INDAMMU_655
INDAMMU_3921()

:INDAMMU_662
$1944 == 0
jf @INDAMMU_1252
0057: player $PLAYER_CHAR coords 1066.2 -403.5 14.0 to 1072.8 -394.0 18.0 sphere 0
jf @INDAMMU_1252
025B: is_player_playing $PLAYER_CHAR
jf @INDAMMU_754
01B9: set_player_control $PLAYER_CHAR to 0
044F: is_player_on_foot $PLAYER_CHAR
jf @INDAMMU_748
$1929 = 0
goto @INDAMMU_754

:INDAMMU_748
$1929 = 1

:INDAMMU_754
if and
8572:   not does_char_exist $1934
$1941 == 0
jf @INDAMMU_924
025B: is_player_playing $PLAYER_CHAR
jf @INDAMMU_785

:INDAMMU_785
05AE: args 1 out 0 locals_base_index 0 call_func @MDLMAC_2446 250 
029B: unload_special_character 9
0241: load_special_character 9 model 'GUN_ASS'
$1932 = 1
024C: request_model #CHROMEGUN
$1933 = 1
0390: load_all_models_now

:INDAMMU_833
if or
8242:   not has_special_character_loaded 9
824D:   not has_model_loaded #CHROMEGUN
jf @INDAMMU_863
wait 0
goto @INDAMMU_833

:INDAMMU_863
INDAMMU_3921()
025B: is_player_playing $PLAYER_CHAR
jf @INDAMMU_887
01B9: set_player_control $PLAYER_CHAR to 1

:INDAMMU_887
0164: set_fixed_camera_position 1071.95 -402.8 17.0 rotation 0 0 0
025B: is_player_playing $PLAYER_CHAR
jf @INDAMMU_924
015C: point_camera_at_player $PLAYER_CHAR mode 15 switchstyle 2

:INDAMMU_924
025B: is_player_playing $PLAYER_CHAR
jf @INDAMMU_968
811D:   not is_char_dead $PLAYER_ACTOR
jf @INDAMMU_968
80E4:   not is_char_in_any_car $PLAYER_ACTOR
jf @INDAMMU_968
057E: stop_char $PLAYER_ACTOR
0377: set_char $PLAYER_ACTOR anim 0 wait_state_time -1 ms

:INDAMMU_968
0164: set_fixed_camera_position 1071.95 -402.8 17.0 rotation 0 0 0
025B: is_player_playing $PLAYER_CHAR
jf @INDAMMU_1005
015C: point_camera_at_player $PLAYER_CHAR mode 15 switchstyle 2

:INDAMMU_1005
03B2: switch_rubbish 0
001F: TIMERA > $1940
jf @INDAMMU_1190
0572: does_char_exist $1934
jf @INDAMMU_1178
811D:   not is_char_dead $1934
jf @INDAMMU_1178
$1941 == 0
jf @INDAMMU_1178
$1937 == 0
jf @INDAMMU_1178
$1092 == 0
jf @INDAMMU_1178
$1936 == 0
jf @INDAMMU_1109
0191: add_one_off_sound 1070.81 -396.97 14.2 sound 52

:INDAMMU_1109
$1936 == 1
jf @INDAMMU_1141
0191: add_one_off_sound 1070.81 -396.97 14.2 sound 53

:INDAMMU_1141
$1936 == 2
jf @INDAMMU_1154

:INDAMMU_1154
$1936 += 1
$1936 > 1
jf @INDAMMU_1178
$1936 = 0

:INDAMMU_1178
008A: $1940 = TIMERA  // (int)
$1940 += 10000

:INDAMMU_1190
016E: set_fading_colour 0 0 1
016F: do_fade 250 fade 1
025B: is_player_playing $PLAYER_CHAR
jf @INDAMMU_1220
01B9: set_player_control $PLAYER_CHAR to 1

:INDAMMU_1220
$1092 == 1
jf @INDAMMU_1239
$1092 = 2

:INDAMMU_1239
$1944 = 1
goto @INDAMMU_56

:INDAMMU_1252
0572: does_char_exist $1934
jf @INDAMMU_1829
811D:   not is_char_dead $1934
jf @INDAMMU_1736
$1944 == 1
jf @INDAMMU_1332
02E4: is_player_shooting $PLAYER_CHAR
jf @INDAMMU_1332
if and
82DC:   not is_current_player_weapon $PLAYER_CHAR weapon 34
82DC:   not is_current_player_weapon $PLAYER_CHAR weapon 1
82DC:   not is_current_player_weapon $PLAYER_CHAR weapon 0
jf @INDAMMU_1332
$1937 = 1

:INDAMMU_1332
045C: is_player_targetting_char $PLAYER_CHAR char $1934
jf @INDAMMU_1373
if and
82DC:   not is_current_player_weapon $PLAYER_CHAR weapon 1
82DC:   not is_current_player_weapon $PLAYER_CHAR weapon 0
jf @INDAMMU_1373
$1937 = 1

:INDAMMU_1373
811D:   not is_char_dead $PLAYER_ACTOR
jf @INDAMMU_1403
051F: has_char_been_damaged_by_char $1934 char $PLAYER_ACTOR
jf @INDAMMU_1403
$1937 = 1

:INDAMMU_1403
025B: is_player_playing $PLAYER_CHAR
jf @INDAMMU_1729
$1937 == 1
jf @INDAMMU_1475
  $1092 <> 0
jf @INDAMMU_1445
$1092 = 99

:INDAMMU_1445
01BE: set_current_char_weapon $1934 to 19
01CF: set_char_obj_kill_player_on_foot $1934 player $PLAYER_CHAR
008A: $1938 = TIMERA  // (int)
$1938 += 30000
$1937 = 2

:INDAMMU_1475
$1937 == 0
jf @INDAMMU_1729
$1947 == 0
jf @INDAMMU_1595
$1935 = -1
02E1: get_random_char_in_area from 1067.0 -403.5 to 1072.8 -394.0 civilian 1 gang 1 criminal/prostitute 1 store_to $1935
if or
003A: $1935 == $PLAYER_ACTOR
003A: $1935 == $1934
jf @INDAMMU_1560
$1935 = -1

:INDAMMU_1560
0572: does_char_exist $1935
jf @INDAMMU_1588
811D:   not is_char_dead $1935
jf @INDAMMU_1588
$1947 = 1

:INDAMMU_1588
goto @INDAMMU_1683

:INDAMMU_1595
0572: does_char_exist $1935
jf @INDAMMU_1678
011D: is_char_dead $1935
jf @INDAMMU_1633
$1947 = 0
01C7: mark_char_as_no_longer_needed $1935
goto @INDAMMU_1671

:INDAMMU_1633
80A3:   not is_char_in_area_2d $1935 from 1065.6 -403.5 to 1072.8 -394.0 sphere 0
jf @INDAMMU_1671
$1947 = 0
01C7: mark_char_as_no_longer_needed $1935

:INDAMMU_1671
goto @INDAMMU_1683

:INDAMMU_1678
$1947 = 0

:INDAMMU_1683
$1947 == 0
jf @INDAMMU_1717
01BE: set_current_char_weapon $1934 to 0
0197: set_char_obj_wait_on_foot $1934
0214: turn_char_to_face_player $1934 player $PLAYER_CHAR
goto @INDAMMU_1729

:INDAMMU_1717
01BE: set_current_char_weapon $1934 to 19
01CE: set_char_obj_kill_char_on_foot $1934 char $1935

:INDAMMU_1729
goto @INDAMMU_1822

:INDAMMU_1736
$1941 == 0
jf @INDAMMU_1802
$1941 = 1
0113: alter_wanted_level_no_drop $PLAYER_CHAR to 1
801E:   not $1939 > TIMERA
jf @INDAMMU_1784
008A: $1939 = TIMERA  // (int)
$1939 += 30000

:INDAMMU_1784
  $1092 <> 0
jf @INDAMMU_1802
$1092 = 99

:INDAMMU_1802
0572: does_char_exist $1935
jf @INDAMMU_1822
01C7: mark_char_as_no_longer_needed $1935
$1947 = 0

:INDAMMU_1822
goto @INDAMMU_1849

:INDAMMU_1829
0572: does_char_exist $1935
jf @INDAMMU_1849
01C7: mark_char_as_no_longer_needed $1935
$1947 = 0

:INDAMMU_1849
$1944 == 1
jf @INDAMMU_2023
if and
8057:   not player $PLAYER_CHAR coords 1065.6 -403.5 14.0 to 1072.8 -394.0 18.0 sphere 0
8057:   not player $PLAYER_CHAR coords 1065.2 -396.0 14.0 to 1072.8 -394.0 18.0 sphere 0
jf @INDAMMU_1985
025B: is_player_playing $PLAYER_CHAR
jf @INDAMMU_1943
0378: set_camera_behind_player
02F0: restore_camera_jumpcut

:INDAMMU_1943
$1944 = 0
03B2: switch_rubbish 1
$1092 == 7
jf @INDAMMU_1971
$1092 = 8

:INDAMMU_1971
goto @INDAMMU_56
goto @INDAMMU_2023

:INDAMMU_1985
$1086 == 0
jf @INDAMMU_2023
0164: set_fixed_camera_position 1071.95 -402.8 17.0 rotation 0 0 0
015C: point_camera_at_player $PLAYER_CHAR mode 15 switchstyle 2

:INDAMMU_2023
$1946 == 1
jf @INDAMMU_2094
80FB:   not locate_player_on_foot_3d $PLAYER_CHAR coord 1069.11 -398.86 14.21 radius 1.0 1.0 5.0 sphere 0
jf @INDAMMU_2077
$1946 = 0

:INDAMMU_2077
$1944 == 0
jf @INDAMMU_2094
$1946 = 0

:INDAMMU_2094
$1944 == 1
jf @INDAMMU_3857
$1937 == 0
jf @INDAMMU_3857
0572: does_char_exist $1934
jf @INDAMMU_3857
811D:   not is_char_dead $1934
jf @INDAMMU_3857
$1941 == 0
jf @INDAMMU_3857
$1946 == 0
jf @INDAMMU_3857
$1086 == 0
jf @INDAMMU_3857
00FE: locate_stopped_player_on_foot_3d $PLAYER_CHAR coord 1069.11 -398.86 14.21 radius 1.0 1.0 5.0 sphere 1
jf @INDAMMU_3857
$1928 = 0
$1946 = 1
$1945 = 1
$1927 = 1
$1925 = 0
$1926 = 1
$1942 = 0
$1943 = 0
if or
$2308 == 1
$_241 > 4
$1119 == 1
$_240 == 1
$1090 == 1
jf @INDAMMU_2305
$1942 = 1

:INDAMMU_2305
if or
$2323 == 1
$_247 > 2
$1119 == 1
$_246 == 1
jf @INDAMMU_2346
$1943 = 1

:INDAMMU_2346
0618: unknown_command_6141
jf @INDAMMU_2367
$1942 = 1
$1943 = 1

:INDAMMU_2367
05AE: args 0 out 0 locals_base_index 0 call_func @MDLMAC_39 
0586: display_radar 1
0586: display_radar 0
025B: is_player_playing $PLAYER_CHAR
jf @INDAMMU_2434
01B9: set_player_control $PLAYER_CHAR to 0
811D:   not is_char_dead $PLAYER_ACTOR
jf @INDAMMU_2417
04DC: freeze_char_position $PLAYER_ACTOR set_to 1

:INDAMMU_2417
811D:   not is_char_dead $1934
jf @INDAMMU_2434
0215: turn_player_to_face_char $PLAYER_CHAR char $1934

:INDAMMU_2434
0164: set_fixed_camera_position 1071.55 -397.1 16.6 rotation 0 0 0
0165: point_camera_at_point 1073.05 -397.1 16.6 switchstyle 2

:INDAMMU_2473
$1927 == 1
jf @INDAMMU_3711
wait 0
05AE: args 0 out 0 locals_base_index 0 call_func @MDLMAC_39 
$1925 == 0
jf @INDAMMU_3173
0164: set_fixed_camera_position 1071.55 -397.1 16.6 rotation 0 0 0
0165: point_camera_at_point 1073.05 -397.1 16.6 switchstyle 1
$1945 == 1
jf @INDAMMU_2623
0465: set_interpolation_parameters 0 time 1200
$1945 = 0
$1092 == 2
jf @INDAMMU_2616
$1092 = 3

:INDAMMU_2593
$1092 == 3
jf @INDAMMU_2616
wait 0
goto @INDAMMU_2593

:INDAMMU_2616
goto @INDAMMU_2667

:INDAMMU_2623
0465: set_interpolation_parameters 0 time 800
008A: $1952 = TIMERA  // (int)
$1952 += 800

:INDAMMU_2641
001E: $1952 > TIMERA
jf @INDAMMU_2667
wait 0
03EB: clear_help
00BE: clear_prints
goto @INDAMMU_2641

:INDAMMU_2667
$1925 == 0
jf @INDAMMU_3173
wait 0
00BA: print_big 'A_PISTO' time 1000 style 4 // ~w~< Pistol >
025B: is_player_playing $PLAYER_CHAR
jf @INDAMMU_3149
0164: set_fixed_camera_position 1071.55 -397.1 16.6 rotation 0 0 0
0165: point_camera_at_point 1073.05 -397.1 16.6 switchstyle 2
01B9: set_player_control $PLAYER_CHAR to 0
PHIAMMU_5467()
$1948 == 1
jf @INDAMMU_2794
0657: print_now_dont_add_to_brief_array 'A_VIC4' time 1000 flag 1 // ~w~A pistol usually costs $240, but this one's on Vincenzo.
goto @INDAMMU_2924

:INDAMMU_2794
$1942 == 1
jf @INDAMMU_2909
810F:   not is_score_greater $PLAYER_CHAR than 239 // money
jf @INDAMMU_2846
0658: print_with_number_now_dont_add_to_brief_array 'A_COST4' number 240 time 1000 flag 1 // ~w~Cost: ~h~$~1~ ~n~ ~r~You cannot afford this.
goto @INDAMMU_2902

:INDAMMU_2846
0495: has_player_got_weapon $PLAYER_CHAR weapon 18
jf @INDAMMU_2884
0658: print_with_number_now_dont_add_to_brief_array 'A_COST2' number 240 time 1000 flag 1 // ~w~Cost: ~h~$~1~ ~n~ ~r~This will replace your current weapon.
goto @INDAMMU_2902

:INDAMMU_2884
0658: print_with_number_now_dont_add_to_brief_array 'A_COST' number 240 time 1000 flag 1 // ~w~Cost: ~h~$~1~

:INDAMMU_2902
goto @INDAMMU_2924

:INDAMMU_2909
0657: print_now_dont_add_to_brief_array 'A_STOCK' time 1000 flag 1 // ~r~Out of stock.

:INDAMMU_2924
$1951 == 0
jf @INDAMMU_3119
05AB: get_pad_state actionID 42 store_to $1953
$1953 == 1
jf @INDAMMU_3112
$1951 = 1
if or
$1942 == 1
$1948 == 1
jf @INDAMMU_3105
if or
010F: is_score_greater $PLAYER_CHAR than 239 // money
$1948 == 1
jf @INDAMMU_3091
01B6: give_player $PLAYER_CHAR weapon 17 ammo 68
01BD: set_current_player_weapon $PLAYER_CHAR to 17
PHIAMMU_5704()
$1948 == 0
jf @INDAMMU_3060
010E: add_score $PLAYER_CHAR value -240 // money
052D: add 240 to_money_spent_on_weapons_stats
goto @INDAMMU_3065

:INDAMMU_3060
$1948 = 0

:INDAMMU_3065
$1092 == 4
jf @INDAMMU_3084
$1092 = 5

:INDAMMU_3084
goto @INDAMMU_3098

:INDAMMU_3091
PHIAMMU_5677()

:INDAMMU_3098
goto @INDAMMU_3112

:INDAMMU_3105
PHIAMMU_5677()

:INDAMMU_3112
goto @INDAMMU_3142

:INDAMMU_3119
05AB: get_pad_state actionID 42 store_to $1953
$1953 == 0
jf @INDAMMU_3142
$1951 = 0

:INDAMMU_3142
goto @INDAMMU_3166

:INDAMMU_3149
0084: $1925 = $1926  // (int)
$1925 += 1
$1927 = 0

:INDAMMU_3166
goto @INDAMMU_2667

:INDAMMU_3173
05AE: args 0 out 0 locals_base_index 0 call_func @MDLMAC_39 
$1925 == 1
jf @INDAMMU_3704
0164: set_fixed_camera_position 1071.55 -398.4 16.6 rotation 0 0 0
0165: point_camera_at_point 1073.05 -398.4 16.6 switchstyle 1
0465: set_interpolation_parameters 0 time 800
008A: $1952 = TIMERA  // (int)
$1952 += 800

:INDAMMU_3253
001E: $1952 > TIMERA
jf @INDAMMU_3279
wait 0
03EB: clear_help
00BE: clear_prints
goto @INDAMMU_3253

:INDAMMU_3279
$1925 == 1
jf @INDAMMU_3704
wait 0
00BA: print_big 'A_UZI' time 1000 style 4 // ~w~< Micro SMG >
025B: is_player_playing $PLAYER_CHAR
jf @INDAMMU_3680
0164: set_fixed_camera_position 1071.55 -398.4 16.6 rotation 0 0 0
0165: point_camera_at_point 1073.05 -398.4 16.6 switchstyle 2
01B9: set_player_control $PLAYER_CHAR to 0
PHIAMMU_5467()
$1943 == 1
jf @INDAMMU_3503
810F:   not is_score_greater $PLAYER_CHAR than 599 // money
jf @INDAMMU_3424
0658: print_with_number_now_dont_add_to_brief_array 'A_COST4' number 600 time 1000 flag 1 // ~w~Cost: ~h~$~1~ ~n~ ~r~You cannot afford this.
goto @INDAMMU_3496

:INDAMMU_3424
if or
0495: has_player_got_weapon $PLAYER_CHAR weapon 25
0495: has_player_got_weapon $PLAYER_CHAR weapon 24
0495: has_player_got_weapon $PLAYER_CHAR weapon 22
jf @INDAMMU_3478
0658: print_with_number_now_dont_add_to_brief_array 'A_COST2' number 600 time 1000 flag 1 // ~w~Cost: ~h~$~1~ ~n~ ~r~This will replace your current weapon.
goto @INDAMMU_3496

:INDAMMU_3478
0658: print_with_number_now_dont_add_to_brief_array 'A_COST' number 600 time 1000 flag 1 // ~w~Cost: ~h~$~1~

:INDAMMU_3496
goto @INDAMMU_3518

:INDAMMU_3503
0657: print_now_dont_add_to_brief_array 'A_STOCK' time 1000 flag 1 // ~r~Out of stock.

:INDAMMU_3518
$1951 == 0
jf @INDAMMU_3650
05AB: get_pad_state actionID 42 store_to $1953
$1953 == 1
jf @INDAMMU_3643
$1951 = 1
$1943 == 1
jf @INDAMMU_3636
010F: is_score_greater $PLAYER_CHAR than 599 // money
jf @INDAMMU_3622
01B6: give_player $PLAYER_CHAR weapon 23 ammo 120
01BD: set_current_player_weapon $PLAYER_CHAR to 23
PHIAMMU_5704()
010E: add_score $PLAYER_CHAR value -600 // money
052D: add 600 to_money_spent_on_weapons_stats
goto @INDAMMU_3629

:INDAMMU_3622
PHIAMMU_5677()

:INDAMMU_3629
goto @INDAMMU_3643

:INDAMMU_3636
PHIAMMU_5677()

:INDAMMU_3643
goto @INDAMMU_3673

:INDAMMU_3650
05AB: get_pad_state actionID 42 store_to $1953
$1953 == 0
jf @INDAMMU_3673
$1951 = 0

:INDAMMU_3673
goto @INDAMMU_3697

:INDAMMU_3680
0084: $1925 = $1926  // (int)
$1925 += 1
$1927 = 0

:INDAMMU_3697
goto @INDAMMU_3279

:INDAMMU_3704
goto @INDAMMU_2473

:INDAMMU_3711
if and
025B: is_player_playing $PLAYER_CHAR
$1086 == 0
jf @INDAMMU_3811
00BE: clear_prints
03EB: clear_help
01B9: set_player_control $PLAYER_CHAR to 1
0164: set_fixed_camera_position 1071.95 -402.8 17.0 rotation 0 0 0
025B: is_player_playing $PLAYER_CHAR
jf @INDAMMU_3778
015C: point_camera_at_player $PLAYER_CHAR mode 15 switchstyle 2

:INDAMMU_3778
811D:   not is_char_dead $PLAYER_ACTOR
jf @INDAMMU_3793
0197: set_char_obj_wait_on_foot $PLAYER_ACTOR

:INDAMMU_3793
wait 0
811D:   not is_char_dead $PLAYER_ACTOR
jf @INDAMMU_3811
0121: set_char_obj_no_obj $PLAYER_ACTOR

:INDAMMU_3811
811D:   not is_char_dead $PLAYER_ACTOR
jf @INDAMMU_3831
04DC: freeze_char_position $PLAYER_ACTOR set_to 0
0586: display_radar 1

:INDAMMU_3831
$1092 == 5
jf @INDAMMU_3850
$1092 = 6

:INDAMMU_3850
goto @INDAMMU_56

:INDAMMU_3857
goto @INDAMMU_3876

:INDAMMU_3864
INDAMMU_4040()
wait 500

:INDAMMU_3876
goto @INDAMMU_3895

:INDAMMU_3883
INDAMMU_4040()
wait 500

:INDAMMU_3895
goto @INDAMMU_3914

:INDAMMU_3902
INDAMMU_4040()
wait 500

:INDAMMU_3914
goto @INDAMMU_56

:INDAMMU_3921
009A: create_char 21 model #SPECIAL09 at 1070.81 -396.97 14.2 store_to $1934
01CA: dont_remove_char $1934
0178: set_char_heading $1934 to 170.0
0355: set_char_stay_in_same_place $1934 to 1
0578: set_char_stop_shoot_dont_seek_entity $1934 on 1
01B7: give_weapon_to_char $1934 weapon 19 ammo 32
02AE: set_char_only_damaged_by_player $1934 to 1
025B: is_player_playing $PLAYER_CHAR
jf @INDAMMU_4004
0232: char_look_at_player_always $1934 player $PLAYER_CHAR
0214: turn_char_to_face_player $1934 player $PLAYER_CHAR

:INDAMMU_4004
01BE: set_current_char_weapon $1934 to 0
024E: mark_model_as_no_longer_needed #CHROMEGUN
$1933 = 0
$1937 == 2
jf @INDAMMU_4038
01CF: set_char_obj_kill_player_on_foot $1934 player $PLAYER_CHAR

:INDAMMU_4038
return 

:INDAMMU_4040
025B: is_player_playing $PLAYER_CHAR
jf @INDAMMU_4112
80FA:   not locate_char_any_means_3d $PLAYER_CHAR coord 1065.47 -397.85 13.93 radius 30.0 30.0 30.0 sphere 0
jf @INDAMMU_4100
$1950 = 1
goto @INDAMMU_4105

:INDAMMU_4100
$1950 = 0

:INDAMMU_4105
goto @INDAMMU_4118

:INDAMMU_4112
$1950 = 1

:INDAMMU_4118
$1950 == 1
jf @INDAMMU_4251
$1930 == 1
jf @INDAMMU_4153
01C9: mark_object_as_no_longer_needed $1910
$1930 = 0

:INDAMMU_4153
$1931 == 1
jf @INDAMMU_4175
01C9: mark_object_as_no_longer_needed $1911
$1931 = 0

:INDAMMU_4175
$1932 == 1
jf @INDAMMU_4212
0572: does_char_exist $1934
jf @INDAMMU_4212
01C7: mark_char_as_no_longer_needed $1934
029B: unload_special_character 9
$1932 = 0

:INDAMMU_4212
$1947 == 1
jf @INDAMMU_4251
0572: does_char_exist $1935
jf @INDAMMU_4251
01C7: mark_char_as_no_longer_needed $1935
$1947 = 0
$1935 = -1

:INDAMMU_4251
$1944 == 1
jf @INDAMMU_4283
025B: is_player_playing $PLAYER_CHAR
jf @INDAMMU_4277
0378: set_camera_behind_player

:INDAMMU_4277
02F0: restore_camera_jumpcut
03B2: switch_rubbish 1

:INDAMMU_4283
$1946 = 0
$1944 = 0
return 

:COMAMMU
03A9: script_name 'COMAMMU'
$1954 = 0
$1955 = 0
$1956 = 0
$1957 = 0
$1958 = 0
$1959 = 0
$1960 = 0
$1965 = 0
$1967 = 0
$1975 = 0

:COMAMMU_60
wait 0
825B:   not is_player_playing $PLAYER_CHAR
jf @COMAMMU_103
$1967 = 0
$1963 = 0
COMAMMU_4897()
wait 500
goto @COMAMMU_60

:COMAMMU_103
01FF: read_kill_frenzy_status $1973
$1973 == 1
jf @COMAMMU_139
COMAMMU_4897()
wait 500
goto @COMAMMU_60

:COMAMMU_139
03CB: is_collision_in_memory island_id 2
jf @COMAMMU_4759
0126: is_player_in_zone $PLAYER_CHAR zone 'COM_EAS' // Newport
jf @COMAMMU_4740
00FA: locate_char_any_means_3d $PLAYER_CHAR coord 347.12 -711.38 25.13 radius 70.0 70.0 20.0 sphere 0
jf @COMAMMU_4721
$1968 == 0
jf @COMAMMU_357
$1967 == 1
jf @COMAMMU_264
  $1965 <> 0
jf @COMAMMU_264
001F: TIMERA > $1965
jf @COMAMMU_264
$1967 = 0
$1963 = 0

:COMAMMU_264
  $1963 <> 0
jf @COMAMMU_357
  $1964 <> 0
jf @COMAMMU_357
80FA:   not locate_char_any_means_3d $PLAYER_CHAR coord 347.12 -711.38 25.13 radius 30.0 30.0 30.0 sphere 0
jf @COMAMMU_357
001F: TIMERA > $1964
jf @COMAMMU_357
$1963 = 0
811D:   not is_char_dead $1961
jf @COMAMMU_357
01BE: set_current_char_weapon $1961 to 0

:COMAMMU_357
$1954 == 0
jf @COMAMMU_417
010C: create_object #AK47 at 349.7 -721.65 27.5 store_to $1912
0397: set_object_dynamic $1912 0
0458: set_object_rotation $1912 to 0 3.0 5.0
0555: freeze_object_position $1912 to 1
$1954 = 1

:COMAMMU_417
$1955 == 0
jf @COMAMMU_479
010C: create_object #SNIPER at 348.2 -721.65 27.45 store_to $1913
0397: set_object_dynamic $1913 0
0458: set_object_rotation $1913 to 0 5.0 5.0
0555: freeze_object_position $1913 to 1
$1955 = 1

:COMAMMU_479
$1956 == 0
jf @COMAMMU_542
010C: create_object #GRENADE at 347.3 -721.65 27.6 store_to $1914
0397: set_object_dynamic $1914 0
0458: set_object_rotation $1914 to 0 345.0 90.0
0555: freeze_object_position $1914 to 1
$1956 = 1

:COMAMMU_542
$1957 == 0
jf @COMAMMU_602
010C: create_object #UZI at 346.3 -721.65 27.5 store_to $1915
0397: set_object_dynamic $1915 0
0458: set_object_rotation $1915 to 0 4.0 5.0
0555: freeze_object_position $1915 to 1
$1957 = 1

:COMAMMU_602
$1958 == 0
jf @COMAMMU_659
010C: create_object #BODYARMOUR at 345.4 -721.5 27.45 store_to $1916
0397: set_object_dynamic $1916 0
0458: set_object_rotation $1916 to 0 0 0
0555: freeze_object_position $1916 to 1
$1958 = 1

:COMAMMU_659
if and
8572:   not does_char_exist $1961
$1967 == 0
jf @COMAMMU_829
$1959 == 0
jf @COMAMMU_713
029B: unload_special_character 9
0241: load_special_character 9 model 'GUN_ASS'
$1959 = 1

:COMAMMU_713
$1960 == 0
jf @COMAMMU_736
024C: request_model #CHROMEGUN
$1960 = 1

:COMAMMU_736
if and
0242: has_special_character_loaded 9
024D: has_model_loaded #CHROMEGUN
jf @COMAMMU_829
if and
00FA: locate_char_any_means_3d $PLAYER_CHAR coord 347.12 -711.38 25.13 radius 30.0 30.0 30.0 sphere 0
00C2: is_point_on_screen 347.12 -711.38 25.13 radius 2.0
jf @COMAMMU_822
goto @COMAMMU_829

:COMAMMU_822
COMAMMU_4778()

:COMAMMU_829
$1968 == 0
jf @COMAMMU_1372
0057: player $PLAYER_CHAR coords 353.3 -711.5 24.0 to 339.8 -722.7 28.0 sphere 0
jf @COMAMMU_1372
025B: is_player_playing $PLAYER_CHAR
jf @COMAMMU_923
01B9: set_player_control $PLAYER_CHAR to 0
044F: is_player_on_foot $PLAYER_CHAR
jf @COMAMMU_917
$1929 = 0
goto @COMAMMU_923

:COMAMMU_917
$1929 = 1

:COMAMMU_923
if and
8572:   not does_char_exist $1961
$1967 == 0
jf @COMAMMU_1097
05AE: args 1 out 0 locals_base_index 0 call_func @MDLMAC_2446 250 
029B: unload_special_character 9
0241: load_special_character 9 model 'GUN_ASS'
$1959 = 1
024C: request_model #CHROMEGUN
$1960 = 1
0390: load_all_models_now

:COMAMMU_991
if or
8242:   not has_special_character_loaded 9
824D:   not has_model_loaded #CHROMEGUN
jf @COMAMMU_1021
wait 0
goto @COMAMMU_991

:COMAMMU_1021
COMAMMU_4778()
025B: is_player_playing $PLAYER_CHAR
jf @COMAMMU_1045
01B9: set_player_control $PLAYER_CHAR to 1

:COMAMMU_1045
0164: set_fixed_camera_position 342.35 -713.54 28.57 rotation 0 0 0
025B: is_player_playing $PLAYER_CHAR
jf @COMAMMU_1084
015C: point_camera_at_player $PLAYER_CHAR mode 15 switchstyle 2

:COMAMMU_1084
016E: set_fading_colour 0 0 1
016F: do_fade 250 fade 1

:COMAMMU_1097
0164: set_fixed_camera_position 342.35 -713.54 28.57 rotation 0 0 0
025B: is_player_playing $PLAYER_CHAR
jf @COMAMMU_1169
811D:   not is_char_dead $PLAYER_ACTOR
jf @COMAMMU_1161
80E4:   not is_char_in_any_car $PLAYER_ACTOR
jf @COMAMMU_1161
057E: stop_char $PLAYER_ACTOR
0377: set_char $PLAYER_ACTOR anim 0 wait_state_time -1 ms

:COMAMMU_1161
015C: point_camera_at_player $PLAYER_CHAR mode 15 switchstyle 2

:COMAMMU_1169
03B2: switch_rubbish 0
001F: TIMERA > $1966
jf @COMAMMU_1342
0572: does_char_exist $1961
jf @COMAMMU_1330
811D:   not is_char_dead $1961
jf @COMAMMU_1330
$1967 == 0
jf @COMAMMU_1330
$1963 == 0
jf @COMAMMU_1330
$1962 == 0
jf @COMAMMU_1261
0191: add_one_off_sound 350.2 -719.9 25.4 sound 52

:COMAMMU_1261
$1962 == 1
jf @COMAMMU_1293
0191: add_one_off_sound 350.2 -719.9 25.4 sound 53

:COMAMMU_1293
$1962 == 2
jf @COMAMMU_1306

:COMAMMU_1306
$1962 += 1
$1962 > 1
jf @COMAMMU_1330
$1962 = 0

:COMAMMU_1330
008A: $1966 = TIMERA  // (int)
$1966 += 10000

:COMAMMU_1342
025B: is_player_playing $PLAYER_CHAR
jf @COMAMMU_1359
01B9: set_player_control $PLAYER_CHAR to 1

:COMAMMU_1359
$1968 = 1
goto @COMAMMU_60

:COMAMMU_1372
0572: does_char_exist $1961
jf @COMAMMU_1654
811D:   not is_char_dead $1961
jf @COMAMMU_1606
$1968 == 1
jf @COMAMMU_1452
02E4: is_player_shooting $PLAYER_CHAR
jf @COMAMMU_1452
if and
82DC:   not is_current_player_weapon $PLAYER_CHAR weapon 34
82DC:   not is_current_player_weapon $PLAYER_CHAR weapon 1
82DC:   not is_current_player_weapon $PLAYER_CHAR weapon 0
jf @COMAMMU_1452
$1963 = 1

:COMAMMU_1452
045C: is_player_targetting_char $PLAYER_CHAR char $1961
jf @COMAMMU_1493
if and
82DC:   not is_current_player_weapon $PLAYER_CHAR weapon 1
82DC:   not is_current_player_weapon $PLAYER_CHAR weapon 0
jf @COMAMMU_1493
$1963 = 1

:COMAMMU_1493
811D:   not is_char_dead $PLAYER_ACTOR
jf @COMAMMU_1523
051F: has_char_been_damaged_by_char $1961 char $PLAYER_ACTOR
jf @COMAMMU_1523
$1963 = 1

:COMAMMU_1523
025B: is_player_playing $PLAYER_CHAR
jf @COMAMMU_1599
$1963 == 1
jf @COMAMMU_1577
01BE: set_current_char_weapon $1961 to 19
01CF: set_char_obj_kill_player_on_foot $1961 player $PLAYER_CHAR
008A: $1964 = TIMERA  // (int)
$1964 += 30000
$1963 = 2

:COMAMMU_1577
$1963 == 0
jf @COMAMMU_1599
0197: set_char_obj_wait_on_foot $1961
0214: turn_char_to_face_player $1961 player $PLAYER_CHAR

:COMAMMU_1599
goto @COMAMMU_1654

:COMAMMU_1606
$1967 == 0
jf @COMAMMU_1654
$1967 = 1
0113: alter_wanted_level_no_drop $PLAYER_CHAR to 1
801E:   not $1965 > TIMERA
jf @COMAMMU_1654
008A: $1965 = TIMERA  // (int)
$1965 += 30000

:COMAMMU_1654
$1968 == 1
jf @COMAMMU_1818
if and
8057:   not player $PLAYER_CHAR coords 353.3 -711.2 24.0 to 339.8 -722.7 28.0 sphere 0
8057:   not player $PLAYER_CHAR coords 353.3 -710.9 24.0 to 351.2 -722.7 28.0 sphere 0
jf @COMAMMU_1778
025B: is_player_playing $PLAYER_CHAR
jf @COMAMMU_1755
0378: set_camera_behind_player
02F0: restore_camera_jumpcut

:COMAMMU_1755
$1968 = 0
03B2: switch_rubbish 1
goto @COMAMMU_60
goto @COMAMMU_1818

:COMAMMU_1778
$1086 == 0
jf @COMAMMU_1818
0164: set_fixed_camera_position 342.35 -713.54 28.57 rotation 0 0 0
015C: point_camera_at_player $PLAYER_CHAR mode 15 switchstyle 2

:COMAMMU_1818
$1970 == 1
jf @COMAMMU_1889
80FB:   not locate_player_on_foot_3d $PLAYER_CHAR coord 349.48 -717.49 25.4 radius 1.0 1.0 5.0 sphere 0
jf @COMAMMU_1872
$1970 = 0

:COMAMMU_1872
$1968 == 0
jf @COMAMMU_1889
$1970 = 0

:COMAMMU_1889
$1968 == 1
jf @COMAMMU_4714
$1963 == 0
jf @COMAMMU_4714
0572: does_char_exist $1961
jf @COMAMMU_4714
811D:   not is_char_dead $1961
jf @COMAMMU_4714
$1967 == 0
jf @COMAMMU_4714
$1970 == 0
jf @COMAMMU_4714
$1086 == 0
jf @COMAMMU_4714
00FE: locate_stopped_player_on_foot_3d $PLAYER_CHAR coord 349.48 -717.49 25.4 radius 1.0 1.0 5.0 sphere 1
jf @COMAMMU_4714
$1928 = 0
$1970 = 1
$1969 = 1
$1927 = 1
$1925 = 0
$1926 = 4
05AE: args 0 out 0 locals_base_index 0 call_func @MDLMAC_39 
0586: display_radar 1
0586: display_radar 0
025B: is_player_playing $PLAYER_CHAR
jf @COMAMMU_2110
01B9: set_player_control $PLAYER_CHAR to 0
811D:   not is_char_dead $PLAYER_ACTOR
jf @COMAMMU_2093
04DC: freeze_char_position $PLAYER_ACTOR set_to 1

:COMAMMU_2093
811D:   not is_char_dead $1961
jf @COMAMMU_2110
0215: turn_player_to_face_char $PLAYER_CHAR char $1961

:COMAMMU_2110
0164: set_fixed_camera_position 349.95 -720.25 27.7 rotation 0 0 0
0165: point_camera_at_point 349.95 -721.65 27.7 switchstyle 2

:COMAMMU_2148
$1927 == 1
jf @COMAMMU_4618
wait 0
05AE: args 0 out 0 locals_base_index 0 call_func @MDLMAC_39 
$1925 == 0
jf @COMAMMU_2645
0164: set_fixed_camera_position 349.95 -720.25 27.7 rotation 0 0 0
0165: point_camera_at_point 349.95 -721.65 27.7 switchstyle 1
$1969 == 1
jf @COMAMMU_2255
0465: set_interpolation_parameters 0 time 1200
$1969 = 0
goto @COMAMMU_2299

:COMAMMU_2255
0465: set_interpolation_parameters 0 time 800
008A: $1976 = TIMERA  // (int)
$1976 += 800

:COMAMMU_2273
001E: $1976 > TIMERA
jf @COMAMMU_2299
wait 0
03EB: clear_help
00BE: clear_prints
goto @COMAMMU_2273

:COMAMMU_2299
$1925 == 0
jf @COMAMMU_2645
wait 0
00BA: print_big 'A_AK' time 1000 style 4 // ~w~< AK >
025B: is_player_playing $PLAYER_CHAR
jf @COMAMMU_2621
0164: set_fixed_camera_position 349.95 -720.25 27.7 rotation 0 0 0
0165: point_camera_at_point 349.95 -721.65 27.7 switchstyle 2
01B9: set_player_control $PLAYER_CHAR to 0
PHIAMMU_5467()
810F:   not is_score_greater $PLAYER_CHAR than 4199 // money
jf @COMAMMU_2429
0658: print_with_number_now_dont_add_to_brief_array 'A_COST4' number 4200 time 1000 flag 1 // ~w~Cost: ~h~$~1~ ~n~ ~r~You cannot afford this.
goto @COMAMMU_2485

:COMAMMU_2429
0495: has_player_got_weapon $PLAYER_CHAR weapon 26
jf @COMAMMU_2467
0658: print_with_number_now_dont_add_to_brief_array 'A_COST2' number 4200 time 1000 flag 1 // ~w~Cost: ~h~$~1~ ~n~ ~r~This will replace your current weapon.
goto @COMAMMU_2485

:COMAMMU_2467
0658: print_with_number_now_dont_add_to_brief_array 'A_COST' number 4200 time 1000 flag 1 // ~w~Cost: ~h~$~1~

:COMAMMU_2485
$1975 == 0
jf @COMAMMU_2591
05AB: get_pad_state actionID 42 store_to $1977
$1977 == 1
jf @COMAMMU_2584
$1975 = 1
010F: is_score_greater $PLAYER_CHAR than 4199 // money
jf @COMAMMU_2577
01B6: give_player $PLAYER_CHAR weapon 27 ammo 150
01BD: set_current_player_weapon $PLAYER_CHAR to 27
PHIAMMU_5704()
010E: add_score $PLAYER_CHAR value -4200 // money
052D: add 4200 to_money_spent_on_weapons_stats
goto @COMAMMU_2584

:COMAMMU_2577
PHIAMMU_5677()

:COMAMMU_2584
goto @COMAMMU_2614

:COMAMMU_2591
05AB: get_pad_state actionID 42 store_to $1977
$1977 == 0
jf @COMAMMU_2614
$1975 = 0

:COMAMMU_2614
goto @COMAMMU_2638

:COMAMMU_2621
0084: $1925 = $1926  // (int)
$1925 += 1
$1927 = 0

:COMAMMU_2638
goto @COMAMMU_2299

:COMAMMU_2645
05AE: args 0 out 0 locals_base_index 0 call_func @MDLMAC_39 
$1925 == 1
jf @COMAMMU_3096
0164: set_fixed_camera_position 348.4 -720.25 27.7 rotation 0 0 0
0165: point_camera_at_point 348.4 -721.65 27.7 switchstyle 1
0465: set_interpolation_parameters 0 time 800
008A: $1976 = TIMERA  // (int)
$1976 += 800

:COMAMMU_2724
001E: $1976 > TIMERA
jf @COMAMMU_2750
wait 0
03EB: clear_help
00BE: clear_prints
goto @COMAMMU_2724

:COMAMMU_2750
$1925 == 1
jf @COMAMMU_3096
wait 0
00BA: print_big 'A_SNIPE' time 1000 style 4 // ~w~< Sniper Rifle >
025B: is_player_playing $PLAYER_CHAR
jf @COMAMMU_3072
0164: set_fixed_camera_position 348.4 -720.25 27.7 rotation 0 0 0
0165: point_camera_at_point 348.4 -721.65 27.7 switchstyle 2
01B9: set_player_control $PLAYER_CHAR to 0
PHIAMMU_5467()
810F:   not is_score_greater $PLAYER_CHAR than 5999 // money
jf @COMAMMU_2881
0658: print_with_number_now_dont_add_to_brief_array 'A_COST4' number 6000 time 1000 flag 1 // ~w~Cost: ~h~$~1~ ~n~ ~r~You cannot afford this.
goto @COMAMMU_2937

:COMAMMU_2881
0495: has_player_got_weapon $PLAYER_CHAR weapon 29
jf @COMAMMU_2919
0658: print_with_number_now_dont_add_to_brief_array 'A_COST2' number 6000 time 1000 flag 1 // ~w~Cost: ~h~$~1~ ~n~ ~r~This will replace your current weapon.
goto @COMAMMU_2937

:COMAMMU_2919
0658: print_with_number_now_dont_add_to_brief_array 'A_COST' number 6000 time 1000 flag 1 // ~w~Cost: ~h~$~1~

:COMAMMU_2937
$1975 == 0
jf @COMAMMU_3042
05AB: get_pad_state actionID 42 store_to $1977
$1977 == 1
jf @COMAMMU_3035
$1975 = 1
010F: is_score_greater $PLAYER_CHAR than 5999 // money
jf @COMAMMU_3028
01B6: give_player $PLAYER_CHAR weapon 28 ammo 30
01BD: set_current_player_weapon $PLAYER_CHAR to 28
PHIAMMU_5704()
010E: add_score $PLAYER_CHAR value -6000 // money
052D: add 6000 to_money_spent_on_weapons_stats
goto @COMAMMU_3035

:COMAMMU_3028
PHIAMMU_5677()

:COMAMMU_3035
goto @COMAMMU_3065

:COMAMMU_3042
05AB: get_pad_state actionID 42 store_to $1977
$1977 == 0
jf @COMAMMU_3065
$1975 = 0

:COMAMMU_3065
goto @COMAMMU_3089

:COMAMMU_3072
0084: $1925 = $1926  // (int)
$1925 += 1
$1927 = 0

:COMAMMU_3089
goto @COMAMMU_2750

:COMAMMU_3096
05AE: args 0 out 0 locals_base_index 0 call_func @MDLMAC_39 
$1925 == 2
jf @COMAMMU_3563
0164: set_fixed_camera_position 347.275 -720.25 27.7 rotation 0 0 0
0165: point_camera_at_point 347.275 -721.65 27.7 switchstyle 1
0465: set_interpolation_parameters 0 time 800
008A: $1976 = TIMERA  // (int)
$1976 += 800

:COMAMMU_3175
001E: $1976 > TIMERA
jf @COMAMMU_3201
wait 0
03EB: clear_help
00BE: clear_prints
goto @COMAMMU_3175

:COMAMMU_3201
$1925 == 2
jf @COMAMMU_3563
wait 0
00BA: print_big 'A_GRENA' time 1000 style 4 // ~w~< Grenades >
025B: is_player_playing $PLAYER_CHAR
jf @COMAMMU_3539
0164: set_fixed_camera_position 347.275 -720.25 27.7 rotation 0 0 0
0165: point_camera_at_point 347.275 -721.65 27.7 switchstyle 2
01B9: set_player_control $PLAYER_CHAR to 0
PHIAMMU_5467()
810F:   not is_score_greater $PLAYER_CHAR than 359 // money
jf @COMAMMU_3332
0658: print_with_number_now_dont_add_to_brief_array 'A_COST4' number 360 time 1000 flag 1 // ~w~Cost: ~h~$~1~ ~n~ ~r~You cannot afford this.
goto @COMAMMU_3404

:COMAMMU_3332
if or
0495: has_player_got_weapon $PLAYER_CHAR weapon 14
0495: has_player_got_weapon $PLAYER_CHAR weapon 15
0495: has_player_got_weapon $PLAYER_CHAR weapon 13
jf @COMAMMU_3386
0658: print_with_number_now_dont_add_to_brief_array 'A_COST2' number 360 time 1000 flag 1 // ~w~Cost: ~h~$~1~ ~n~ ~r~This will replace your current weapon.
goto @COMAMMU_3404

:COMAMMU_3386
0658: print_with_number_now_dont_add_to_brief_array 'A_COST' number 360 time 1000 flag 1 // ~w~Cost: ~h~$~1~

:COMAMMU_3404
$1975 == 0
jf @COMAMMU_3509
05AB: get_pad_state actionID 42 store_to $1977
$1977 == 1
jf @COMAMMU_3502
$1975 = 1
010F: is_score_greater $PLAYER_CHAR than 359 // money
jf @COMAMMU_3495
01B6: give_player $PLAYER_CHAR weapon 12 ammo 8
01BD: set_current_player_weapon $PLAYER_CHAR to 12
PHIAMMU_5704()
010E: add_score $PLAYER_CHAR value -360 // money
052D: add 360 to_money_spent_on_weapons_stats
goto @COMAMMU_3502

:COMAMMU_3495
PHIAMMU_5677()

:COMAMMU_3502
goto @COMAMMU_3532

:COMAMMU_3509
05AB: get_pad_state actionID 42 store_to $1977
$1977 == 0
jf @COMAMMU_3532
$1975 = 0

:COMAMMU_3532
goto @COMAMMU_3556

:COMAMMU_3539
0084: $1925 = $1926  // (int)
$1925 += 1
$1927 = 0

:COMAMMU_3556
goto @COMAMMU_3201

:COMAMMU_3563
05AE: args 0 out 0 locals_base_index 0 call_func @MDLMAC_39 
$1925 == 3
jf @COMAMMU_4030
0164: set_fixed_camera_position 346.4 -720.25 27.7 rotation 0 0 0
0165: point_camera_at_point 346.4 -721.65 27.7 switchstyle 1
0465: set_interpolation_parameters 0 time 800
008A: $1976 = TIMERA  // (int)
$1976 += 800

:COMAMMU_3642
001E: $1976 > TIMERA
jf @COMAMMU_3668
wait 0
03EB: clear_help
00BE: clear_prints
goto @COMAMMU_3642

:COMAMMU_3668
$1925 == 3
jf @COMAMMU_4030
wait 0
00BA: print_big 'A_UZI' time 1000 style 4 // ~w~< Micro SMG >
025B: is_player_playing $PLAYER_CHAR
jf @COMAMMU_4006
0164: set_fixed_camera_position 346.4 -720.25 27.7 rotation 0 0 0
0165: point_camera_at_point 346.4 -721.65 27.7 switchstyle 2
01B9: set_player_control $PLAYER_CHAR to 0
PHIAMMU_5467()
810F:   not is_score_greater $PLAYER_CHAR than 599 // money
jf @COMAMMU_3799
0658: print_with_number_now_dont_add_to_brief_array 'A_COST4' number 600 time 1000 flag 1 // ~w~Cost: ~h~$~1~ ~n~ ~r~You cannot afford this.
goto @COMAMMU_3871

:COMAMMU_3799
if or
0495: has_player_got_weapon $PLAYER_CHAR weapon 22
0495: has_player_got_weapon $PLAYER_CHAR weapon 24
0495: has_player_got_weapon $PLAYER_CHAR weapon 25
jf @COMAMMU_3853
0658: print_with_number_now_dont_add_to_brief_array 'A_COST2' number 600 time 1000 flag 1 // ~w~Cost: ~h~$~1~ ~n~ ~r~This will replace your current weapon.
goto @COMAMMU_3871

:COMAMMU_3853
0658: print_with_number_now_dont_add_to_brief_array 'A_COST' number 600 time 1000 flag 1 // ~w~Cost: ~h~$~1~

:COMAMMU_3871
$1975 == 0
jf @COMAMMU_3976
05AB: get_pad_state actionID 42 store_to $1977
$1977 == 1
jf @COMAMMU_3969
$1975 = 1
010F: is_score_greater $PLAYER_CHAR than 599 // money
jf @COMAMMU_3962
01B6: give_player $PLAYER_CHAR weapon 23 ammo 120
01BD: set_current_player_weapon $PLAYER_CHAR to 23
PHIAMMU_5704()
010E: add_score $PLAYER_CHAR value -600 // money
052D: add 600 to_money_spent_on_weapons_stats
goto @COMAMMU_3969

:COMAMMU_3962
PHIAMMU_5677()

:COMAMMU_3969
goto @COMAMMU_3999

:COMAMMU_3976
05AB: get_pad_state actionID 42 store_to $1977
$1977 == 0
jf @COMAMMU_3999
$1975 = 0

:COMAMMU_3999
goto @COMAMMU_4023

:COMAMMU_4006
0084: $1925 = $1926  // (int)
$1925 += 1
$1927 = 0

:COMAMMU_4023
goto @COMAMMU_3668

:COMAMMU_4030
05AE: args 0 out 0 locals_base_index 0 call_func @MDLMAC_39 
$1925 == 4
jf @COMAMMU_4611
0164: set_fixed_camera_position 345.4 -720.25 27.7 rotation 0 0 0
0165: point_camera_at_point 345.4 -721.5 27.7 switchstyle 1
0465: set_interpolation_parameters 0 time 800
008A: $1976 = TIMERA  // (int)
$1976 += 800

:COMAMMU_4108
001E: $1976 > TIMERA
jf @COMAMMU_4134
wait 0
03EB: clear_help
00BE: clear_prints
goto @COMAMMU_4108

:COMAMMU_4134
$1925 == 4
jf @COMAMMU_4611
wait 0
00BA: print_big 'A_ARMOU' time 1000 style 4 // ~w~< Body Armor >
025B: is_player_playing $PLAYER_CHAR
jf @COMAMMU_4587
0164: set_fixed_camera_position 345.4 -720.25 27.7 rotation 0 0 0
0165: point_camera_at_point 345.4 -721.5 27.7 switchstyle 2
01B9: set_player_control $PLAYER_CHAR to 0
PHIAMMU_5467()
$1971 = 0
811D:   not is_char_dead $PLAYER_ACTOR
jf @COMAMMU_4259
04E2: get_char_armour $PLAYER_ACTOR store_to $1971
cset_var_float_to_var_int $1972 = int_to_float $1971
0071: $1972 /= $1098  // (float)

:COMAMMU_4259
810F:   not is_score_greater $PLAYER_CHAR than 239 // money
jf @COMAMMU_4298
0658: print_with_number_now_dont_add_to_brief_array 'A_COST4' number 240 time 1000 flag 1 // ~w~Cost: ~h~$~1~ ~n~ ~r~You cannot afford this.
goto @COMAMMU_4357

:COMAMMU_4298
$1972 > 0.8
jf @COMAMMU_4339
0658: print_with_number_now_dont_add_to_brief_array 'A_COST3' number 240 time 1000 flag 1 // ~w~Cost: ~h~$~1~ ~n~ ~r~Your Body Armor is in good condition.
goto @COMAMMU_4357

:COMAMMU_4339
0658: print_with_number_now_dont_add_to_brief_array 'A_COST' number 240 time 1000 flag 1 // ~w~Cost: ~h~$~1~

:COMAMMU_4357
$1975 == 0
jf @COMAMMU_4557
05AB: get_pad_state actionID 42 store_to $1977
$1977 == 1
jf @COMAMMU_4550
$1975 = 1
010F: is_score_greater $PLAYER_CHAR than 239 // money
jf @COMAMMU_4543
125.0 > $1098
jf @COMAMMU_4482
100 > $1971
jf @COMAMMU_4468
0363: set_player $PLAYER_CHAR armour_to 200
PHIAMMU_5704()
010E: add_score $PLAYER_CHAR value -240 // money
052D: add 240 to_money_spent_on_weapons_stats
goto @COMAMMU_4475

:COMAMMU_4468
PHIAMMU_5677()

:COMAMMU_4475
goto @COMAMMU_4536

:COMAMMU_4482
150 > $1971
jf @COMAMMU_4529
0363: set_player $PLAYER_CHAR armour_to 200
PHIAMMU_5704()
010E: add_score $PLAYER_CHAR value -240 // money
052D: add 240 to_money_spent_on_weapons_stats
goto @COMAMMU_4536

:COMAMMU_4529
PHIAMMU_5677()

:COMAMMU_4536
goto @COMAMMU_4550

:COMAMMU_4543
PHIAMMU_5677()

:COMAMMU_4550
goto @COMAMMU_4580

:COMAMMU_4557
05AB: get_pad_state actionID 42 store_to $1977
$1977 == 0
jf @COMAMMU_4580
$1975 = 0

:COMAMMU_4580
goto @COMAMMU_4604

:COMAMMU_4587
0084: $1925 = $1926  // (int)
$1925 += 1
$1927 = 0

:COMAMMU_4604
goto @COMAMMU_4134

:COMAMMU_4611
goto @COMAMMU_2148

:COMAMMU_4618
if and
025B: is_player_playing $PLAYER_CHAR
$1086 == 0
jf @COMAMMU_4687
00BE: clear_prints
03EB: clear_help
01B9: set_player_control $PLAYER_CHAR to 1
0164: set_fixed_camera_position 342.35 -713.54 28.57 rotation 0 0 0
025B: is_player_playing $PLAYER_CHAR
jf @COMAMMU_4687
015C: point_camera_at_player $PLAYER_CHAR mode 15 switchstyle 2

:COMAMMU_4687
811D:   not is_char_dead $PLAYER_ACTOR
jf @COMAMMU_4707
04DC: freeze_char_position $PLAYER_ACTOR set_to 0
0586: display_radar 1

:COMAMMU_4707
goto @COMAMMU_60

:COMAMMU_4714
goto @COMAMMU_4733

:COMAMMU_4721
COMAMMU_4897()
wait 500

:COMAMMU_4733
goto @COMAMMU_4752

:COMAMMU_4740
COMAMMU_4897()
wait 500

:COMAMMU_4752
goto @COMAMMU_4771

:COMAMMU_4759
COMAMMU_4897()
wait 500

:COMAMMU_4771
goto @COMAMMU_60

:COMAMMU_4778
009A: create_char 21 model #SPECIAL09 at 350.2 -719.9 25.4 store_to $1961
01CA: dont_remove_char $1961
0178: set_char_heading $1961 to 70.0
0355: set_char_stay_in_same_place $1961 to 1
0578: set_char_stop_shoot_dont_seek_entity $1961 on 1
01B7: give_weapon_to_char $1961 weapon 19 ammo 32
02AE: set_char_only_damaged_by_player $1961 to 1
025B: is_player_playing $PLAYER_CHAR
jf @COMAMMU_4861
0232: char_look_at_player_always $1961 player $PLAYER_CHAR
0214: turn_char_to_face_player $1961 player $PLAYER_CHAR

:COMAMMU_4861
01BE: set_current_char_weapon $1961 to 0
024E: mark_model_as_no_longer_needed #CHROMEGUN
$1960 = 0
$1963 == 2
jf @COMAMMU_4895
01CF: set_char_obj_kill_player_on_foot $1961 player $PLAYER_CHAR

:COMAMMU_4895
return 

:COMAMMU_4897
025B: is_player_playing $PLAYER_CHAR
jf @COMAMMU_4969
80FA:   not locate_char_any_means_3d $PLAYER_CHAR coord 347.12 -711.38 25.13 radius 30.0 30.0 30.0 sphere 0
jf @COMAMMU_4957
$1974 = 1
goto @COMAMMU_4962

:COMAMMU_4957
$1974 = 0

:COMAMMU_4962
goto @COMAMMU_4975

:COMAMMU_4969
$1974 = 1

:COMAMMU_4975
$1974 == 1
jf @COMAMMU_5135
$1954 == 1
jf @COMAMMU_5010
01C9: mark_object_as_no_longer_needed $1912
$1954 = 0

:COMAMMU_5010
$1955 == 1
jf @COMAMMU_5032
01C9: mark_object_as_no_longer_needed $1913
$1955 = 0

:COMAMMU_5032
$1956 == 1
jf @COMAMMU_5054
01C9: mark_object_as_no_longer_needed $1914
$1956 = 0

:COMAMMU_5054
$1957 == 1
jf @COMAMMU_5076
01C9: mark_object_as_no_longer_needed $1915
$1957 = 0

:COMAMMU_5076
$1958 == 1
jf @COMAMMU_5098
01C9: mark_object_as_no_longer_needed $1916
$1958 = 0

:COMAMMU_5098
$1959 == 1
jf @COMAMMU_5135
0572: does_char_exist $1961
jf @COMAMMU_5135
01C7: mark_char_as_no_longer_needed $1961
029B: unload_special_character 9
$1959 = 0

:COMAMMU_5135
$1968 == 1
jf @COMAMMU_5167
025B: is_player_playing $PLAYER_CHAR
jf @COMAMMU_5161
0378: set_camera_behind_player

:COMAMMU_5161
02F0: restore_camera_jumpcut
03B2: switch_rubbish 1

:COMAMMU_5167
$1970 = 0
$1968 = 0
return 
03A9: script_name 'SUBAMMU'
0@ = 0

:SUBAMMU_14
wait 100
825B:   not is_player_playing $PLAYER_CHAR
jf @SUBAMMU_43
SUBAMMU_220()
goto @SUBAMMU_14

:SUBAMMU_43
01FF: read_kill_frenzy_status 1@
1@ == 1
jf @SUBAMMU_72
SUBAMMU_220()
goto @SUBAMMU_14

:SUBAMMU_72
0126: is_player_in_zone $PLAYER_CHAR zone 'SUB_IND' // Pike Creek
jf @SUBAMMU_206
0@ == 0
jf @SUBAMMU_155
0218: create_pickup #FLAME type 1 at -1206.6 -6.6 53.3 store_to $1917
0218: create_pickup #MOLOTOV type 1 at -1210.6 -6.6 53.3 store_to $1918
0@ = 1

:SUBAMMU_155
0@ == 1
jf @SUBAMMU_199
0219: has_pickup_been_collected $1917
jf @SUBAMMU_183
052D: add 5500 to_money_spent_on_weapons_stats

:SUBAMMU_183
0219: has_pickup_been_collected $1918
jf @SUBAMMU_199
052D: add 400 to_money_spent_on_weapons_stats

:SUBAMMU_199
goto @SUBAMMU_213

:SUBAMMU_206
SUBAMMU_220()

:SUBAMMU_213
goto @SUBAMMU_14

:SUBAMMU_220
0@ == 1
jf @SUBAMMU_244
021A: remove_pickup $1917
021A: remove_pickup $1918
0@ = 0

:SUBAMMU_244
return 

:PHIAMMU
03A9: script_name 'PHIAMMU'
$1978 = 0
$1979 = 0
$1980 = 0
$1981 = 0
$1982 = 0
$1989 = 0
$1991 = 0
$1999 = 0

:PHIAMMU_50
wait 0
825B:   not is_player_playing $PLAYER_CHAR
jf @PHIAMMU_93
$1991 = 0
$1987 = 0
PHIAMMU_5196()
wait 500
goto @PHIAMMU_50

:PHIAMMU_93
01FF: read_kill_frenzy_status $1997
$1997 == 1
jf @PHIAMMU_129
PHIAMMU_5196()
wait 500
goto @PHIAMMU_50

:PHIAMMU_129
03CB: is_collision_in_memory island_id 2
jf @PHIAMMU_5059
if or
0126: is_player_in_zone $PLAYER_CHAR zone 'SHOPING' // Bedford Point
0126: is_player_in_zone $PLAYER_CHAR zone 'YAKUSA' // Torrington
jf @PHIAMMU_5040
00FA: locate_char_any_means_3d $PLAYER_CHAR coord 165.89 -1259.56 25.1 radius 80.0 80.0 20.0 sphere 0
jf @PHIAMMU_5021
$1992 == 0
jf @PHIAMMU_363
$1991 == 1
jf @PHIAMMU_270
  $1989 <> 0
jf @PHIAMMU_270
001F: TIMERA > $1989
jf @PHIAMMU_270
$1991 = 0
$1987 = 0

:PHIAMMU_270
  $1987 <> 0
jf @PHIAMMU_363
  $1988 <> 0
jf @PHIAMMU_363
80FA:   not locate_char_any_means_3d $PLAYER_CHAR coord 165.89 -1259.56 25.1 radius 60.0 60.0 60.0 sphere 0
jf @PHIAMMU_363
001F: TIMERA > $1988
jf @PHIAMMU_363
$1987 = 0
811D:   not is_char_dead $1985
jf @PHIAMMU_363
01BE: set_current_char_weapon $1985 to 0

:PHIAMMU_363
$1978 == 0
jf @PHIAMMU_424
010C: create_object #ROCKETLA at 171.4 -1264.3 27.2 store_to $1919
0397: set_object_dynamic $1919 0
0458: set_object_rotation $1919 to 0 0 351.5
0555: freeze_object_position $1919 to 1
$1978 = 1

:PHIAMMU_424
$1979 == 0
jf @PHIAMMU_487
010C: create_object #CHROMEGUN at 169.65 -1264.05 27.23 store_to $1920
0397: set_object_dynamic $1920 0
0458: set_object_rotation $1920 to 0 8.5 357.5
0555: freeze_object_position $1920 to 1
$1979 = 1

:PHIAMMU_487
$1980 == 0
jf @PHIAMMU_549
010C: create_object #M4 at 168.65 -1263.65 27.2 store_to $1921
0397: set_object_dynamic $1921 0
0458: set_object_rotation $1921 to 0 2.5 340.0
0555: freeze_object_position $1921 to 1
$1980 = 1

:PHIAMMU_549
$1981 == 0
jf @PHIAMMU_611
010C: create_object #FLAME at 167.2 -1262.9 27.45 store_to $1922
0397: set_object_dynamic $1922 0
0458: set_object_rotation $1922 to 0 29.0 338.0
0555: freeze_object_position $1922 to 1
$1981 = 1

:PHIAMMU_611
$1982 == 0
jf @PHIAMMU_715
010C: create_object #MINIGUN at 166.0 -1262.3 27.52 store_to $1923
010C: create_object #MINIGUN2 at 166.36 -1262.425 27.33 store_to $1924
0397: set_object_dynamic $1923 0
0397: set_object_dynamic $1924 0
0458: set_object_rotation $1923 to 0 29.0 338.0
0458: set_object_rotation $1924 to 0 179.0 334.0
0555: freeze_object_position $1923 to 1
0555: freeze_object_position $1924 to 1
$1982 = 1

:PHIAMMU_715
if and
8572:   not does_char_exist $1985
$1991 == 0
jf @PHIAMMU_885
$1983 == 0
jf @PHIAMMU_769
029B: unload_special_character 9
0241: load_special_character 9 model 'GUN_ASS'
$1983 = 1

:PHIAMMU_769
$1984 == 0
jf @PHIAMMU_792
024C: request_model #CHROMEGUN
$1984 = 1

:PHIAMMU_792
if and
0242: has_special_character_loaded 9
024D: has_model_loaded #CHROMEGUN
jf @PHIAMMU_885
if and
00FA: locate_char_any_means_3d $PLAYER_CHAR coord 165.89 -1259.56 25.1 radius 60.0 60.0 60.0 sphere 0
00C2: is_point_on_screen 165.89 -1259.56 25.1 radius 2.0
jf @PHIAMMU_878
goto @PHIAMMU_885

:PHIAMMU_878
PHIAMMU_5078()

:PHIAMMU_885
$1992 == 0
jf @PHIAMMU_1298
0057: player $PLAYER_CHAR coords 159.69 -1267.71 25.1 to 175.38 -1251.78 31.07 sphere 0
jf @PHIAMMU_1298
if and
8572:   not does_char_exist $1985
$1991 == 0
jf @PHIAMMU_1090
025B: is_player_playing $PLAYER_CHAR
jf @PHIAMMU_975
01B9: set_player_control $PLAYER_CHAR to 0

:PHIAMMU_975
05AE: args 1 out 0 locals_base_index 0 call_func @MDLMAC_2446 250 
029B: unload_special_character 9
0241: load_special_character 9 model 'GUN_ASS'
$1983 = 1
024C: request_model #CHROMEGUN
$1984 = 1
0390: load_all_models_now

:PHIAMMU_1023
if or
8242:   not has_special_character_loaded 9
824D:   not has_model_loaded #CHROMEGUN
jf @PHIAMMU_1053
wait 0
goto @PHIAMMU_1023

:PHIAMMU_1053
PHIAMMU_5078()
025B: is_player_playing $PLAYER_CHAR
jf @PHIAMMU_1077
01B9: set_player_control $PLAYER_CHAR to 1

:PHIAMMU_1077
016E: set_fading_colour 0 0 1
016F: do_fade 250 fade 1

:PHIAMMU_1090
03B2: switch_rubbish 0
001F: TIMERA > $1990
jf @PHIAMMU_1285
0572: does_char_exist $1985
jf @PHIAMMU_1273
811D:   not is_char_dead $1985
jf @PHIAMMU_1273
$1991 == 0
jf @PHIAMMU_1273
$1987 == 0
jf @PHIAMMU_1273
$1093 == 0
jf @PHIAMMU_1273
$1094 == 0
jf @PHIAMMU_1273
$1986 == 0
jf @PHIAMMU_1205
0191: add_one_off_sound 171.7 -1263.5 25.1 sound 52

:PHIAMMU_1205
$1986 == 1
jf @PHIAMMU_1236
0191: add_one_off_sound 171.7 -1263.5 25.1 sound 53

:PHIAMMU_1236
$1986 == 2
jf @PHIAMMU_1249

:PHIAMMU_1249
$1986 += 1
$1986 > 1
jf @PHIAMMU_1273
$1986 = 0

:PHIAMMU_1273
008A: $1990 = TIMERA  // (int)
$1990 += 10000

:PHIAMMU_1285
$1992 = 1
goto @PHIAMMU_50

:PHIAMMU_1298
0572: does_char_exist $1985
jf @PHIAMMU_1580
811D:   not is_char_dead $1985
jf @PHIAMMU_1532
$1992 == 1
jf @PHIAMMU_1378
02E4: is_player_shooting $PLAYER_CHAR
jf @PHIAMMU_1378
if and
82DC:   not is_current_player_weapon $PLAYER_CHAR weapon 34
82DC:   not is_current_player_weapon $PLAYER_CHAR weapon 1
82DC:   not is_current_player_weapon $PLAYER_CHAR weapon 0
jf @PHIAMMU_1378
$1987 = 1

:PHIAMMU_1378
045C: is_player_targetting_char $PLAYER_CHAR char $1985
jf @PHIAMMU_1419
if and
82DC:   not is_current_player_weapon $PLAYER_CHAR weapon 1
82DC:   not is_current_player_weapon $PLAYER_CHAR weapon 0
jf @PHIAMMU_1419
$1987 = 1

:PHIAMMU_1419
811D:   not is_char_dead $PLAYER_ACTOR
jf @PHIAMMU_1449
051F: has_char_been_damaged_by_char $1985 char $PLAYER_ACTOR
jf @PHIAMMU_1449
$1987 = 1

:PHIAMMU_1449
025B: is_player_playing $PLAYER_CHAR
jf @PHIAMMU_1525
$1987 == 1
jf @PHIAMMU_1503
01BE: set_current_char_weapon $1985 to 19
01CF: set_char_obj_kill_player_on_foot $1985 player $PLAYER_CHAR
008A: $1988 = TIMERA  // (int)
$1988 += 30000
$1987 = 2

:PHIAMMU_1503
$1987 == 0
jf @PHIAMMU_1525
0197: set_char_obj_wait_on_foot $1985
0214: turn_char_to_face_player $1985 player $PLAYER_CHAR

:PHIAMMU_1525
goto @PHIAMMU_1580

:PHIAMMU_1532
$1991 == 0
jf @PHIAMMU_1580
$1991 = 1
0113: alter_wanted_level_no_drop $PLAYER_CHAR to 1
801E:   not $1989 > TIMERA
jf @PHIAMMU_1580
008A: $1989 = TIMERA  // (int)
$1989 += 30000

:PHIAMMU_1580
$1992 == 1
jf @PHIAMMU_1651
8057:   not player $PLAYER_CHAR coords 159.69 -1267.71 25.1 to 175.38 -1251.78 31.07 sphere 0
jf @PHIAMMU_1651
$1992 = 0
03B2: switch_rubbish 1
goto @PHIAMMU_50

:PHIAMMU_1651
$1994 == 1
jf @PHIAMMU_1722
80FB:   not locate_player_on_foot_3d $PLAYER_CHAR coord 171.78 -1261.86 25.1 radius 1.0 1.0 5.0 sphere 0
jf @PHIAMMU_1705
$1994 = 0

:PHIAMMU_1705
$1992 == 0
jf @PHIAMMU_1722
$1994 = 0

:PHIAMMU_1722
$1992 == 1
jf @PHIAMMU_5014
$1987 == 0
jf @PHIAMMU_5014
0572: does_char_exist $1985
jf @PHIAMMU_5014
811D:   not is_char_dead $1985
jf @PHIAMMU_5014
$1991 == 0
jf @PHIAMMU_5014
$1994 == 0
jf @PHIAMMU_5014
$1086 == 0
jf @PHIAMMU_5014
00FE: locate_stopped_player_on_foot_3d $PLAYER_CHAR coord 171.78 -1261.86 25.1 radius 1.0 1.0 5.0 sphere 1
jf @PHIAMMU_5014
$1928 = 0
$1994 = 1
$1993 = 1
$1927 = 1
$1925 = 0
$1926 = 4
025B: is_player_playing $PLAYER_CHAR
jf @PHIAMMU_1926
01B9: set_player_control $PLAYER_CHAR to 0
811D:   not is_char_dead $PLAYER_ACTOR
jf @PHIAMMU_1909
04DC: freeze_char_position $PLAYER_ACTOR set_to 1

:PHIAMMU_1909
811D:   not is_char_dead $1985
jf @PHIAMMU_1926
0215: turn_player_to_face_char $PLAYER_CHAR char $1985

:PHIAMMU_1926
$1995 = 0
if or
$_302 > 4
$1120 == 1
$_301 == 1
jf @PHIAMMU_1966
$1995 = 1

:PHIAMMU_1966
if or
$_305 > 4
$1120 == 1
$_304 == 1
jf @PHIAMMU_2001
$1995 = 1

:PHIAMMU_2001
if or
$1093 == 1
$1094 == 1
jf @PHIAMMU_2024

:PHIAMMU_2024
$2002 = 0
if or
$_452 > 1
$_451 == 1
jf @PHIAMMU_2058
$2002 = 1

:PHIAMMU_2058
05AE: args 0 out 0 locals_base_index 0 call_func @MDLMAC_39 
0586: display_radar 1
0586: display_radar 0
0164: set_fixed_camera_position 171.7 -1262.4 27.5 rotation 0 0 0
0165: point_camera_at_point 171.4 -1264.3 27.5 switchstyle 2

:PHIAMMU_2110
$1927 == 1
jf @PHIAMMU_4953
wait 0
05AE: args 0 out 0 locals_base_index 0 call_func @MDLMAC_39 
$1925 == 0
jf @PHIAMMU_2757
0164: set_fixed_camera_position 171.7 -1262.4 27.5 rotation 0 0 0
0165: point_camera_at_point 171.4 -1264.3 27.5 switchstyle 1
$1993 == 1
jf @PHIAMMU_2214
0465: set_interpolation_parameters 0 time 1200
$1993 = 0
goto @PHIAMMU_2258

:PHIAMMU_2214
0465: set_interpolation_parameters 0 time 800
008A: $2000 = TIMERA  // (int)
$2000 += 800

:PHIAMMU_2232
001E: $2000 > TIMERA
jf @PHIAMMU_2258
wait 0
03EB: clear_help
00BE: clear_prints
goto @PHIAMMU_2232

:PHIAMMU_2258
$1925 == 0
jf @PHIAMMU_2757
wait 0
00BA: print_big 'A_ROCKE' time 1000 style 4 // ~w~< Rocket Launcher >
025B: is_player_playing $PLAYER_CHAR
jf @PHIAMMU_2733
0164: set_fixed_camera_position 171.7 -1262.4 27.5 rotation 0 0 0
0165: point_camera_at_point 171.4 -1264.3 27.5 switchstyle 2
01B9: set_player_control $PLAYER_CHAR to 0
PHIAMMU_5467()
$1094 == 1
jf @PHIAMMU_2381
0657: print_now_dont_add_to_brief_array 'A_NEDS4' time 1000 flag 1 // ~w~Some church guy reserved one of these for you.
goto @PHIAMMU_2527

:PHIAMMU_2381
$1995 == 1
jf @PHIAMMU_2512
810F:   not is_score_greater $PLAYER_CHAR than 8999 // money
jf @PHIAMMU_2433
0658: print_with_number_now_dont_add_to_brief_array 'A_COST4' number 9000 time 1000 flag 1 // ~w~Cost: ~h~$~1~ ~n~ ~r~You cannot afford this.
goto @PHIAMMU_2505

:PHIAMMU_2433
if or
0495: has_player_got_weapon $PLAYER_CHAR weapon 31
0495: has_player_got_weapon $PLAYER_CHAR weapon 32
0495: has_player_got_weapon $PLAYER_CHAR weapon 33
jf @PHIAMMU_2487
0658: print_with_number_now_dont_add_to_brief_array 'A_COST2' number 9000 time 1000 flag 1 // ~w~Cost: ~h~$~1~ ~n~ ~r~This will replace your current weapon.
goto @PHIAMMU_2505

:PHIAMMU_2487
0658: print_with_number_now_dont_add_to_brief_array 'A_COST' number 9000 time 1000 flag 1 // ~w~Cost: ~h~$~1~

:PHIAMMU_2505
goto @PHIAMMU_2527

:PHIAMMU_2512
0657: print_now_dont_add_to_brief_array 'A_STOCK' time 1000 flag 1 // ~r~Out of stock.

:PHIAMMU_2527
$1999 == 0
jf @PHIAMMU_2703
05AB: get_pad_state actionID 42 store_to $2001
$2001 == 1
jf @PHIAMMU_2696
$1999 = 1
if or
$1995 == 1
$1094 == 1
jf @PHIAMMU_2689
if or
010F: is_score_greater $PLAYER_CHAR than 8999 // money
$1094 == 1
jf @PHIAMMU_2675
01B6: give_player $PLAYER_CHAR weapon 30 ammo 8
01BD: set_current_player_weapon $PLAYER_CHAR to 30
PHIAMMU_5704()
$1094 == 0
jf @PHIAMMU_2663
010E: add_score $PLAYER_CHAR value -9000 // money
052D: add 9000 to_money_spent_on_weapons_stats
goto @PHIAMMU_2668

:PHIAMMU_2663
$1094 = 0

:PHIAMMU_2668
goto @PHIAMMU_2682

:PHIAMMU_2675
PHIAMMU_5677()

:PHIAMMU_2682
goto @PHIAMMU_2696

:PHIAMMU_2689
PHIAMMU_5677()

:PHIAMMU_2696
goto @PHIAMMU_2726

:PHIAMMU_2703
05AB: get_pad_state actionID 42 store_to $2001
$2001 == 0
jf @PHIAMMU_2726
$1999 = 0

:PHIAMMU_2726
goto @PHIAMMU_2750

:PHIAMMU_2733
0084: $1925 = $1926  // (int)
$1925 += 1
$1927 = 0

:PHIAMMU_2750
goto @PHIAMMU_2258

:PHIAMMU_2757
05AE: args 0 out 0 locals_base_index 0 call_func @MDLMAC_39 
$1925 == 1
jf @PHIAMMU_3274
0164: set_fixed_camera_position 170.15 -1262.15 27.5 rotation 0 0 0
0165: point_camera_at_point 169.85 -1264.05 27.5 switchstyle 1
0465: set_interpolation_parameters 0 time 800
008A: $2000 = TIMERA  // (int)
$2000 += 800

:PHIAMMU_2833
001E: $2000 > TIMERA
jf @PHIAMMU_2859
wait 0
03EB: clear_help
00BE: clear_prints
goto @PHIAMMU_2833

:PHIAMMU_2859
$1925 == 1
jf @PHIAMMU_3274
wait 0
00BA: print_big 'A_SHOTG' time 1000 style 4 // ~w~< Shotgun >
025B: is_player_playing $PLAYER_CHAR
jf @PHIAMMU_3250
0164: set_fixed_camera_position 170.15 -1262.15 27.5 rotation 0 0 0
0165: point_camera_at_point 169.85 -1264.05 27.5 switchstyle 2
01B9: set_player_control $PLAYER_CHAR to 0
PHIAMMU_5467()
$1995 == 1
jf @PHIAMMU_3073
810F:   not is_score_greater $PLAYER_CHAR than 1499 // money
jf @PHIAMMU_3000
0658: print_with_number_now_dont_add_to_brief_array 'A_COST4' number 1500 time 1000 flag 1 // ~w~Cost: ~h~$~1~ ~n~ ~r~You cannot afford this.
goto @PHIAMMU_3066

:PHIAMMU_3000
if or
0495: has_player_got_weapon $PLAYER_CHAR weapon 21
0495: has_player_got_weapon $PLAYER_CHAR weapon 20
jf @PHIAMMU_3048
0658: print_with_number_now_dont_add_to_brief_array 'A_COST2' number 1500 time 1000 flag 1 // ~w~Cost: ~h~$~1~ ~n~ ~r~This will replace your current weapon.
goto @PHIAMMU_3066

:PHIAMMU_3048
0658: print_with_number_now_dont_add_to_brief_array 'A_COST' number 1500 time 1000 flag 1 // ~w~Cost: ~h~$~1~

:PHIAMMU_3066
goto @PHIAMMU_3088

:PHIAMMU_3073
0657: print_now_dont_add_to_brief_array 'A_STOCK' time 1000 flag 1 // ~r~Out of stock.

:PHIAMMU_3088
$1999 == 0
jf @PHIAMMU_3220
05AB: get_pad_state actionID 42 store_to $2001
$2001 == 1
jf @PHIAMMU_3213
$1999 = 1
$1995 == 1
jf @PHIAMMU_3206
010F: is_score_greater $PLAYER_CHAR than 1499 // money
jf @PHIAMMU_3192
01B6: give_player $PLAYER_CHAR weapon 19 ammo 32
01BD: set_current_player_weapon $PLAYER_CHAR to 19
PHIAMMU_5704()
010E: add_score $PLAYER_CHAR value -1500 // money
052D: add 1500 to_money_spent_on_weapons_stats
goto @PHIAMMU_3199

:PHIAMMU_3192
PHIAMMU_5677()

:PHIAMMU_3199
goto @PHIAMMU_3213

:PHIAMMU_3206
PHIAMMU_5677()

:PHIAMMU_3213
goto @PHIAMMU_3243

:PHIAMMU_3220
05AB: get_pad_state actionID 42 store_to $2001
$2001 == 0
jf @PHIAMMU_3243
$1999 = 0

:PHIAMMU_3243
goto @PHIAMMU_3267

:PHIAMMU_3250
0084: $1925 = $1926  // (int)
$1925 += 1
$1927 = 0

:PHIAMMU_3267
goto @PHIAMMU_2859

:PHIAMMU_3274
05AE: args 0 out 0 locals_base_index 0 call_func @MDLMAC_39 
$1925 == 2
jf @PHIAMMU_3776
0164: set_fixed_camera_position 169.25 -1261.75 27.5 rotation 0 0 0
0165: point_camera_at_point 168.75 -1263.65 27.5 switchstyle 1
0465: set_interpolation_parameters 0 time 800
008A: $2000 = TIMERA  // (int)
$2000 += 800

:PHIAMMU_3347
001E: $2000 > TIMERA
jf @PHIAMMU_3373
wait 0
03EB: clear_help
00BE: clear_prints
goto @PHIAMMU_3347

:PHIAMMU_3373
$1925 == 2
jf @PHIAMMU_3776
wait 0
00BA: print_big 'A_M4' time 1000 style 4 // ~w~< M4 >
025B: is_player_playing $PLAYER_CHAR
jf @PHIAMMU_3752
0164: set_fixed_camera_position 169.25 -1261.75 27.5 rotation 0 0 0
0165: point_camera_at_point 168.75 -1263.65 27.5 switchstyle 2
01B9: set_player_control $PLAYER_CHAR to 0
PHIAMMU_5467()
$1995 == 1
jf @PHIAMMU_3574
810F:   not is_score_greater $PLAYER_CHAR than 5399 // money
jf @PHIAMMU_3511
0658: print_with_number_now_dont_add_to_brief_array 'A_COST4' number 5400 time 1000 flag 1 // ~w~Cost: ~h~$~1~ ~n~ ~r~You cannot afford this.
goto @PHIAMMU_3567

:PHIAMMU_3511
0495: has_player_got_weapon $PLAYER_CHAR weapon 27
jf @PHIAMMU_3549
0658: print_with_number_now_dont_add_to_brief_array 'A_COST2' number 5400 time 1000 flag 1 // ~w~Cost: ~h~$~1~ ~n~ ~r~This will replace your current weapon.
goto @PHIAMMU_3567

:PHIAMMU_3549
0658: print_with_number_now_dont_add_to_brief_array 'A_COST' number 5400 time 1000 flag 1 // ~w~Cost: ~h~$~1~

:PHIAMMU_3567
goto @PHIAMMU_3589

:PHIAMMU_3574
0657: print_now_dont_add_to_brief_array 'A_STOCK' time 1000 flag 1 // ~r~Out of stock.

:PHIAMMU_3589
$1999 == 0
jf @PHIAMMU_3722
05AB: get_pad_state actionID 42 store_to $2001
$2001 == 1
jf @PHIAMMU_3715
$1999 = 1
$1995 == 1
jf @PHIAMMU_3708
010F: is_score_greater $PLAYER_CHAR than 5399 // money
jf @PHIAMMU_3694
01B6: give_player $PLAYER_CHAR weapon 26 ammo 150
01BD: set_current_player_weapon $PLAYER_CHAR to 26
PHIAMMU_5704()
010E: add_score $PLAYER_CHAR value -5400 // money
052D: add 5400 to_money_spent_on_weapons_stats
goto @PHIAMMU_3701

:PHIAMMU_3694
PHIAMMU_5677()

:PHIAMMU_3701
goto @PHIAMMU_3715

:PHIAMMU_3708
PHIAMMU_5677()

:PHIAMMU_3715
goto @PHIAMMU_3745

:PHIAMMU_3722
05AB: get_pad_state actionID 42 store_to $2001
$2001 == 0
jf @PHIAMMU_3745
$1999 = 0

:PHIAMMU_3745
goto @PHIAMMU_3769

:PHIAMMU_3752
0084: $1925 = $1926  // (int)
$1925 += 1
$1927 = 0

:PHIAMMU_3769
goto @PHIAMMU_3373

:PHIAMMU_3776
05AE: args 0 out 0 locals_base_index 0 call_func @MDLMAC_39 
$1925 == 3
jf @PHIAMMU_4416
0164: set_fixed_camera_position 168.1 -1261.2 27.4 rotation 0 0 0
0165: point_camera_at_point 167.7 -1262.9 27.4 switchstyle 1
0465: set_interpolation_parameters 0 time 800
008A: $2000 = TIMERA  // (int)
$2000 += 800

:PHIAMMU_3856
001E: $2000 > TIMERA
jf @PHIAMMU_3882
wait 0
03EB: clear_help
00BE: clear_prints
goto @PHIAMMU_3856

:PHIAMMU_3882
$1925 == 3
jf @PHIAMMU_4416
wait 0
00BA: print_big 'A_FLAME' time 1000 style 4 // ~w~< Flame-Thrower >
025B: is_player_playing $PLAYER_CHAR
jf @PHIAMMU_4392
0164: set_fixed_camera_position 168.1 -1261.2 27.4 rotation 0 0 0
0165: point_camera_at_point 167.7 -1262.9 27.4 switchstyle 2
01B9: set_player_control $PLAYER_CHAR to 0
PHIAMMU_5467()
$1093 == 1
jf @PHIAMMU_4010
0657: print_now_dont_add_to_brief_array 'A_DONS4' time 1000 flag 1 // ~w~Donald Love's already paid for this.
goto @PHIAMMU_4156

:PHIAMMU_4010
$1995 == 1
jf @PHIAMMU_4141
810F:   not is_score_greater $PLAYER_CHAR than 5499 // money
jf @PHIAMMU_4062
0658: print_with_number_now_dont_add_to_brief_array 'A_COST4' number 5500 time 1000 flag 1 // ~w~Cost: ~h~$~1~ ~n~ ~r~You cannot afford this.
goto @PHIAMMU_4134

:PHIAMMU_4062
if or
0495: has_player_got_weapon $PLAYER_CHAR weapon 32
0495: has_player_got_weapon $PLAYER_CHAR weapon 33
0495: has_player_got_weapon $PLAYER_CHAR weapon 30
jf @PHIAMMU_4116
0658: print_with_number_now_dont_add_to_brief_array 'A_COST2' number 5500 time 1000 flag 1 // ~w~Cost: ~h~$~1~ ~n~ ~r~This will replace your current weapon.
goto @PHIAMMU_4134

:PHIAMMU_4116
0658: print_with_number_now_dont_add_to_brief_array 'A_COST' number 5500 time 1000 flag 1 // ~w~Cost: ~h~$~1~

:PHIAMMU_4134
goto @PHIAMMU_4156

:PHIAMMU_4141
0657: print_now_dont_add_to_brief_array 'A_STOCK' time 1000 flag 1 // ~r~Out of stock.

:PHIAMMU_4156
$1999 == 0
jf @PHIAMMU_4362
05AB: get_pad_state actionID 42 store_to $2001
$2001 == 1
jf @PHIAMMU_4355
$1999 = 1
if or
$1995 == 1
$1093 == 1
jf @PHIAMMU_4348
if or
010F: is_score_greater $PLAYER_CHAR than 5499 // money
$1093 == 1
jf @PHIAMMU_4334
$1093 == 1
jf @PHIAMMU_4269
01B6: give_player $PLAYER_CHAR weapon 31 ammo 1000
goto @PHIAMMU_4278

:PHIAMMU_4269
01B6: give_player $PLAYER_CHAR weapon 31 ammo 600

:PHIAMMU_4278
01BD: set_current_player_weapon $PLAYER_CHAR to 31
PHIAMMU_5704()
$1093 == 0
jf @PHIAMMU_4322
010E: add_score $PLAYER_CHAR value -5500 // money
052D: add 5500 to_money_spent_on_weapons_stats
goto @PHIAMMU_4327

:PHIAMMU_4322
$1093 = 0

:PHIAMMU_4327
goto @PHIAMMU_4341

:PHIAMMU_4334
PHIAMMU_5677()

:PHIAMMU_4341
goto @PHIAMMU_4355

:PHIAMMU_4348
PHIAMMU_5677()

:PHIAMMU_4355
goto @PHIAMMU_4385

:PHIAMMU_4362
05AB: get_pad_state actionID 42 store_to $2001
$2001 == 0
jf @PHIAMMU_4385
$1999 = 0

:PHIAMMU_4385
goto @PHIAMMU_4409

:PHIAMMU_4392
0084: $1925 = $1926  // (int)
$1925 += 1
$1927 = 0

:PHIAMMU_4409
goto @PHIAMMU_3882

:PHIAMMU_4416
05AE: args 0 out 0 locals_base_index 0 call_func @MDLMAC_39 
$1925 == 4
jf @PHIAMMU_4946
0164: set_fixed_camera_position 166.9 -1260.6 27.52 rotation 0 0 0
0165: point_camera_at_point 166.5 -1262.3 27.52 switchstyle 1
0465: set_interpolation_parameters 0 time 800
008A: $2000 = TIMERA  // (int)
$2000 += 800

:PHIAMMU_4495
001E: $2000 > TIMERA
jf @PHIAMMU_4521
wait 0
03EB: clear_help
00BE: clear_prints
goto @PHIAMMU_4495

:PHIAMMU_4521
$1925 == 4
jf @PHIAMMU_4946
wait 0
00BA: print_big 'A_MINIG' time 1000 style 4 // ~w~< Minigun >
025B: is_player_playing $PLAYER_CHAR
jf @PHIAMMU_4922
0164: set_fixed_camera_position 166.9 -1260.6 27.52 rotation 0 0 0
0165: point_camera_at_point 166.5 -1262.3 27.52 switchstyle 2
01B9: set_player_control $PLAYER_CHAR to 0
PHIAMMU_5467()
$2002 == 1
jf @PHIAMMU_4744
810F:   not is_score_greater $PLAYER_CHAR than 9999 // money
jf @PHIAMMU_4665
0658: print_with_number_now_dont_add_to_brief_array 'A_COST4' number 10000 time 1000 flag 1 // ~w~Cost: ~h~$~1~ ~n~ ~r~You cannot afford this.
goto @PHIAMMU_4737

:PHIAMMU_4665
if or
0495: has_player_got_weapon $PLAYER_CHAR weapon 31
0495: has_player_got_weapon $PLAYER_CHAR weapon 32
0495: has_player_got_weapon $PLAYER_CHAR weapon 30
jf @PHIAMMU_4719
0658: print_with_number_now_dont_add_to_brief_array 'A_COST2' number 10000 time 1000 flag 1 // ~w~Cost: ~h~$~1~ ~n~ ~r~This will replace your current weapon.
goto @PHIAMMU_4737

:PHIAMMU_4719
0658: print_with_number_now_dont_add_to_brief_array 'A_COST' number 10000 time 1000 flag 1 // ~w~Cost: ~h~$~1~

:PHIAMMU_4737
goto @PHIAMMU_4759

:PHIAMMU_4744
0657: print_now_dont_add_to_brief_array 'A_STOCK' time 1000 flag 1 // ~r~Out of stock.

:PHIAMMU_4759
$1999 == 0
jf @PHIAMMU_4892
05AB: get_pad_state actionID 42 store_to $2001
$2001 == 1
jf @PHIAMMU_4885
$1999 = 1
$2002 == 1
jf @PHIAMMU_4878
010F: is_score_greater $PLAYER_CHAR than 9999 // money
jf @PHIAMMU_4864
01B6: give_player $PLAYER_CHAR weapon 33 ammo 1000
01BD: set_current_player_weapon $PLAYER_CHAR to 33
PHIAMMU_5704()
010E: add_score $PLAYER_CHAR value -10000 // money
052D: add 10000 to_money_spent_on_weapons_stats
goto @PHIAMMU_4871

:PHIAMMU_4864
PHIAMMU_5677()

:PHIAMMU_4871
goto @PHIAMMU_4885

:PHIAMMU_4878
PHIAMMU_5677()

:PHIAMMU_4885
goto @PHIAMMU_4915

:PHIAMMU_4892
05AB: get_pad_state actionID 42 store_to $2001
$2001 == 0
jf @PHIAMMU_4915
$1999 = 0

:PHIAMMU_4915
goto @PHIAMMU_4939

:PHIAMMU_4922
0084: $1925 = $1926  // (int)
$1925 += 1
$1927 = 0

:PHIAMMU_4939
goto @PHIAMMU_4521

:PHIAMMU_4946
goto @PHIAMMU_2110

:PHIAMMU_4953
if and
025B: is_player_playing $PLAYER_CHAR
$1086 == 0
jf @PHIAMMU_4987
00BE: clear_prints
03EB: clear_help
01B9: set_player_control $PLAYER_CHAR to 1
0378: set_camera_behind_player
02F0: restore_camera_jumpcut

:PHIAMMU_4987
811D:   not is_char_dead $PLAYER_ACTOR
jf @PHIAMMU_5007
04DC: freeze_char_position $PLAYER_ACTOR set_to 0
0586: display_radar 1

:PHIAMMU_5007
goto @PHIAMMU_50

:PHIAMMU_5014
goto @PHIAMMU_5033

:PHIAMMU_5021
PHIAMMU_5196()
wait 500

:PHIAMMU_5033
goto @PHIAMMU_5052

:PHIAMMU_5040
PHIAMMU_5196()
wait 500

:PHIAMMU_5052
goto @PHIAMMU_5071

:PHIAMMU_5059
PHIAMMU_5196()
wait 500

:PHIAMMU_5071
goto @PHIAMMU_50

:PHIAMMU_5078
009A: create_char 21 model #SPECIAL09 at 171.7 -1263.5 25.1 store_to $1985
01CA: dont_remove_char $1985
0178: set_char_heading $1985 to 70.0
0355: set_char_stay_in_same_place $1985 to 1
0578: set_char_stop_shoot_dont_seek_entity $1985 on 1
01B7: give_weapon_to_char $1985 weapon 19 ammo 32
02AE: set_char_only_damaged_by_player $1985 to 1
025B: is_player_playing $PLAYER_CHAR
jf @PHIAMMU_5160
0232: char_look_at_player_always $1985 player $PLAYER_CHAR
0214: turn_char_to_face_player $1985 player $PLAYER_CHAR

:PHIAMMU_5160
01BE: set_current_char_weapon $1985 to 0
024E: mark_model_as_no_longer_needed #CHROMEGUN
$1984 = 0
$1987 == 2
jf @PHIAMMU_5194
01CF: set_char_obj_kill_player_on_foot $1985 player $PLAYER_CHAR

:PHIAMMU_5194
return 

:PHIAMMU_5196
025B: is_player_playing $PLAYER_CHAR
jf @PHIAMMU_5268
80FA:   not locate_char_any_means_3d $PLAYER_CHAR coord 165.89 -1259.56 25.1 radius 60.0 60.0 60.0 sphere 0
jf @PHIAMMU_5256
$1998 = 1
goto @PHIAMMU_5261

:PHIAMMU_5256
$1998 = 0

:PHIAMMU_5261
goto @PHIAMMU_5274

:PHIAMMU_5268
$1998 = 1

:PHIAMMU_5274
$1998 == 1
jf @PHIAMMU_5438
$1978 == 1
jf @PHIAMMU_5309
01C9: mark_object_as_no_longer_needed $1919
$1978 = 0

:PHIAMMU_5309
$1979 == 1
jf @PHIAMMU_5331
01C9: mark_object_as_no_longer_needed $1920
$1979 = 0

:PHIAMMU_5331
$1980 == 1
jf @PHIAMMU_5353
01C9: mark_object_as_no_longer_needed $1921
$1980 = 0

:PHIAMMU_5353
$1981 == 1
jf @PHIAMMU_5375
01C9: mark_object_as_no_longer_needed $1922
$1981 = 0

:PHIAMMU_5375
$1982 == 1
jf @PHIAMMU_5401
01C9: mark_object_as_no_longer_needed $1923
01C9: mark_object_as_no_longer_needed $1924
$1982 = 0

:PHIAMMU_5401
$1983 == 1
jf @PHIAMMU_5438
0572: does_char_exist $1985
jf @PHIAMMU_5438
01C7: mark_char_as_no_longer_needed $1985
029B: unload_special_character 9
$1983 = 0

:PHIAMMU_5438
$1992 == 1
jf @PHIAMMU_5455
03B2: switch_rubbish 1

:PHIAMMU_5455
$1994 = 0
$1992 = 0
return 

:PHIAMMU_5467
0674: print_help_forever_version_b 'A_H1' // ~w~~k~ ~AMBUY~ ~w~to buy. ~n~~k~ ~AMEXI~ ~w~to exit.
05AB: get_pad_state actionID 38 store_to 0@
0@ == 1
jf @PHIAMMU_5507
$1925 -= 1
PHIAMMU_5731()

:PHIAMMU_5507
05AB: get_pad_state actionID 39 store_to 0@
0@ == 1
jf @PHIAMMU_5537
$1925 += 1
PHIAMMU_5731()

:PHIAMMU_5537
0 > $1925
jf @PHIAMMU_5555
0084: $1925 = $1926  // (int)

:PHIAMMU_5555
001C: $1925 > $1926
jf @PHIAMMU_5573
$1925 = 0

:PHIAMMU_5573
05AB: get_pad_state actionID 43 store_to 0@
0@ == 1
jf @PHIAMMU_5603
$1928 = 1
goto @PHIAMMU_5645

:PHIAMMU_5603
$1928 == 1
jf @PHIAMMU_5645
$1927 = 0
0084: $1925 = $1926  // (int)
$1925 += 1
$1928 = 0
PHIAMMU_5731()

:PHIAMMU_5645
$1086 == 1
jf @PHIAMMU_5675
$1927 = 0
0084: $1925 = $1926  // (int)
$1925 += 1

:PHIAMMU_5675
return 

:PHIAMMU_5677
025B: is_player_playing $PLAYER_CHAR
jf @PHIAMMU_5702
0054: get_player_coordinates $PLAYER_CHAR store_to 0@ 1@ 2@
0191: add_one_off_sound 0@ 1@ 2@ sound 14

:PHIAMMU_5702
return 

:PHIAMMU_5704
025B: is_player_playing $PLAYER_CHAR
jf @PHIAMMU_5729
0054: get_player_coordinates $PLAYER_CHAR store_to 0@ 1@ 2@
0191: add_one_off_sound 0@ 1@ 2@ sound 13

:PHIAMMU_5729
return 

:PHIAMMU_5731
025B: is_player_playing $PLAYER_CHAR
jf @PHIAMMU_5756
0054: get_player_coordinates $PLAYER_CHAR store_to 0@ 1@ 2@
0191: add_one_off_sound 0@ 1@ 2@ sound 70

:PHIAMMU_5756
return 

:PHIAMMU_5758
004F: start_new_script @USJ 
return 