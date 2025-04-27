/*
5. Reverse an Array
Problem: Write a Java program to reverse a given array.
Sample Input:
arr = {1, 2, 3, 4, 5} 
Sample Output:
Reversed array: {5, 4, 3, 2, 1}
*/
import java.util.Scanner;

public class Array_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr["+i+"]: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("\nReversed Array["+arr.length+"]: { ");
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\b\b }");
        sc.close();   
    }
}
