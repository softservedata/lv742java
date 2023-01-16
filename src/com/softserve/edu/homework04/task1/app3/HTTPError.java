package com.softserve.edu.homework04.task1.app3;

public enum HTTPError {
    ERROR400("Bad Request"),
    ERROR401("Unauthorized"),
    ERROR402("Payment Required"),
    ERROR403("Forbidden"),
    ERROR404("Not Found "),
    ERROR405("Method Not Allowed"),
    ERROR406("Not Acceptable"),
    ERROR407("Proxy Authentication Required"),
    ERROR408("Request Timeout"),
    ERROR409("Conflict");

    private final String errorName;

    HTTPError(String errorName) {
        this.errorName = errorName;
    }

    public String getErrorName() {
        return this.errorName;
    }

}
