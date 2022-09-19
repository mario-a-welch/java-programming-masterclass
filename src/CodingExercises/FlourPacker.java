package CodingExercises;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int counter = 0;
        int remainder = 0;

        while((counter * 5) <= goal && counter <= bigCount){
            remainder = goal - (counter * 5);
            counter++;
        }
        return smallCount >= remainder && remainder >= 0;
    }

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4)); // false
        System.out.println(canPack(1, 0, 5)); // true
        System.out.println(canPack(0, 5, 4)); // true
        System.out.println(canPack(2, 2, 11)); // true
        System.out.println(canPack(-3, 2, 12)); // false
        System.out.println(canPack(4, 3, 19)); // false
    }
}
