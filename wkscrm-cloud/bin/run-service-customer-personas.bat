@echo off
echo.
echo [信息] 运行service-personas工程。
echo.

cd %~dp0
cd ../wkscrm-service/service-customer-personas/target

set JAVA_OPTS=-Xms512m -Xmx1024m -XX:MetaspaceSize=128m -XX:MaxMetaspaceSize=512m

java -Dfile.encoding=utf-8 -jar %JAVA_OPTS% service-customer-personas.jar

cd bin
pause