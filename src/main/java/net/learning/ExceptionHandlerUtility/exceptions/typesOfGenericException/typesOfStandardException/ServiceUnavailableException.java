package net.learning.ExceptionHandlerUtility.exceptions.typesOfGenericException.typesOfStandardException;

import net.learning.ExceptionHandlerUtility.exceptions.typesOfGenericException.StandardException;
import org.springframework.http.HttpStatus;

public class ServiceUnavailableException extends StandardException {

    public ServiceUnavailableException(String errorMessage) {
        super(HttpStatus.SERVICE_UNAVAILABLE,errorMessage);
    }
}
