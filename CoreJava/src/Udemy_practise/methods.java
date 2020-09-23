package Udemy_practise;

import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        int score;
        displayHighScorePosition();
        score = calculateHighScorePosition();
        System.out.println("the player scored "+score);
    }

    public static void displayHighScorePosition() {
        String playerName;
        int playerPosition;
        System.out.println("Please enter the Player name:");
        Scanner scan = new Scanner(System.in);
        playerName = scan.nextLine();
        System.out.println("Please enter the Player position in the table:");
        Scanner x = new Scanner(System.in);
        playerPosition = x.nextInt();
        System.out.println(playerName + " managed target to get into position and maintained " + playerPosition + " position on the high score table");
    }

    public static int calculateHighScorePosition() {
        int playerScore;
        System.out.println("Please enter the Player score in the table:");
        Scanner x = new Scanner(System.in);
        playerScore = x.nextInt();
        if (playerScore >=1000) {
            return playerScore;
        }
        else if (playerScore >=500 && playerScore < 1000) {
            return playerScore;
        }
        else if (playerScore >=100 && playerScore < 500) {
            return playerScore;
        }
        else {
            return playerScore;
        }
    }
}
