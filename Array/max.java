public class max {
    static int  max(int arr [])
    {
        int maxVal = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if ( arr[i] > maxVal)
            {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,33,4,5,6,7};
        System.out.println(max(arr));
    }
}
