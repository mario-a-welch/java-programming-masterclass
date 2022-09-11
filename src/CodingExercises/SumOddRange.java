package CodingExercises;

public class SumOddRange {
    //Method that returns true if the number is odd or false if the number is even or less than 0
    public static boolean isOdd(int number){
        if(number < 0){
            return false;
        }

        return number % 2 != 0;
    }

    //Method that will return -1 if the end integer is less than the start or if the start or end integer is less than 0
    //Method will sum all the odd integers in the range of the start and end integer inclusive
    public static int sumOdd(int start, int end){
        if(end < start || start < 0 || end < 0){
            return -1;
        }

        int sum = 0;

        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(sumOdd(1, 100)); // should return 2500
        System.out.println(sumOdd(-1, 100)); // should return -1
        System.out.println(sumOdd(100, 100)); // should return 0
        System.out.println(sumOdd(13, 13)); // should return 13 (This set contains one number, 13 and it is odd
        System.out.println(sumOdd(100, -100)); // should return -1
        System.out.println(sumOdd(100, 1000)); // should return 247500
    }
}
