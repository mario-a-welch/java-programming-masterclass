package CodingExercises;

public class EqualSumChecker {
    public static boolean hasEqualSum(int numOne, int numTwo, int total){
        if(numOne + numTwo == total){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
    }
}
