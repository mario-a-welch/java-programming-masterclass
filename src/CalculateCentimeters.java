public class CalculateCentimeters {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
//        if(feet >= 0 && (inches >= 0 && inches <= 12)){
//            double centimeters = ((feet * 12 * 2.54) + (inches * 2.54));
//            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
//            return centimeters;
//        } else{
//            System.out.println("Invalid feet or inches");
//        }
//        return -1;

        if((feet < 0) || ((inches < 0) || (inches > 12))){
            System.out.println("Invalid feet or inches");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
//        if(inches >= 0){
//            double centimeters = inches * 2.54;
//            System.out.println(inches + " inches = " + centimeters + " cm");
//        }
//        return -1;

        if(inches < 0){
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

    public static void main (String[] args){
        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(-10, 12);
        calcFeetAndInchesToCentimeters(100);
    }
}
