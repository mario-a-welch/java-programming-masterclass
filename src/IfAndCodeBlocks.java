public class IfAndCodeBlocks {
    public static void main(String[] args){
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        If keyword helps test various scenarios
//        if(score < 5000 && score > 1000){
//            System.out.println("Your score was less than 5000 but more than 1000");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else{
//            System.out.println("Got here");
//        }

        if(gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
//            A variable created in the code block cannot be accessed outside the code block - outside scope
//            You can access variables that are created outside the code block
        }

//            Challenge
//            Print out a second score on the screen with the following
//            score set to 10000
//            levelCompleted set to 8
//            bonus set to 200
//            But make sure the first printout above still displays as well
        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if(newGameOver) {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
