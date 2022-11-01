# Exception Handler Utility : 2.0.0

TODO : Read me file update 

This version contains a basic generic handler for handling the standard custom exceptions.

## Advantages

## Disadvantages

## Installation

Import this as a maven jar dependency in your applications 
( _where you want to use the custom exception handler_ )
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

[![](https://mermaid.ink/img/pako:eNqVVk2T2jAM_SuenNlDr-lMZyjQXTrdPQCdXrg4iSAeHDu1FVi67H-v8rH5Ig4sJ6K89yRLspQ3L9QReL63NzyN2Wa-VYx-v4RF3_eX6nsmZLRUCGbHQ2APD9_YBV4RVGQvbKalhBCFViWreb7NXZKZBxII-czNAUwN3FZqazRC7Ruln_zIZ5JbWyjNdJJyp0LDL8ExN2v4m4EK74GvwQguxb9c_SOaFdhUKwsLhQLPrqieEFMnoj4YmKME_APBKo-pnemuWp2tilHBp0ihBhmCdeiVZJGkEhJQSNl-4SiO0CA6xCvZm_GwaWDR8NAVkfO1U7kd7BBrsGT9U93uun4GPsMdOcxV764yaoIEFq8hpN374MhojSz59xM3sdGnslFzYv14T6bbfe7KcdUpm-lqQxCL3OR-c6nLjEvJQp2AZahZzFUkwVxmmUWd1AeoBB6lDrisrU8luIxoBZgZZRkYow2jzslCMgALeHjIlUPyQ8KLl3krgnZ0fZe56rDDQTyp_rZg5rATCpp0FSqAlA0CcKU08taoG3CZX_5nwFhHRACVJW5oXb45R75UaYb1dGgsI5oNyBF810u_HdvJG07UmCyNQpxphSYf92YaHUUxVfspGin5gLdPsK_m3U1Gd3jfDi9vxA9OO1fV5Wy_HktUXrw1HSqzVfGGBAok1RM2VKEf2iS8arnr9THM7e7qm_DCYkcC4QPVuAaW69L11tG2Lfho4xYnGWyLklu1geNutjCPd2DGjmw7Zy1fhHmYFDZrFsVOSOkzKfYx7g2A-nqF7G2WklBgJ6GWNPb8UywQ-sTeSK54EVlvcwez24o0kBk4Au3jc-ioryZ5FeMMUupTH1bcgRKgDVf7K516v3z4pRUwYQOepVCHNZ4lsAh2PJNYMpRWMKENog_wcBIRxv6X9LUy-AGtxrw03sRLgO6ZiOi79y3X23oY007cej79rQS33la9EzRLI7qci0igNp6_49LCxOMZ6vVZhbWhRM0Fp-_opLK-_wdMsP0G)](https://mermaid.live/edit#pako:eNqVVk2T2jAM_SuenNlDr-lMZyjQXTrdPQCdXrg4iSAeHDu1FVi67H-v8rH5Ig4sJ6K89yRLspQ3L9QReL63NzyN2Wa-VYx-v4RF3_eX6nsmZLRUCGbHQ2APD9_YBV4RVGQvbKalhBCFViWreb7NXZKZBxII-czNAUwN3FZqazRC7Ruln_zIZ5JbWyjNdJJyp0LDL8ExN2v4m4EK74GvwQguxb9c_SOaFdhUKwsLhQLPrqieEFMnoj4YmKME_APBKo-pnemuWp2tilHBp0ihBhmCdeiVZJGkEhJQSNl-4SiO0CA6xCvZm_GwaWDR8NAVkfO1U7kd7BBrsGT9U93uun4GPsMdOcxV764yaoIEFq8hpN374MhojSz59xM3sdGnslFzYv14T6bbfe7KcdUpm-lqQxCL3OR-c6nLjEvJQp2AZahZzFUkwVxmmUWd1AeoBB6lDrisrU8luIxoBZgZZRkYow2jzslCMgALeHjIlUPyQ8KLl3krgnZ0fZe56rDDQTyp_rZg5rATCpp0FSqAlA0CcKU08taoG3CZX_5nwFhHRACVJW5oXb45R75UaYb1dGgsI5oNyBF810u_HdvJG07UmCyNQpxphSYf92YaHUUxVfspGin5gLdPsK_m3U1Gd3jfDi9vxA9OO1fV5Wy_HktUXrw1HSqzVfGGBAok1RM2VKEf2iS8arnr9THM7e7qm_DCYkcC4QPVuAaW69L11tG2Lfho4xYnGWyLklu1geNutjCPd2DGjmw7Zy1fhHmYFDZrFsVOSOkzKfYx7g2A-nqF7G2WklBgJ6GWNPb8UywQ-sTeSK54EVlvcwez24o0kBk4Au3jc-ioryZ5FeMMUupTH1bcgRKgDVf7K516v3z4pRUwYQOepVCHNZ4lsAh2PJNYMpRWMKENog_wcBIRxv6X9LUy-AGtxrw03sRLgO6ZiOi79y3X23oY007cej79rQS33la9EzRLI7qci0igNp6_49LCxOMZ6vVZhbWhRM0Fp-_opLK-_wdMsP0G)

## Configuration Details

[Here](https://github.com/KomalJayswal/Exception-Handler-Utlity/blob/version_1.0.0/Configurtion.md)
is the configuration details well documented along with the brief explaination
## Testing
The GlobalExceptionHandlerTest contains covers all the exception scenarios. Please run the test class to test different exception handling scenarios

## Exception --> yet to update

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





