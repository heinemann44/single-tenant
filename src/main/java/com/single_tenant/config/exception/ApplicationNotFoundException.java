package com.single_tenant.config.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ApplicationNotFoundException extends ApplicationException{

    public ApplicationNotFoundException() {
        super();
    }
    
}
