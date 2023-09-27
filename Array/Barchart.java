import java.util.*;
public class Barchart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the elements");
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        int max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }

        for(int floor = max ; floor>=1; floor --) //floor
        for(int i=1;i<arr.length;i++) //building
        {
            if(arr[i]>=floor)
            {
                System.out.print("*\t");
            }
            else{
                System.out.print("\t");
            }
        }
        System.out.println(" ");
    }
}
