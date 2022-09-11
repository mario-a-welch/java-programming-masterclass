public class WhileAndDoWhileStatement {
    //Challenge #1
    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is an even number or not
    // return true if an even number, otherwise return false

    //Challenge #1
    public static boolean isEvenNumber(int num){
        return num % 2 == 0;
    }

    public static void main(String[] args){
//        int count = 0;
//        while(count != 5) {
//            System.out.println("Count value is " + count);
//            count++;
//        }

        //do while will execute at least once
//        count = 1;
//        do{
//            System.out.println("Count value is " + count);
//            count++;
//        }while(count != 6);

        //Challenge #1
//        int num = 0;
//        int finalNumber = 20;
//
//        while(num <= finalNumber){
//            num++;
//            if(!isEvenNumber(num)) {
//                continue;
//            }
//            System.out.println("Even number: " + num);
//        }

        //Challenge #2
        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found
        int num = 0;
        int finalNumber = 20;
        int count = 0;

        while(num <= finalNumber){
            num++;

            if(!isEvenNumber(num)) {
                continue;
            }

            System.out.println("Even number: " + num);
            count++;
            System.out.println("Even number count: " + count);
            if(count == 5){
                break;
            }
        }
        System.out.println("Total even numbers found: " + count);
    }
}
