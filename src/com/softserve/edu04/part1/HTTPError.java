package com.softserve.edu04.part1;
public enum HTTPError {
    HTTPERROR400("Bad Request"),
    HTTPERROR404("Not Found"),
    HTTPERROR409("Conflict");

    private String name;

    private HTTPError(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HTTPError{" +
                "name='" + name + '\'' +
                '}';
    }
}
