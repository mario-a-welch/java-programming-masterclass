package ArraysJavaInbuiltLists;

import java.util.Arrays;
import java.util.Scanner;

// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is the highest value to lowest
// In other words if the array had the values in it of 106, 26, 81, 5, 15
// Your program should ultimately have an array with 106, 81, 26, 5, 15
// Set up the program so that the numbers to sort are read in from the keyboard
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from the keyboard
// printArray prints out the contents of the array
// sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new array
// and sort them and return the new sorted array
public class ArrayChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int num){
        System.out.println("Enter " + num + " integer values. \r");
        int[] values = new int[num];

        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);

        }
    }

    public static int[] sortIntegers(int[] array){
//        int[] sortedArray = new int[array.length];
//        for(int i = 0; i < array.length; i++){
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
//        System.out.println(getIntegers(5));
    }

}
