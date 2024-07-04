package com.example.exception;

public class InvolidNumberException extends Exception {
    public InvolidNumberException(){
        super("Invalid number. it should be between 1 and 10");

    }
    public InvolidNumberException(String message){
        super(message);
    }
}
