set mydate=%date:~6,4%%date:~3,2%%date:~0,2%%time:~0,2%%time:~3,2%%time:~6,2%
echo %mydate%
git add .
git commit -m "%mydate% commit"
git push -u cursoSpringAT master
pause
