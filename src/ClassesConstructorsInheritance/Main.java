package ClassesConstructorsInheritance;

public class Main {

    public static void main(String[] args) {
        Car ferrari = new Car();
        Car toyota = new Car();

        ferrari.setModel("Portofino");
        System.out.println("Ferrari model is " + ferrari.getModel());
    }
}
