package io.codelex.enums.practice.Exercise2;

import java.util.Random;

public enum ScissorPaperStone {
    Scissors,
    Paper,
    Stone;

    public static ScissorPaperStone ai() {
        Random number = new Random();
        int randomNumber = number.nextInt(3);
        ScissorPaperStone randomValue = null;
        for (ScissorPaperStone element : ScissorPaperStone.values()) {
            if (element.ordinal() == randomNumber) {
                return randomValue = element;
            }
        }
        return randomValue;
    }
}
