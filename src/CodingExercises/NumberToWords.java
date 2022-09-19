package CodingExercises;

public class NumberToWords {

    // prints out passed number variable using words for the digits
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        } else{
            String numToWord = "";
            int numDigitCount = getDigitCount(number);
            int reverseNumber = reverse(number);
            int reverseNumDigitCount = getDigitCount(reverseNumber);

            do{
                int num = reverseNumber % 10;
                reverseNumber /= 10;

                if(!numToWord.equals("")){
                    numToWord += " ";
                }

                switch(num){
                    case 1:
                        numToWord += "One";
                        break;
                    case 2:
                        numToWord += "Two";
                        break;
                    case 3:
                        numToWord += "Three";
                        break;
                    case 4:
                        numToWord += "Four";
                        break;
                    case 5:
                        numToWord += "Five";
                        break;
                    case 6:
                        numToWord += "Six";
                        break;
                    case 7:
                        numToWord += "Seven";
                        break;
                    case 8:
                        numToWord += "Eight";
                        break;
                    case 9:
                        numToWord += "Nine";
                        break;
                    default:
                        numToWord += "Zero";
                }
            } while(reverseNumber > 0);

            if(reverseNumDigitCount != numDigitCount){
                int zerosToAdd = numDigitCount - reverseNumDigitCount;
                while(zerosToAdd > 0){
                    numToWord = numToWord + " " + "Zero";
                    zerosToAdd--;
                }
            }

            System.out.println(numToWord);
        }
    }

    // reverses number, except will not return a 0 to the front of the number if the original number ends in 0
    // ex: 1020 will return 201
    public static int reverse(int number){
        int reverseNum = 0;

        while(number != 0){
            int num = number % 10;
            reverseNum = (reverseNum * 10) + num;
            number /= 10;
        }
        return reverseNum;
    }

    //returns number of digits, ex: 1020 will return 4
    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        int counter = 0;

        do{
            number/=10;
            counter++;
        }while(number > 0);

        return counter;
    }

    public static void main(String[] args){
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        System.out.println(reverse(1020));

        numberToWords(100);
        numberToWords(11);
    }
}
