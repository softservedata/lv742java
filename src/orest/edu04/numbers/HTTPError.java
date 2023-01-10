package orest.edu04.numbers;

public enum HTTPError {
    BAD_REQUEST("Bad request"),
    UNAUTHORIZED("Unauthorized"),
    PAYMENT_REQUIRED("Payment required"),
    FORBIDDEN("Forbidden"),
    NOT_FOUND("Not found");

    final String errorCode;

    HTTPError(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return errorCode;
    }
}
