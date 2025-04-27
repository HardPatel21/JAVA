/*
Find the Sum of All Elements in an Array
Problem: Write a Java program to find the sum of all elements in a given array.
Sample Input:
arr = {5, 10, 15, 20} 
Sample Output:
Sum of array elements: 50
*/

import java.util.Scanner;

public class Array_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 10, 15, 20};
        
        double sum = 0;
        
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum of array elements: " + sum);
        sc.close();        
    }
}
