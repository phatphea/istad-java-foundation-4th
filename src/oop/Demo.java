package oop;

import oop.encapulation.Car;
import oop.inheritance.AutoCar;

public class Demo {

    public static void main(String[] args) {
        AutoCar car = new AutoCar();
        car.setBrand("Toyota");
        car.setModel("Corolla Cross");
        car.setProductionYear(2025);
        car.displayInfo();

    }
}
