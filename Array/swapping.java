import java.util.Arrays;

public class swapping {
    static void swap(int arr[], int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    public static void main(String[] args) {
        int arr [] = {1,4,3,2,5,};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }
}
