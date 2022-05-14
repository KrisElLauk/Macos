package io.codelex.JavaAdvancedTests.Exercise2;

public class BasketFullException extends Exception {

    String message;

    BasketFullException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Exception occured: " + message;
    }
}
