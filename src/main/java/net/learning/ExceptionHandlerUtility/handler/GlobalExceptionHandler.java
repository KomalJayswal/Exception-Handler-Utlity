package net.learning.ExceptionHandlerUtility.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.ServletWebRequest;

import java.util.Objects;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(OhmValidationException.class)
    public ResponseEntity<OhmErrorResponse> handleOhmValidationException(OhmValidationException ohmException,
                                                                         ServletWebRequest servletWebRequest) {
        LoggerExceptionUtil.logException(ohmException);
        return new ResponseEntity<>(
                OhmErrorResponse.builder().httpMethod(Objects.requireNonNull(servletWebRequest.getHttpMethod()).name())
                        .requestUri(servletWebRequest.getRequest().getRequestURI())
                        .errorTimestamp(ExceptionHandlerHelperUtil.currentTimeStamp())
                        .errors(ExceptionHandlerHelperUtil.computeErrorList(ohmException)).build(),
                HttpStatus.BAD_REQUEST);
    }
}
