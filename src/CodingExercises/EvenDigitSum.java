package CodingExercises;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        int sumEven = 0;

        if(number >= 0){

            while(number != 0){
                int getEvenNum = number % 10;

                if(getEvenNum % 2 == 0){
                    sumEven += getEvenNum;
                }

                number /= 10;
            }
            return sumEven;
        }

        return -1;
    }

    public static void main(String[] args){
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(0));
    }
}

