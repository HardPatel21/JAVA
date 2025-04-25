import java.util.Scanner;

public class Array_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int diff;
        int even_sum = 0;
        int odd_sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even_sum += arr[i];
            } else {
                odd_sum += arr[i];
            }
        }
        diff = even_sum - odd_sum;
        System.out.println("Difference: Even sum - Odd sum: " + diff);
    }
}
