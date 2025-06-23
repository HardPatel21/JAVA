package filehandling;

import java.util.Scanner;

public class StreamsReadWrite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FH_Stream fh = new FH_Stream();
        String fileName = "";
        int choice;
        do {
            System.out.println("1. Write into a file");
            System.out.println("2. Read from the file");
            System.out.println("0: Exit");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the name of the file: ");
                    fileName = sc.next();
                    fh.writeFile(fileName, null);
                    break;

                case 2:
                    System.out.println("Enter the name of the file: ");
                    fileName = sc.next();
                    fh.readFile(fileName, null);
                    break;

                case 0:
                    System.out.println("Exiting the Program...");
                    break;

                default:
                    System.out.println("Invalid choice, Please try again!");
                    break;
            }
        } while (choice != 0);
        sc.close();
    }
}