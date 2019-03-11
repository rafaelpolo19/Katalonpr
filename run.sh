#Comando para arrancar el contenedor
#se debe estar parado en la ruta especifica al proyecto de katalon.
docker run -t -v "$(pwd)":/katalon/katalon/source katalonpr katalon-execute.sh -browserType="Chrome" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/Zoho"