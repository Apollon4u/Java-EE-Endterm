package org.example.midterm.exceptions;

public class DateException extends ArithmeticException {

    public DateException() {
        super("Incorrect format of the date");
    }

    public DateException(String s) {
        super(s);
    }
}
