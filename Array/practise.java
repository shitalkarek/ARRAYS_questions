
import java.util.*;
public class practise{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        int n=sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
 int sum=0;
        for(int i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        int arrsum=0;
        for(int i=0;i<n;i++)
        {
            arrsum+=arr[i];
        }
        System.out.println(sum-arrsum);
    }
}
