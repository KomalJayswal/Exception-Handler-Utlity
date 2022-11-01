package net.learning.ExceptionHandlerUtility.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Builder;
import lombok.Data;
import org.slf4j.MDC;
import org.springframework.boot.web.reactive.error.DefaultErrorAttributes;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
/**
 * Class representing an API error in order to provide details of exceptions thrown back to the client
 */
@Data
//@JsonRootName("apiError")
public class ErrorResponse {

    private HttpMethod method;
    private String requestUri;
    private HttpStatus statusCode;
    private String timestamp;
    private List<Errors> errors;

    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

    public ErrorResponse(){

    }

    public ErrorResponse(HttpMethod method, String requestUri, HttpStatus statusCode, String errors) {
        this();
        this.method = method;
        this.requestUri = requestUri;
        this.statusCode = statusCode;
        timestamp = dateFormatter.format(LocalDateTime.now(ZoneOffset.UTC));
        this.errors = buildErrors(errors);
    }

    public List<Errors> buildErrors(String errors){
        if(null == errors){
            return List.of(Errors.builder().errorMessage("customized error").build());
        }
        return List.of(Errors.builder().errorMessage(errors).build());
    }
}
