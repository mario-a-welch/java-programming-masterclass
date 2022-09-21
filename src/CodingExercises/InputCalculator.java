package CodingExercises;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        long average;

        while(true){

            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
            }else{
                break;
            }
            scanner.nextLine(); // needed to handle next line enter key
        }
        average = Math.round((double)sum / counter);
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
