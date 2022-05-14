package io.codelex.JavaAdvancedTests.Exercise1;

public class NotEnoughFundsException extends Exception {

    String message;

    NotEnoughFundsException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return ("NotEnoughFundsException occured: " + message);
    }
}
