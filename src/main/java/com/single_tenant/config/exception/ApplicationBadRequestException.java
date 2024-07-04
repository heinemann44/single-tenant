package com.single_tenant.config.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ApplicationBadRequestException extends ApplicationException{

    public ApplicationBadRequestException() {
        super();
    }
    
}
