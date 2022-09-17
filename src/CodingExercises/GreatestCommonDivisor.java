package CodingExercises;

public class GreatestCommonDivisor {

    public static int greatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }

        int divisor = 1;
        int counter =1;

        while(counter <= Math.min(first, second)){
            if(first % counter == 0 && second % counter == 0){
                divisor = counter;
            }
            counter ++;
        }
        return divisor;
    }

    public static void main(String[] args){
        System.out.println(greatestCommonDivisor(12, 30));
        System.out.println(greatestCommonDivisor(25, 15));
        System.out.println(greatestCommonDivisor(9, 81));
        System.out.println(greatestCommonDivisor(81, 153));
    }
}
