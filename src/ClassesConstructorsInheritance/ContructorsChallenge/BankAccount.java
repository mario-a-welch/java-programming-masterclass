package ClassesConstructorsInheritance.ContructorsChallenge;

public class BankAccount {
    // Create a new class for a bank account
    // Create fields for the account number, balance, customer name, email and phone number.

    // Create getters and setters for each field
    // Create two additional methods
    // 1. To allow the customer to deposit funds (this should increment the balance field)
    // 2. To allow the customer to withdraw funds. This should deduct from the balance field, but not allow the withdrawal
    // to complete if there are insufficient funds.

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        //Line is used to create default amounts if not parameters are given
        //Must be first line in constructor
        this("56789", 3.00, "Default name", "Default email", "Defaule Phone number");
        System.out.println("Empty constructor");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Used constructor with parameters");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " processed. New balance is: $" + this.balance);
    }

    public void withdraw(double withdrawAmount){
        if(withdrawAmount > this.balance){
            System.out.println("Insufficient Funds");
        } else{
            this.balance -= withdrawAmount;
            System.out.println("Withdrawal processed. New balance is: $" + this.balance);
        }
    }
}
