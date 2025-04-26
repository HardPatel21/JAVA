/*
10. Find the Difference Between the Sum of Even and Odd Numbers in an
Array
Problem: Write a Java program to find the difference between the sum of even and odd numbers in an array.
Sample Input:
arr = {3, 8, 15, 6, 9, 2} 
Sample Output:
Difference: (Sum of evens - Sum of odds) = (16 - 27) = -11
*/

import java.util.Scanner;

public class Array_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 3, 8, 15, 6, 9, 2 };

        double even_sum = 0;
        double odd_sum = 0;
        // double diff;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even_sum += arr[i];
            }
            else{
                odd_sum += arr[i];
            }
        }
        System.out.println("Difference: (Sum of evens - Sum of odds) = " + (even_sum - odd_sum));
        sc.close();
    }
}
