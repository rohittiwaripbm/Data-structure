import java.util.Arrays;


public class Insertion {
    public static void main(String[] args) {
        int[] arr = {12,1,4,34,55,5,64,35};
        // System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(Sort(arr)));
    }
    public static int[] Sort(int[] arr)
    {
        System.out.println("Initial array " + Arrays.toString(arr));
        System.out.println();
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if(arr[j]<arr[j-1])
                {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
               System.out.println("Now the array is : " + Arrays.toString(arr));

                }
                else{
                    break;
                }
            }
        }
 
        return arr;
    }
}
