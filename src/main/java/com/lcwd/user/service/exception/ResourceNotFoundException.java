package com.lcwd.user.service.exception;

public class ResourceNotFoundException extends RuntimeException {

    //extra proprties that you want to manage
    public ResourceNotFoundException(){
        super("Resource Not Found On Server !!");
    }


    public ResourceNotFoundException(String message){
        super(message);
    }

}
