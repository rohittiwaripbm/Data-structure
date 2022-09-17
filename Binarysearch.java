import java.util.Scanner;

public class Binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int search = 1;
        System.out.println("enter a number to search");
        search = sc.nextInt();
        int start_node = 0, end_node = arr.length-1;
        // System.out.println("Searched value is present on Index : " + Binary_search(arr, start_node, end_node, search));
        // System.out.println("The number is " + search);
        System.out.println("The searched number is present on index : " + Binary_search(arr, start_node, end_node, search));
        sc.close();
    }
    static int Binary_search(int[] arr, int start_node, int end_node, int search)
    {
        int mid_node;
        while(start_node<=end_node)
        {
            mid_node = (start_node+end_node)/2;
            if (arr[mid_node] ==  search) {
                // System.out.println(arr[mid_node]);
                return mid_node;
            }
            if (search<arr[mid_node]) {
                end_node = mid_node-1;
                // System.out.println(start_node+" End node is : "+end_node);
            }
            else{
                start_node = mid_node+1;
                // System.out.println("Start node is : "+start_node);
            }

        }
        return -1;
    }
}
