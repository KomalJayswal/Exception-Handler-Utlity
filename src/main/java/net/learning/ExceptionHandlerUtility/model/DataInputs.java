package net.learning.ExceptionHandlerUtility.model;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class DataInputs extends RuntimeException {

    protected HttpStatus httpStatus;
    protected String errorMessage;
}
