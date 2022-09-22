package ClassesConstructorsInheritance.ContructorsChallenge;

public class Main {

    public static void main(String[] args){
        BankAccount marioAccount = new BankAccount("1375894", 0.00, "Mario Welch", "mario@email.com", "(123) 456-7890");

//        marioAccount.setAccountNumber("1375894");
//        marioAccount.setBalance(0.00);
//        marioAccount.setCustomerName("Mario Welch");
//        marioAccount.setEmail("mario@email.com");
//        marioAccount.setPhoneNumber("(123) 456-7890");

        marioAccount.withdraw(100.00);
        marioAccount.deposit(1000.00);
        marioAccount.withdraw(75.00);
        System.out.println("Account number: " + marioAccount.getAccountNumber());

        BankAccount maverickAccount = new BankAccount("Maverick", "Maverick@email.com", "(112) 985-7452");
        System.out.println("Account holder name: " + maverickAccount.getCustomerName());

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Mario", 2000000);
        System.out.println("VIP Customer: " + person2.getName() + " has credit limit of $" + person2.getCreditLimit());

        VipCustomer person3 = new VipCustomer("Maverick", 5000000, "Maverick@vipemail.com");
        System.out.println("VIP Customer: " + person3.getName() + " has credit limit of $" + person3.getCreditLimit());

    }
}
