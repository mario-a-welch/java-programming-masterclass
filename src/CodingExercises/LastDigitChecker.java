package CodingExercises;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int a, int b, int c){
        if(isValid(a) && isValid(b) && isValid(c)){
            return(a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10);
        }
        return false;
    }

    public static boolean isValid(int num){
        if(num >= 10 && num <= 1000){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(hasSameLastDigit(42, 71, 22));
        System.out.println(hasSameLastDigit(1, 54, 91));
        System.out.println(hasSameLastDigit(45, 905, 36));
    }
}
