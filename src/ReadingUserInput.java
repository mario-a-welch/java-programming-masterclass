import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args){

        // new creates instance of an object, Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");

        boolean hasNextInt = scanner.hasNextInt(); // checks to see if next user input is an int

        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // needed to handle next line enter key

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2022 - yearOfBirth;

            if(age >= 0 && age <= 100){
                System.out.println("Your name is " + name + ", you are " + age + " years old.");
            } else{
                System.out.println("Invalid age");
            }
        } else{
            System.out.println("Unable to parse year of birth");
        }


        scanner.close();

    }
}
