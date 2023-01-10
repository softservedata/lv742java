package orest.edu04.numbers;

public enum HTTPError {
    BAD_REQUEST(400),
    UNAUTHORIZED(401),
    PAYMENT_REQUIRED(402),
    FORBIDDEN(403),
    NOT_FOUND(404);

    final int errorCode;

    HTTPError(int errorCode) {
        this.errorCode = errorCode;
    }
}
