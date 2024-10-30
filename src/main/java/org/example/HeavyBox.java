package org.example;

import javax.swing.*;

public class HeavyBox extends Box {
    int weight = 4;

    public HeavyBox(double width, double height, double depth, int weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}
