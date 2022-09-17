import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, target;
        System.out.println("Enter the size of array");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Elements into array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number you have to find");
        target = sc.nextInt();
        System.out.println();
        // System.out.println(Linear(arr, target));
        if (Linear(arr, target)>0) {
            System.out.println("Value is found on Index " + Linear(arr, target));
        }
        else{
            System.out.println("Value not found");
        }
    }

    static int Linear(int[] arr, int target) {
        if (arr.length == 0) {
            return 0;

        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return -1;

    }
}
