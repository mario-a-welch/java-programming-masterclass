public class Operators {
    public static void main(String[] args){
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("4 % 3 = " + result);

        result++;
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2 - 1 = " + result);

        result += 2;
        System.out.println("1 + 2 = " + result);

        result *= 10;
        System.out.println("3 * 10 = " + result);

        result /= 3;
        System.out.println("30 / 3 = " + result);

        result -= 2;
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false){
            System.out.println("It is not a Alien");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than second top score and less than 100");
        }

        if (topScore > 90 || secondTopScore <= 90){
            System.out.println("Either or both of the conditions are true");
        }

//        Assignment vs Equal Operator
        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar){
            System.out.println("This is not supposed to happen");
        }

//        ternary operator
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("wasCar is true");
        }

//        Operator Challenge
        double firstVal = 20.00d;
        double secondVal = 80.00d;

        double sumVal = (firstVal + secondVal) * 100.00d;
        System.out.println("sumVal total = " + sumVal);

        double remainder = sumVal % 40.00d;
        System.out.println("Remainder = " + remainder);

        boolean isZero = (remainder == 0) ? true : false;
        System.out.println(isZero);

        if(!isZero){
            System.out.println("Got remainder of " + remainder);
        } else{
            System.out.println("No remainder");
        }

    }
}
