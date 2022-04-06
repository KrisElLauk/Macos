package io.codelex.enums.practice.Exercise1;

public class DirectionApp {

    public static void main(String[] args) {

        Direction north = Direction.North;
        Direction south = Direction.South;
        Direction east = Direction.East;
        Direction west = Direction.West;

        System.out.println(north + ": " + north.getText() + ": " + north.ordinal());
        System.out.println(south + ": " + south.getText() + ": " + south.ordinal());
        System.out.println(east + ": " + east.getText() + ": " + east.ordinal());
        System.out.println(west + ": " + west.getText() + ": " + west.ordinal());
    }
}
