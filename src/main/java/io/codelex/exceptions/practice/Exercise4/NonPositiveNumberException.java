package io.codelex.exceptions.practice.Exercise4;

public class NonPositiveNumberException extends Exception {
    NonPositiveNumberException(String negative) {
        super(negative);
    }
}
