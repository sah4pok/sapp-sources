:AMMUNAT
0238: script_name 'AMMUNAT'
$3458 = -1
$3459 = -1
$841 = -1
009C: set_deatharrest_state 0

:AMMUNAT_32
wait 100
009F: is_char_dead $PLAYER_CHAR
jf @AMMUNAT_59
wait 500
goto @AMMUNAT_32

:AMMUNAT_59
037B: args 1 out 0 locals_base_index 12 call_func @EXPORTB_2581 0 
0@ == 0
jf @AMMUNAT_115
$3465 = -57.3
$3466 = -1480.2
$3467 = 9.4
goto @AMMUNAT_334

:AMMUNAT_115
0@ == 1
jf @AMMUNAT_161
$3465 = 372.7
$3466 = 1056.8
$3467 = 18.2
goto @AMMUNAT_334

:AMMUNAT_161
0@ == 2
jf @AMMUNAT_206
$3465 = -679.26
$3466 = 1198.5
$3467 = 10.029
goto @AMMUNAT_334

:AMMUNAT_206
0@ == 5
jf @AMMUNAT_252
$3465 = 198.2
$3466 = -481.7
$3467 = 10.1
goto @AMMUNAT_334

:AMMUNAT_252
0@ == 4
jf @AMMUNAT_296
$3465 = -969.0
$3466 = -686.5
$3467 = 10.3
goto @AMMUNAT_334

:AMMUNAT_296
0@ == 3
jf @AMMUNAT_334
$3465 = -1157.0
$3466 = -700.1
$3467 = 10.6

:AMMUNAT_334
0036: 6@ = $3465 // (float vars)
6@ -= 0.25
0036: 7@ = $3466 // (float vars)
7@ -= 0.25
0036: 8@ = $3467 // (float vars)
8@ -= 0.25
0036: 9@ = $3465 // (float vars)
9@ += 0.25
0036: 10@ = $3466 // (float vars)
10@ += 0.25
0036: 11@ = $3467 // (float vars)
11@ += 0.25
3@ = 0
0@ == 1
jf @AMMUNAT_441
$822 == 5
jf @AMMUNAT_434
3@ = 1

:AMMUNAT_434
goto @AMMUNAT_512

:AMMUNAT_441
0080: locate_char_any_means_2d $PLAYER_CHAR coord $3465 $3466 radius 50.0 50.0 sphere 0
jf @AMMUNAT_512
3@ = 1
0130: read_kill_frenzy_status 5@
5@ == 1
jf @AMMUNAT_487
3@ = 0

:AMMUNAT_487
0202: is_area_occupied 6@ 7@ 8@ to 9@ 10@ 11@ solid 0 car 1 char 0 object 0 particle 0
jf @AMMUNAT_512
3@ = 0

:AMMUNAT_512
3@ == 1
jf @AMMUNAT_4565
0035: $3458 = 0@ // (int vars)
1@ = 1
2@ = 0
4@ = 0
$3478 = 0
  0@ <> 1
jf @AMMUNAT_3573
037B: args 3 out 0 locals_base_index 12 call_func @EXPORTB_2043 $3465 $3466 $3467 

:AMMUNAT_575
1@ == 1
jf @AMMUNAT_3556
wait 0
037B: args 1 out 0 locals_base_index 12 call_func @EXPORTB_2581 1 
0045: is_char_still_alive $PLAYER_CHAR
jf @AMMUNAT_3545
0080: locate_char_any_means_2d $PLAYER_CHAR coord $3465 $3466 radius 50.0 50.0 sphere 0
jf @AMMUNAT_3490
4@ == 1
jf @AMMUNAT_701
808A:   not locate_char_on_foot_3d $PLAYER_CHAR coord $3465 $3466 $3467 radius 1.0 1.0 5.0 sphere 0
jf @AMMUNAT_694
4@ = 0
037B: args 3 out 0 locals_base_index 12 call_func @EXPORTB_2043 $3465 $3466 $3467 

:AMMUNAT_694
goto @AMMUNAT_3483

:AMMUNAT_701
008A: locate_char_on_foot_3d $PLAYER_CHAR coord $3465 $3466 $3467 radius 1.0 1.0 5.0 sphere 0
jf @AMMUNAT_3483
0@ == 0
jf @AMMUNAT_1512
$3461 = 0
$3468 = -60.7
$3469 = -1479.7
$3470 = 9.4
$3462 = -64.4
$3463 = -1479.8
$3464 = 9.4
$3481 = -64.5
$3482 = -1483.1
$3483 = 9.6
$3471 = -66.8
$3472 = -1485.0
$3473 = 9.4
$3474 = -60.1
$3475 = -1480.8
$3476 = 10.4
set_var_text_label $3477 = 'SH_AM01' // 'Ammu-Nation'
02E2: $3497 = 27 // (any)
$3509 = -60.903
$3515 = -1486.852
$3521 = 13.91
$3527 = 8.0
$3533 = 0
$3539 = 0
$3545 = -60.51
$3551 = -1485.49
$3557 = 13.99
$3563 = -60.64
$3569 = -1486.49
$3575 = 13.98
02E2: $3498 = 29 // (any)
$3510 = -62.243
$3516 = -1486.731
$3522 = 13.903
$3528 = 2.0
$3534 = 0
$3540 = 0
$3546 = -61.8198
$3552 = -1485.38
$3558 = 13.99
$3564 = -61.9498
$3570 = -1486.38
$3576 = 13.98
02E2: $3499 = 22 // (any)
$3511 = -63.733
$3517 = -1486.591
$3523 = 13.93
$3529 = 7.0
$3535 = 0
$3541 = 0
$3547 = -63.2496
$3553 = -1485.18
$3559 = 13.99
$3565 = -63.3796
$3571 = -1486.18
$3577 = 13.98
02E2: $3500 = 30 // (any)
$3512 = -65.313
$3518 = -1486.471
$3524 = 13.91
$3530 = 0
$3536 = 0
$3542 = 0
$3548 = -64.8297
$3554 = -1485.18
$3560 = 13.99
$3566 = -64.9596
$3572 = -1486.18
$3578 = 13.98
02E2: $3501 = 32 // (any)
$3513 = -66.539
$3519 = -1486.3
$3525 = 13.903
$3531 = 0
$3537 = 0
$3543 = 0
$3549 = -66.32
$3555 = -1485.18
$3561 = 13.99
$3567 = -66.45
$3573 = -1486.18
$3579 = 13.98
02E2: $3502 = 41 // (any)
$3514 = -67.629
$3520 = -1486.09
$3526 = 14.013
$3532 = 0
$3538 = 0
$3544 = 0
$3550 = -67.4702
$3556 = -1484.899
$3562 = 13.91
$3568 = -67.6002
$3574 = -1485.899
$3580 = 13.92
goto @AMMUNAT_3053

:AMMUNAT_1512
0@ == 2
jf @AMMUNAT_2306
$3461 = 0
$3468 = -679.29
$3469 = 1202.3
$3470 = 10.034
$3462 = -679.0
$3463 = 1206.6
$3464 = 10.0
$3481 = -682.97
$3482 = 1205.5
$3483 = 10.0
$3471 = -685.6
$3472 = 1201.1
$3473 = 10.0
$3474 = -680.4
$3475 = 1208.9
$3476 = 12.0
set_var_text_label $3477 = 'SH_AM01' // 'Ammu-Nation'
02E2: $3497 = 19 // (any)
$3509 = -685.9703
$3515 = 1201.61
$3521 = 14.58
$3527 = 0
$3533 = 4.0
$3539 = 90.0
$3545 = -684.69
$3551 = 1201.72
$3557 = 14.57
$3563 = -685.69
$3569 = 1201.78
$3575 = 14.59
02E2: $3498 = 24 // (any)
$3510 = -685.9203
$3516 = 1202.589
$3522 = 14.56
$3528 = 0
$3534 = 8.0
$3540 = 95.0
$3546 = -684.6299
$3552 = 1202.761
$3558 = 14.57
$3564 = -685.6299
$3570 = 1202.821
$3576 = 14.59
02E2: $3499 = 25 // (any)
$3511 = -685.9403
$3517 = 1203.949
$3523 = 14.58
$3529 = 0
$3535 = 9.0
$3541 = 95.0
$3547 = -684.6299
$3553 = 1204.002
$3559 = 14.57
$3565 = -685.6299
$3571 = 1204.062
$3577 = 14.59
02E2: $3500 = 12 // (any)
$3512 = -685.9403
$3518 = 1205.109
$3524 = 14.62
$3530 = 0
$3536 = 3.0
$3542 = 95.0
$3548 = -684.6299
$3554 = 1205.103
$3560 = 14.57
$3566 = -685.6299
$3572 = 1205.163
$3578 = 14.59
02E2: $3501 = 21 // (any)
$3513 = -685.9803
$3519 = 1206.239
$3525 = 14.53
$3531 = 0
$3537 = 2.0
$3543 = 95.0
$3549 = -684.6299
$3555 = 1206.485
$3561 = 14.57
$3567 = -685.6299
$3573 = 1206.545
$3579 = 14.59
02E2: $3502 = 41 // (any)
$3514 = -685.9705
$3520 = 1208.039
$3526 = 14.629
$3532 = 0
$3538 = 0
$3544 = 90.0
$3550 = -684.3597
$3556 = 1207.936
$3562 = 14.57
$3568 = -685.3597
$3574 = 1207.996
$3580 = 14.59
goto @AMMUNAT_3053

:AMMUNAT_2306
0@ == 3
jf @AMMUNAT_3053
$3461 = 1
$3468 = -1157.0
$3469 = -702.5
$3470 = 10.7
$3462 = -1152.4
$3463 = -703.5
$3464 = 10.7
$3481 = -1152.2
$3482 = -706.3
$3483 = 10.7
$3471 = -1154.1
$3472 = -707.0
$3473 = 10.0
$3474 = -1150.1
$3475 = -704.9
$3476 = 15.0
set_var_text_label $3477 = 'SH_AM02' // 'Stonewall J's'
02E2: $3497 = 2 // (any)
$3509 = -1150.14
$3515 = -707.3308
$3521 = 12.68
$3527 = 0
$3533 = 30.0
$3539 = 180.0
$3545 = -1150.29
$3551 = -706.07
$3557 = 12.68
$3563 = -1150.29
$3569 = -707.07
$3575 = 12.68
02E2: $3498 = 9 // (any)
$3510 = -1150.761
$3516 = -707.3408
$3522 = 12.64
$3528 = 0
$3534 = 44.0
$3540 = 180.0
$3546 = -1151.081
$3552 = -706.07
$3558 = 12.68
$3564 = -1151.081
$3570 = -707.07
$3576 = 12.68
02E2: $3499 = 19 // (any)
$3511 = -1151.721
$3517 = -707.3408
$3523 = 12.66
$3529 = 0
$3535 = 0
$3541 = 180.0
$3547 = -1151.921
$3553 = -706.07
$3559 = 12.68
$3565 = -1151.921
$3571 = -707.07
$3577 = 12.68
02E2: $3500 = 24 // (any)
$3512 = -1152.541
$3518 = -707.3408
$3524 = 12.62
$3530 = 0
$3536 = 0
$3542 = 180.0
$3548 = -1152.771
$3554 = -706.07
$3560 = 12.68
$3566 = -1152.771
$3572 = -707.07
$3578 = 12.68
02E2: $3501 = 23 // (any)
$3513 = -1153.383
$3519 = -707.3408
$3525 = 12.59
$3531 = 0
$3537 = 0
$3543 = 180.0
$3549 = -1153.784
$3555 = -706.07
$3561 = 12.69
$3567 = -1153.784
$3573 = -707.07
$3579 = 12.69
02E2: $3502 = 0 // (any)
$3514 = 0
$3520 = 0
$3526 = 0
$3532 = 0
$3538 = 0
$3544 = 0
$3550 = 0
$3556 = 0
$3562 = 0
$3568 = 0
$3574 = 0
$3580 = 0

:AMMUNAT_3053
037B: args 0 out 0 locals_base_index 12 call_func @EXPORTB_5977 
4@ = 1

:AMMUNAT_3068
1@ == 1
jf @AMMUNAT_3425
wait 0
037B: args 1 out 0 locals_base_index 12 call_func @EXPORTB_2581 1 
0045: is_char_still_alive $PLAYER_CHAR
jf @AMMUNAT_3414
037B: args 0 out 0 locals_base_index 12 call_func @EXPORTB_4615 
037B: args 0 out 0 locals_base_index 12 call_func @EXPORTB_6824 
jf @AMMUNAT_3252
2@ == 0
jf @AMMUNAT_3219
037B: args 3 out 0 locals_base_index 12 call_func @EXPORTB_2108 $3462 $3463 $3464 
008D: locate_stopped_char_on_foot_3d $PLAYER_CHAR coord $3462 $3463 $3464 radius 1.0 1.0 5.0 sphere 0
jf @AMMUNAT_3212
037B: args 0 out 0 locals_base_index 12 call_func @EXPORTB_2138 
2@ = 1
037B: args 0 out 0 locals_base_index 12 call_func @EXPORTB_7230 

:AMMUNAT_3212
goto @AMMUNAT_3245

:AMMUNAT_3219
8081:   not locate_char_on_foot_2d $PLAYER_CHAR coord $3462 $3463 radius 1.0 1.0 sphere 0
jf @AMMUNAT_3245
2@ = 0

:AMMUNAT_3245
goto @AMMUNAT_3266

:AMMUNAT_3252
037B: args 0 out 0 locals_base_index 12 call_func @EXPORTB_2138 
2@ = 0

:AMMUNAT_3266
4@ == 1
jf @AMMUNAT_3332
808A:   not locate_char_on_foot_3d $PLAYER_CHAR coord $3468 $3469 $3470 radius 1.0 1.0 5.0 sphere 0
jf @AMMUNAT_3325
4@ = 0
037B: args 3 out 0 locals_base_index 12 call_func @EXPORTB_2043 $3468 $3469 $3470 

:AMMUNAT_3325
goto @AMMUNAT_3363

:AMMUNAT_3332
008A: locate_char_on_foot_3d $PLAYER_CHAR coord $3468 $3469 $3470 radius 1.0 1.0 5.0 sphere 0
jf @AMMUNAT_3363
1@ = 0

:AMMUNAT_3363
  0@ <> 1
jf @AMMUNAT_3407
8080:   not locate_char_any_means_2d $PLAYER_CHAR coord $3465 $3466 radius 50.0 50.0 sphere 0
jf @AMMUNAT_3407
1@ = 0
$3478 = 1

:AMMUNAT_3407
goto @AMMUNAT_3418

:AMMUNAT_3414
1@ = 0

:AMMUNAT_3418
goto @AMMUNAT_3068

:AMMUNAT_3425
1@ = 1
4@ = 1
009F: is_char_dead $PLAYER_CHAR
jf @AMMUNAT_3473

:AMMUNAT_3446
009F: is_char_dead $PLAYER_CHAR
jf @AMMUNAT_3467
wait 0
goto @AMMUNAT_3446

:AMMUNAT_3467
$3478 = 1

:AMMUNAT_3473
037B: args 0 out 0 locals_base_index 12 call_func @EXPORTB_5478 

:AMMUNAT_3483
goto @AMMUNAT_3494

:AMMUNAT_3490
1@ = 0

:AMMUNAT_3494
0130: read_kill_frenzy_status 5@
5@ == 1
jf @AMMUNAT_3513
1@ = 0

:AMMUNAT_3513
0202: is_area_occupied 6@ 7@ 8@ to 9@ 10@ 11@ solid 0 car 1 char 0 object 0 particle 0
jf @AMMUNAT_3538
1@ = 0

:AMMUNAT_3538
goto @AMMUNAT_3549

:AMMUNAT_3545
1@ = 0

:AMMUNAT_3549
goto @AMMUNAT_575

:AMMUNAT_3556
037B: args 0 out 0 locals_base_index 12 call_func @EXPORTB_2083 
goto @AMMUNAT_4565

:AMMUNAT_3573
$3461 = 0
$3468 = 367.9
$3469 = 1056.2
$3470 = 18.2
$3462 = 364.8
$3463 = 1056.2
$3464 = -200.7
$3481 = 361.7
$3482 = 1054.3
$3483 = -200.7
$3471 = 360.0
$3472 = 1049.5
$3473 = -200.0
$3474 = 364.0
$3475 = 1055.1
$3476 = -196.0
set_var_text_label $3477 = ''
02E2: $3497 = 20 // (any)
$3509 = 360.3697
$3515 = 1054.8
$3521 = -196.6501
$3527 = 0
$3533 = 0
$3539 = 90.0
$3545 = 361.8091
$3551 = 1054.96
$3557 = -196.6001
$3563 = 360.8091
$3569 = 1055.02
$3575 = -196.5801
02E2: $3498 = 28 // (any)
$3510 = 360.3797
$3516 = 1056.3
$3522 = -196.72
$3528 = 0
$3534 = 0
$3540 = 90.0
$3546 = 361.8091
$3552 = 1056.542
$3558 = -196.6001
$3564 = 360.8091
$3570 = 1056.602
$3576 = -196.5801
02E2: $3499 = 12 // (any)
$3511 = 360.3897
$3517 = 1058.1
$3523 = -196.6001
$3529 = 0
$3535 = 3.0
$3541 = 95.0
$3547 = 361.8191
$3553 = 1058.113
$3559 = -196.6201
$3565 = 360.8191
$3571 = 1058.173
$3577 = -196.6001
02E2: $3500 = 31 // (any)
$3512 = 360.3997
$3518 = 1059.3
$3524 = -196.77
$3530 = 0
$3536 = 0
$3542 = 90.0
$3548 = 361.8091
$3554 = 1059.595
$3560 = -196.6601
$3566 = 360.8091
$3572 = 1059.655
$3578 = -196.6401
02E2: $3501 = 35 // (any)
$3513 = 360.4498
$3519 = 1061.291
$3525 = -196.5401
$3531 = 8.0
$3537 = 26.0
$3543 = 267.0
$3549 = 361.8091
$3555 = 1061.086
$3561 = -196.7001
$3567 = 360.8091
$3573 = 1061.146
$3579 = -196.6801
02E2: $3502 = 41 // (any)
$3514 = 360.4097
$3520 = 1062.49
$3526 = -196.6401
$3532 = 0
$3538 = 0
$3544 = 90.0
$3550 = 361.8091
$3556 = 1062.417
$3562 = -196.7101
$3568 = 360.8091
$3574 = 1062.478
$3580 = -196.6901
037B: args 0 out 0 locals_base_index 12 call_func @EXPORTB_5977 

:AMMUNAT_4350
$822 == 5
jf @AMMUNAT_4555
wait 0
0045: is_char_still_alive $PLAYER_CHAR
jf @AMMUNAT_4544
037B: args 0 out 0 locals_base_index 12 call_func @EXPORTB_4615 
037B: args 0 out 0 locals_base_index 12 call_func @EXPORTB_6824 
jf @AMMUNAT_4523
2@ == 0
jf @AMMUNAT_4490
037B: args 3 out 0 locals_base_index 12 call_func @EXPORTB_2108 $3462 $3463 $3464 
008D: locate_stopped_char_on_foot_3d $PLAYER_CHAR coord $3462 $3463 $3464 radius 1.0 1.0 5.0 sphere 0
jf @AMMUNAT_4483
037B: args 0 out 0 locals_base_index 12 call_func @EXPORTB_2138 
2@ = 1
037B: args 0 out 0 locals_base_index 12 call_func @EXPORTB_7230 

:AMMUNAT_4483
goto @AMMUNAT_4516

:AMMUNAT_4490
8081:   not locate_char_on_foot_2d $PLAYER_CHAR coord $3462 $3463 radius 1.0 1.0 sphere 0
jf @AMMUNAT_4516
2@ = 0

:AMMUNAT_4516
goto @AMMUNAT_4537

:AMMUNAT_4523
037B: args 0 out 0 locals_base_index 12 call_func @EXPORTB_2138 
2@ = 0

:AMMUNAT_4537
goto @AMMUNAT_4548

:AMMUNAT_4544
1@ = 0

:AMMUNAT_4548
goto @AMMUNAT_4350

:AMMUNAT_4555
037B: args 0 out 0 locals_base_index 12 call_func @EXPORTB_5478 

:AMMUNAT_4565
0@ += 1
0@ == 4
jf @AMMUNAT_4586
0@ = 0

:AMMUNAT_4586
goto @AMMUNAT_32

:AMMUNAT_4593
0024: start_new_script @METALDE 
return 

:AMMUNAT_4603
01BB: get_ground_z_for_3d_coord 0@ 1@ 2@ store_to 2@
003E: create_char 4 model #GANG5A at 0@ 1@ 2@ store_to 3@
015D: set_char 3@ ped_stats_to 32
010F: turn_char_to_face_coord 3@ at $3610 $3611 $3612
0042: char_set_idle 3@
0106: give_weapon_to_char 3@ weapon 4 ammo 0
010B: set_current_char_weapon 3@ to 0
return 

:AMMUNAT_4648
0@ = 0
0045: is_char_still_alive $PLAYER_CHAR
jf @AMMUNAT_4743

:AMMUNAT_4663
2 > 0@
jf @AMMUNAT_4743
034A: does_char_exist $3595(0@,2)
jf @AMMUNAT_4731
809F:   not is_char_dead $3595(0@,2)
jf @AMMUNAT_4725
010B: set_current_char_weapon $3595(0@,2) to 4
00E5: set_char_obj_kill_char_any_means $3595(0@,2) char $PLAYER_CHAR
03DE: unknown_char_command_2682 $3595(0@,2) flag 1

:AMMUNAT_4725
0112: mark_char_as_no_longer_needed $3595(0@,2)

:AMMUNAT_4731
0@ += 1
goto @AMMUNAT_4663

:AMMUNAT_4743
return 

:AMMUNAT_4745
0035: 1@ = 0@ // (int vars)
$3608 == 0
jf @AMMUNAT_4934
0@ == 0
jf @AMMUNAT_4797
$3613 -= 1.4
$3614 -= 2.6
goto @AMMUNAT_4934

:AMMUNAT_4797
0@ == 1
jf @AMMUNAT_4832
$3613 += 3.7
$3614 += 1.5
goto @AMMUNAT_4934

:AMMUNAT_4832
0@ == 2
jf @AMMUNAT_4867
$3613 += 0.75
$3614 -= 1.85
goto @AMMUNAT_4934

:AMMUNAT_4867
0@ == 3
jf @AMMUNAT_4902
$3613 -= 3.7
$3614 -= 1.5
goto @AMMUNAT_4934

:AMMUNAT_4902
0@ == 4
jf @AMMUNAT_4934
$3613 += 0.75
$3614 -= 1.85
1@ = 0

:AMMUNAT_4934
if or
$3608 == 1
$3608 == 2
jf @AMMUNAT_5126
0@ == 0
jf @AMMUNAT_5009
$3608 == 1
jf @AMMUNAT_4995
$3618 = 220.0
goto @AMMUNAT_5002

:AMMUNAT_4995
$3618 = 140.0

:AMMUNAT_5002
goto @AMMUNAT_5043

:AMMUNAT_5009
$3608 == 1
jf @AMMUNAT_5036
$3618 -= 5.0
goto @AMMUNAT_5043

:AMMUNAT_5036
$3618 += 5.0

:AMMUNAT_5043
01D2: sin $3618 store_to $3613
$3613 *= 35.0
$3613 -= 1436.0
01D3: cos $3618 store_to $3614
$3614 *= 35.0
$3614 -= 805.0
$3614 += 0.75
$3608 == 1
jf @AMMUNAT_5119
$3613 += 1.5
goto @AMMUNAT_5126

:AMMUNAT_5119
$3613 -= 1.5

:AMMUNAT_5126
return 

:AMMUNAT_5128
0@ = 0
1@ = 0
$2716 = 1

:AMMUNAT_5142
10 > 0@
jf @AMMUNAT_5375
1@ = 0
0036: $3613 = $3610 // (float vars)
0036: $3614 = $3611 // (float vars)
0036: $3615 = $3612 // (float vars)
$3615 += 0.5
$_154(0@,10) > 0
jf @AMMUNAT_5360
0141: remove_pickup $3597(0@,10)
037B: args 1 out 1 locals_base_index 2 call_func @AMMUNAT_4745 1@ 1@ 
02D3: is_any_pickup_at_coords $3613 $3614 $3615 radius 0.5
jf @AMMUNAT_5272

:AMMUNAT_5231
02D3: is_any_pickup_at_coords $3613 $3614 $3615 radius 0.5
jf @AMMUNAT_5272
1@ += 1
037B: args 1 out 1 locals_base_index 2 call_func @AMMUNAT_4745 1@ 1@ 
goto @AMMUNAT_5231

:AMMUNAT_5272
if or
$_144(0@,10) > 0
0@ == 1
jf @AMMUNAT_5360
02DB: $_134(0@,10) == 13  // any == constant
jf @AMMUNAT_5338
01F9: create_pickup_with_ammo #BOMB type 3 ammo $_144(0@,10) at $3613 $3614 $3615 store_to $3597(0@,10)
goto @AMMUNAT_5360

:AMMUNAT_5338
01F9: create_pickup_with_ammo $_154(0@,10) type 3 ammo $_144(0@,10) at $3613 $3614 $3615 store_to $3597(0@,10)

:AMMUNAT_5360
0@ += 1
wait 0
goto @AMMUNAT_5142

:AMMUNAT_5375
return 

:AMMUNAT_5377
0@ = 0

:AMMUNAT_5381
10 > 0@
jf @AMMUNAT_5411
0141: remove_pickup $3597(0@,10)
0@ += 1
goto @AMMUNAT_5381

:AMMUNAT_5411
return 

:AMMUNAT_5413
0@ = 0
1@ = 0
037B: args 0 out 0 locals_base_index 2 call_func @Noname_1_495 
0045: is_char_still_alive $PLAYER_CHAR
jf @AMMUNAT_5446
02D4: remove_all_char_weapons $PLAYER_CHAR

:AMMUNAT_5446
return 

:AMMUNAT_5448
0@ = 0
$3609 > 0
jf @AMMUNAT_5468
0162: mark_model_as_no_longer_needed #GANG5A

:AMMUNAT_5468
$3609 > 1
jf @AMMUNAT_5524

:AMMUNAT_5481
2 > 0@
jf @AMMUNAT_5524
034A: does_char_exist $3595(0@,2)
jf @AMMUNAT_5512
0112: mark_char_as_no_longer_needed $3595(0@,2)

:AMMUNAT_5512
0@ += 1
goto @AMMUNAT_5481

:AMMUNAT_5524
0272: pedtype 11 remove_threat 1
$3609 = 0
return 

:AMMUNAT_5537
037B: args 0 out 0 locals_base_index 0 call_func @AMMUNAT_5448 
037B: args 0 out 0 locals_base_index 0 call_func @AMMUNAT_5377 
$3608 = -1
return 

:AMMUNAT_5565
0035: $3616 = 0@ // (int vars)
return 