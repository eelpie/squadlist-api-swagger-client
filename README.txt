wget https://repo1.maven.org/maven2/io/swagger/swagger-codegen-cli/2.4.14/swagger-codegen-cli-2.4.14.jar -O swagger-codegen-cli.jar
java -jar swagger-codegen-cli.jar generate -i https://api.squadlist.co.uk/swagger.json -c java-config.json -l java
