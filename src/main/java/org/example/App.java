package org.example;

import org.example.Temp;

public class App 
{
    public static void main( String[] args )
    {
        WaterBoiler waterBoiler = new WaterBoiler(155.5);

        System.out.println(waterBoiler.getStateOfWater());

        Object steamingHot = new WaterBoiler(999);

        if (steamingHot instanceof WaterBoiler) {
            System.out.println( ((WaterBoiler) steamingHot).getStateOfWater() );
        }

        Temp show = Temp.Frozen;

        switch (show) {
            case OutsideScope:

                break;
            case Steam:

                break;
            case Fluid:

                break;
            case Frozen:

                break;

        }
    }
}
