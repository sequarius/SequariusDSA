package com.sequarius.dsa.common;

public class ExceptionPositionInvalid extends RuntimeException {
    public ExceptionPositionInvalid() {
    }

    public ExceptionPositionInvalid(String message) {
        super(message);
    }

    public ExceptionPositionInvalid(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionPositionInvalid(Throwable cause) {
        super(cause);
    }

    public ExceptionPositionInvalid(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
