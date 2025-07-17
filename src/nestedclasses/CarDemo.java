package nestedclasses;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car("Lexus", "NX200T", 2025);
        car.showInfoCar();

        Car.Engine engine = car.new Engine(220, "Tubo");
        engine.showInforEngine();
    }
}
