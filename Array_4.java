/*
4. Count Even and Odd Numbers in an Array
Problem: Write a Java program to count the number of even and odd elements in an array.
Sample Input:
arr = {10, 21, 30, 41, 50} 
Sample Output:
Even count: 3, Odd count: 2
*/
import java.util.Scanner;

public class Array_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int even_count = 0;
        int odd_count = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr["+i+"]: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                even_count++;
            }
            else{
                odd_count++;
            }
        }
        System.out.println("Even count: " + even_count);
        System.out.println("Odd count: " + odd_count);
        sc.close();
    }
}
