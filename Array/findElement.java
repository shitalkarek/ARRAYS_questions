import java.util.Scanner;

public class findElement {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array size");
    int n = sc.nextInt();

    int arr[] = new int[n];

    for(int i = 0 ; i < arr.length;i++)
    {
        arr[i] = sc.nextInt();
    }

    System.out.println("enter the data to search ");
    int data = sc.nextInt();
    int index=-1;

    for(int i =0; i <arr.length;i++)
    {
        if(arr[i] == data)
        {
            index=i;
            break;
        }
    }
    System.out.println(index);
   } 
}
