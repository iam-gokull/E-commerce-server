package com.zucisystems.ecommercemerchant.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class UserAlreadyExistsException extends RuntimeException {

    private final HttpStatus status;
    private final String message;

    public UserAlreadyExistsException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
