package com.softserve.homework6;

import java.util.Arrays;

public class Feathers {

    private long number;
    private String[] colors;

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "Feathers{" +
                "number=" + number +
                ", colors=" + Arrays.toString(colors) +
                '}';
    }
}
