package CodingExercises;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes >= 0){
            int mB = kiloBytes/1024;
            int remainderKilo = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + mB + " MB and " + remainderKilo + " KB");
        }else{

            System.out.println("Invalid Value");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(0);

    }

}
