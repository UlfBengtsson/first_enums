package org.example;

public enum Temp {
    Frozen(-250.0, 0.0),
    Fluid(0.1,99.9),
    Steam(100, 1000),
    OutsideScope(0,0);

    double min;
    double max;
    Temp(double min, double max) {
        this.min = min;
        this.max = max;
    }
}
