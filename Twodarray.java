
import java.util.Scanner;

public class Twodarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 3;
        int column = 3;

        int two_d_array[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter element at array["+i+"]["+j+"]   ");
                two_d_array[i][j] = sc.nextInt();
            }

        }
        System.out.println();
        System.out.println();
        // printing array;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                // System.out.println("at arr["+i+"]["+j+ "]"+two_d_array[i][j]);
                // System.out.print(" " + two_d_array[i][j]);
            }
            System.out.println();

        }

        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(" " + two_d_array[i][j]);

            }
        }
        // int arr2[][] = {
        //     {1,2,3},
        //     {3,4},
        //     {2,3,4,5}
        // };
        sc.close();

    }
}
