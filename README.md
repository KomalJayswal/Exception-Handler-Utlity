# Exception Handler Utility 

This is a utility tool which can be used in other services for **handling the user-defined or custom exceptions for both checked and unchecked exceptions**

## The Need for Custom Exceptions

Inbuilt Exceptions Handling Mechanism in Java covers almost all general exceptions that are bound to happen in programming.
However, we sometimes need to supplement these standard exceptions with our own

These are the main reasons for introducing custom exceptions :

- **Flexibility** : to Customize the Error Response Structure of all the Exsisting Standard Exceptions.

- **Business logic exceptions** : exceptions that are specific to the business logic and workflow. These help the application users or the developers understand what the exact problem is.
To catch and provide specific treatment to a subset of existing Java exceptions.
 
- **Handles unchecked Exceptions** : For all the unknown exceptions, we can generalize them

- **New HTTP Status Series** : We can extend the HTTP status after 4XX and 5XX series 

## Versions

[1.0.0](https://github.com/KomalJayswal/Exception-Handler-Utlity/tree/version_1.0.0)

## Pre-Requistics

Please install Java8 and maven in your system.

## Run Locally

Clone the project

```bash
git clone https://github.com/KomalJayswal/Exception-Handler-Utlity.git
```

Checkout to the branch version to be used

```bash
 git checkout <branchname> 
```

Go to the project directory

```bash
cd <project-folder-name>
```

Build the Project

```bash
mvn clean install
```
**_You can now see the repository build in your .m2 folder_**

## Installation

Import this as a maven jar dependency in your applications 
(_where you want to use the custom exception handler_ )
```bash
<dependency>
    <groupId>net.apmoller.crb.ohm.microservices</groupId>
    <artifactId>ohm-exception-handler-utility</artifactId>
    <version><_latestVersion_></version>
 </dependency>
```