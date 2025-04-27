/*
2. Find the Minimum Element in an Array
Problem: Write a Java program to find the smallest element in a given array.
Sample Input:
arr = {5, 8, 2, 17, 1, 9} 
Sample Output:
Minimum element: 1
*/

import java.util.Scanner;

public class Array_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter arr["+i+"]: ");
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i = 0; i < 6; i++){
            if(arr[i] < min){
                min = arr[i]; 
            }
        }
        System.out.println("Smallest element: " + min);
        sc.close();
    }
}
