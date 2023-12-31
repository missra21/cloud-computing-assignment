package com.sap.exceptions;

public class NotFoundException extends DemoApplicationException {

    public NotFoundException(String s) {
        super(s);
    }

    public NotFoundException(Long s) {
        super(String.valueOf(s));
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFoundException(Throwable cause) {
        super(cause);
    }

    public NotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
