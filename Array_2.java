/*
2. Find the Minimum Element in an Array
Problem: Write a Java program to find the smallest element in a given array.
Sample Input:
arr = {5, 8, 2, 17, 1, 9} 
Sample Output:
Minimum element: 1
*/

public class Array_2 {
    public static void main(String[] args){

        int[] arr = {5, 8, 2, 17, 1, 9};
        int min = arr[0];
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i]; 
            }
        }
        System.out.println("Minimum element: " + min);
    }
}
