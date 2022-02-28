package io.codelex.loops.practice;

public class AsciiFigure {

    public static void size5() {

        final int size = 5;
        final int addedStars = 8;

        int maxWidth = addedStars * (size - 1);
        for (int i = 0; i < size; i++) {
            int stars = addedStars * i;
            int slashes = (maxWidth - stars) / 2;
            for (int j = 0; j < slashes; j++) {
                System.out.print("/");
            }
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }
            for (int l = 0; l < slashes; l++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }

        public static void size3() {

            final int size = 3;
            final int addedStars = 8;

            int maxWidth = addedStars * (size - 1);
            for (int i = 0; i < size; i++) {
                int stars = addedStars * i;
                int slashes = (maxWidth - stars) / 2;
                for (int j = 0; j < slashes; j++) {
                    System.out.print("/");
                }
                for (int k = 0; k < stars; k++) {
                    System.out.print("*");
                }
                for (int l = 0; l < slashes; l++) {
                    System.out.print("\\");
                }
                System.out.println();
            }
        }

        public static void size7() {

            final int size = 7;
            final int addedStars = 8;

            int maxWidth = addedStars * (size - 1);
            for (int i = 0; i < size; i++) {
                int stars = addedStars * i;
                int slashes = (maxWidth - stars) / 2;
                for (int j = 0; j < slashes; j++) {
                    System.out.print("/");
                }
                for (int k = 0; k < stars; k++) {
                    System.out.print("*");
                }
                for (int l = 0; l < slashes; l++) {
                    System.out.print("\\");
                }
                System.out.println();
            }
    }

    public static void main(String[] args) {

        size3();
        System.out.println();
        size5();
        System.out.println();
        size7();
    }
}
