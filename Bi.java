import java.util.Scanner;

public class Bi {
    public static void main(String[] args) {
        int[] arr = {23,24,25,26,27,28,29,30};
        Scanner sc = new Scanner(System.in);
        int target;
        System.out.println("Enter element to search");
        target = sc.nextInt();
        System.out.println("Number is present at index :  " + Binary_search(arr, target));

    }
    static int Binary_search(int[] arr, int target)
    {
        int start_index = 0;
        int end_index = arr.length-1;
        int mid_index;
        while (start_index<=end_index) {
            mid_index = (start_index+end_index)/2;
            if (target == arr[mid_index]) {
                return mid_index;
            }
            else if (target<arr[mid_index]) {
                end_index = mid_index-1;
                
            }
            else{
                start_index = mid_index+1;
            }
            
        }

        return -1;
    }
}
