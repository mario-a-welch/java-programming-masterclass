package CodingExercises;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo) {
        if (numOne < 0 && numTwo < 0) {
            double a = Math.ceil(numOne * 1000) / 1000;
            double b = Math.ceil(numTwo * 1000) / 1000;
            return a == b;
        }else if(numOne > 0 && numTwo > 0){
            double a = Math.floor(numOne * 1000) / 1000;
            double b = Math.floor(numTwo * 1000) / 1000;
            return a == b;
        } else return numOne == numTwo;
    }
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}
