package org.example.Exceptions;

public class SexException extends FormatOfException{

    public SexException() {
        super("Sex format exception");
    }

    public void test(String value){
        if(value.toLowerCase() != "f" && value.toLowerCase() != "m"){
            throw new SexException();
        }
    }
}
