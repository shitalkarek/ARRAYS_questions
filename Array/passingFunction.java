import java.util.Arrays;

public class passingFunction {

    static void change(int arr [])
    {
        arr[0] = 2002;
    }
    public static void main(String[] args) {
        int num [] = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(num));

        change(num);
        System.out.println(Arrays.toString(num));


    }
}
