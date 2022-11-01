package net.learning.ExceptionHandlerUtility.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

@Getter
public class GenericException extends ResponseStatusException {

    protected HttpStatus httpStatus;
    protected String errorMessage;

    public GenericException(HttpStatus httpStatus, String errorMessage) {
        super(httpStatus, errorMessage);
        this.httpStatus = httpStatus;
        this.errorMessage = errorMessage;
    }
}
