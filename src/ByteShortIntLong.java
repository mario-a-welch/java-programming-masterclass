public class ByteShortIntLong {
    public static void main(String[] args) {

//        Primitive Type Lec
        int myValue = 1000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue); // Integer min is -2147483648
        System.out.println("Integer Maximum Value = " + myMaxIntValue); // Integer max is 2147483647
        System.out.println("Busted Maximum Value = " + (myMaxIntValue + 1));
        System.out.println("Busted Minimum Value = " + (myMinIntValue - 1));

//        Byte, short, long Lec
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue); // Byte min is -128
        System.out.println("Byte Maximum Value = " + myMaxByteValue); // Byte max is 127

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue); // Short min is -32768
        System.out.println("Short Maximum Value = " + myMaxShortValue); // Short max is 32767

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue); // Long min is -9223372036854775808
        System.out.println("Long Maximum Value = " + myMaxLongValue); // Long max is 9223372036854775807

//        Casting Lec
        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

//        Primitive Types Challenge
        byte challengeByte = 125;
        short challengeShort = 3000;
        int challengeInt = 7;
        long challengeLong = 50000L + 10L * (challengeByte + challengeShort + challengeInt);

        System.out.println(challengeLong);
    }
}
