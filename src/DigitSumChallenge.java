public class DigitSumChallenge {
    // Write a method with the name sumDigits that has one int parameter called number
    // If parameter is >= 10 then the method should process the number and return sum of all digits
    // otherwise return -1 to indicate an invalid value
    // The numbers from 0-9 have 1 digit, so we don't want to process them, also we don't want to process
    // negative numbers, so also return -1 for negative numbers
    // For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8
    // Calling the method sumDigits(1) should return -1 as per requirements described above

    public static int sumDigits(int number){
        if(number >= 10){
            int sum = 0;

            while (number > 0){
                // will get the remainder of the number and add it to the sum
                int num = number % 10;
                sum += num;

                // due to the number being an int and dividing the number by 10, no decimals will be kept
                // causing the number you just added to the sum to be dropped from further calculations'
                // ex: 125 / 10 = 12
//                System.out.println(number / 10);
                number /= 10;
            }

            return sum;
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-1));
        System.out.println(sumDigits(483));
        System.out.println(sumDigits(65));
    }
}
