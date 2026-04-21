import java.util.Scanner;

public class uc5 {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {

        int slot = getUserSlot();

        int row = getRowFromSlot(slot);
        int col = getColFromSlot(slot);

        if (isValidMove(row, col)) {
            System.out.println("Move accepted");
        } else {
            System.out.println("Move rejected");
        }
    }

    // Take user input
    static int getUserSlot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter slot (1-9): ");
        return scanner.nextInt();
    }

    // Convert slot to row index
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    // Convert slot to column index
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }

    // UC5: Validate move
    static boolean isValidMove(int row, int col) {

        // Check boundaries (0–2)
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }
}