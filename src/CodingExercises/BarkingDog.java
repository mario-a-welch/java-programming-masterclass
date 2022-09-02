package CodingExercises;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

//        if(barking){
//            if(hourOfDay < 0 || hourOfDay > 23){
//                return false;
//            }else if(hourOfDay < 8){
//                return true;
//            } else return hourOfDay == 23;
//        }
//        return false;

            if(barking){
                if(hourOfDay < 0 || hourOfDay > 23){
                    return false;
                }else if(hourOfDay < 8 || hourOfDay == 23){
                    return true;
                }
            }
            return false;
        }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, -1));
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
    }
}
