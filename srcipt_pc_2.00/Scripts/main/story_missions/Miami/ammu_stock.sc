MISSION_START

{
VAR_INT sniper_in_stock spaz_in_stock M4_in_stock laser_in_stock armour_in_stock stubby_in_stock
VAR_INT shotgun_in_stock ruger_in_stock	bbat_in_stock machete_in_stock mp5_in_stock uzi_in_stock 
VAR_INT python_in_stock katana_in_stock

shotgun_in_stock = 0
ruger_in_stock = 0
bbat_in_stock = 0
machete_in_stock = 0
armour_in_stock = 0
stubby_in_stock = 0
sniper_in_stock = 0
M4_in_stock = 0
spaz_in_stock = 0
laser_in_stock = 0
python_in_stock	= 0
mp5_in_stock = 0
uzi_in_stock = 0
katana_in_stock = 0

//DEBUG

shotgun_in_stock = 1
ruger_in_stock = 1
bbat_in_stock = 1
machete_in_stock = 1
armour_in_stock = 1
stubby_in_stock = 1
sniper_in_stock = 1
M4_in_stock = 1
spaz_in_stock = 1
laser_in_stock = 1
python_in_stock	= 1
mp5_in_stock = 1
uzi_in_stock = 1
katana_in_stock = 1


// STOCK WEAPONS  **************************************************************************

SCRIPT_NAME STOCK
	
	WAIT 5000
	
	IF uzi_in_stock = 1
	AND flag_player_on_mission = 0
		CLEAR_HELP
		CLEAR_PRINTS 
		PRINT_HELP (A_UZI_A)
	ENDIF

	TERMINATE_THIS_SCRIPT

RETURN

MISSION_END

}