import java.util.*;
public class input_output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // input

        int arr [] [] = new int [3][3];

        for(int row = 0  ; row<arr.length;  row++)
        {
            for(int col = 0 ; col<arr[row].length; col++)
            {
                arr[row][col] =  sc.nextInt();
            }
        }


        // output

        //  for(int row = 0  ; row<arr.length;  row++)
        // {
        //     for(int col = 0 ; col<arr[row].length; col++)
        //     {
        //         System.out.print(arr[row][col] + " ");
         
        //     }
        //     System.out.println();
        // }

        for(int row = 0 ; row<arr.length; row++)
            {
                System.out.println(Arrays.toString(arr[row]));
            }
        

    }
}
