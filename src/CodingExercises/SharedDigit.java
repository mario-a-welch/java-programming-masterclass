package CodingExercises;

public class SharedDigit {

    public static boolean hasSharedDigit(int numOne, int numTwo) {

        if ((numOne > 9 && numOne <= 99) && (numTwo > 9 && numTwo <= 99)) {
            while (numOne != 0) {

                int compareNum = numTwo;

                while (compareNum != 0) {

                    if (numOne % 10 == compareNum % 10) {
                        return true;
                    }

                    compareNum /= 10;
                }

                numOne /= 10;
            }
        } return false;
    }

    public static void main(String[] args){
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 13));
        System.out.println(hasSharedDigit(12, 42));
    }
}
