import java.util.Arrays;

public class Selectioin_sort {
    public static void main(String[] args) {
        int[] arr = { 23, 35, 32, 12, 3, 22, 5, 1, 9 };

        // System.out.println(Sorting(arr));
        System.out.println(Arrays.toString(Sorting(arr)));
    }

    public static int[] Sorting(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
        int min_num = i;
            
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min_num] > arr[j]) {
                    min_num = j;
                    // System.out.println("min nums " + min_num);
                }
            }
            if (arr[i]!=arr[min_num]) {
                int temp = 0;
                temp = arr[i];
                arr[i] = arr[min_num];
                arr[min_num] = temp;
            }
        }

        return arr;

    }
}