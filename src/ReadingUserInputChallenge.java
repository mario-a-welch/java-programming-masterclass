import java.util.Scanner;

public class ReadingUserInputChallenge {
    // Read 10 numbers from the console entered by the user and print the sume of those numbers
    // Create a Scanner
    // Use the hasNextInt() method from the scanner to check if the user has entered an int value
    // If hasNextInt() returns false, print the message "Invalid Number". Continue reading until you have read 10 numbers
    // Before the user enters each number, print the message "Enter number #x:" where x represents the count, i.e. 1, 2, etc

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while(counter < 10){
            int userEntry = counter + 1;
            System.out.println("Enter number #" + userEntry +":");

            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
            }else{
                System.out.println("Invalid Number");
            }
            scanner.nextLine(); // needed to handle next line enter key
        }
        System.out.println("Sum of entered numbers is: " + sum);
        scanner.close();
    }
 }
