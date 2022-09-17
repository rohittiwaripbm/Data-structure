import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        // int[] arr = {13,45,56,57,64,67};
        int[]arr = {67,64,57,56,45,13};
        Scanner sc = new Scanner(System.in);
        int target;
        System.out.println("Enter number to search");
        target = sc.nextInt();
        if (arr[0]<arr[arr.length-1]) {
        System.out.println("Number is present at " + Asc_binary_search(arr, target));
            
        }
        else{
        System.out.println("Number is present at " + des_binary_search(arr, target));

        }
        sc.close();
    }
    static int Asc_binary_search(int[] arr, int target)
    {
        int start_node = 0;
        int end_node = arr.length-1;
        int mid_node;
        while (start_node<=end_node) {
            mid_node = (start_node+end_node)/2;
            if (arr[mid_node] ==  target) {
                return mid_node;
                
            }
            else if(arr[mid_node] < target)
            {
                start_node = mid_node+1;

            }
            else
            {
                end_node = mid_node-1;

            }
        }

        return -1;
    }
    static int des_binary_search(int[] arr, int target)
    {
        int start_node = 0;
        int end_node =  arr.length-1;
        int mid_node;
        // System.out.println("Comming");
        while(start_node<=end_node)
        {
            mid_node = (start_node+end_node)/2;
            if (target ==  arr[mid_node]) {
                return mid_node;
                
            }
            else if(target<arr[mid_node])
            {
                start_node = mid_node+1;
            }
            else 
            {
                end_node = mid_node-1;
            }
        }
        return -1;
    }
}
