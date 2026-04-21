import java.util.Scanner;

public class uc3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int slot = getUserSlot();   // method call
        System.out.println("You selected slot: " + slot);
    }

    // Method to get user input
    static int getUserSlot() {

        System.out.print("Enter a slot number (1-9): ");
        int slot = sc.nextInt();   // read integer input

        return slot;               // return value to game logic
    }
}