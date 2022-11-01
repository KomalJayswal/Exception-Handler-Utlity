package net.learning.ExceptionHandlerUtility.handler;

import net.learning.ExceptionHandlerUtility.exceptions.GenericException;
import net.learning.ExceptionHandlerUtility.model.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.ServletWebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(GenericException.class)
    public ResponseEntity<ErrorResponse> handleOhmValidationException(GenericException genericException,
                                                                      ServletWebRequest servletWebRequest) {
                ErrorResponse apiError = new ErrorResponse(servletWebRequest.getHttpMethod(), servletWebRequest.getRequest().getRequestURI(),
                        genericException.getHttpStatus(),genericException.getErrorMessage());

        return ResponseEntity
                .status(genericException.getHttpStatus())
                .body(apiError);
    }
}
