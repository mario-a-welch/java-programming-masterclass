package CodingExercises;

public class TeenNumberChecker {

    public static boolean hasTeen(int numOne, int numTwo, int numThree){
        if(((numOne >= 13) && (numOne <= 19)) || ((numTwo >= 13) && (numTwo <= 19)) || ((numThree >= 13) && (numThree <= 19))){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int age){
        if(age >= 13 && age <= 19){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }
}
