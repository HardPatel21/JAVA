/*
6. Find Second Largest Element in an Array
Problem: Write a Java program to find the second largest element in an array.
Sample Input:
arr = {10, 20, 4, 45, 99} 
Sample Output:
Second largest element: 45
*/

import java.util.Scanner;

public class Array_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted Array: {");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("\b\b }");
        System.out.println();
        System.out.println("Second largest element: " + arr[arr.length - 2]);

        sc.close();
    }
}
