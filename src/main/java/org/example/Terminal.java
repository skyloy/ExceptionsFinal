package org.example;

import org.example.Exceptions.FormatOfException;

import java.util.List;


public class Terminal {
    List<FormatOfException> exceptions;
    public Terminal(List<FormatOfException> exceptions) {
        this.exceptions = exceptions;
    }

    public String[] spliter(String value){
        String[] strings = value.split(" ");
        try {
            testValues(strings);
            return strings;
        }catch (FormatOfException e) {
            System.out.println(e.getMessage());
        }catch (RuntimeException e)  {
            System.out.println(e.getMessage());
        }

        return strings;
    }

    private void testValues(String[] values) {
        if (values.length < 6) throw new RuntimeException("Enter more values");

        if (values.length > 6) throw new RuntimeException("Enter less values");

        int i = 0;
        for (String value : values) {
            exceptions.get(i).test(value);
            i++;
        }
    }
}
