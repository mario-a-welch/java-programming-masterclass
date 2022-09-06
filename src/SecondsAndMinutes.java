public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static String getDurationString(long minutes, long seconds){
        if((minutes < 0) || (seconds < 0) || (seconds > 59)){
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        //More optimal ways to complete following code, but used what was currently taught
        String hoursString =  hours + "h";
        if(hours < 10){
            hoursString = "0" + hoursString;
        }

        //More optimal ways to complete following code, but used what was currently taught
        String minutesString =  remainingMinutes + "m";
        if(hours < 10){
            minutesString = "0" + minutesString;
        }

        //More optimal ways to complete following code, but used what was currently taught
        String secondsString =  seconds + "s";
        if(hours < 10){
            secondsString = "0" + secondsString;
        }

        return hoursString + " " + minutesString + " " + secondsString;
    }

    public static String getDurationString(long seconds){
        if(seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }
}
