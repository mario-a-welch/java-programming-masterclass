import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args){

        // new creates instance of an object, Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // needed to handle next line enter key

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        int age = 2022 - yearOfBirth;

        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);

        scanner.close();

    }
}
