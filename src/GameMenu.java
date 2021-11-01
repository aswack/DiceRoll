import java.util.*;

public class GameMenu {
    static Scanner reader = new Scanner(System.in);
    static int finalScore = 0;

    public static void main(String[] args){
        Dice dice = new Dice();
        Coin coin = new Coin();
        boolean playing = true;

        while(playing){
            System.out.println("Main Menu: Which Game would you like to play?");
            System.out.println("     1. Coin Game");
            System.out.println("     2. Dice Game");
            System.out.println("     3. Exit Game");

            String game = reader.nextLine();
            int gameChoice = 0;
            if (game.contains("Coin")||game.contains("1")) gameChoice = 1;
            else if (game.contains("Dice")||game.contains("2")) gameChoice = 2;
            else if (game.contains("Exit")||game.contains("3")) gameChoice = 3;

            switch(gameChoice){
                case 1:
                    int coinScore = coin.play();
                    finalScore += coinScore;
                    break;
                case 2:
                    int diceScore = dice.play();
                    finalScore += diceScore;
                    break;
                case 3:
                    System.out.println("Final Score = "+finalScore);
                    playing = false;
                    break;
                default: System.out.println("ERROR");
            }
        }
    }
}