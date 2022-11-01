package net.learning.ExceptionHandlerUtility.exceptions.typesOfGenericException;

import lombok.Getter;
import net.learning.ExceptionHandlerUtility.exceptions.GenericException;
import org.springframework.http.HttpStatus;

@Getter
public class StandardException extends GenericException {

    public StandardException(HttpStatus httpStatus, String errorMessage) {
        super(httpStatus, errorMessage);
    }
}
