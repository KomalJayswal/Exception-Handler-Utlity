# Exception Handler Utility

This is a utility tool which can be used in other services for handling the custom exceptions

## Installation

Import this as a maven jar dependency in any of the imports applications

## Exception Handler Framework

### Custom Exception
For creating your own custom exception, please extend BaseOhmException
and throw your custom exception with a matching constructor

Serializable -> Throwable -> Exception -> RuntimeException


### Unchecked Exception
This will be automatically taken care by the exception handler and all unchecked runtime exceptions would get handled by the Global Exception Handler

## Testing
The GlobalExceptionHandlerTest contains covers all the exception scenarios. Please run the test class to test different exception handling scenarios

## Build
*mvn clean install*





