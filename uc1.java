public class uc1 {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        // Initialize board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        printBoard();
    }

    // Method to print board
    static void printBoard() {

        System.out.println("-------------");

        for (int row = 0; row < 3; row++) {

            for (int col = 0; col < 3; col++) {
                System.out.print("| " + board[row][col] + " ");
            }

            System.out.println("|");
            System.out.println("-------------");
        }
    }
}