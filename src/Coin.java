import java.util.*;

public class Coin {
    public String flip(){
        Random coin = new Random();
        String coinResult;

        int coinFlip = coin.nextInt(2);
        if(coinFlip==0) coinResult = "Heads";
        else if(coinFlip==1) coinResult = "Tails";
        else coinResult = "ERROR";

        return coinResult;
    }

    public int play(){
        Scanner scan = new Scanner(System.in);
        boolean stillPlaying = true;
        int score = 0;

        while(stillPlaying){
            System.out.println("Heads or Tails?");
            System.out.println("     1. Heads");
            System.out.println("     2. Tails");

            String guess = scan.nextLine();
            int flipGuess = 0;
            if (guess.contains("Heads")||guess.contains("1")) flipGuess = 1;
            else if (guess.contains("Tails")||guess.contains("2")) flipGuess = 2;

            switch(flipGuess){
                case 1:
                    if(this.flip()=="Heads"){
                        score++;
                        System.out.println("CORRECT! Result = Heads");
                        System.out.println("Score: "+score);

                    }
                    else {
                        //score--;
                        System.out.println("Sorry! Result = Tails");
                        System.out.println("Score: "+score);

                    }
                    break;
                case 2:
                    if(this.flip()=="Heads") {
                        //score--;
                        System.out.println("Sorry! Result = Heads");
                        System.out.println("Score: "+score);
                    }
                    else {
                        score++;
                        System.out.println("CORRECT! Result = Tails");
                        System.out.println("Score: "+score);
                    }
                    break;
                default: System.out.println("ERROR");
            }
            System.out.println("Do you want to play again?");
            System.out.println("     1. Yes");
            System.out.println("     2. No");

            String playAgain = scan.nextLine();
            if (playAgain.contains("Yes")||playAgain.contains("1")) stillPlaying = true;
            else if (playAgain.contains("No")||playAgain.contains("2")) stillPlaying = false;
        }

        System.out.println("Thanks for playing the coin game!!");
        return score;
    }
}
