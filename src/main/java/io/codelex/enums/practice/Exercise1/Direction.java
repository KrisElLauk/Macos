package io.codelex.enums.practice.Exercise1;

public enum Direction {
    North("Up"),
    South("Down"),
    East("Right"),
    West("Left");

    private String text;

    Direction(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
