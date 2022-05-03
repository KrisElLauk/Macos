package io.codelex.polymorphism.practice.exercise2;

public class MakeSounds {
    public static void main(String[] arg) {

        Parrot parrot = new Parrot();
        Radio radio = new Radio();
        Firework firework = new Firework();

        Sound[] sound = {
                parrot,
                radio,
                firework
        };

        for (Sound typeOfSound : sound) {
            typeOfSound.playSound();
        }
    }
}
