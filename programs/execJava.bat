@echo off
setlocal enabledelayedexpansion

set "fileName=%1"
type %fileName% | clip
javac %fileName%

:: Find the position of the first period
set "dotPos=-1"
for /l %%i in (0,1,255) do (
    if "!fileName:~%%i,1!"=="." (
        set "dotPos=%%i"
        goto continue
    )
)

:continue
if %dotPos% gtr -1 (
    :: Extract the substring before the period
    set "fileNameWithNoExtension=!fileName:~0,%dotPos%!"
    echo !fileNameWithNoExtension!
    if !errorlevel! == 0 (
        java !fileNameWithNoExtension!
    ) else (
        echo "There was some Error(s)"
    )
) else (
    echo %fileName%
    echo %fileNameWithNoExtension%
    echo No period found in the string.
)

endlocal
