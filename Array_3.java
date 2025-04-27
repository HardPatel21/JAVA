/*
3. Check if an Array is Sorted
Problem: Write a Java program to check if a given array is sorted in ascending order.
Sample Input:
arr = {1, 2, 3, 4, 5} 
Sample Output:
Array is sorted 
Sample Input:
arr = {3, 1, 4, 2, 5} 
Sample Output:
Array is not sorted 
*/

import java.util.Scanner;

public class Array_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Array is not sorted");
                return;
            } else {
                System.out.println("Array is sorted");
                return;
            }
        }
    }
}
