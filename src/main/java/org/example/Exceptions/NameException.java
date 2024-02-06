package org.example.Exceptions;

public class NameException extends FormatOfException{
    public NameException() {
        super("Name format exception");
    }
    public void test(String value){
        if(value == null){
            throw new NameException();
        }
    }
}
