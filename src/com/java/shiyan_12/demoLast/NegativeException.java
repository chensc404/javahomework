package com.java.shiyan_12.demoLast;

public class NegativeException extends Exception{
    public NegativeException() {
    }

    public NegativeException(String message) {
        super(message);
    }

    public NegativeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeException(Throwable cause) {
        super(cause);
    }
}
