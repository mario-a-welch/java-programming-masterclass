package CompositionEncapsulationPolymorphism.OOPMasterChallenge;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String bun;

    private String additionName;
    private double addtitionPrice;

    private String addition2Name;
    private double addtition2Price;

    private String addition3Name;
    private double addtition3Price;

    private String addition4Name;
    private double addtition4Price;

    public Hamburger(String name, String meat, double price, String bun) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.bun = bun;
    }

    public void addHamburgerAddition(String name, double price){
        this.additionName = name;
        this.addtitionPrice = price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addtition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addtition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addtition4Price = price;
    }

    public double itemizedHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.bun + "bun price is " + this.price);

        if(this.additionName != null){
            hamburgerPrice += this.addtitionPrice;
            System.out.println("Added " + this.additionName + " for an extra " + this.addtitionPrice);
        }

        if(this.addition2Name != null){
            hamburgerPrice += this.addtition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addtition2Price);
        }

        if(this.addition3Name != null){
            hamburgerPrice += this.addtition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addtition3Price);
        }

        if(this.addition4Name != null){
            hamburgerPrice += this.addtition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addtition4Price);
        }

        return hamburgerPrice;
    }
}
