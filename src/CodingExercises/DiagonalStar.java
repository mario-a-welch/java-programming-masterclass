package CodingExercises;

public class DiagonalStar {

    public static void printSquareStar(int number){

        if(number < 5){
            System.out.println("Invalid Value");
        } else{

            for(int x = 0; x < number; x++){
                for(int y = 0; y < number; y++){
                    if(x == 0 || x == number - 1 || y == 0 || y == number - 1 || x == y || number - (x + 1) == y){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        printSquareStar(8);
        printSquareStar(5);
    }
}
