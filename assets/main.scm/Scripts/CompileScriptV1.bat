@echo off
setlocal

del /Q streamed\*.*
cd ..\data
sc.exe -cmdlist -missionout -san_andreas_pc -f ..\scripts\mainV1.sc -close
if ERRORLEVEL 1 goto err

copy /Y /D ..\Scripts\mainV1.scm ..\data\script\mainV1.scm
..\..\..\..\..\..\Engine\Binaries\Win64\UE4Editor-Cmd.exe Gameface -run=ModelData -CompressFile OriginalData/GTASA/Scripts/GTASASaveInfo.dat OriginalData/GTASA/data/GTASASaveInfo.dat
goto streamed


:streamed
del script\script.img
endlocal
cdimagemaker ..\data\script\scriptV1.img streamed\*.scm

..\..\..\..\..\..\Engine\Binaries\Win64\UE4Editor-Cmd.exe Gameface -run=ModelData -ReimportScripts
if ERRORLEVEL 1 goto errimport

goto end

:errimport
@ECHO ERROR Importing scriptv1.img into scriptv1.uasset

goto end


:err
@ECHO Error compiling script
goto end


:end
pause