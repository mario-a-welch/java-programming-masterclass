package CodingExercises;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour > 0){
            return Math.round(kilometersPerHour / 1.609);
        }
        return -1;
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h = " + milesPerHour + "mi/h");
        }
    }

    public static void main(String[] args) {
        printConversion(10.5);
        printConversion(-1);

    }
}
