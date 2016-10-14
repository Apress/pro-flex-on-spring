The Spring source code is in an Eclipse project format. You can copy the af_FlexonSpring project to your Eclipse workspace and build it in Eclipse.

The Flex code can be built in the Flex Builder by adding the Flex project to your Eclipse or Flex Builder workspace. Otherwise, you can use the Ant script in the Appendix of the book to build the Flex project.

You can download BlazeDS from:  http://opensource.adobe.com/wiki/display/blazeds/Downloads

You can download Spring Security, Spring BlazeDS Integration, and Spring with dependences from:  http://springframework.org/download

Server Set-up
-----------------------------------------------
1. For this project I created two BlazeDS servers. One for security, SpringSecurity, that uses SpringFactory and one, af_Central, that uses Spring BlazeDS Integration. The af_Central is the main server side repository that holds the Spring services and Flex application builds.

2. Move the two BlazeDS servers into your Tomcat location here:  
    <tomcat-install-directory>/webapps/SpringSecurity
    <tomcat-install-directory>/webapps/af_Central

4. Build the Flex application and move the build to:
    <tomcat-install-directory>/webapps/af_Central

5. Start your Tomcat server, or other Jave EE server, and run the application:
    http://localhost:8080/af_Central/af_ClientManager.html