package oop.inheritance;

import oop.encapulation.Car;

public class AutoCar extends Car {

    public void displayInfo(){

        System.out.println("========AutoCar Info========");
        System.out.println(STR."""
                Brand: \{super.getBrand()}
                Model: \{super.getModel()}
                Production year: \{super.getProductionYear()}
                """);

    }

}
