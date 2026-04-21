import java.util.Random;

public class uc2 {

    static String player1 = "Player 1";
    static String player2 = "Player 2";

    static char player1Symbol;
    static char player2Symbol;
    static String currentPlayer;
    static char currentSymbol;

    public static void main(String[] args) {

        performToss();

        System.out.println("Game is starting...\n");
        System.out.println(player1 + " is '" + player1Symbol + "'");
        System.out.println(player2 + " is '" + player2Symbol + "'");
        System.out.println("\n" + currentPlayer + " will start first with '" + currentSymbol + "'");
    }

    // Method to perform toss
    static void performToss() {

        Random rand = new Random();
        int toss = rand.nextInt(2); // 0 or 1

        if (toss == 0) {
            // Player 1 starts
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentPlayer = player1;
            currentSymbol = player1Symbol;
        } else {
            // Player 2 starts
            player2Symbol = 'X';
            player1Symbol = 'O';
            currentPlayer = player2;
            currentSymbol = player2Symbol;
        }
    }
}