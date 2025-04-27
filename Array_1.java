/*
1. Find the Maximum Element in an Array
Problem: Write a Java program to find the largest element in a given array.
Sample Input:
arr = {12, 45, 67, 23, 89, 34} 
Sample Output:
Maximum element: 89
*/

import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int max = arr[0];
        
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter arr["+i+"]: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 6; i++){
            if(arr[i] > max){
                max = arr[i]; 
            }
        }
        System.out.println("Maximum element: " + max);
        sc.close();
    }
}
