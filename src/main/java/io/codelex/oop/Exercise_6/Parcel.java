package io.codelex.oop.Exercise_6;

public class Parcel implements Validatable {

    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
    }

    @Override
    public boolean validate() {
        int MAX_SUM_OF_DIMENSIONS = 300;
        int MAX_SIZE_OF_DIMENSIONS = 30;
        float ALLOWABLE_WEIGHT = 30;

        if (weight < ALLOWABLE_WEIGHT) {
            isExpress = true;
        }
        return xLength + yLength + zLength < MAX_SUM_OF_DIMENSIONS
                && xLength > MAX_SIZE_OF_DIMENSIONS
                && yLength > MAX_SIZE_OF_DIMENSIONS
                && zLength > MAX_SIZE_OF_DIMENSIONS
                && isExpress;
    }
}
