package collections.Leest;

import java.util.Scanner;
import static java.lang.System.exit;

public class RestaurantApp {
    public static void main(String[] args) {
        RestaurantMenu menu = new RestaurantMenu();
        Order order = new Order();
        int choice;
        do {
            System.out.println("1. Display Menu");
            System.out.println("2. Add Item to Order");
            System.out.println("3. View Order");
            System.out.println("4. Exit");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    menu.displayMenu();
                    break;

                case 2:
                    menu.displayMenu();

                    break;

                case 3:
                    order.viewOrder();
                    break;

                case 4:
                    System.out.println("Thank you for visiting our Restaurant! Hope you will come again");
                    exit(0);
                    break;

                default:
                    System.out.println("Please Enter the valid choice!");
                    break;
            }
        } while (choice != 4);
    }
}
