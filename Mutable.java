import java.util.Arrays;

//Mutability :-  Changing the values of integer array;
public class Mutable {
    static void Change(int num[])
    {
        num[0] = 23;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,3,22};
        String number = Arrays.toString(arr);
        System.out.println(number);
        Change(arr);
        System.out.println(Arrays.toString(arr));

    }
}
