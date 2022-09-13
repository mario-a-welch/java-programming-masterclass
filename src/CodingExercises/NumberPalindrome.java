package CodingExercises;

public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int lastDigit;

        // Stores number parameter in a new variable to allow to compare to reverse variable
        int num = number;

        while(number != 0){
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }

        return reverse == num;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(72727));
    }
}
