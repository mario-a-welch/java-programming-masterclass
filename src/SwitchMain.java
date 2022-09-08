public class SwitchMain {
    public static void main(String[] args) {
//        int value = 3;
//
//        if(value == 1){
//            System.out.println("Value was 1");
//        } else if(value == 2){
//            System.out.println("Value was 2");
//        } else{
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 4;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break; // last break is not needed but recommended
        }

        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        char switchChar = 'A';

        switch(switchChar) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Found char of " + switchChar);
                break;

            default:
                System.out.println("Could not find A, B, C, D, or E");
                break;
        }

       String month = "May";

       switch (month.toLowerCase()){
           case "may":
               System.out.println("Birthday month!");
               break;

           case "august":
               System.out.println("Mavericks birthday month!");
               break;

           default:
               System.out.println("Not my birthday month");
               break;
       }
    }
}
