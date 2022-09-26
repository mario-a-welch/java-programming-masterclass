package CompositionEncapsulationPolymorphism;

//Inheritance has an isA relationship
//Composition has a hasA relationship
public class Car extends Vehicle{

    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
