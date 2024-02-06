package org.example.Exceptions;

public class PhoneNumException extends FormatOfException {

    public PhoneNumException() {
        super("Number format exception");
    }

    public void test(String value){
        try{
            Integer.parseInt(value);
        }catch (NumberFormatException e){
            throw new NumberFormatException();
        }
    }
}
