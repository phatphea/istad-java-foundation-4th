package nestedclasses;

public class Car {

    //field or instance variable
    String brand;
    String model;
    int year;

    Car(){
        this("Unknown", "Unknown", 0);
    }

    Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    //behavior
    void showInfoCar(){
        System.out.println("=============| Car Information |=============");
        System.out.println("Car brand: " + this.brand);
        System.out.println("Car model: " + this.model);
        System.out.println("Year is: " + this.year);
    }

    class Engine{
        int horsepower;
        String type;

        Engine(){
            this(0, "Unknown");
        }

        Engine(int horsepower, String type){
            this.horsepower = horsepower;
            this.type = type;
        }

        void showInforEngine(){
            System.out.println("=============| Engine Information |=============");
            System.out.println("Engine Horsepower: " + this.horsepower);
            System.out.println("Engine Type: " + this.type);
        }
    }
}
