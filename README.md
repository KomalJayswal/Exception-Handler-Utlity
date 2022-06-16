# Exception Handler Utility : 1.0.0

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

Import this as a maven jar dependency in your applications ( _where you want to use the custom exception handler_ )
```bash
<dependency>
    <groupId>net.apmoller.crb.ohm.microservices</groupId>
    <artifactId>ohm-exception-handler-utility</artifactId>
    <version>1.0.0</version>
 </dependency>

```
## Error Response Structure

```bash
{
    "method": "POST",
    "requestUri": "/imports/vessel-voyage/documents",
    "statusCode": "BAD_REQUEST",
    "timestamp": "2022-06-16T09:24:15",
    "errors": [
        {
            "errorMessage": "<customized error>"
        }
    ]
}
```

## Exception Handler Framework

https://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.4.1

![alt text](https://raw.githubusercontent.com/KomalJayswal/Exception-Handler-Utlity/master/image.webp)

## Hierarchy of Collections / Class Diagram
Serializable -> Throwable -> Exception -> RuntimeException

## Testing
The GlobalExceptionHandlerTest contains covers all the exception scenarios. Please run the test class to test different exception handling scenarios


## Types of Exception

Java exceptions can be checked and unchecked. In the next sections, we'll cover both of these cases.

### Checked Exception

### Unchecked Exception





### Bad Request Exception

The request could not be understood by the server due to malformed syntax. The client SHOULD NOT repeat the 
request without modifications.

### Forbidden Exception

The server understood the request, but is refusing to fulfill it. Authorization will not help and the request
SHOULD NOT be repeated. If the request method was not HEAD and the server wishes to make public why the
request has not been fulfilled, it SHOULD describe the reason for the refusal in the entity. If the server
does not wish to make this information available to the client, the status code 404 (Not Found) can be used
instead.

### Data Not Found Exception

The server has not found anything matching the Request-URI. No indication is given of whether the condition is
temporary or permanent. This status code is commonly used when the server does not wish to reveal exactly why the request has been refused, or when no other response is applicable.

### Internal Server Exception

Similarly, we can create ...

### Bad Request Exception
For creating your own custom exception, please extend BaseOhmException
and throw your custom exception with a matching constructor





