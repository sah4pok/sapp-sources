:HELP
03A9: script_name 'HELP'
$_463 = 1

:HELP_16
wait 0
$2295 == 1
jf @HELP_44
wait 5000
goto @HELP_16

:HELP_44
if or
$2305 == 1
$_241 > 1
$_240 == 1
$1119 == 1
jf @HELP_634
$_468 == 0
jf @HELP_181
$ONMISSION == 0
jf @HELP_159
$3773 == 0
jf @HELP_145
0218: create_pickup #INFO type 3 at 1144.3 -588.74 14.8 store_to $3772
$3773 = 1

:HELP_145
HELP_1891()
goto @HELP_181

:HELP_159
$3773 == 1
jf @HELP_181
021A: remove_pickup $3772
$3773 = 0

:HELP_181
$_470 == 0
jf @HELP_283
$ONMISSION == 0
jf @HELP_261
$3771 == 0
jf @HELP_247
0218: create_pickup #INFO type 3 at 1143.9 -675.2 14.97 store_to $3770
$3771 = 1

:HELP_247
HELP_2107()
goto @HELP_283

:HELP_261
$3771 == 1
jf @HELP_283
021A: remove_pickup $3770
$3771 = 0

:HELP_283
$_464 == 0
jf @HELP_302
HELP_929()

:HELP_302
$_465 == 0
jf @HELP_321
HELP_1034()

:HELP_321
$_467 == 0
jf @HELP_340
HELP_1193()

:HELP_340
$_480 == 0
jf @HELP_359
HELP_2768()

:HELP_359
$_481 == 0
jf @HELP_378
HELP_2884()

:HELP_378
$_482 == 0
jf @HELP_397
HELP_3002()

:HELP_397
$_483 == 0
jf @HELP_416
HELP_3565()

:HELP_416
$_484 == 0
jf @HELP_435
HELP_3785()

:HELP_435
$_485 == 0
jf @HELP_454
HELP_3681()

:HELP_454
$_505 == 0
jf @HELP_473
HELP_1384()

:HELP_473
$_506 == 0
jf @HELP_492
HELP_1502()

:HELP_492
$_469 == 0
jf @HELP_511
HELP_1952()

:HELP_511
$_507 == 0
jf @HELP_530
HELP_3910()

:HELP_530
$_500 == 0
jf @HELP_549
HELP_3120()

:HELP_549
$_508 == 0
jf @HELP_568
HELP_2168()

:HELP_568
$_478 == 0
jf @HELP_587
HELP_2434()

:HELP_587
if or
$_472 == 0
$_473 == 0
jf @HELP_615
HELP_1612()

:HELP_615
$_475 == 0
jf @HELP_634
HELP_2550()

:HELP_634
$_465 == 1
jf @HELP_922
$_467 == 1
jf @HELP_922
$_468 == 1
jf @HELP_922
$_470 == 1
jf @HELP_922
$_471 == 1
jf @HELP_922
$_469 == 1
jf @HELP_922
$_508 == 1
jf @HELP_922
$_478 == 1
jf @HELP_922
$_505 == 1
jf @HELP_922
$_464 == 1
jf @HELP_922
$_483 == 1
jf @HELP_922
$_472 == 1
jf @HELP_922
$_473 == 1
jf @HELP_922
$_480 == 1
jf @HELP_922
$_481 == 1
jf @HELP_922
$_482 == 1
jf @HELP_922
$_475 == 1
jf @HELP_922
$_484 == 1
jf @HELP_922
$_485 == 1
jf @HELP_922
$_500 == 1
jf @HELP_922
$_506 == 1
jf @HELP_922
$_507 == 1
jf @HELP_922
004E: terminate_this_script

:HELP_922
goto @HELP_16

:HELP_929
  $1081 <> 1
jf @HELP_1032
$1081 = 1
025B: is_player_playing $PLAYER_CHAR
jf @HELP_1027
0483: is_player_on_any_bike $PLAYER_CHAR
jf @HELP_1027
wait 500
8616:   not unknown_pad_command_52a7
jf @HELP_1020
03EA: print_help 'HELP39' // ~w~Use~h~ ~k~ ~VEWEI~ ~w~to shift your weight while on a bike.
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 5000 
$_464 = 1
goto @HELP_1027

:HELP_1020
03EB: clear_help
$_464 = 0

:HELP_1027
$1081 = 0

:HELP_1032
return 

:HELP_1034
  $1081 <> 1
jf @HELP_1191
$1081 = 1
025B: is_player_playing $PLAYER_CHAR
jf @HELP_1186
80E5:   not is_player_in_any_car $PLAYER_CHAR
jf @HELP_1186
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 1000 
8616:   not unknown_pad_command_52a7
jf @HELP_1127
03EA: print_help 'HELP2' // ~w~Press~h~ ~k~ ~PDSPR~ ~w~while running to ~h~start sprinting.
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 4000 
goto @HELP_1134

:HELP_1127
03EB: clear_help
$_465 = 0

:HELP_1134
8616:   not unknown_pad_command_52a7
jf @HELP_1179
03EA: print_help 'HELP3' // ~w~You can only sprint for a short time before tiring.
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 4000 
$_465 = 1
goto @HELP_1186

:HELP_1179
03EB: clear_help
$_465 = 0

:HELP_1186
$1081 = 0

:HELP_1191
return 

:HELP_1193
  $1081 <> 1
jf @HELP_1382
$1081 = 1
025B: is_player_playing $PLAYER_CHAR
jf @HELP_1377
044F: is_player_on_foot $PLAYER_CHAR
jf @HELP_1377
$1116 == 0
jf @HELP_1377
$_467 == 0
jf @HELP_1377
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 1000 
8616:   not unknown_pad_command_52a7
jf @HELP_1318
0517: print_help_forever 'HELP40' // ~w~When on foot hold~h~ ~k~ ~PDLO1~ ~w~and use~h~ ~k~ ~PDLO2~ ~w~to look around.
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 6000 
03EB: clear_help
$_467 = 1
goto @HELP_1325

:HELP_1318
03EB: clear_help
$_467 = 0

:HELP_1325
8616:   not unknown_pad_command_52a7
jf @HELP_1370
03EA: print_help 'HELP25' // ~w~Press~h~ ~k~ ~CVEIW~ ~w~to change ~h~camera modes.
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 5000 
$_467 = 1
goto @HELP_1377

:HELP_1370
03EB: clear_help
$_467 = 0

:HELP_1377
$1081 = 0

:HELP_1382
return 

:HELP_1384
  $1081 <> 1
jf @HELP_1500
$1081 = 1
025B: is_player_playing $PLAYER_CHAR
jf @HELP_1495
8616:   not unknown_pad_command_52a7
jf @HELP_1495
if or
02DC: is_current_player_weapon $PLAYER_CHAR weapon 13
02DC: is_current_player_weapon $PLAYER_CHAR weapon 12
02DC: is_current_player_weapon $PLAYER_CHAR weapon 15
jf @HELP_1495
$_505 == 0
jf @HELP_1495
0517: print_help_forever 'HELP28' // ~w~To throw an ~h~explosive weapon~w~ press~h~ ~k~ ~PDFW~. ~w~The longer you hold~h~ ~k~ ~PDFW~ ~w~the further the weapon will go.
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 7000 
03EB: clear_help
$_505 = 1

:HELP_1495
$1081 = 0

:HELP_1500
return 

:HELP_1502
  $1081 <> 1
jf @HELP_1610
$1081 = 1
025B: is_player_playing $PLAYER_CHAR
jf @HELP_1605
8616:   not unknown_pad_command_52a7
jf @HELP_1605
044F: is_player_on_foot $PLAYER_CHAR
jf @HELP_1605
82DC:   not is_current_player_weapon $PLAYER_CHAR weapon 0
jf @HELP_1605
$_506 == 0
jf @HELP_1605
03EA: print_help 'HELP21' // ~w~Use~h~ ~k~ ~PDCWE~ ~w~to change weapons when on foot.
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 5000 
$_506 = 1

:HELP_1605
$1081 = 0

:HELP_1610
return 

:HELP_1612
  $1081 <> 1
jf @HELP_1889
$1081 = 1
025B: is_player_playing $PLAYER_CHAR
jf @HELP_1884
00E5: is_player_in_any_car $PLAYER_CHAR
jf @HELP_1884
if or
02DC: is_current_player_weapon $PLAYER_CHAR weapon 22
02DC: is_current_player_weapon $PLAYER_CHAR weapon 23
02DC: is_current_player_weapon $PLAYER_CHAR weapon 24
02DC: is_current_player_weapon $PLAYER_CHAR weapon 25
jf @HELP_1884
$_472 == 0
jf @HELP_1798
8616:   not unknown_pad_command_52a7
jf @HELP_1739
03EA: print_help 'HELP19A' // ~w~To perform a ~h~drive-by~w~, hold~h~ ~k~ ~VELL~ ~w~or~h~ ~k~ ~VELR~ ~w~and fire using~h~ ~k~ ~VEWEP~.
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 5000 
goto @HELP_1746

:HELP_1739
03EB: clear_help
$_472 = 0

:HELP_1746
8616:   not unknown_pad_command_52a7
jf @HELP_1791
03EA: print_help 'HELP19C' // ~w~You can only do a drive-by if you have a ~h~sub-machine gun.
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 5000 
$_472 = 1
goto @HELP_1798

:HELP_1791
03EB: clear_help
$_472 = 0

:HELP_1798
$_473 == 0
jf @HELP_1884
025B: is_player_playing $PLAYER_CHAR
jf @HELP_1884
0483: is_player_on_any_bike $PLAYER_CHAR
jf @HELP_1884
8616:   not unknown_pad_command_52a7
jf @HELP_1877
03EA: print_help 'HELP19D' // ~h~Motorbikes ~w~allow you to ~h~shoot forwards~w~ by pressing~h~ ~k~ ~VEWEP~.
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 5000 
$_473 = 1
goto @HELP_1884

:HELP_1877
03EB: clear_help
$_473 = 0

:HELP_1884
$1081 = 0

:HELP_1889
return 

:HELP_1891
  $1081 <> 1
jf @HELP_1950
$1081 = 1
025B: is_player_playing $PLAYER_CHAR
jf @HELP_1945
0219: has_pickup_been_collected $3772
jf @HELP_1945
HELP_5683()
$_468 = 1

:HELP_1945
$1081 = 0

:HELP_1950
return 

:HELP_1952
025B: is_player_playing $PLAYER_CHAR
jf @HELP_2105
01C5: store_wanted_level $PLAYER_CHAR store_to $2730
$2730 > 0
jf @HELP_2105
  $1081 <> 1
jf @HELP_2105
$1081 = 1
8616:   not unknown_pad_command_52a7
jf @HELP_2041
0517: print_help_forever 'HELP10' // ~w~The ~h~yellow badge~w~ indicates you are a ~h~wanted man~w~ - police officers will try to arrest you.
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 6000 
03EB: clear_help
goto @HELP_2048

:HELP_2041
03EB: clear_help
$_469 = 0

:HELP_2048
8616:   not unknown_pad_command_52a7
jf @HELP_2093
03EA: print_help 'HELP11' // ~w~As more badges are displayed the Law will try harder to stop you.
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 5000 
$_469 = 1
goto @HELP_2100

:HELP_2093
03EB: clear_help
$_469 = 0

:HELP_2100
$1081 = 0

:HELP_2105
return 

:HELP_2107
  $1081 <> 1
jf @HELP_2166
$1081 = 1
025B: is_player_playing $PLAYER_CHAR
jf @HELP_2161
0219: has_pickup_been_collected $3770
jf @HELP_2161
HELP_4282()
$_470 = 1

:HELP_2161
$1081 = 0

:HELP_2166
return 

:HELP_2168
  $1081 <> 1
jf @HELP_2432
$1081 = 1
025B: is_player_playing $PLAYER_CHAR
jf @HELP_2427
$ONMISSION == 0
jf @HELP_2427
$2323 == 1
jf @HELP_2277
$_510 == 0
jf @HELP_2277
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 5000 
03EA: print_help 'A_UZI_A' // ~w~Ammu-Nation now stock Micro SMGs!
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 5000 
$_510 = 1

:HELP_2277
if or
$_302 > 4
$_305 > 4
jf @HELP_2354
$_511 == 0
jf @HELP_2354
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 5000 
03EA: print_help 'HELP18' // ~w~New stock has been delivered to Phil Cassidy's Fully Cocked Gun Shop!
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 5000 
$_511 = 1

:HELP_2354
$_452 > 1
jf @HELP_2427
$_512 == 0
jf @HELP_2427
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 5000 
03EA: print_help 'HELP18B' // ~w~Phil Cassidy's now has the ~h~Minigun~w~ in stock!
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 5000 
$_512 = 1
$_508 = 1

:HELP_2427
$1081 = 0

:HELP_2432
return 

:HELP_2434
  $1081 <> 1
jf @HELP_2548
$1081 = 1
025B: is_player_playing $PLAYER_CHAR
jf @HELP_2543
$ONMISSION == 0
jf @HELP_2543
$_266 == 1
jf @HELP_2543
$_478 == 0
jf @HELP_2543
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 5000 
03EA: print_help 'CARS_O' // ~w~Capital Autos in Harwood is looking for new salesmen, if you want to make some extra money.
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 5000 
$_478 = 1

:HELP_2543
$1081 = 0

:HELP_2548
return 

:HELP_2550
0219: has_pickup_been_collected $3811
jf @HELP_2577
03EA: print_help 'HELP20' // ~w~You found a ~h~police bribe!~w~ Collecting them reduces your ~h~wanted level~w~ by one star!
$_475 = 1

:HELP_2577
0219: has_pickup_been_collected $3812
jf @HELP_2604
03EA: print_help 'HELP20' // ~w~You found a ~h~police bribe!~w~ Collecting them reduces your ~h~wanted level~w~ by one star!
$_475 = 1

:HELP_2604
0219: has_pickup_been_collected $3813
jf @HELP_2631
03EA: print_help 'HELP20' // ~w~You found a ~h~police bribe!~w~ Collecting them reduces your ~h~wanted level~w~ by one star!
$_475 = 1

:HELP_2631
0219: has_pickup_been_collected $3814
jf @HELP_2658
03EA: print_help 'HELP20' // ~w~You found a ~h~police bribe!~w~ Collecting them reduces your ~h~wanted level~w~ by one star!
$_475 = 1

:HELP_2658
0219: has_pickup_been_collected $3815
jf @HELP_2685
03EA: print_help 'HELP20' // ~w~You found a ~h~police bribe!~w~ Collecting them reduces your ~h~wanted level~w~ by one star!
$_475 = 1

:HELP_2685
0219: has_pickup_been_collected $3816
jf @HELP_2712
03EA: print_help 'HELP20' // ~w~You found a ~h~police bribe!~w~ Collecting them reduces your ~h~wanted level~w~ by one star!
$_475 = 1

:HELP_2712
0219: has_pickup_been_collected $3817
jf @HELP_2739
03EA: print_help 'HELP20' // ~w~You found a ~h~police bribe!~w~ Collecting them reduces your ~h~wanted level~w~ by one star!
$_475 = 1

:HELP_2739
0219: has_pickup_been_collected $3818
jf @HELP_2766
03EA: print_help 'HELP20' // ~w~You found a ~h~police bribe!~w~ Collecting them reduces your ~h~wanted level~w~ by one star!
$_475 = 1

:HELP_2766
return 

:HELP_2768
  $1081 <> 1
jf @HELP_2882
$1081 = 1
025B: is_player_playing $PLAYER_CHAR
jf @HELP_2877
$ONMISSION == 0
jf @HELP_2877
$_249 == 1
jf @HELP_2877
$_480 == 0
jf @HELP_2877
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 7000 
03EA: print_help 'HELP33' // ~w~Now the hitmen have been paid they'll see the job through, no matter how long it takes.
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 5000 
$_480 = 1

:HELP_2877
$1081 = 0

:HELP_2882
return 

:HELP_2884
  $1081 <> 1
jf @HELP_3000
$1081 = 1
025B: is_player_playing $PLAYER_CHAR
jf @HELP_2995
$ONMISSION == 0
jf @HELP_2995
$1344 == 1
jf @HELP_2995
$_481 == 0
jf @HELP_2995
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 7000 
0517: print_help_forever 'SRC_ON' // Now that you've made a name for yourself on the underground car-racing circuit, challengers will try to contact you.
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 5000 
03EB: clear_help
$_481 = 1

:HELP_2995
$1081 = 0

:HELP_3000
return 

:HELP_3002
  $1081 <> 1
jf @HELP_3118
$1081 = 1
025B: is_player_playing $PLAYER_CHAR
jf @HELP_3113
$ONMISSION == 0
jf @HELP_3113
$1345 == 1
jf @HELP_3113
$_482 == 0
jf @HELP_3113
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 7000 
0517: print_help_forever 'SRB_ON' // Now that you've made a name for yourself on the underground bike-racing circuit, challengers will try to contact you.
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 5000 
03EB: clear_help
$_482 = 1

:HELP_3113
$1081 = 0

:HELP_3118
return 

:HELP_3120
  $1081 <> 1
jf @HELP_3228
$1081 = 1
025B: is_player_playing $PLAYER_CHAR
jf @HELP_3223
$ONMISSION == 0
jf @HELP_3223
$1087 == 1
jf @HELP_3223
$_500 == 0
jf @HELP_3223
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 5000 
0517: print_help_forever 'ONEHPC' // 100 percent completed! There's a little present waiting for you in Fort Staunton.
wait 7000
03EB: clear_help
$_500 = 1

:HELP_3223
$1081 = 0

:HELP_3228
return 
  $1081 <> 1
jf @HELP_3563
$1081 = 1
025B: is_player_playing $PLAYER_CHAR
jf @HELP_3558
$ONMISSION == 0
jf @HELP_3558
$1119 == 1
jf @HELP_3341
$_501 == 0
jf @HELP_3341
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 5000 
0517: print_help_forever 'MPUNLK' // New multiplayer content unlocked. Shame other players with all the stuff you've unlocked!
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 7000 
03EB: clear_help
$_501 = 1

:HELP_3341
$1120 == 1
jf @HELP_3410
$_502 == 0
jf @HELP_3410
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 5000 
0517: print_help_forever 'MPUNLK' // New multiplayer content unlocked. Shame other players with all the stuff you've unlocked!
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 7000 
03EB: clear_help
$_502 = 1

:HELP_3410
if and
$_445 == 1
$_252 == 1
jf @HELP_3489
$_503 == 0
jf @HELP_3489
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 5000 
0517: print_help_forever 'MPUNLK' // New multiplayer content unlocked. Shame other players with all the stuff you've unlocked!
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 7000 
03EB: clear_help
$_503 = 1

:HELP_3489
$1087 == 1
jf @HELP_3558
$_504 == 0
jf @HELP_3558
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 5000 
0517: print_help_forever 'MPUNLKA' // All multiplayer content unlocked. Shame other players with all the stuff you've unlocked!
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 7000 
03EB: clear_help
$_504 = 1

:HELP_3558
$1081 = 0

:HELP_3563
return 

:HELP_3565
  $1081 <> 1
jf @HELP_3679
$1081 = 1
025B: is_player_playing $PLAYER_CHAR
jf @HELP_3674
$ONMISSION == 0
jf @HELP_3674
$_305 > 3
jf @HELP_3674
$_483 == 0
jf @HELP_3674
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 7000 
03EA: print_help 'KAR_ON' // Return to the firetruck whenever you want to try and beat your best time!
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 5000 
$_483 = 1

:HELP_3674
$1081 = 0

:HELP_3679
return 

:HELP_3681
  $1081 <> 1
jf @HELP_3783
$1081 = 1
025B: is_player_playing $PLAYER_CHAR
jf @HELP_3778
$ONMISSION == 0
jf @HELP_3778
$_212 == 1
jf @HELP_3778
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 7000 
03EA: print_help 'PAGERA' // ~w~The ~h~M60~w~ is now available at your safehouse!
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 5000 
$_485 = 1

:HELP_3778
$1081 = 0

:HELP_3783
return 

:HELP_3785
  $1081 <> 1
jf @HELP_3908
$1081 = 1
025B: is_player_playing $PLAYER_CHAR
jf @HELP_3903
00E5: is_player_in_any_car $PLAYER_CHAR
jf @HELP_3903
  $2289 <> 0
jf @HELP_3903
0573: does_vehicle_exist $2289
jf @HELP_3903
811E:   not is_car_dead $2289
jf @HELP_3903
013C: is_car_model $2289 model #RHINO
jf @HELP_3903
03EA: print_help 'TANK' // ~w~Use~h~ ~k~ ~VEWEL~ ~w~to aim the Rhino's cannon, and~h~ ~k~ ~VEWEP~ ~w~to fire.
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 5000 
$_484 = 1

:HELP_3903
$1081 = 0

:HELP_3908
return 

:HELP_3910
  $1081 <> 1
jf @HELP_3997
$1081 = 1
025B: is_player_playing $PLAYER_CHAR
jf @HELP_3992
$ONMISSION == 0
jf @HELP_3992
04AD: player $PLAYER_CHAR driving_boat
jf @HELP_3992
03EA: print_help 'HELP43' // ~w~Using the handbrake will allow you to turn the boat more quickly.
05AE: args 1 out 0 locals_base_index 0 call_func @Noname_16_13 5000 
$_507 = 1

:HELP_3992
$1081 = 0

:HELP_3997
return 

:HELP_3999
025B: is_player_playing $PLAYER_CHAR
jf @HELP_4025
01B9: set_player_control $PLAYER_CHAR to 0
0115: clear_wanted_level $PLAYER_CHAR
01FC: set_police_ignore_player $PLAYER_CHAR to 1

:HELP_4025
025B: is_player_playing $PLAYER_CHAR
jf @HELP_4166
00E9: locate_player_on_foot_2d $PLAYER_CHAR coord 1143.9 -675.2 radius 2.0 2.0 sphere 0
jf @HELP_4101
0164: set_fixed_camera_position 1136.19 -649.74 16.69 rotation 0 0 0
0165: point_camera_at_point 1135.38 -650.33 16.63 switchstyle 2

:HELP_4101
00E9: locate_player_on_foot_2d $PLAYER_CHAR coord 1144.3 -588.74 radius 2.0 2.0 sphere 0
jf @HELP_4166
0164: set_fixed_camera_position 1137.23 -589.48 16.8 rotation 0 0 0
0165: point_camera_at_point 1136.33 -589.04 16.74 switchstyle 2

:HELP_4166
05AE: args 0 out 0 locals_base_index 0 call_func @MDLMAC_2412 
03EA: print_help 'HELP31' // ~w~If you are ~h~'busted'~w~ or ~h~'wasted'~w~ while on a mission, this ~h~Taxi~w~ will appear.
05AE: args 1 out 0 locals_base_index 0 call_func @MDLMAC_1959 8000 
jf @HELP_4213
goto @HELP_4250

:HELP_4213
03EA: print_help 'HELP32' // ~w~For a small fee (or free if you have no cash) it will transport you to the ~h~contact location~w~ of your last mission.
05AE: args 1 out 0 locals_base_index 0 call_func @MDLMAC_1959 7000 
jf @HELP_4250
goto @HELP_4250

:HELP_4250
03EB: clear_help
025B: is_player_playing $PLAYER_CHAR
jf @HELP_4280
01B9: set_player_control $PLAYER_CHAR to 1
0115: clear_wanted_level $PLAYER_CHAR
01FC: set_police_ignore_player $PLAYER_CHAR to 0
02F0: restore_camera_jumpcut

:HELP_4280
return 

:HELP_4282
025B: is_player_playing $PLAYER_CHAR
jf @HELP_4304
01B9: set_player_control $PLAYER_CHAR to 0
01FC: set_police_ignore_player $PLAYER_CHAR to 1

:HELP_4304
016F: do_fade 1500 fade 0

:HELP_4310
0170: get_fading_status
jf @HELP_4329
wait 0
goto @HELP_4310

:HELP_4329
025B: is_player_playing $PLAYER_CHAR
jf @HELP_4361
01B9: set_player_control $PLAYER_CHAR to 0
01FC: set_police_ignore_player $PLAYER_CHAR to 1
01C5: store_wanted_level $PLAYER_CHAR store_to $2730
0115: clear_wanted_level $PLAYER_CHAR

:HELP_4361
811D:   not is_char_dead $PLAYER_ACTOR
jf @HELP_4376
057E: stop_char $PLAYER_ACTOR

:HELP_4376
HELP_4392()
HELP_5488()
return 

:HELP_4392
025B: is_player_playing $PLAYER_CHAR
jf @HELP_4421
0176: set_player_heading $PLAYER_CHAR to 90.0
01B9: set_player_control $PLAYER_CHAR to 0
01FC: set_police_ignore_player $PLAYER_CHAR to 1

:HELP_4421
05AB: get_pad_state actionID 42 store_to 22@
22@ > 0
jf @HELP_4442
17@ = 1

:HELP_4442
wait 0
025B: is_player_playing $PLAYER_CHAR
jf @HELP_4467
01B9: set_player_control $PLAYER_CHAR to 0
01FC: set_police_ignore_player $PLAYER_CHAR to 1

:HELP_4467
13@ = 0
14@ = 0
15@ = 0
16@ = 0
5@ = 0
8@ = 0
18@ = 0
10@ = 0
024C: request_model #ENFORCER
024C: request_model #SWAT
024C: request_model #MP5K
0390: load_all_models_now

:HELP_4515
824D:   not has_model_loaded #ENFORCER
jf @HELP_4537
wait 0
goto @HELP_4515

:HELP_4537
824D:   not has_model_loaded #SWAT
jf @HELP_4558
wait 0
goto @HELP_4537

:HELP_4558
824D:   not has_model_loaded #MP5K
jf @HELP_4580
wait 0
goto @HELP_4558

:HELP_4580
00A5: create_car #ENFORCER at 1142.0 -662.0 -100.0 store_to 2@
017A: set_car_heading 2@ to 90.0
020F: lock_car_doors 2@ mode 1
00A9: car_set_idle 2@
009A: create_char 4 model #SWAT at 1138.0 -667.0 15.0 store_to 7@
009A: create_char 4 model #SWAT at 1137.8 -657.3 15.0 store_to 6@
01B7: give_weapon_to_char 6@ weapon 25 ammo 60
0178: set_char_heading 7@ to 110.0
0178: set_char_heading 6@ to 80.0
01B7: give_weapon_to_char 6@ weapon 25 ammo 10
025B: is_player_playing $PLAYER_CHAR
jf @HELP_4704
0176: set_player_heading $PLAYER_CHAR to 90.0
01B9: set_player_control $PLAYER_CHAR to 0
01FC: set_police_ignore_player $PLAYER_CHAR to 1

:HELP_4704
811D:   not is_char_dead $PLAYER_ACTOR
jf @HELP_4719
057E: stop_char $PLAYER_ACTOR

:HELP_4719
6 > 16@
jf @HELP_5486
wait 0
025B: is_player_playing $PLAYER_CHAR
jf @HELP_4763
0176: set_player_heading $PLAYER_CHAR to 90.0
01B9: set_player_control $PLAYER_CHAR to 0
01FC: set_police_ignore_player $PLAYER_CHAR to 1

:HELP_4763
16@ == 0
jf @HELP_4871
811D:   not is_char_dead $PLAYER_ACTOR
jf @HELP_4792
0178: set_char_heading $PLAYER_ACTOR to 90.0

:HELP_4792
0164: set_fixed_camera_position 1135.0 -672.5 15.5 rotation 0 0 0
0165: point_camera_at_point 1147.88 -675.27 17.0 switchstyle 2
wait 0
05AE: args 0 out 0 locals_base_index 23 call_func @MDLMAC_2412 
811D:   not is_char_dead $PLAYER_ACTOR
jf @HELP_4853
057E: stop_char $PLAYER_ACTOR

:HELP_4853
01C2: get_game_timer 15@
03EA: print_help 'WANT_A' // ~w~When you get ~h~'busted'~w~ you are taken to the nearest police station.
16@ = 1

:HELP_4871
18@ == 0
jf @HELP_4893
01C2: get_game_timer 14@
0085: 13@ = 14@  // (int)
0062: 13@ -= 15@  // (int)

:HELP_4893
if and
13@ > 6000
16@ == 1
jf @HELP_4969
03EA: print_help 'WANT_B' // ~w~Any mission you were on will be failed, and the cops will take all your weapons and a cash bribe.
0164: set_fixed_camera_position 1128.98 -699.12 16.64 rotation 0 0 0
0165: point_camera_at_point 1129.74 -698.49 16.78 switchstyle 2
16@ = 2

:HELP_4969
if and
13@ > 12000
5@ == 0
jf @HELP_5015
039A: clear_area 1142.0 -666.0 14.8 radius 10.0 clear_particles 1
5@ = 1

:HELP_5015
if and
13@ > 12000
16@ == 2
jf @HELP_5052
03EA: print_help 'WANT_C' // ~w~You will only be ~h~'busted'~w~ if you have a ~h~wanted level~w~ - represented by a row of stars in the top corner of the screen.
16@ = 3

:HELP_5052
13@ > 12500
jf @HELP_5071
0112: alter_wanted_level $PLAYER_CHAR to 1

:HELP_5071
13@ > 14500
jf @HELP_5090
0112: alter_wanted_level $PLAYER_CHAR to 2

:HELP_5090
13@ > 16500
jf @HELP_5109
0112: alter_wanted_level $PLAYER_CHAR to 3

:HELP_5109
13@ > 17500
jf @HELP_5128
0112: alter_wanted_level $PLAYER_CHAR to 4

:HELP_5128
13@ > 18500
jf @HELP_5182
if and
811E:   not is_car_dead 2@
811D:   not is_char_dead 7@
jf @HELP_5165
0234: stop_char_looking 7@
01DA: set_char_obj_enter_car_as_driver 7@ car 2@

:HELP_5165
811D:   not is_char_dead 6@
jf @HELP_5182
0234: stop_char_looking 6@
01D9: set_char_obj_enter_car_as_passenger 6@ car 2@

:HELP_5182
if and
13@ > 19000
16@ == 3
jf @HELP_5255
03EA: print_help 'WANT_D' // ~w~The more stars you have, the harder the Law will try to take you down.
811E:   not is_car_dead 2@
jf @HELP_5250
0164: set_fixed_camera_position 1135.8 -670.0 14.8 rotation 0 0 0
015D: point_camera_at_car 2@ mode 15 switchstyle 2

:HELP_5250
16@ = 4

:HELP_5255
if and
13@ > 25000
16@ == 4
jf @HELP_5362
0164: set_fixed_camera_position 1135.8 -670.0 14.8 rotation 0 0 0
0165: point_camera_at_point 1147.88 -675.27 17.0 switchstyle 2
03EA: print_help 'WANT_E' // ~w~There are ways of reducing your wanted level - keep your eyes open for them.
0218: create_pickup #BRIBE type 15 at 1143.0 -671.0 15.0 store_to 9@
0165: point_camera_at_point 1143.0 -671.0 15.0 switchstyle 1
16@ = 5

:HELP_5362
if and
13@ > 31000
16@ == 5
jf @HELP_5389
16@ = 6

:HELP_5389
if and
18@ == 0
6 > 16@
jf @HELP_5479
17@ == 0
jf @HELP_5459
05AB: get_pad_state actionID 42 store_to 22@
22@ > 0
jf @HELP_5452
13@ = 31001
16@ = 6
18@ = 1

:HELP_5452
goto @HELP_5479

:HELP_5459
05AB: get_pad_state actionID 42 store_to 22@
22@ > 0
jf @HELP_5479
17@ = 0

:HELP_5479
goto @HELP_4719

:HELP_5486
return 

:HELP_5488
03EB: clear_help
05AE: args 0 out 0 locals_base_index 23 call_func @MDLMAC_2379 
021A: remove_pickup 9@
00A6: delete_car 2@
009B: delete_char 6@
009B: delete_char 7@
wait 0
024E: mark_model_as_no_longer_needed #COP
024E: mark_model_as_no_longer_needed #SWAT
024E: mark_model_as_no_longer_needed #ENFORCER
024E: mark_model_as_no_longer_needed #POLICE
025B: is_player_playing $PLAYER_CHAR
jf @HELP_5548
0115: clear_wanted_level $PLAYER_CHAR

:HELP_5548
0627: unknown_command_71df
jf @HELP_5636
$_471 == 0
jf @HELP_5589
HELP_3999()
$_471 = 1
goto @HELP_5629

:HELP_5589
025B: is_player_playing $PLAYER_CHAR
jf @HELP_5617
01B9: set_player_control $PLAYER_CHAR to 1
01FC: set_police_ignore_player $PLAYER_CHAR to 0
0112: alter_wanted_level $PLAYER_CHAR to $2730

:HELP_5617
02F0: restore_camera_jumpcut
05AE: args 0 out 0 locals_base_index 23 call_func @MDLMAC_2412 

:HELP_5629
goto @HELP_5676

:HELP_5636
025B: is_player_playing $PLAYER_CHAR
jf @HELP_5664
0112: alter_wanted_level $PLAYER_CHAR to $2730
01B9: set_player_control $PLAYER_CHAR to 1
01FC: set_police_ignore_player $PLAYER_CHAR to 0

:HELP_5664
02F0: restore_camera_jumpcut
05AE: args 0 out 0 locals_base_index 23 call_func @MDLMAC_2412 

:HELP_5676
16@ = 1
return 

:HELP_5683
025B: is_player_playing $PLAYER_CHAR
jf @HELP_5705
01B9: set_player_control $PLAYER_CHAR to 0
01FC: set_police_ignore_player $PLAYER_CHAR to 1

:HELP_5705
016F: do_fade 1500 fade 0

:HELP_5711
0170: get_fading_status
jf @HELP_5730
wait 0
goto @HELP_5711

:HELP_5730
025B: is_player_playing $PLAYER_CHAR
jf @HELP_5762
01B9: set_player_control $PLAYER_CHAR to 0
01FC: set_police_ignore_player $PLAYER_CHAR to 1
01C5: store_wanted_level $PLAYER_CHAR store_to $2730
0115: clear_wanted_level $PLAYER_CHAR

:HELP_5762
HELP_5778()
HELP_6873()
return 

:HELP_5778
0@ = 0
1@ = 0
2@ = 0
3@ = 0
4@ = 0
5@ = 0
6@ = 0
7@ = 0
8@ = 0
10@ = 0
wait 0
05AB: get_pad_state actionID 42 store_to 11@
11@ > 0
jf @HELP_5842
9@ = 1

:HELP_5842
025B: is_player_playing $PLAYER_CHAR
jf @HELP_5864
01B9: set_player_control $PLAYER_CHAR to 0
01FC: set_police_ignore_player $PLAYER_CHAR to 1

:HELP_5864
024C: request_model #AMBULAN
024C: request_model #MEDIC

:HELP_5873
if or
824D:   not has_model_loaded #AMBULAN
824D:   not has_model_loaded #MEDIC
jf @HELP_5903
wait 0
goto @HELP_5873

:HELP_5903
039A: clear_area 1141.0 -622.0 14.8 radius 30.0 clear_particles 1
039A: clear_area 1125.77 -594.0 14.8 radius 10.0 clear_particles 1
00A5: create_car #AMBULAN at 1140.2 -621.5 14.8 store_to 2@
017A: set_car_heading 2@ to 90.0
009A: create_char 4 model #MEDIC at 1138.101 -625.5 14.7 store_to 3@
0178: set_char_heading 3@ to 25.0
009F: char_set_idle 3@
0355: set_char_stay_in_same_place 3@ to 1
025B: is_player_playing $PLAYER_CHAR
jf @HELP_6034
01B9: set_player_control $PLAYER_CHAR to 0
01FC: set_police_ignore_player $PLAYER_CHAR to 1
0176: set_player_heading $PLAYER_CHAR to 90.0

:HELP_6034
0164: set_fixed_camera_position 1134.73 -580.77 16.78 rotation 0 0 0
0165: point_camera_at_point 1135.68 -581.07 16.68 switchstyle 2
wait 5
0465: set_interpolation_parameters 1.0 time 11000
0164: set_fixed_camera_position 1134.73 -580.77 16.78 rotation 0 0 0
0165: point_camera_at_point 1135.25 -581.61 16.68 switchstyle 1
016F: do_fade 1500 fade 1

:HELP_6130
0170: get_fading_status
jf @HELP_6149
wait 0
goto @HELP_6130

:HELP_6149
0465: set_interpolation_parameters 1.0 time 1000

:HELP_6157
8 > 5@
jf @HELP_6871
wait 0
025B: is_player_playing $PLAYER_CHAR
jf @HELP_6201
01B9: set_player_control $PLAYER_CHAR to 0
01FC: set_police_ignore_player $PLAYER_CHAR to 1
0176: set_player_heading $PLAYER_CHAR to 90.0

:HELP_6201
5@ == 0
jf @HELP_6230
01C2: get_game_timer 8@
03EA: print_help 'HEAL_A' // ~w~When you get ~h~'wasted'~w~ you will be taken to the nearest hospital.
5@ = 1

:HELP_6230
10@ == 0
jf @HELP_6252
01C2: get_game_timer 7@
0085: 6@ = 7@  // (int)
0062: 6@ -= 8@  // (int)

:HELP_6252
if and
6@ > 4000
5@ == 1
jf @HELP_6289
03EA: print_help 'HEAL_B' // ~w~You will lose all your weapons and fail any mission you were on. You will also be charged for health care.
5@ = 2

:HELP_6289
if and
6@ > 9000
5@ == 2
jf @HELP_6445
if and
811E:   not is_car_dead 2@
811D:   not is_char_dead 3@
jf @HELP_6426
039A: clear_area 1141.0 -622.0 14.8 radius 30.0 clear_particles 1
039A: clear_area 1125.77 -594.0 14.8 radius 10.0 clear_particles 1
0218: create_pickup #HEALTH type 15 at 1144.3 -603.5 15.0 store_to 0@
0164: set_fixed_camera_position 1134.13 -630.6 16.5 rotation 0 0 0
0165: point_camera_at_point 1135.52 -627.68 15.65 switchstyle 2

:HELP_6426
03EA: print_help 'HEAL_C' // ~w~Your ~h~health~w~ is represented by the red bar in the top right of the screen.
03EC: flash_hud_object 4
5@ = 3

:HELP_6445
if and
6@ > 9500
5@ == 3
jf @HELP_6497
if and
811E:   not is_car_dead 2@
811D:   not is_char_dead 3@
jf @HELP_6492
0355: set_char_stay_in_same_place 3@ to 0
01DA: set_char_obj_enter_car_as_driver 3@ car 2@

:HELP_6492
5@ = 4

:HELP_6497
6@ > 12500
jf @HELP_6514
03EC: flash_hud_object -1

:HELP_6514
if and
6@ > 14000
5@ == 4
jf @HELP_6575
0164: set_fixed_camera_position 1138.6 -590.4 18.0 rotation 0 0 0
0165: point_camera_at_point 1144.3 -594.5 15.0 switchstyle 2
5@ = 5

:HELP_6575
if and
6@ > 14000
5@ == 5
jf @HELP_6612
03EA: print_help 'HEAL_D' // ~w~There are ways of healing or protecting yourself - keep your eyes open for them.
5@ = 6

:HELP_6612
if and
6@ > 14000
5@ == 6
jf @HELP_6675
0165: point_camera_at_point 1147.0 -590.4 15.0 switchstyle 1
0218: create_pickup #BODYARMOUR type 15 at 1147.0 -591.1 15.0 store_to 1@
5@ = 7

:HELP_6675
if and
6@ > 20500
5@ == 7
jf @HELP_6702
5@ = 8

:HELP_6702
if and
6@ > 10500
8 > 5@
jf @HELP_6770
if and
811E:   not is_car_dead 2@
811D:   not is_char_dead 3@
jf @HELP_6770
if and
00E0: is_char_in_car 3@ car 2@
4@ == 0
jf @HELP_6770
039C: switch_car_siren 2@ to 1
4@ = 1

:HELP_6770
if and
10@ == 0
8 > 5@
jf @HELP_6864
9@ == 0
jf @HELP_6844
05AB: get_pad_state actionID 42 store_to 11@
11@ > 0
jf @HELP_6837
6@ = 20501
5@ = 8
10@ = 1
03EC: flash_hud_object -1

:HELP_6837
goto @HELP_6864

:HELP_6844
05AB: get_pad_state actionID 42 store_to 11@
11@ > 0
jf @HELP_6864
9@ = 0

:HELP_6864
goto @HELP_6157

:HELP_6871
return 

:HELP_6873
03EB: clear_help
05AE: args 0 out 0 locals_base_index 12 call_func @MDLMAC_2379 
0465: set_interpolation_parameters 1.0 time 1000
00A6: delete_car 2@
009B: delete_char 3@
021A: remove_pickup 0@
021A: remove_pickup 1@
wait 0
024E: mark_model_as_no_longer_needed #AMBULAN
024E: mark_model_as_no_longer_needed #MEDIC
0627: unknown_command_71df
jf @HELP_7005
$_471 == 0
jf @HELP_6958
HELP_3999()
$_471 = 1
goto @HELP_6998

:HELP_6958
025B: is_player_playing $PLAYER_CHAR
jf @HELP_6986
01B9: set_player_control $PLAYER_CHAR to 1
01FC: set_police_ignore_player $PLAYER_CHAR to 0
0112: alter_wanted_level $PLAYER_CHAR to $2730

:HELP_6986
02F0: restore_camera_jumpcut
05AE: args 0 out 0 locals_base_index 12 call_func @MDLMAC_2412 

:HELP_6998
goto @HELP_7045

:HELP_7005
025B: is_player_playing $PLAYER_CHAR
jf @HELP_7033
01B9: set_player_control $PLAYER_CHAR to 1
01FC: set_police_ignore_player $PLAYER_CHAR to 0
0112: alter_wanted_level $PLAYER_CHAR to $2730

:HELP_7033
02F0: restore_camera_jumpcut
05AE: args 0 out 0 locals_base_index 12 call_func @MDLMAC_2412 

:HELP_7045
5@ = 1
return 