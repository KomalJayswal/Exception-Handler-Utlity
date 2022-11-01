package net.learning.ExceptionHandlerUtility.exceptions.typesOfGenericException.typesOfStandardException;

import net.learning.ExceptionHandlerUtility.exceptions.typesOfGenericException.StandardException;
import org.springframework.http.HttpStatus;

public class BadGatewayException extends StandardException {

    public BadGatewayException(String errorMessage) {
        super(HttpStatus.BAD_GATEWAY,errorMessage);
    }
}