package CodingExercises;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            if(year % 4 == 0){
                if(year % 100 == 0){
                    if(year % 400 == 0){
                        return true;
                    }
                }else{
                    return true;
                }
            } else{
                return false;
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year){
        if((month < 1 || month > 12) || (year < 1 || year > 9999)){
            return -1;
        }
        int days = 0;
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 2:
                if(month == 2 && isLeapYear(year) == true){ // can be simplified to just isLeapYear(year)
                    days = 29;
                } else{
                    days = 28;
                }
                break;
            default:
                days = 30;
        }
        return days;
    }

    public static void main (String[] args){
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }
}
