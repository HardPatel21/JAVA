
/*
8. Count the Frequency of Each Element in an Array
Problem: Write a Java program to count the occurrences of each element in an array.
Sample Input:
arr = {1, 2, 2, 3, 3, 3, 4} 
Sample Output:
1 -> 1 times 
2 -> 2 times 
3 -> 3 times 
4 -> 1 time
*/

import java.util.Scanner;

public class Array_8 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 3, 4 };
        int n = arr.length;
        boolean[] visited = new boolean[n];

        System.out.println("Element Frequencies:");
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            String timeWord = count == 1 ? "time" : "times";
            System.out.println(arr[i] + " -> " + count + " " + timeWord);
        }
    }
}
