//-------------Mission 37---------------
// Originally: Skywolf [PS2 only, I think]

:GYROTGT
0238: script_name 'GYROTGT'
$_1430 == 0
jf @GYROTGT_25
01EA: register_mission_given

:GYROTGT_25
0025: gosub @GYROTGT_4279
009D: has_deatharrest_been_executed
jf @GYROTGT_48
0025: gosub @GYROTGT_6905

:GYROTGT_48
0025: gosub @GYROTGT_7237
0023: terminate_this_script
00B9: set_fixed_camera_position 0@ 1@ 2@ rotation 0 0 0
if and
02DB: 6@ == 1  // any == constant
7@ > 0
jf @GYROTGT_89
02B4: set_interpolation_parameters 0 time 7@

:GYROTGT_89
00BA: point_camera_at_point 3@ 4@ 5@ switchstyle 6@
return 
00B9: set_fixed_camera_position 0@ 1@ 2@ rotation 0 0 0
6@ == 0
jf @GYROTGT_130
00BA: point_camera_at_point 3@ 4@ 5@ switchstyle 2
goto @GYROTGT_141

:GYROTGT_130
02B4: set_interpolation_parameters 0 time 6@
00BA: point_camera_at_point 3@ 4@ 5@ switchstyle 1

:GYROTGT_141
return 
00B9: set_fixed_camera_position 0@ 1@ 2@ rotation 0 0 0
if and
02DB: 4@ == 1  // any == constant
5@ > 0
jf @GYROTGT_175
02B4: set_interpolation_parameters 0 time 5@

:GYROTGT_175
809F:   not is_char_dead 3@
jf @GYROTGT_191
00B5: point_camera_at_char 3@ mode 15 switchstyle 4@

:GYROTGT_191
return 

:GYROTGT_193
$816 = 1
0045: is_char_still_alive $PLAYER_CHAR
jf @GYROTGT_257
0107: set_player_control $PLAYER_CHAR to 0
024A: set_everyone_ignore_player $PLAYER_CHAR to 1
012E: set_police_ignore_player $PLAYER_CHAR to 1
007E: is_char_in_any_car $PLAYER_CHAR
jf @GYROTGT_251
0400: get_player_saved_weapon $PLAYER_CHAR store_to $814
goto @GYROTGT_257

:GYROTGT_251
02C0: get_current_char_weapon $PLAYER_CHAR store_to $814

:GYROTGT_257
0@ >= 0
jf @GYROTGT_284
00C8: set_fading_colour 0 0 0
037B: args 1 out 0 locals_base_index 1 call_func @MAIN_4301 0@ 

:GYROTGT_284
0045: is_char_still_alive $PLAYER_CHAR
jf @GYROTGT_352
807E:   not is_char_in_any_car $PLAYER_CHAR
jf @GYROTGT_329
0352: stop_char $PLAYER_CHAR
0220: set_char $PLAYER_CHAR anim 0 wait_state_time -1 ms
010B: set_current_char_weapon $PLAYER_CHAR to 0
goto @GYROTGT_332

:GYROTGT_329
021D: switch_car_radio 0

:GYROTGT_332
$822 == 0
jf @GYROTGT_348
02EA: set_area_visible 2

:GYROTGT_348
01AE: switch_widescreen 1

:GYROTGT_352
028D: set_near_clip 0.7
0059: clear_prints
0268: clear_help
return 

:GYROTGT_365
0045: is_char_still_alive $PLAYER_CHAR
jf @GYROTGT_429
807E:   not is_char_in_any_car $PLAYER_CHAR
jf @GYROTGT_417
0352: stop_char $PLAYER_CHAR
0220: set_char $PLAYER_CHAR anim 0 wait_state_time -1 ms
02D5: has_char_got_weapon $PLAYER_CHAR weapon $814
jf @GYROTGT_417
010B: set_current_char_weapon $PLAYER_CHAR to $814

:GYROTGT_417
021D: switch_car_radio 1
00A2: set_char_obj_no_obj $PLAYER_CHAR
0154: stop_char_looking $PLAYER_CHAR

:GYROTGT_429
0059: clear_prints
0268: clear_help
0045: is_char_still_alive $PLAYER_CHAR
jf @GYROTGT_478
0107: set_player_control $PLAYER_CHAR to 1
024A: set_everyone_ignore_player $PLAYER_CHAR to 0
012E: set_police_ignore_player $PLAYER_CHAR to 0
01AE: switch_widescreen 0
$822 == 0
jf @GYROTGT_478
02EA: set_area_visible 0

:GYROTGT_478
0221: set_camera_behind_player
01CF: restore_camera_jumpcut
$816 = 0
0@ >= 0
jf @GYROTGT_508
00C8: set_fading_colour 0 0 0
00C9: do_fade 0@ fade 1

:GYROTGT_508
return 
0045: is_char_still_alive 0@
jf @GYROTGT_529
01EC: set_char 0@ running 0
00EE: char 0@ walk_to 1@ 2@

:GYROTGT_529
return 
0045: is_char_still_alive 0@
jf @GYROTGT_559
0045: is_char_still_alive 1@
jf @GYROTGT_559
013E: turn_char_to_face_char 0@ char 1@
013E: turn_char_to_face_char 1@ char 0@

:GYROTGT_559
return 

:GYROTGT_561
0045: is_char_still_alive 0@
jf @GYROTGT_608
007E: is_char_in_any_car 0@
jf @GYROTGT_604
02EE: get_offset_from_char_in_world_coords 0@ offset 0 3.0 0 store_to 2@ 3@ 4@
1@ = 1
goto @GYROTGT_608

:GYROTGT_604
1@ = 0

:GYROTGT_608
1@ == 1
jf @GYROTGT_692
wait 0
0045: is_char_still_alive 0@
jf @GYROTGT_685
007E: is_char_in_any_car 0@
jf @GYROTGT_681
1@ = 1
02A7: is_char_sitting_in_any_car 0@
jf @GYROTGT_671
0216: warp_char_from_car_to_coord 0@ coord 2@ 3@ 4@
goto @GYROTGT_674

:GYROTGT_671
00F1: char 0@ exit_car

:GYROTGT_674
goto @GYROTGT_685

:GYROTGT_681
1@ = 0

:GYROTGT_685
goto @GYROTGT_608

:GYROTGT_692
return 
0045: is_char_still_alive 0@
jf @GYROTGT_786
007E: is_char_in_any_car 0@
jf @GYROTGT_770
02A7: is_char_sitting_in_any_car 0@
jf @GYROTGT_740
00A2: set_char_obj_no_obj 0@
0216: warp_char_from_car_to_coord 0@ coord 1@ 2@ 3@
goto @GYROTGT_763

:GYROTGT_740
00A2: set_char_obj_no_obj 0@
037B: args 1 out 0 locals_base_index 4 call_func @GYROTGT_561 0@ 
00A2: set_char_obj_no_obj 0@
0216: warp_char_from_car_to_coord 0@ coord 1@ 2@ 3@

:GYROTGT_763
goto @GYROTGT_779

:GYROTGT_770
00A2: set_char_obj_no_obj 0@
0216: warp_char_from_car_to_coord 0@ coord 1@ 2@ 3@

:GYROTGT_779
goto @GYROTGT_788

:GYROTGT_786
005F: return_false

:GYROTGT_788
005E: return_true
0045: is_char_still_alive 0@
jf @GYROTGT_946
004F: is_car_still_alive 1@
jf @GYROTGT_946
2@ == -1
jf @GYROTGT_887
02BD: get_driver_of_car 1@ store_to 4@
001C: 4@ == 0@ // (int) var == var
jf @GYROTGT_846
return 
goto @GYROTGT_880

:GYROTGT_846
037B: args 1 out 0 locals_base_index 6 call_func @GYROTGT_561 0@ 
4@ > -1
jf @GYROTGT_880
037B: args 1 out 0 locals_base_index 6 call_func @GYROTGT_561 4@ 

:GYROTGT_880
goto @GYROTGT_946

:GYROTGT_887
029A: get_char_in_car_passenger_seat 1@ seat 2@ store_to 3@
001C: 3@ == 0@ // (int) var == var
jf @GYROTGT_912
return 
goto @GYROTGT_946

:GYROTGT_912
037B: args 1 out 0 locals_base_index 6 call_func @GYROTGT_561 0@ 
  3@ <> -1
jf @GYROTGT_946
037B: args 1 out 0 locals_base_index 6 call_func @GYROTGT_561 3@ 

:GYROTGT_946
0045: is_char_still_alive 0@
jf @GYROTGT_998
004F: is_car_still_alive 1@
jf @GYROTGT_998
007E: is_char_in_any_car 0@
jf @GYROTGT_998
807C:   not is_char_in_car 0@ car 1@
jf @GYROTGT_998
037B: args 1 out 0 locals_base_index 6 call_func @GYROTGT_561 0@ 

:GYROTGT_998
5@ = 0

:GYROTGT_1002
5@ == 0
jf @GYROTGT_1100
wait 0
0045: is_char_still_alive 0@
jf @GYROTGT_1093
004F: is_car_still_alive 1@
jf @GYROTGT_1093
007C: is_char_in_car 0@ car 1@
jf @GYROTGT_1059
5@ = 1
goto @GYROTGT_1093

:GYROTGT_1059
2@ == -1
jf @GYROTGT_1085
00A2: set_char_obj_no_obj 0@
021C: warp_char_into_car 0@ car 1@
goto @GYROTGT_1093

:GYROTGT_1085
00A2: set_char_obj_no_obj 0@
0298: warp_char_into_car_as_passenger 0@ car 1@ seat 2@

:GYROTGT_1093
goto @GYROTGT_1002

:GYROTGT_1100
return 

:GYROTGT_1102
$828 = 0
0377: get_pad_state actionID 0 store_to $828
$828 > 0
jf @GYROTGT_1175
0045: is_char_still_alive $PLAYER_CHAR
jf @GYROTGT_1175
0429: get_char_char_is_targetting $PLAYER_CHAR store_to 0@
0@ > -1
jf @GYROTGT_1175
037B: args 1 out 0 locals_base_index 1 call_func @AUDIMON_2407 0@ 
jf @GYROTGT_1175
$828 = 0

:GYROTGT_1175
$828 > 0
jf @GYROTGT_1293
$829 == -1
jf @GYROTGT_1247
010E: get_game_timer $911
0035: $829 = $911 // (int vars)
$829 += 2500
0267: print_help 'CAN_CON' // Use~h~ ~k~ ~TGSUB~ ~w~again to cancel the mission.
$812 = 1
$831 = 1
goto @GYROTGT_1280

:GYROTGT_1247
801C:   not $830 == $828 // (int) var == var
jf @GYROTGT_1280
$829 = -1
$830 = 0
0268: clear_help
$812 = 0
005E: return_true

:GYROTGT_1280
0035: $830 = $828 // (int vars)
goto @GYROTGT_1351

:GYROTGT_1293
$831 == 1
jf @GYROTGT_1346
010E: get_game_timer $911
0011: $911 > $829 // (int) var > var
jf @GYROTGT_1346
$829 = -1
$830 = 0
0268: clear_help
$812 = 0
$831 = 0

:GYROTGT_1346
$830 = 0

:GYROTGT_1351
005F: return_false

:GYROTGT_1353
0@ == 0
jf @GYROTGT_1396
03CF: set_onscreen_counter_colour 237 130 180 255
03D0: set_onscreen_counter_background_colour 110 16 60 255
goto @GYROTGT_1572

:GYROTGT_1396
0@ == 1
jf @GYROTGT_1429
03CF: set_onscreen_counter_colour 200 200 200 255
goto @GYROTGT_1572

:GYROTGT_1429
0@ == 2
jf @GYROTGT_1471
03CF: set_onscreen_counter_colour 30 255 255 255
03D0: set_onscreen_counter_background_colour 0 88 88 255
goto @GYROTGT_1572

:GYROTGT_1471
0@ == 3
jf @GYROTGT_1515
03CF: set_onscreen_counter_colour 237 130 180 255
03D0: set_onscreen_counter_background_colour 110 16 60 255
goto @GYROTGT_1572

:GYROTGT_1515
0@ == 4
jf @GYROTGT_1546
03CF: set_onscreen_counter_colour 8 143 59 255
goto @GYROTGT_1572

:GYROTGT_1546
0@ == 5
jf @GYROTGT_1572
03CF: set_onscreen_counter_colour 237 130 180 255

:GYROTGT_1572
return 

:GYROTGT_1574
00BC: change_blip_colour 0@ to 2
return 

:GYROTGT_1581
00BC: change_blip_colour 0@ to 6
return 
3@ = -1
00C3: add_blip_for_coord 0@ 1@ 2@ store_to 3@
037B: args 1 out 0 locals_base_index 4 call_func @GYROTGT_1581 3@ 
return 
3@ = 0
004F: is_car_still_alive 0@
jf @GYROTGT_1636
014E: get_car_health 0@ store_to 3@
3@ -= 250

:GYROTGT_1636
0 > 3@
jf @GYROTGT_1651
3@ = 0

:GYROTGT_1651
1@ -= 250
0035: 4@ = 3@ // (int vars)
4@ *= 100
002F: 4@ /= 1@ // (int vars)
2@ = 100
002B: 2@ -= 4@ // (int vars)
0017: 3@ >= 1@ // (int) var >= var
jf @GYROTGT_1696
2@ = 0
005E: return_true

:GYROTGT_1696
005F: return_false
$5349 = 0
$5352 = 0
$5612 = 0
$5613 = 0
$5615 = 0
$5617 = 0
$5618 = 0

:GYROTGT_1733
0035: $5624 = $_1431 // (int vars)
$5624 /= 1000
0035: $5623 = $5624 // (int vars)
$5623 /= 60
0035: $5625 = $5623 // (int vars)
$5625 *= 60
002B: $5624 -= $5625 // (int vars)
return 

:GYROTGT_1778
0@ == 1
jf @GYROTGT_1851
0160: request_model #HUNTER
0160: request_model #AMMOTRUK
0160: request_model #REEFER
0160: request_model #SPARROW

:GYROTGT_1810
if or
8161:   not has_model_loaded #HUNTER
8161:   not has_model_loaded #AMMOTRUK
8161:   not has_model_loaded #REEFER
8161:   not has_model_loaded #SPARROW
jf @GYROTGT_1851
wait 0
goto @GYROTGT_1810

:GYROTGT_1851
return 

:GYROTGT_1853
$5353 = -1621.639
$5359 = -4.1046
$5365 = 60.6123
$5354 = -1493.427
$5360 = 164.4884
$5366 = 68.8646
$5355 = -1188.564
$5361 = 230.8791
$5367 = 31.2333
$5356 = -1289.332
$5362 = 221.2827
$5368 = 35.5307
$5357 = -1386.674
$5363 = -56.679
$5369 = 41.0044
$5358 = -1707.09
$5364 = -272.0868
$5370 = 49.9363
$5371 = -670.0
$5377 = 7520.0
$5383 = 90.0
$5372 = 4100.0
$5378 = 1000.0
$5384 = 0
$5373 = -340.0596
$5379 = 16910.84
$5385 = 0.2247
$5374 = -1000.333
$5380 = 260.2395
$5386 = 0.57
$5375 = -640.0179
$5381 = -1850.007
$5387 = 42.7256
$5376 = 0
$5382 = 0
$5388 = 0
$5389 = -1156.51
$5404 = 287.5381
$5419 = 11.6346
$5390 = -1141.938
$5405 = 382.2939
$5420 = 11.6181
$5391 = -1336.444
$5406 = 121.52
$5421 = 11.0033
$5392 = -1338.469
$5407 = 84.3239
$5422 = 11.0642
$5393 = -1337.873
$5408 = 33.6356
$5423 = 11.0777
$5394 = -1335.697
$5409 = -32.6241
$5424 = 6.1568
$5395 = -1346.413
$5410 = -70.1901
$5425 = 6.1652
$5396 = -1556.029
$5411 = -160.0866
$5426 = 15.2412
$5397 = -1528.26
$5412 = -222.6133
$5427 = 15.2415
$5398 = -1499.416
$5413 = -257.8792
$5428 = 15.2411
$5399 = -1581.15
$5414 = -127.0819
$5429 = 14.7179
$5400 = -1740.86
$5415 = -118.1362
$5430 = 30.9169
$5434 = 4.0
$5435 = 122.0
$5436 = 255.0
$5437 = 169.0
$5438 = 107.0
$5439 = 261.0
$5440 = 86.0
$5441 = 358.0
$5442 = 170.0
$5443 = 242.0
$5444 = 182.0
$5445 = 250.0
$5479 = -1525.955
$5489 = -58.2654
$5499 = 6.2341
$5480 = -1592.633
$5490 = -10.5005
$5500 = 6.1446
$5481 = -1588.635
$5491 = 37.5946
$5501 = 6.167
$5482 = -1540.427
$5492 = 22.1608
$5502 = 6.2657
$5483 = -1552.666
$5493 = -15.4812
$5503 = 6.1504
$5449 = -1301.485
$5459 = -50.1316
$5469 = 6.2694
$5450 = -1282.715
$5460 = -88.1016
$5470 = 6.2596
$5451 = -1293.701
$5461 = -145.8407
$5471 = 6.285
$5452 = -1334.736
$5462 = -128.9412
$5472 = 6.2609
$5453 = -1326.058
$5463 = -76.9832
$5473 = 6.2217
$5509 = -1577.074
$5519 = -210.9312
$5529 = 14.7233
$5510 = -1551.884
$5520 = -264.158
$5530 = 14.725
$5511 = -1489.456
$5521 = -283.4356
$5531 = 14.7157
$5512 = -1435.335
$5522 = -263.0967
$5532 = 14.7234
$5513 = -1433.962
$5523 = -247.0949
$5533 = 14.7242
$5514 = -1449.599
$5524 = -226.6804
$5534 = 14.7919
$5515 = -1485.371
$5525 = -202.4314
$5535 = 15.1356
$5516 = -1535.583
$5526 = -187.1123
$5536 = 14.7248
$5539 = -1592.035
$5549 = -97.2523
$5559 = 57.8193
$5540 = -1539.894
$5550 = -96.6119
$5560 = 61.0766
$5541 = -1511.632
$5551 = -118.0118
$5561 = 62.0718
$5542 = -1519.025
$5552 = -162.9045
$5562 = 60.536
$5543 = -1570.417
$5553 = -163.5423
$5563 = 59.4013
$5630 = 0
$5649 = 20
$5650 = 20
return 

:GYROTGT_3201
0@ == 5
jf @GYROTGT_3219
00BC: change_blip_colour $5590 to 1

:GYROTGT_3219
return 

:GYROTGT_3221
0@ == 5
jf @GYROTGT_3239
00BC: change_blip_colour $5591 to 1

:GYROTGT_3239
return 

:GYROTGT_3241
80A0:   not is_car_dead $5572
jf @GYROTGT_3376
809F:   not is_char_dead $PLAYER_CHAR
jf @GYROTGT_3376
807C:   not is_char_in_car $PLAYER_CHAR car $5572
jf @GYROTGT_3376
00C0: add_blip_for_car $5572 store_to $5589
037B: args 1 out 0 locals_base_index 1 call_func @GYROTGT_1574 $5589 
0035: 0@ = $5629 // (int vars)
$5645 > 0
jf @GYROTGT_3362

:GYROTGT_3311
0011: $5626 > 0@ // (int) var > var
jf @GYROTGT_3355
$5630(0@,15) == 0
jf @GYROTGT_3343
00BB: remove_blip $5592(0@,15)

:GYROTGT_3343
0@ += 1
goto @GYROTGT_3311

:GYROTGT_3355
goto @GYROTGT_3370

:GYROTGT_3362
00BB: remove_blip $5590
00BB: remove_blip $5591

:GYROTGT_3370
$5350 = 2

:GYROTGT_3376
return 

:GYROTGT_3378
80A0:   not is_car_dead $5572
jf @GYROTGT_3620
809F:   not is_char_dead $PLAYER_CHAR
jf @GYROTGT_3620
007C: is_char_in_car $PLAYER_CHAR car $5572
jf @GYROTGT_3620
0035: 0@ = $5607 // (int vars)
0035: 1@ = $5629 // (int vars)
$5350 == 2
jf @GYROTGT_3440
00BB: remove_blip $5589

:GYROTGT_3440
$5645 > 0
jf @GYROTGT_3520

:GYROTGT_3452
0011: $5626 > 1@ // (int) var > var
jf @GYROTGT_3513
$5630(1@,15) == 0
jf @GYROTGT_3501
80A0:   not is_car_dead $5574(1@,15)
jf @GYROTGT_3501
00C0: add_blip_for_car $5574(1@,15) store_to $5592(1@,15)

:GYROTGT_3501
1@ += 1
goto @GYROTGT_3452

:GYROTGT_3513
goto @GYROTGT_3614

:GYROTGT_3520
00C3: add_blip_for_coord $5353(0@,6) $5359(0@,6) $5365(0@,6) store_to $5590
037B: args 1 out 0 locals_base_index 2 call_func @GYROTGT_3201 0@ 
0@ += 1
6 > 0@
jf @GYROTGT_3609
  0@ <> 5
jf @GYROTGT_3609
00C3: add_blip_for_coord $5353(0@,6) $5359(0@,6) $5365(0@,6) store_to $5591
037B: args 1 out 0 locals_base_index 2 call_func @GYROTGT_3221 0@ 
00BD: dim_blip $5591 brightness_to 1

:GYROTGT_3609
0@ -= 1

:GYROTGT_3614
$5350 = 1

:GYROTGT_3620
return 

:GYROTGT_3622
0035: $5626 = 0@ // (int vars)
0035: $5627 = 1@ // (int vars)
0035: $5628 = 2@ // (int vars)
0035: $5629 = 3@ // (int vars)
return 

:GYROTGT_3644
0035: 0@ = $5629 // (int vars)

:GYROTGT_3649
0011: $5626 > 0@ // (int) var > var
jf @GYROTGT_4059
$5630(0@,15) == 0
jf @GYROTGT_4047
3 > $5607
jf @GYROTGT_3719
0048: create_car #AMMOTRUK at $5389(0@,15) $5404(0@,15) $5419(0@,15) store_to $5574(0@,15)
00D1: set_car_heading $5574(0@,15) to $5434(0@,15)

:GYROTGT_3719
$5607 == 3
jf @GYROTGT_3879
0@ > 4
jf @GYROTGT_3848
0048: create_car #REEFER at $5389(0@,15) $5404(0@,15) $5419(0@,15) store_to $5574(0@,15)
00D1: set_car_heading $5574(0@,15) to $5434(0@,15)
0@ == 5
jf @GYROTGT_3808
01BF: boat_goto_coords $5574(0@,15) coords $5449 $5459 $5469
01C3: set_boat_cruise_speed $5574(0@,15) to 15.0

:GYROTGT_3808
0@ == 6
jf @GYROTGT_3841
01BF: boat_goto_coords $5574(0@,15) coords $5479 $5489 $5499
01C3: set_boat_cruise_speed $5574(0@,15) to 15.0

:GYROTGT_3841
goto @GYROTGT_3879

:GYROTGT_3848
0048: create_car #AMMOTRUK at $5389(0@,15) $5404(0@,15) $5419(0@,15) store_to $5574(0@,15)
00D1: set_car_heading $5574(0@,15) to $5434(0@,15)

:GYROTGT_3879
$5607 == 4
jf @GYROTGT_4022
0@ > 10
jf @GYROTGT_3970
0048: create_car #SPARROW at $5389(0@,15) $5404(0@,15) $5419(0@,15) store_to $5574(0@,15)
00D1: set_car_heading $5574(0@,15) to $5434(0@,15)
02FF: set_heli_stabiliser $5574(0@,15) to 1
03D8: unknown_heli_command_7314 vehicle $5574(0@,15)
02DA: heli_goto_coords $5574(0@,15) coords $5539 $5549 $5559 speed 8
goto @GYROTGT_4022

:GYROTGT_3970
0048: create_car #AMMOTRUK at $5389(0@,15) $5404(0@,15) $5419(0@,15) store_to $5574(0@,15)
00D1: set_car_heading $5574(0@,15) to $5434(0@,15)
0@ == 10
jf @GYROTGT_4022
0050: set_car_cruise_speed $5574(0@,15) to 10.0

:GYROTGT_4022
00C0: add_blip_for_car $5574(0@,15) store_to $5592(0@,15)
00BC: change_blip_colour $5592(0@,15) to 0
013A: lock_car_doors $5574(0@,15) mode 2

:GYROTGT_4047
0@ += 1
goto @GYROTGT_3649

:GYROTGT_4059
return 

:GYROTGT_4061
80A0:   not is_car_dead $5572
jf @GYROTGT_4132
809F:   not is_char_dead $PLAYER_CHAR
jf @GYROTGT_4132
807C:   not is_char_in_car $PLAYER_CHAR car $5572
jf @GYROTGT_4132
TIMERB = 0
$5613 = 1
$5612 = 1
0059: clear_prints
03ED: print_with_number_now_dont_add_to_brief_array 'GYRO_30' number $5614 time 4000 flag 1 // ~w~You've got ~1~ seconds to get back in your ~b~vehicle.

:GYROTGT_4132
return 

:GYROTGT_4134
80A0:   not is_car_dead $5572
jf @GYROTGT_4277
809F:   not is_char_dead $PLAYER_CHAR
jf @GYROTGT_4277
007C: is_char_in_car $PLAYER_CHAR car $5572
jf @GYROTGT_4277
TIMERB = 0
$5612 = 0
$5613 = 0
$5615 = 0
0059: clear_prints
0268: clear_help
$5645 > 0
jf @GYROTGT_4227
0056: print 'GYRO_60' time 6000 flag 1 // ~w~Destroy the drone ~r~targets!
goto @GYROTGT_4277

:GYROTGT_4227
$5607 == 5
jf @GYROTGT_4262
0056: print 'GYRO_5' time 6000 flag 1 // ~w~Head for the final ~g~checkpoint.
goto @GYROTGT_4277

:GYROTGT_4262
0056: print 'GYRO_3' time 3000 flag 1 // ~w~Head for the next ~y~checkpoint.

:GYROTGT_4277
return 

:GYROTGT_4279
$ONMISSION = 1
00AA: switch_car_generator $1014 num_generations 0
809F:   not is_char_dead $PLAYER_CHAR
jf @GYROTGT_4341
007E: is_char_in_any_car $PLAYER_CHAR
jf @GYROTGT_4318
007B: store_car_char_is_in $PLAYER_CHAR store_to $5572

:GYROTGT_4318
0110: store_wanted_level $PLAYER_CHAR store_to $5651
$5651 == 1
jf @GYROTGT_4341
009B: clear_wanted_level $PLAYER_CHAR

:GYROTGT_4341
012E: set_police_ignore_player $PLAYER_CHAR to 0
033A: load_mission_text 'GYRO_VC'
wait 0
037B: args 1 out 0 locals_base_index 8 call_func @GYROTGT_1778 1 
$5569 = -1179.069
$5570 = -1103.094
$5571 = 15.4104
809F:   not is_char_dead $PLAYER_CHAR
jf @GYROTGT_4450
80A0:   not is_car_dead $5572
jf @GYROTGT_4448
004E: set_car_coordinates $5572 to -1175.069 -1103.094 15.0104
00D1: set_car_heading $5572 to 7.63

:GYROTGT_4448
0221: set_camera_behind_player

:GYROTGT_4450
80A0:   not is_car_dead $5572
jf @GYROTGT_4465
03D8: unknown_heli_command_7314 vehicle $5572

:GYROTGT_4465
037B: args 0 out 0 locals_base_index 8 call_func @GYROTGT_1853 
$5349 = 1

:GYROTGT_4481
wait 0
809F:   not is_char_dead $PLAYER_CHAR
jf @GYROTGT_6635
80A0:   not is_car_dead $5572
jf @GYROTGT_6635
$5612 == 0
jf @GYROTGT_4535
037B: args 0 out 0 locals_base_index 8 call_func @GYROTGT_4061 
goto @GYROTGT_4545

:GYROTGT_4535
037B: args 0 out 0 locals_base_index 8 call_func @GYROTGT_4134 

:GYROTGT_4545
$5613 == 1
jf @GYROTGT_4802
0035: $5616 = TIMERB // (int vars)
$5616 /= 1000
$5615 == 0
jf @GYROTGT_4612
if and
31000 > $5617
$5617 > 1
jf @GYROTGT_4612
$5615 = 1

:GYROTGT_4612
$5615 == 0
jf @GYROTGT_4644
$5617 > 30099
jf @GYROTGT_4644
$5615 = 2

:GYROTGT_4644
$5615 == 1
jf @GYROTGT_4670
0035: $5614 = $5617 // (int vars)
$5614 /= 1000

:GYROTGT_4670
$5615 == 2
jf @GYROTGT_4695
$5614 = 30
002B: $5614 -= $5616 // (int vars)

:GYROTGT_4695
0059: clear_prints
$5614 > 0
jf @GYROTGT_4765
$5614 > 1
jf @GYROTGT_4747
03ED: print_with_number_now_dont_add_to_brief_array 'GYRO_30' number $5614 time 4000 flag 1 // ~w~You've got ~1~ seconds to get back in your ~b~vehicle.
goto @GYROTGT_4765

:GYROTGT_4747
03ED: print_with_number_now_dont_add_to_brief_array 'GYRO_29' number $5614 time 4000 flag 1 // ~w~You've got ~1~ second to get back in your ~b~vehicle.

:GYROTGT_4765
TIMERB > 30000
jf @GYROTGT_4802
0059: clear_prints
0055: print_big 'GYRO_34' time 5000 style 8 // ~r~You took too long to get back to your vehicle!
$5349 = 12

:GYROTGT_4802
$5349 == 1
jf @GYROTGT_4984
00C9: do_fade 1500 fade 1
037B: args 0 out 0 locals_base_index 8 call_func @GYROTGT_3378 
0059: clear_prints
037B: args 0 out 0 locals_base_index 8 call_func @GYROTGT_1733 
10 > $5624
jf @GYROTGT_4884
01D8: text_2numbers 'GYRO_57' $5623 $5624 6000 ms 1 // ~w~Pass through each ~y~checkpoint!~w~ Beat the record time of ~1~:0~1~.
goto @GYROTGT_4904

:GYROTGT_4884
01D8: text_2numbers 'GYRO_56' $5623 $5624 6000 ms 1 // ~w~Pass through each ~y~checkpoint!~w~ Beat the record time of ~1~:~1~.

:GYROTGT_4904
00CA: get_fading_status
jf @GYROTGT_4923
wait 0
goto @GYROTGT_4904

:GYROTGT_4923
809F:   not is_char_dead $PLAYER_CHAR
jf @GYROTGT_4940
0107: set_player_control $PLAYER_CHAR to 1

:GYROTGT_4940
$5617 = 999999
037B: args 1 out 0 locals_base_index 8 call_func @GYROTGT_1353 5 
024C: display_onscreen_timer_with_string $5618 type 0 gxt 'TIME' // Time
$5350 = 1
$5349 = 2

:GYROTGT_4984
$5349 == 2
jf @GYROTGT_6614
80A0:   not is_car_dead $5579
jf @GYROTGT_5091
0035: 0@ = $5608 // (int vars)
0104: locate_car_3d $5579 point $5449(0@,10) $5459(0@,10) $5469(0@,10) radius 10.0 10.0 10.0 sphere 0
jf @GYROTGT_5091
$5608 += 1
$5608 == 5
jf @GYROTGT_5070
$5608 = 0

:GYROTGT_5070
0035: 0@ = $5608 // (int vars)
01BF: boat_goto_coords $5579 coords $5449(0@,10) $5459(0@,10) $5469(0@,10)

:GYROTGT_5091
80A0:   not is_car_dead $5580
jf @GYROTGT_5185
0035: 1@ = $5609 // (int vars)
0104: locate_car_3d $5580 point $5479(1@,10) $5489(1@,10) $5499(1@,10) radius 10.0 10.0 10.0 sphere 0
jf @GYROTGT_5185
$5609 += 1
$5609 == 5
jf @GYROTGT_5164
$5609 = 0

:GYROTGT_5164
0035: 1@ = $5609 // (int vars)
01BF: boat_goto_coords $5580 coords $5479(1@,10) $5489(1@,10) $5499(1@,10)

:GYROTGT_5185
80A0:   not is_car_dead $5584
jf @GYROTGT_5263
0035: 2@ = $5610 // (int vars)
0104: locate_car_3d $5584 point $5509(2@,10) $5519(2@,10) $5529(2@,10) radius 5.0 5.0 5.0 sphere 0
jf @GYROTGT_5263
$5610 += 1
$5610 == 8
jf @GYROTGT_5258
$5610 = 0

:GYROTGT_5258
0035: 2@ = $5610 // (int vars)

:GYROTGT_5263
80A0:   not is_car_dead $5585
jf @GYROTGT_5359
0035: 3@ = $5611 // (int vars)
0104: locate_car_3d $5585 point $5539(3@,10) $5549(3@,10) $5559(3@,10) radius 15.0 15.0 15.0 sphere 0
jf @GYROTGT_5359
$5611 += 1
$5611 == 5
jf @GYROTGT_5336
$5611 = 0

:GYROTGT_5336
0035: 3@ = $5611 // (int vars)
02DA: heli_goto_coords $5585 coords $5539(3@,10) $5549(3@,10) $5559(3@,10) speed 8

:GYROTGT_5359
0035: $5622 = $5620 // (int vars)
$5622 *= 60000
0035: $5619 = $5618 // (int vars)
002B: $5619 -= $5622 // (int vars)
$5619 /= 1000
$5619 > 59
jf @GYROTGT_5425
$5619 -= 60
$5620 += 1
goto @GYROTGT_5431

:GYROTGT_5425
0035: $5621 = $5619 // (int vars)

:GYROTGT_5431
$5350 == 1
jf @GYROTGT_6591
037B: args 0 out 0 locals_base_index 8 call_func @GYROTGT_3241 
0035: 5@ = $5607 // (int vars)
0035: 4@ = 5@ // (int vars)
4@ += 1
$5645 == 0
jf @GYROTGT_5619
2 > $5351
jf @GYROTGT_5591
6 > 4@
jf @GYROTGT_5550
04BF: draw_checkpoint_with_alpha coords $5353(5@,6) $5359(5@,6) $5365(5@,6) coords $5371(5@,6) $5377(5@,6) $5383(5@,6) colour 237 130 180 radius 6.0
goto @GYROTGT_5584

:GYROTGT_5550
04BF: draw_checkpoint_with_alpha coords $5353(5@,6) $5359(5@,6) $5365(5@,6) coords $5371(5@,6) $5377(5@,6) $5383(5@,6) colour 0 255 0 radius 6.0

:GYROTGT_5584
goto @GYROTGT_5619

:GYROTGT_5591
04BF: draw_checkpoint_with_alpha coords $5353(5@,6) $5359(5@,6) $5365(5@,6) coords $5646 $5647 $5648 colour 255 0 0 radius 6.0

:GYROTGT_5619
$5351 == 1
jf @GYROTGT_5697
007F: is_button_pressed 0 button 17
jf @GYROTGT_5697

:GYROTGT_5644
007F: is_button_pressed 0 button 17
jf @GYROTGT_5666
wait 0
goto @GYROTGT_5644

:GYROTGT_5666
0325: freeze_car_position $5572 set_to 1
$5646 = -1000.0
$5647 = -1000.0
$5648 = 0
$5351 = 2

:GYROTGT_5697
$5351 == 2
jf @GYROTGT_5785
007F: is_button_pressed 0 button 10
jf @GYROTGT_5729
$5646 += 30.0

:GYROTGT_5729
007F: is_button_pressed 0 button 11
jf @GYROTGT_5748
$5647 += 30.0

:GYROTGT_5748
007F: is_button_pressed 0 button 9
jf @GYROTGT_5767
$5648 += 30.0

:GYROTGT_5767
007F: is_button_pressed 0 button 17
jf @GYROTGT_5785
$5351 = 3

:GYROTGT_5785
$5351 == 3
jf @GYROTGT_5861
007F: is_button_pressed 0 button 17
jf @GYROTGT_5849

:GYROTGT_5810
007F: is_button_pressed 0 button 17
jf @GYROTGT_5832
wait 0
goto @GYROTGT_5810

:GYROTGT_5832
$5351 = 1
0325: freeze_car_position $5572 set_to 0
$5650 += 20

:GYROTGT_5849
0376: display_3_float_values int_2D_coords $5649 $5650 float_values $5646 $5647 $5648

:GYROTGT_5861
$5645 == 0
jf @GYROTGT_6314
008B: locate_char_in_car_3d $PLAYER_CHAR coord $5353(5@,6) $5359(5@,6) $5365(5@,6) radius 10.5 10.5 10.5 sphere 0
jf @GYROTGT_6314
$5607 == 1
jf @GYROTGT_5951
037B: args 4 out 0 locals_base_index 8 call_func @GYROTGT_3622 2 2 0 0 
037B: args 0 out 0 locals_base_index 8 call_func @GYROTGT_3644 
$5645 = 1

:GYROTGT_5951
$5607 == 3
jf @GYROTGT_5997
037B: args 4 out 0 locals_base_index 8 call_func @GYROTGT_3622 7 5 0 2 
037B: args 0 out 0 locals_base_index 8 call_func @GYROTGT_3644 
$5645 = 1

:GYROTGT_5997
$5607 == 4
jf @GYROTGT_6043
037B: args 4 out 0 locals_base_index 8 call_func @GYROTGT_3622 12 5 0 7 
037B: args 0 out 0 locals_base_index 8 call_func @GYROTGT_3644 
$5645 = 1

:GYROTGT_6043
00D9: add_one_off_sound 0 0 0 sound 1
5@ += 1
0035: $5607 = 5@ // (int vars)
00BB: remove_blip $5590
00BB: remove_blip $5591
$5645 == 1
jf @GYROTGT_6115
0057: print_now 'GYRO_60' time 6000 flag 1 // ~w~Destroy the drone ~r~targets!
0267: print_help 'H_IV_H1' // Press~h~ ~k~ ~VEWEP~ ~w~to fire the Hunter's ~h~rockets,~w~ and~h~ ~k~ ~VEWE2~ ~w~to fire the ~h~cannon.
goto @GYROTGT_6178

:GYROTGT_6115
$5607 == 5
jf @GYROTGT_6150
0057: print_now 'GYRO_5' time 6000 flag 1 // ~w~Head for the final ~g~checkpoint.
goto @GYROTGT_6178

:GYROTGT_6150
  $5607 <> 6
jf @GYROTGT_6178
0057: print_now 'GYRO_3' time 6000 flag 1 // ~w~Head for the next ~y~checkpoint.

:GYROTGT_6178
$5607 == 6
jf @GYROTGT_6208
00AC: clear_onscreen_timer $5618
$5349 = 3
goto @GYROTGT_6314

:GYROTGT_6208
$5645 == 0
jf @GYROTGT_6314
00C3: add_blip_for_coord $5353(5@,6) $5359(5@,6) $5365(5@,6) store_to $5590
037B: args 1 out 0 locals_base_index 8 call_func @GYROTGT_3201 5@ 
5@ += 1
6 > 5@
jf @GYROTGT_6309
  5@ <> 5
jf @GYROTGT_6309
00C3: add_blip_for_coord $5353(5@,6) $5359(5@,6) $5365(5@,6) store_to $5591
037B: args 1 out 0 locals_base_index 8 call_func @GYROTGT_3221 5@ 
00BD: dim_blip $5591 brightness_to 1

:GYROTGT_6309
5@ -= 1

:GYROTGT_6314
$5645 == 1
jf @GYROTGT_6591
0035: 6@ = $5629 // (int vars)

:GYROTGT_6332
0011: $5626 > 6@ // (int) var > var
jf @GYROTGT_6591
$5630(6@,15) == 0
jf @GYROTGT_6579
00A0: is_car_dead $5574(6@,15)
jf @GYROTGT_6579
$5628 += 1
0059: clear_prints
001C: $5628 == $5627 // (int) var == var
jf @GYROTGT_6549
$5607 == 5
jf @GYROTGT_6427
0057: print_now 'GYRO_5' time 6000 flag 1 // ~w~Head for the final ~g~checkpoint.
goto @GYROTGT_6443

:GYROTGT_6427
0057: print_now 'GYRO_14' time 6000 flag 1 // ~w~All targets destroyed. Head for the next ~y~checkpoint.

:GYROTGT_6443
$5645 = 0
00C3: add_blip_for_coord $5353(5@,6) $5359(5@,6) $5365(5@,6) store_to $5590
037B: args 1 out 0 locals_base_index 8 call_func @GYROTGT_3201 5@ 
5@ += 1
6 > 5@
jf @GYROTGT_6537
  5@ <> 5
jf @GYROTGT_6537
00C3: add_blip_for_coord $5353(5@,6) $5359(5@,6) $5365(5@,6) store_to $5591
037B: args 1 out 0 locals_base_index 8 call_func @GYROTGT_3221 5@ 
00BD: dim_blip $5591 brightness_to 1

:GYROTGT_6537
5@ -= 1
goto @GYROTGT_6565

:GYROTGT_6549
0057: print_now 'GYRO_13' time 6000 flag 1 // ~r~Target~w~ destroyed!

:GYROTGT_6565
00BB: remove_blip $5592(6@,15)
$5630(6@,15) = 1

:GYROTGT_6579
6@ += 1
goto @GYROTGT_6332

:GYROTGT_6591
$5350 == 2
jf @GYROTGT_6614
037B: args 0 out 0 locals_base_index 8 call_func @GYROTGT_3378 

:GYROTGT_6614
$5349 == 3
jf @GYROTGT_6635
0059: clear_prints
$5349 = 11

:GYROTGT_6635
037B: args 0 out 0 locals_base_index 8 call_func @GYROTGT_1102 
jf @GYROTGT_6720
0059: clear_prints
80A0:   not is_car_dead $5572
jf @GYROTGT_6670
0325: freeze_car_position $5572 set_to 0

:GYROTGT_6670
$5352 = 1

:GYROTGT_6676
007F: is_button_pressed 0 button 8
jf @GYROTGT_6698
wait 0
goto @GYROTGT_6676

:GYROTGT_6698
0055: print_big 'GYRO_73' time 5000 style 8 // ~r~Skywolf Cancelled!
$5349 = 12

:GYROTGT_6720
8045:   not is_char_still_alive $PLAYER_CHAR
jf @GYROTGT_6737
$5349 = 12

:GYROTGT_6737
00A0: is_car_dead $5572
jf @GYROTGT_6772
0059: clear_prints
0055: print_big 'GYRO_31' time 5000 style 8 // ~r~You have destroyed your vehicle!
$5349 = 12

:GYROTGT_6772
10 > $5349
jf @GYROTGT_6792
goto @GYROTGT_4481

:GYROTGT_6792
$5349 == 11
jf @GYROTGT_6819
0025: gosub @GYROTGT_6957
goto @GYROTGT_6826

:GYROTGT_6819
0025: gosub @GYROTGT_6905

:GYROTGT_6826
return 
037B: args 1 out 0 locals_base_index 8 call_func @GYROTGT_193 1000 
037B: args 0 out 0 locals_base_index 8 call_func @MAIN_4379 
0057: print_now 'TEMP1_A' time 5000 flag 1
037B: args 1 out 0 locals_base_index 8 call_func @MAIN_4394 5000 
037B: args 0 out 0 locals_base_index 8 call_func @MAIN_4364 
037B: args 1 out 0 locals_base_index 8 call_func @GYROTGT_365 1000 
return 

:GYROTGT_6905
$5352 == 1
jf @GYROTGT_6940
0055: print_big 'M_OVER' time 1000 style 1 // ~r~MISSION OVER!
goto @GYROTGT_6955

:GYROTGT_6940
0055: print_big 'M_FAIL' time 1000 style 1 // MISSION FAILED!

:GYROTGT_6955
return 

:GYROTGT_6957
0011: $_1431 > $5618 // (int) var > var
jf @GYROTGT_7156
0035: $_1431 = $5618 // (int vars)
0035: $5348 = $_1431 // (int vars)
$5348 /= 1000
052C: register_skywolf_time $5348
037B: args 0 out 0 locals_base_index 8 call_func @GYROTGT_1733 
10 > $5624
jf @GYROTGT_7043
01D9: print_with_2_numbers_now 'GYRO_21' numbers $5623 $5624 time 5000 flag 1 // ~w~New Course Record! ~1~:0~1~
goto @GYROTGT_7063

:GYROTGT_7043
01D9: print_with_2_numbers_now 'GYRO_20' numbers $5623 $5624 time 5000 flag 1 // ~w~New Course Record! ~1~:~1~

:GYROTGT_7063
$_1430 == 0
jf @GYROTGT_7123
011D: print_with_number_big 'M_PASS' number 500 time 1000 style 1 // ~Y~MISSION PASSED! ~n~$~1~
0094: add_score $PLAYER_CHAR value 500 // money
022B: play_mission_passed_tune 1
036A: register_oddjob_mission_passed
01DF: player_made_progress 1
$_1430 = 1
goto @GYROTGT_7149

:GYROTGT_7123
011D: print_with_number_big 'GYRO_58' number 500 time 1000 style 1 // NEW RECORD! ~n~$~1~
0094: add_score $PLAYER_CHAR value 500 // money

:GYROTGT_7149
goto @GYROTGT_7231

:GYROTGT_7156
0055: print_big 'M_FAIL' time 1000 style 1 // MISSION FAILED!
10 > $5621
jf @GYROTGT_7211
021E: print_with_2_numbers_big 'GYRO_62' numbers $5620 $5621 time 5000 style 8 // ~r~You failed to beat the Course Record! Your time ~1~:0~1~.
goto @GYROTGT_7231

:GYROTGT_7211
021E: print_with_2_numbers_big 'GYRO_61' numbers $5620 $5621 time 5000 style 8 // ~r~You failed to beat the Course Record! Your time ~1~:~1~.

:GYROTGT_7231
009B: clear_wanted_level $PLAYER_CHAR
return 

:GYROTGT_7237
$ONMISSION = 0
00AA: switch_car_generator $1014 num_generations 101
00C9: do_fade 1500 fade 1
809F:   not is_char_dead $PLAYER_CHAR
jf @GYROTGT_7272
0107: set_player_control $PLAYER_CHAR to 1

:GYROTGT_7272
0162: mark_model_as_no_longer_needed #HUNTER
0162: mark_model_as_no_longer_needed #AMMOTRUK
0162: mark_model_as_no_longer_needed #SPARROW
0162: mark_model_as_no_longer_needed #REEFER
00AC: clear_onscreen_timer $5618
00BB: remove_blip $5589
00BB: remove_blip $5590
00BB: remove_blip $5591
0035: 7@ = $5629 // (int vars)

:GYROTGT_7313
0011: $5626 > 7@ // (int) var > var
jf @GYROTGT_7343
00BB: remove_blip $5592(7@,15)
7@ += 1
goto @GYROTGT_7313

:GYROTGT_7343
007A: mission_has_finished
return 
