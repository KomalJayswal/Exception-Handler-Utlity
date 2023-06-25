package net.learning.ExceptionHandlerUtility.handler;

import net.learning.ExceptionHandlerUtility.exceptions.CustomException;
import net.learning.ExceptionHandlerUtility.model.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.ServletWebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ErrorResponse> handleOhmValidationException(CustomException customException,
                                                                      ServletWebRequest servletWebRequest) {
                ErrorResponse apiError = new ErrorResponse(servletWebRequest.getHttpMethod(), servletWebRequest.getRequest().getRequestURI(),
                        customException.getHttpStatus(),customException.getErrorMessage());

        return ResponseEntity
                .status(customException.getHttpStatus())
                .body(apiError);
    }
}
