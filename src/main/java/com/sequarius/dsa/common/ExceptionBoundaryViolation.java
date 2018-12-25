package com.sequarius.dsa.common;

public class ExceptionBoundaryViolation extends RuntimeException {
    public ExceptionBoundaryViolation() {
    }

    public ExceptionBoundaryViolation(String message) {
        super(message);
    }
}
