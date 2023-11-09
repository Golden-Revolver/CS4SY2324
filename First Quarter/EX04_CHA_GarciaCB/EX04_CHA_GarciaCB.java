/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04_cha_garciacb;
import java.util.Scanner;
/**
 *
 * @author Christian Brandon
 */
public class EX04_CHA_GarciaCB {
    /**
     * @param args the command line arguments
     */
    private static final Scanner sc = new Scanner(System.in);
    private static int roundsToWin = 2, playerScore, computerScore;
    private static Move rock, paper, scissors;
    
    public static int prompt() {
        System.out.print("> ");
        return sc.nextInt();
    }
    
    public static Move parseMove (int number) {
        switch(number) {
            case 1: return rock;
            case 2: return paper;
            case 3: return scissors;
            default: throw new IllegalArgumentException("Method only "
                    + "accepts integers 1, 2 and 3.");
        }
    }
    
    public static Move randomMove() {
        int random = (int) Math.floor(Math.random()*3) + 1;
        return parseMove(random);
    }
    
    public static void setRoundsToWin(int number) {
        if (number > 0) roundsToWin = number;
        else {
            System.out.println("\nInput a number greater than 0.");
            setRoundsToWin(prompt());
        }
    }
    
    public static String getWinner(int computerScore, int playerScore) {
        if (computerScore > playerScore) return "Computer";
        else if (playerScore > computerScore) return "Player";
        else return null;
    }
    
    public static void showSettings() {
        System.out.println("Welcome to Rock, Paper, Scissors. "
                + "Please choose an option:");
        System.out.println("1. Start game");
        System.out.println("2. Change number of rounds");
        System.out.println("3. Exit application");
        int choice = prompt();
        
        switch(choice) {
            case 1 -> {
                String plural = "";
                if (roundsToWin != 1) plural = "s";
                System.out.println("\nThis match will be first to " + 
                        roundsToWin + " win" + plural + ".");
                playGame();
            }
            case 2 -> {
                System.out.println("\nHow many wins are needed to win "
                        + "a match?");
                setRoundsToWin(prompt());
                System.out.println("\nNew setting has been saved!\n");
                showSettings();
            }
            case 3 -> {
                System.out.println("\nThank you for playing!");
            }
        }
    }
    
    public static void playGame() {
        Move computerMove, playerMove;
        int result;
        String output = null, winner;
        
        computerMove = randomMove();
        
        System.out.println("The computer has selected its move. "
                + "Select your move:");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        
        playerMove = parseMove(prompt());
        
        result = Move.compareMoves(computerMove, playerMove);
        switch(result) {
            case 0 -> {
                computerScore++;
                output = "Computer wins round!";
            }
            case 1 -> {
                playerScore++;
                output = "Player wins round!";
            }
            case 2 -> {
                output = "Round is tied.";
            }
        }
        
        System.out.print("\nPlayer chose " + playerMove.getName() + ". ");
        System.out.print("Computer chose " + computerMove.getName() + ". ");
        System.out.println(output);

        System.out.println("Player: " + playerScore + " - " + 
                "Computer: " + computerScore + "\n");
        
        if (computerScore == roundsToWin || playerScore == roundsToWin) {
            winner = getWinner(computerScore, playerScore);
            System.out.println(winner + " wins!\n");
            computerScore = playerScore = 0; // resets the score
            showSettings();
        }
        else playGame();
    }
    
    public static void main(String[] args) {
        rock = new Move("Rock");
        paper = new Move("Paper");
        scissors = new Move("Scissors");

        rock.setStrongAgainst(scissors);
        paper.setStrongAgainst(rock);
        scissors.setStrongAgainst(paper);
        
        showSettings();
    }
}
