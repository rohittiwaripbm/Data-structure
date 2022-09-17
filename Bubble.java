import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {24,56,34,561,344,23,122,12,64,67,9,43,3,213};
        System.out.println(Arrays.toString(Bubble_sort(arr)));

    }
    static int[] Bubble_sort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp =0;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
