import java.util.Scanner;
public class Array_9 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
       
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter arr["+i+"]: ");
                arr[i] = sc.nextInt();
            }

            for(int i = 0; i < arr.length; i++){
                sum += arr[i];
            }

            System.out.println("sum of array's elements are: " + sum);
    }
}
