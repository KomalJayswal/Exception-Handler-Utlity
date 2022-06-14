package net.learning.ExceptionHandlerUtility.handler;

import net.learning.ExceptionHandlerUtility.exceptions.CustomException;
import net.learning.ExceptionHandlerUtility.model.ErrorResponse;
import net.learning.ExceptionHandlerUtility.model.Errors;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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
                        customException.getHttpStatus(), customException);

                /*Errors api = Errors.builder()
                        .errorMessage("chal ja yaar")
                        .build();*/

        return ResponseEntity
                .status(customException.getHttpStatus())
                .contentType(MediaType.APPLICATION_JSON)
                .body(apiError);
    }
}
