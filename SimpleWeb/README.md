# Dependencies
* springframework 2.5
* tomcat-6.0.13
* junit-3.8.2

# Build Environment
* copy the following jars from springframework 2.5 distribution to war/WEB-INF/lib
	* commons-logging.jar
    * jstl.jar
	* spring-webmvc.jar
	* spring.jar
	* standard.jar
* copy tomcat & junit jar to war/WEB-INF/lib

# Tomcat setup
* Edit tomcat-user.xml
* Run startup.sh

# Build target
* ant build
* ant tests
* ant deploy
* ant reload

# Check it out!
* http://localhost:8080/springapp
