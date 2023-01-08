package com.softserve.edu.hm4.p1;

public enum HttpError {
    ERROR400("Bad Request"),
    ERROR401("Unauthorized"),
    ERROR402("Payment Required");

    private String name;

    private HttpError(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HttpError{" +
                "name='" + name + '\'' +
                '}';
    }
}
