package com.sap.exceptions;

public class DemoApplicationException extends Exception {

    public DemoApplicationException() {
        super();
    }

    public DemoApplicationException(String message) {
        super(message);
    }

    public DemoApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public DemoApplicationException(Throwable cause) {
        super(cause);
    }

    protected DemoApplicationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
