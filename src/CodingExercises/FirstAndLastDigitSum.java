package CodingExercises;

public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number){

        int lastDigit;

        if(number >= 0){

            lastDigit = number % 10;

            while(number > 9){

                number /= 10;

            }

            return number + lastDigit;

        } else{
            return -1;
        }
    }

    public static void main(String[] args){
        System.out.println(sumFirstAndLastDigit(123));
    }
}
