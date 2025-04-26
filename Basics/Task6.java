
/*
 Create a simple password validation system that prompts the user to enter a password and checks if it meets certain criteria (e.g., minimum length, containing numbers and special characters).
*/
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String input = sc.nextLine();
        char[] password = input.toCharArray();
        int number_count = 0;
        int alphabet_count = 0;

        for (int i = 0; i < password.length; i++) {
            if (password.length <= 8) {
                System.out.println("Password's length must be greater than 8 characters!");
                return;
            } else if (password[i] >= '0' && password[i] <= '9') {
                number_count++;
            } else if ((password[i] >= 'A' && password[i] <= 'Z') || (password[i] >= 'a' && password[i] <= 'z')) {
                alphabet_count++;
            }
        }
        if (number_count < 1) {
            System.out.println("Password must contain number!");
        } else if (alphabet_count < 1) {
            System.out.println("Password must contain alphabet!");
        } else {
            System.out.println("Password is valid.");
        }

        sc.close();
    }
}
