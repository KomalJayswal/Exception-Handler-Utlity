# Exception Handler Utility

This is a utility tool which can be used in other services for **handling the user-defined or custom exceptions for both checked and unchecked exceptions**

## Problem Statement

Design a Generic Custom Exception Handler Utility.
It should be used as a JAR is multiple Microservices in order to avoid handling custom exceptions in each Individual Microservice. 

## Getting Started With Solution


1. Please install Java 8 and maven in your system.

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
    <groupId>net.apmoller.crb.ohm.microservices</groupId>
    <artifactId>ohm-exception-handler-utility</artifactId>
    <version><_latestVersion_></version>
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