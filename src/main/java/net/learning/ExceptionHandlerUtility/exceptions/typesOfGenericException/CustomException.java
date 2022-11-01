package net.learning.ExceptionHandlerUtility.exceptions.typesOfGenericException;

import lombok.Getter;
import net.learning.ExceptionHandlerUtility.exceptions.GenericException;
import org.springframework.http.HttpStatus;

@Getter
public class CustomException extends GenericException {

    public CustomException(HttpStatus httpStatus, String errorMessage) {
        super(httpStatus,errorMessage);
    }
}
