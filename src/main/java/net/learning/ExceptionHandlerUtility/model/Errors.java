package net.learning.ExceptionHandlerUtility.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
@Setter
@Data
public class Errors {

    protected String errorMessage;
}
