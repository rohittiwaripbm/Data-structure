import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 5, 4 };
        System.out.println("Sorted array is : ");
        System.out.println(Arrays.toString(Sorting(arr)));

    }

    static int[] Sorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // System.out.println("Now Array is : " + Arrays.toString(arr));
                }
            }
        }
        return arr;
    }
}
