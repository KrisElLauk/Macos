package io.codelex.JavaAdvancedTests.Exercise2;

public class BasketEmptyException extends Exception {

    String message;

    BasketEmptyException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Exception occured: " + message;
    }
}
