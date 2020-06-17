package com.java.shiyan_12.demoLast;

public class FingersException extends Exception{
    public FingersException() {
    }

    public FingersException(String message) {
        super(message);
    }

    public FingersException(String message, Throwable cause) {
        super(message, cause);
    }

    public FingersException(Throwable cause) {
        super(cause);
    }
}
