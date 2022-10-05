package ArraysJavaInbuiltLists;

import java.util.Scanner;

public class ArraysLec {

//    public static void printArray(int[] array){
//        for(int i = 0; i < array.length; i++){
//            System.out.println("Element " + i + ", value is " + array[i]);
//        }
//    }

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int num){
        System.out.println("Enter " + num + " integer values. \r");
        int[] values = new int[num];

        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }


    public static void main(String[] args) {
        // int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Arrays start count an index 0
        // System.out.println(myIntArray[0]);
        // System.out.println(myIntArray[7]);
        // System.out.println(myIntArray[3]);

//        int[] myIntArray = new int[25];
//        for(int i = 0; i < myIntArray.length; i++){
//            myIntArray[i] = i * 10;
//        }
//        printArray(myIntArray);
//        for(int i = 0; i < myIntArray.length; i++){
//            System.out.println("Element " + i + ", value is " + myIntArray[i]);
//        }

        int[] myIntegers = getIntegers(5);
        for(int i = 0; i < myIntegers.length; i++){
            System.out.println("Element " + i + ", type value was " + myIntegers[i]);
        }

        System.out.println("The average is " + getAverage(myIntegers));
    }
}
