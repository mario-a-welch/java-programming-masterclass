public class HighScorePosition {

    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore){
//        if(playerScore >= 1000){
//            return 1;
//        } else if(playerScore >= 500){
//            return 2;
//        } else if(playerScore >= 100){
//            return 3;
//        }
//
//        return 4;

        int position = 4;  //assuming position 4 will be returned

        if(playerScore >= 1000){
            position = 1;
        } else if(playerScore >= 500){
            position = 2;
        } else if(playerScore >= 100){
            position = 3;
        }

        return position;
    }


    public static void main(String[] args){
        int scoreOne = calculateHighScorePosition(1500);
        int scoreTwo = calculateHighScorePosition(500);
        int scoreThree = calculateHighScorePosition(100);
        int scoreFour = calculateHighScorePosition(50);

        displayHighScorePosition("Mario", scoreOne);
        displayHighScorePosition("Keith", scoreTwo);
        displayHighScorePosition("Lex", scoreThree);
        displayHighScorePosition("Maverick", scoreFour);
    }
}
