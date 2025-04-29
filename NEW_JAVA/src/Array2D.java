import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][2];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter the arr["+i+"]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] % 2 == 1){
                    arr[i][j] = 0;
                }
            }
        }

        System.out.print("Final Array : { ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0 ; j < arr[i].length; j++){
                System.out.print(arr[i][j] + ", ");
            }
        }
        System.out.println("\b\b }");
    }
}

