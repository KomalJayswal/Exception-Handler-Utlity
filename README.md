# Exception Handler Utility

This is a utility tool which can be used in other services for **handling the user-defined or custom exceptions for both checked and unchecked exceptions**

## Problem Statement

Design a Generic Custom Exception Handler Utility.
It should be used as a JAR is multiple Microservices in order to avoid handling custom exceptions in each Individual Microservice. 
Expected Error Response Structure (for example):-
```json
Header contains the HTTP Status : 400
{
    "method": "GET",
    "requestUri": "/sample/getData",
    "statusCode": "BAD_REQUEST",
    "timestamp": "2022-06-16T09:24:15",
    "errors": [
        {
            "errorMessage": "<customized error>"
        }
    ]
}
```

## Getting Started With Solution


1. Please install Java 11 and maven in your system.

2.

3. Now, execute Maven clean install command to create the JAR
```
mvn clean install
```
4. Once, build is done, you can now see the repository JAR is created in your .m2 folder

**Congratulation! Exception Handler JAR is successfully created.** 

Now, Import this as a maven jar dependency in your applications
(_where you want to use the custom exception handler_ )
```bash
<dependency>
    <groupId>net.learning</groupId>
    <artifactId>ExceptionHandlerUtility</artifactId>
    <version>1.0.0</version>
 </dependency>
```

[//]: # (## References)

## Further

[1.0.0](https://github.com/KomalJayswal/Exception-Handler-Utlity/tree/version_1.0.0)

## FAQ

<details>
    <summary><I>What is the need for Custom Exceptions ?</I></summary>

Inbuilt Exceptions Handling Mechanism in Java covers almost all general exceptions that are bound to happen in programming.
However, we sometimes need to supplement these standard exceptions with our own

These are the main reasons for introducing custom exceptions :

- **Flexibility** : to Customize the Error Response Structure of all the Exsisting Standard Exceptions.

- **Business logic exceptions** : exceptions that are specific to the business logic and workflow. These help the application users or the developers understand what the exact problem is.
  To catch and provide specific treatment to a subset of existing Java exceptions.

- **Handles unchecked Exceptions** : For all the unknown exceptions, we can generalize them

- **New HTTP Status Series** : We can extend the HTTP status after 4XX and 5XX series
</details>

<details>
    <summary><I>What is POM ?</I></summary>
A Project Object Model or POM is the fundamental unit of work in Maven. It is an XML file that contains information about the project and configuration details used by Maven to build the project.
</details>

<details>
    <summary><I>What is spring-boot-starter-web dependency ?</I></summary>

Starter for building web, including RESTful, applications using Spring MVC. Uses Tomcat as the default embedded container.

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```
</details>

<details>
    <summary><I>What is spring-boot-starter-test dependency ?</I></summary>

Starter for testing Spring Boot applications with libraries including JUnit Jupiter, Hamcrest and Mockito

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
</dependency>
```
</details>

<details>
    <summary><I>What is lombok dependency ?</I></summary>

Automatic generation of getters, setters, equals, hashCode and toString, and more!

```xml
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
</dependency>
```
</details>

<details>
    <summary><I>What is maven-surefire-plugin ?</I></summary>

The Surefire Plugin is used during the test phase of the build lifecycle to execute the unit tests of an application.

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
</plugin>
```
</details>

<details>
    <summary><I>What is maven-compiler-plugin ?</I></summary>

The Compiler Plugin is used to compile the sources of your project. <br>
This plugin has two goals (which are already bound to specific phases of the default lifecycle) : <br>
* compile – compile main source files. <br>
* testCompile – compile test source files

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
</plugin>
```
</details>

### Spring Factories








