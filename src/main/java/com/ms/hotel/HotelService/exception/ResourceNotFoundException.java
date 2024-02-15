package com.ms.hotel.HotelService.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String s){
        super(s);
    }

    public ResourceNotFoundException(){
        super("Resource Not found !!!");
    }
}
