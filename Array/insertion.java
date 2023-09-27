import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        
        int a[] = new int[10];
        a[0]=5;
        a[1]=9;
        a[2]=6;
        a[3]=10;
        a[4]=12;
        a[5]=7;

        int n =6;
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i] + " ,");
            System.out.println(" ");
        }
        int x=20;
        int index =2;

        for(int i=n;i>index;i--)
        {
            a[i]=a[i-1];
            a[index] = x;
        }
       System.out.println(Arrays.toString(a));
       
    }
}
