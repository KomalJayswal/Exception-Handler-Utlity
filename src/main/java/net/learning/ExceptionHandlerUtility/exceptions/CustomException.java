package net.learning.ExceptionHandlerUtility.exceptions;

import lombok.Getter;
import net.learning.ExceptionHandlerUtility.model.DataInputs;
import org.springframework.http.HttpMethod;

@Getter
public class CustomException extends DataInputs {

    public CustomException(int httpStatus, String errorMessage) {
        super();
        this.httpStatus = httpStatus;
        this.errorMessage = errorMessage;
    }
}
