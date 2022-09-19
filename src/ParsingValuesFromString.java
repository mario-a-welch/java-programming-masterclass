public class ParsingValuesFromString {

    public static void main(String[] args) {
//        String numberAsString = "2018";
        String numberAsString = "2018.125";
        System.out.println("numberAsString = " + numberAsString);

//        int number = Integer.parseInt(numberAsString);
        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString + 1 = " + numberAsString); // java converts number to string and appends it
        System.out.println("number + 1 = " +  number); // when parsing the string to an integer, it increments the number by 1


    }
}
