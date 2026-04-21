import java.util.Scanner;

public class uc4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int slot = getUserSlot();              // take input
        int[] position = convertSlotToIndex(slot);  // convert

        System.out.println("Row: " + position[0]);
        System.out.println("Column: " + position[1]);
    }

    // UC3: Get user input
    static int getUserSlot() {
        System.out.print("Enter a slot number (1-9): ");
        int slot = sc.nextInt();
        return slot;
    }

    // UC4: Convert slot → row & column
    static int[] convertSlotToIndex(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }
}