import java.util.Random;
import java.util.Scanner;

public class Dice {
    public int roll(){
        Random die = new Random();

        int dieRoll;
        dieRoll = (die.nextInt(6))+1;
        return dieRoll;
    }

    public int play(){
        Scanner scan = new Scanner(System.in);
        boolean stillPlaying = true;
        int score = 0;

        while(stillPlaying){
            System.out.println("Guess where the dice lands!!");
            System.out.println("     Side 1");
            System.out.println("     Side 2");
            System.out.println("     Side 3");
            System.out.println("     Side 4");
            System.out.println("     Side 5");
            System.out.println("     Side 6");

            String guess = scan.nextLine();
            int dieGuess = 0;
            if (guess.contains("1")) dieGuess = 1;
            else if (guess.contains("2")) dieGuess = 2;
            else if (guess.contains("3")) dieGuess = 3;
            else if (guess.contains("4")) dieGuess = 4;
            else if (guess.contains("5")) dieGuess = 5;
            else if (guess.contains("6")) dieGuess = 6;

            switch(dieGuess){
                case 1:
                    int rollValue = this.roll();
                    if(rollValue==1){
                        score+=5;
                        System.out.println("CORRECT! Result = "+rollValue);
                        System.out.println("Score: "+score);
                    }
                    else {
                        //score--;
                        System.out.println("Sorry! Result = "+rollValue);
                        System.out.println("Score: "+score);
                    }
                    break;
                case 2:
                    rollValue = this.roll();
                    if(rollValue==2){
                        score+=5;
                        System.out.println("CORRECT! Result = "+rollValue);
                        System.out.println("Score: "+score);
                    }
                    else {
                        //score--;
                        System.out.println("Sorry! Result = "+rollValue);
                        System.out.println("Score: "+score);
                    }
                    break;
                case 3:
                    rollValue = this.roll();
                    if(rollValue==3){
                        score+=5;
                        System.out.println("CORRECT! Result = "+rollValue);
                        System.out.println("Score: "+score);
                    }
                    else {
                        //score--;
                        System.out.println("Sorry! Result = "+rollValue);
                        System.out.println("Score: "+score);
                    }
                    break;
                case 4:
                    rollValue = this.roll();
                    if(rollValue==4){
                        score+=5;
                        System.out.println("CORRECT! Result = "+rollValue);
                        System.out.println("Score: "+score);
                    }
                    else {
                        //score--;
                        System.out.println("Sorry! Result = "+rollValue);
                        System.out.println("Score: "+score);
                    }
                    break;
                case 5:
                    rollValue = this.roll();
                    if(rollValue==5){
                        score+=5;
                        System.out.println("CORRECT! Result = "+rollValue);
                        System.out.println("Score: "+score);
                    }
                    else {
                        //score--;
                        System.out.println("Sorry! Result = "+rollValue);
                        System.out.println("Score: "+score);
                    }
                    break;
                case 6:
                    rollValue = this.roll();
                    if(rollValue==6){
                        score+=5;
                        System.out.println("CORRECT! Result = "+rollValue);
                        System.out.println("Score: "+score);
                    }
                    else {
                        //score--;
                        System.out.println("Sorry! Result = "+rollValue);
                        System.out.println("Score: "+score);
                    }
                    break;
                default: System.out.println("ERROR");
            }
            System.out.println("Do you want to play again?");
            System.out.println("     1. Yes");
            System.out.println("     2. No");

            String playAgain = scan.nextLine();
            if (playAgain.contains("No")||playAgain.contains("2")) stillPlaying = false;
        }

        System.out.println("Thanks for playing the dice game!!");
        return score;
    }
}