package org.example;

import org.example.Temp;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner
                .nextLine()
                .trim()
                .toLowerCase()
                .replace(" ", "");

        Temp show = null;

        switch (userInput) {
            case "outsidescope":
                show = Temp.OutsideScope;
                break;
            case "steam":
                show = Temp.Steam;
                break;
            case "fluid":
                show = Temp.Fluid;
                break;
            case "frozen":
                show = Temp.Frozen;
                break;
            default:
                System.out.println("not correct input, defaulting to OutsideScope");
                show=Temp.OutsideScope;
                break;
        }
        System.out.println(show);
    }

    static void waterBoilerEx() {
        WaterBoiler waterBoiler = new WaterBoiler(155.5);

        System.out.println(waterBoiler.getStateOfWater());
    }

    static void riskOfNotCheckingBeforeCasting() {
        //bad way that can crash our code
        Object obj = new Object();
        System.out.println(((WaterBoiler)obj).getStateOfWater());//Exception in thread "main" java.lang.ClassCastException: java.lang.Object cannot be cast to org.example.WaterBoiler
    }

    static void checkingBeforeCast() {

        Object steamingHot =new WaterBoiler(999);//new Object();

        if (steamingHot instanceof WaterBoiler) {
            System.out.println("State of the water inside the boiler: " + ((WaterBoiler) steamingHot).getStateOfWater() );
        }
        else {
            System.out.println("Was not of the WaterBoiler family");
        }
    }
}
