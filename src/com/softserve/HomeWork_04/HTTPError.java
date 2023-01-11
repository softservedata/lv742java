package com.softserve.HomeWork_04;

public enum HTTPError {
    n400("Bad Request"),
    n401("Unauthorized"),
    n402("PaymentRequired"),
    n403("Forbidden"),
    n404("Not Found");

    private String errorName;

    HTTPError(String errorName) {
        this.errorName = errorName;
    }

    @Override
    public String toString() {
        return "HTTPError: " + errorName;
    }
}
