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
2. Create a springboot project using https://start.spring.io. <br>
* Select `Maven Project` 
* Add Dependency : `lombok and spring-web` 
* Group : `net.learning`
* Artifact : `ExceptionHandlerUtility`


3. Create a input request model as a child class of `RuntimeException`.
```java
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class DataInputs extends RuntimeException {

  protected HttpStatus httpStatus;
  protected String errorMessage;
} 
```
4. Create an Exception class as a child class of `DataInputs` and super child class of `RuntimeException`.
```java
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class CustomException extends DataInputs {
  public CustomException(HttpStatus httpStatus, String errorMessage) {
    this.httpStatus = httpStatus;
    this.errorMessage = errorMessage;
  }
}
```
<I>Or you can also merge the `DataInputs` and `CustomException` class into one comman class. </I>

5. Create `Errors` Model contains the error message.
```java
import lombok.*;

@Getter
@Builder
@Setter
@Data
public class Errors {

    protected String errorMessage;
}
```

6. Create `ErrorResponse` Model that contains 
* fields of the error response structure
* DateTimeFormatter to fetch the current data-time
* parameterize constructors to set each value of the fields
```java

import lombok.Data;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;
/**
 * Class representing an API error in order to provide details of exceptions thrown back to the client
 */
@Data
public class ErrorResponse {

  private HttpMethod method;
  private String requestUri;
  private HttpStatus statusCode;
  private String timestamp;
  private List<Errors> errors;

  private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

  public ErrorResponse(){

  }

  public ErrorResponse(HttpMethod method, String requestUri, HttpStatus statusCode) {
    this();
    this.method = method;
    this.requestUri = requestUri;
    this.statusCode = statusCode;
    timestamp = dateFormatter.format(LocalDateTime.now(ZoneOffset.UTC));
    this.errors = buildErrors();
  }

  public List<Errors> buildErrors(){
    return List.of(Errors.builder().errorMessage("customized error").build());
  }
}
```

7. Create `GlobalExceptionHandler` class which contains the Handler method for `CustomException`.
```java
@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(CustomException.class)
  public ResponseEntity<ErrorResponse> handleOhmValidationException(CustomException customException,
                                                                    ServletWebRequest servletWebRequest) {
    ErrorResponse apiError = new ErrorResponse(servletWebRequest.getHttpMethod(), servletWebRequest.getRequest().getRequestURI(),
            customException.getHttpStatus());

    return ResponseEntity
            .status(customException.getHttpStatus())
            .body(apiError);
  }
} 
```

8. Now, execute `mvn clean install` command to create the JAR

9. Once, build is done, you can now see the repository JAR is created in your .m2 folder

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
You can refer [IntegrateCustomException](https://github.com/KomalJayswal/IntegrateCustomException.git) to check the steps to integrate the created exception Handler.

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

<details>
    <summary><I>What is Runtime Exception ?</I></summary>


</details>

<details>
    <summary><I>What is HttpStatus ?</I></summary>


</details>

<details>
    <summary><I>What is HttpMethod ?</I></summary>


</details>

<details>
    <summary><I>What is DateTimeFormatter ?</I></summary>


</details>

<details>
    <summary><I>Explain : <b> private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"); </b> ?</I></summary>


</details>

<details>
    <summary><I>Explain : <b> timestamp = dateFormatter.format(LocalDateTime.now(ZoneOffset.UTC)); </b> ?</I></summary>


</details>

<details>
    <summary><I>What is @RestControllerAdvice ?</I></summary>


</details>

<details>
    <summary><I>What is @ExceptionHandler ?</I></summary>


</details>

<details>
    <summary><I>What is ResponseEntity ?</I></summary>


</details>

<details>
    <summary><I>What is ServletWebRequest ?</I></summary>


</details>

<details>
    <summary><I>What is the need of Spring Factories ?</I></summary>


</details>
