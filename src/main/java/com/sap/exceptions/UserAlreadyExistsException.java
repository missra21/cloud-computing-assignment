package com.sap.exceptions;

public class UserAlreadyExistsException extends BadRequestException {

    public UserAlreadyExistsException(String s) {
        super(s);
    }
}
