public class maxInRange {
    static int max(int arr[], int start,int end)
    {
        int maxVal=arr[start];

        for(int i=start; i<end; i++)
        {
            if(arr[i]>maxVal)
            {
                maxVal=arr[i];
            }
        }
        return maxVal;
    }


    public static void main(String[] args) {
        int arr[]={1,3,44,5,6,77,8};
        System.out.println(max(arr, 2, 6));
    }
}
