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
    }
}
