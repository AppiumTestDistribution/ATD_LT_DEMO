## Install node dependency as ATD depends on appium-device-farm.

1. npm install
2. Platform='android' CLOUD_USERNAME= CLOUD_KEY= CONFIG_FILE='./configs/lt_config.properties' mvn clean -Dtest=Runner test -Dcheckstyle.skip


Automatically starts the server and runs the tests in LambdaTest. If you would like to change the devices refer to ./caps/lt_capabilities.json