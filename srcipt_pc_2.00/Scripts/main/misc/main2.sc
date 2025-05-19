MISSION_START // LAUNCH FROM MAIN.SC
// *****************************************************************************************
// *****************************************************************************************
// *****************************************************************************************
// **********************************Vice City Main Script**********************************
// *****************************************************************************************
// *****************************************************************************************
// *****************************************************************************************

SCRIPT_NAME MAIN2  //NEW MAIN

// ***************************************SETUP*********************************************
// ******************************************************************************************

/*
DO_FADE 0 FADE_OUT
SET_TOTAL_NUMBER_OF_MISSIONS 0
SET_PROGRESS_TOTAL 0
SET_MAX_WANTED_LEVEL 4				    
SET_COLLECTABLE1_TOTAL 0							 
SET_DEATHARREST_STATE OFF
*/
//SET_TIME_OF_DAY 22 00 //This should be: 22 00

//START_NEW_SCRIPT phil_mission1_loop //TEST
// *****************************************CREATE PLAYER************************************   

//SET_CCTV_EFFECT ON

//GET_PLAYER_CHAR player1 scplayer 	

//LOAD_AND_LAUNCH_MISSION inital.sc
//LOAD_AND_LAUNCH_MISSION_EXCLUSIVE inital.sc

// **************************************Game variables**************************************

VAR_INT stadium_door_1
CREATE_OBJECT_NO_OFFSET dtn_staddoora 7140.385 -6919.903 15.372 stadium_door_1
DONT_REMOVE_OBJECT stadium_door_1

VAR_INT stadium_door_2
CREATE_OBJECT_NO_OFFSET dtn_staddoorb 7140.385 -6918.068 15.372 stadium_door_2
DONT_REMOVE_OBJECT stadium_door_2

VAR_INT stadium_poster
CREATE_OBJECT_NO_OFFSET dthotring_a 7212.92 -6909.742 31.552 stadium_poster
DONT_REMOVE_OBJECT stadium_poster

VAR_INT day_flag day_counter hours_s minutes_s flag_stadium_doors

//exterior gates - this needs to go here for the gates opening to work
VAR_INT porn_north_gate_open
VAR_INT porn_south_gate_open
VAR_INT porn_north_gate_closed
VAR_INT porn_south_gate_closed

//north gate
CREATE_OBJECT_NO_OFFSET ci_gatesclosed 8261.697 -7286.824 7.258 porn_north_gate_closed
DONT_REMOVE_OBJECT porn_north_gate_closed

//south gate
CREATE_OBJECT_NO_OFFSET ci_backgateclose 8238.147 -7365.94 8.542 porn_south_gate_closed
DONT_REMOVE_OBJECT porn_south_gate_closed

MISSION_END

// *************************************VC CAR GENERATORS***************************
VAR_INT gen_car52 gen_car53 gen_car54 gen_car55 gen_car56 gen_car57 gen_car58 gen_car59 gen_car60 
VAR_INT gen_car61 gen_car62 gen_car63 gen_car64 gen_car65 gen_car66 gen_car67 gen_car68 gen_car69 gen_car70
VAR_INT gen_car71 gen_car72 gen_car73 gen_car74 gen_car75 gen_car76 gen_car77 gen_car78 gen_car79 gen_car80
VAR_INT gen_car81 gen_car82 gen_car83 gen_car84 gen_car85 gen_car86 gen_car87 gen_car88 gen_car89 gen_car90
VAR_INT gen_car91 gen_car92 gen_car93 gen_car94 gen_car95 gen_car96 gen_car97 gen_car98 gen_car99 gen_car100
VAR_INT gen_car101 gen_car102 gen_car103 gen_car104 gen_car105 gen_car106 gen_car107 gen_car108 gen_car109 gen_car110 
VAR_INT	gen_car111 gen_car112 gen_car113 gen_car114 gen_car115 gen_car116 gen_car117 gen_car118 gen_car119 gen_car120
VAR_INT gen_car121 gen_car122 gen_car123 gen_car124 gen_car125 gen_car126 gen_car127 gen_car128 gen_car129 gen_car130 
VAR_INT gen_car131 gen_car132 gen_car133 gen_car134 gen_car135 gen_car136 gen_car137 gen_car138 gen_car139 gen_car140 
VAR_INT gen_car141 gen_car142 gen_car143 gen_car144 gen_car145 gen_car146 gen_car147 gen_car148 gen_car149 gen_car150
VAR_INT gen_car151 gen_car152 gen_car153 gen_car154 gen_car155 gen_car156 gen_car157 gen_car158 gen_car159 gen_car160
VAR_INT gen_car161 gen_car162 gen_car163 gen_car164 gen_car165 gen_car166 gen_car167 gen_car168 gen_car169 gen_car170
VAR_INT gen_car171 gen_car172 gen_car173 gen_car174 gen_car175 gen_car176 gen_car177 gen_car178 gen_car179 gen_car180