package org.example.Exceptions;

public class DateException extends FormatOfException{
    public DateException() {
        super("Data format exception");
    }

    public void test(String value){
        if(value.length() != 10){
            throw new DateException();
        }

        String[] str = value.split("\\.");
        if (str.length == 3) {
            if(str[0].length() != 2 || str[1].length() != 2 || str[2].length() != 4){
                throw new DateException();
            } else{
                try {
                    Integer.parseInt(str[0]);
                    Integer.parseInt(str[1]);
                    Integer.parseInt(str[2]);
                } catch (NumberFormatException e){throw new DateException();}
            }
        } else {
            throw new DateException();
        }
    }
}
