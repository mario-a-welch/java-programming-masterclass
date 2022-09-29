package CompositionEncapsulationPolymorphism.PolymorphismChallenge;

class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }
}

class Toyota extends Car{

    public Toyota(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Toyota -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Toyota -> accelerate()";
    }

    @Override
    public String brake() {
        return "Toyota -> brake()";
    }
}

class Nissan extends Car{

    public Nissan(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Nissan -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Nissan -> accelerate()";
    }

    @Override
    public String brake() {
        return "Nissan -> brake()";
    }
}

public class Main {
    // Going back to the car analogy
    // Crate a base class called Car
    // It should have a few fields that would be appropriate for a generic car class
    // engine, cylinders, wheels, etc.
    // Constuctor should initialize cylinders (number of) and name, and set wheels to 4 and engine to true.
    // Cylinders and names would be passed parameters
    //
    // Create appropriate getters
    //
    // Create some methods like startEngine, accelerate, and brake
    //
    // show a message for each in the base class
    // Now create 2 subclasses for your favorite vehicles
    // Override the appropriate methods to demonstrate polymorphism in use
    // put all classes in the one java file
    public static void main(String[] args) {
        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Toyota toyota = new Toyota(12, "Tundra");
        System.out.println(toyota.startEngine());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.brake());

        Nissan nissan = new Nissan(8, "370Z");
        System.out.println(nissan.startEngine());
        System.out.println(nissan.accelerate());
        System.out.println(nissan.brake());
    }


}
