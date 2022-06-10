# Configuration Details

######A Project Object Model or POM is the fundamental unit of work in Maven. It is an XML file that contains information about the project and configuration details used by Maven to build the project.

##Dependency
Starter for building web, including RESTful, applications using Spring MVC. Uses Tomcat as the default embedded container

            <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

Starter for testing Spring Boot applications with libraries including JUnit Jupiter, Hamcrest and Mockito

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>

Automatic generation of getters, setters, equals, hashCode and toString, and more!

		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
		</dependency>

JUnit is a unit testing framework for Java

		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<scope>test</scope>
		</dependency>
	
##Plugins

The Surefire Plugin is used during the test phase of the build lifecycle to execute the unit tests of an application.

        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
        </plugin>

The Compiler Plugin is used to compile the sources of your project. <br>
This plugin has two goals (which are already bound to specific phases of the default lifecycle) : <br>
* compile – compile main source files. <br>
* testCompile – compile test source files


        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
        </plugin>






