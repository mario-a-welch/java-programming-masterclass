package CompositionEncapsulationPolymorphism.OOPMasterChallenge;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.50, "White");
        super.addHamburgerAddition("Chips", 2.50);
        super.addHamburgerAddition2("Drink", 1.50);
    }

    @Override
    public void addHamburgerAddition(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");;
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");;
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");;
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");;
    }
}
