package CompositionEncapsulationPolymorphism.Encapsulation;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Mario";
//        player.health = 100;
//        player.weapon = "sword";
//
//        int damage = 20;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 81;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());


        EnhancedPlayer player = new EnhancedPlayer("Mario", 50, "Sword");
        System.out.println("Starting health is = " + player.getHealth());
    }
}
