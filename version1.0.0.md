# Versions 1.0.0

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

[![](https://mermaid.ink/img/pako:eNqVVk2T2jAM_SuenNlDr-lMZyjQXTrdPQCdXrg4iSAeHDu1FVi67H-v8rFJCHHCciLKe0-yJEt580Idged7e8PTmG3mW8Xo90tY9H1_qb5nQkZLhWB2PAT28PCNXeAVQUX2wmZaSghRaFWymudx7pLMPJBAyGduDmBq4LZSW6MRat8o_eRHPpPc2kJpppOUOxUafgmOuVnD3wxUeA98DUZwKf7l6h_RrMCmWllYKBR4dkX1hJg6EfXBwBwl4B8IVnlM7Uxfq9XZqhgVfIoUapAhWIdeSRZJKiEBhZTtF47iCA3iingjOxoPmwYWDQ9dETlfO5XbwfaxekvWPdV413Uz8BnuwGFueneVURMksHgNIb2-D46M1siSfz9xExt9Khs1J9aP92S63eeuHFedspmuNgSxyE3uN5e6zLiULNQJWIaaxVxFEsxlllnUSX2ASuBR6oDL2vpUgsuIVoCZUZaBMdow6pwsJAOwgIeHXDkkPyS8eJm3ImhH13WZq_Y77MWT6m8LZg47oaBJV6ECSNkgAFdKI2-Nuh6X-eV_Box1RARQWeKG1uWbc-RLlWZYT4fGMqDZgEYbpNuK7cT1J8mRj0KWxiDOtEKTj3ozjY6imKjd9AyUu8fbJ9g3s26UcT24x8PLm_CD085VdTHbr4cSlRduTYfKbFW4PoECSbWEDVXohzYJr9rtdnX0c6_39Ci8sNiBQHhPNW6B5ap0vXW0bAtuhxJXnKS3LUpu1QaOe9nCPN6BGTqyvTpr-SLMw6SwWbMkdkJKn0mxj3FvANTXG2Rnq5SEAjsJtaSR559igdAldsZxxYvIOs7tzW4r0kBm4Ai0i8-hg76a5FWMM0ipT11YcQdKgDZc7W906t3y4ZfG_4T1eJZCHdZ4lsAi2PFMYslQWsGEtoc-wMNJRBj7X9LXyuAHtBbz0ngTLwG6ZyKib963XG_rYUz7cOv59LcS3Hpb9U7QLI3oci4igdp4_o5LCxOPZ6jXZxXWhhI1F5y-oZPK-v4f3Yb7Xw)](https://mermaid.live/edit#pako:eNqVVk2T2jAM_SuenNlDr-lMZyjQXTrdPQCdXrg4iSAeHDu1FVi67H-v8rFJCHHCciLKe0-yJEt580Idged7e8PTmG3mW8Xo90tY9H1_qb5nQkZLhWB2PAT28PCNXeAVQUX2wmZaSghRaFWymudx7pLMPJBAyGduDmBq4LZSW6MRat8o_eRHPpPc2kJpppOUOxUafgmOuVnD3wxUeA98DUZwKf7l6h_RrMCmWllYKBR4dkX1hJg6EfXBwBwl4B8IVnlM7Uxfq9XZqhgVfIoUapAhWIdeSRZJKiEBhZTtF47iCA3iingjOxoPmwYWDQ9dETlfO5XbwfaxekvWPdV413Uz8BnuwGFueneVURMksHgNIb2-D46M1siSfz9xExt9Khs1J9aP92S63eeuHFedspmuNgSxyE3uN5e6zLiULNQJWIaaxVxFEsxlllnUSX2ASuBR6oDL2vpUgsuIVoCZUZaBMdow6pwsJAOwgIeHXDkkPyS8eJm3ImhH13WZq_Y77MWT6m8LZg47oaBJV6ECSNkgAFdKI2-Nuh6X-eV_Box1RARQWeKG1uWbc-RLlWZYT4fGMqDZgEYbpNuK7cT1J8mRj0KWxiDOtEKTj3ozjY6imKjd9AyUu8fbJ9g3s26UcT24x8PLm_CD085VdTHbr4cSlRduTYfKbFW4PoECSbWEDVXohzYJr9rtdnX0c6_39Ci8sNiBQHhPNW6B5ap0vXW0bAtuhxJXnKS3LUpu1QaOe9nCPN6BGTqyvTpr-SLMw6SwWbMkdkJKn0mxj3FvANTXG2Rnq5SEAjsJtaSR559igdAldsZxxYvIOs7tzW4r0kBm4Ai0i8-hg76a5FWMM0ipT11YcQdKgDZc7W906t3y4ZfG_4T1eJZCHdZ4lsAi2PFMYslQWsGEtoc-wMNJRBj7X9LXyuAHtBbz0ngTLwG6ZyKib963XG_rYUz7cOv59LcS3Hpb9U7QLI3oci4igdp4_o5LCxOPZ6jXZxXWhhI1F5y-oZPK-v4f3Yb7Xw)

## Testing
The GlobalExceptionHandlerTest contains covers all the exception scenarios. Please run the test class to test different exception handling scenarios

## Exception

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





