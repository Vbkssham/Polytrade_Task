# Polytrade_Task

# Selenium-POM-TestNG-Maven
This is sample of widely used POM framework in selenium using Java as scripting language. Maven is used for dependency management and continuous development. TestNG is used to maintain test cases


selenium-testng-framework
---


A sample framework based on Page Object Model, Selenium, TestNG using Java.

The framework uses:

1. Java
2. Selenium
3. TestNG
4. Log4j
5. Maven

Getting Started
---
<b>Prerequisites</b>

To run this project you need the following things installed in your computer

1. To Install  Please follow the <a href="https://docs.oracle.com/en/java/javase/19/install/overview-jdk-installation.html#GUID-8677A77F-231A-40F7-98B9-1FD0B48C346A">Java Installation Guide</a>

2. Setting up Java_Home <a href="https://confluence.atlassian.com/doc/setting-the-java_home-variable-in-windows-8895.html">Guide to Set Environment Variable for Java </a>

3. Install and setting up <a href="https://maven.apache.org/install.html">Maven Installation Guide</a>

4. In case of <b>JAVA_HOME environment variable is not defined correctly </b> issue follow Below steps to resolve it.

The solution is using the PROGRAMFILES variable inside of JAVA_HOME:

Open command promt and enter the below cammands : 

C:\Users>echo %PROGRAMFILES%

C:\Program Files

C:\Program Files>set JAVA_HOME=%PROGRAMFILES%\Java\jdk-11.0.2

C:\Program Files>echo %JAVA_HOME%

C:\Program Files\Java\jdk-11.0.2


Execution Steps : 
---
1. Once above setup is done download the Polytrade Project from github to local to repository.
2. Navigate to the downloaded Project.
3. Open cmd Prompt and navigate to the project.  
3. enter mvn test in the Cmd prompt.
4. Execution will start 
5. Once the execution is completed Navigate to the polytrade\test-output\emailable-report.html and verify the execution results.



