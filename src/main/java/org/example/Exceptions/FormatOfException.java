package org.example.Exceptions;

public abstract class FormatOfException extends RuntimeException{
    public FormatOfException(String exceptionMessage) {
        super("Format exception: " + exceptionMessage);
    }

    public abstract void test(String value);
}
