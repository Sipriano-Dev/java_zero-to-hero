package com.sipriano.exception.custom;

public class DivideByZeroException extends RuntimeException{

    public DivideByZeroException() {
        super();
    }

    public DivideByZeroException(String msg) {
        super(msg);
    }

}
