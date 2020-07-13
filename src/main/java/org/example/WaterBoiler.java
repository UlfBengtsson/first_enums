package org.example;

public class WaterBoiler {

    private double temperature;

    public WaterBoiler(double temperature) {
        this.temperature = temperature;
    }


    public Temp getStateOfWater() {
        if (temperature <= Temp.Frozen.max && temperature >= Temp.Frozen.min) {
            return Temp.Frozen;
        }
        else if (temperature <= Temp.Fluid.max && temperature >= Temp.Fluid.min) {
            return Temp.Fluid;
        }
        else if(temperature <= Temp.Steam.max && temperature >= Temp.Steam.min) {
            return Temp.Steam;
        }
        return Temp.OutsideScope;
    }
}
