package net.learning.ExceptionHandlerUtility.exceptions;

import net.learning.ExceptionHandlerUtility.model.DataInputs;

public class NullPointerException extends RuntimeException {

    /**
     * Constructor 1
     * @param errorCode
     * @param errorMessage
     */
    public NullPointerException(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public NullPointerException(String errorCode, String errorMessage, String tag, String technicalMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.tag = tag;
        this.technicalMessage = technicalMessage;
    }


}
