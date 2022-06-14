package net.learning.ExceptionHandlerUtility.exceptions;

import lombok.Getter;
import net.learning.ExceptionHandlerUtility.model.DataInputs;
import org.springframework.http.HttpStatus;

@Getter
public class CustomException extends DataInputs {

    public CustomException(HttpStatus httpStatus, String errorMessage) {
        super();
        this.httpStatus = httpStatus;
        this.errorMessage = errorMessage;
    }
}
