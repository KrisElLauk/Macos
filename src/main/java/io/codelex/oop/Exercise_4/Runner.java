package io.codelex.oop.Exercise_4;

public enum Runner {

    BEGINNER(14, 18),
    INTERMEDIATE(10, 12),
    ADVANCED(6, 9);

    private final int min;
    private final int max;

    Runner(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public static void getFitnessLevel(int timeRunning) {
        if (timeRunning >= BEGINNER.min && timeRunning <= BEGINNER.max) {
            System.out.println(BEGINNER);
        } else if (timeRunning >= INTERMEDIATE.min && timeRunning <= INTERMEDIATE.max) {
            System.out.println(INTERMEDIATE);
        } else if (timeRunning >= ADVANCED.min && timeRunning <= ADVANCED.max) {
            System.out.println(ADVANCED);
        } else {
            System.out.println("Not able to determine fitness level");
        }
    }
}
