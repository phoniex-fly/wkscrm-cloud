@echo off
echo.
echo [��Ϣ] ����service-system���̡�
echo.

cd %~dp0
cd ../wkscrm-service/service-system/target

set JAVA_OPTS=-Xms512m -Xmx1024m -XX:MetaspaceSize=128m -XX:MaxMetaspaceSize=512m

java -Dfile.encoding=utf-8 -jar %JAVA_OPTS% service-system.jar

cd bin
pause