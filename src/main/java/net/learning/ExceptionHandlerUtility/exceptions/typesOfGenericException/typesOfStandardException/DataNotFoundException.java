package net.learning.ExceptionHandlerUtility.exceptions.typesOfGenericException.typesOfStandardException;

import net.learning.ExceptionHandlerUtility.exceptions.typesOfGenericException.StandardException;
import org.springframework.http.HttpStatus;

public class DataNotFoundException extends StandardException {

    public DataNotFoundException(String errorMessage) {
        super(HttpStatus.NOT_FOUND,errorMessage);
    }
}
