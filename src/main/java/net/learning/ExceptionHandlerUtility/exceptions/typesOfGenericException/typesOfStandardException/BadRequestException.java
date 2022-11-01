package net.learning.ExceptionHandlerUtility.exceptions.typesOfGenericException.typesOfStandardException;

import net.learning.ExceptionHandlerUtility.exceptions.typesOfGenericException.StandardException;
import org.springframework.http.HttpStatus;

public class BadRequestException extends StandardException {

    public BadRequestException(String errorMessage) {
        super(HttpStatus.BAD_REQUEST,errorMessage);
    }
}
