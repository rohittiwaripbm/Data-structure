import java.util.*;
import java.util.Arrays;

class arraytostring
{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        float num = 12.4f;
        System.out.println(Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        String str[] = new String[5];
        // int arr3[5] = new int[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }
        System.out.println();
        
        for(String name : str)
        {
            System.out.println(name);
        }
        System.out.println(Arrays.toString(str));
        sc.close();
    }

}