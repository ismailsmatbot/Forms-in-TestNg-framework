set projectLocation=E:\TestBotsNg
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\botsinfo.xml