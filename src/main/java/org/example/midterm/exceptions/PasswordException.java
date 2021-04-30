package org.example.midterm.exceptions;

public class PasswordException extends Exception {
    public PasswordException() {
        super("Incorrect password length");
    }

    public PasswordException(String s) {
        super(s);
    }
}
