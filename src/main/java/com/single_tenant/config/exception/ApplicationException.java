package com.single_tenant.config.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class ApplicationException extends ApplicationInterfaceException {

    public ApplicationException() {
        super();
    }
    
}
