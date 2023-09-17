class InsertionSort
{
    public static void main(String[] args) {
        int arr[]={3,6,7,8,54,1,2};
        arr=insertion(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }


    }
    public static int[] insertion(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int item=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>item)
            {
                arr[j+1]=arr[j];
                j--;
            }
            j++;
            arr[j]=item;
        }
        return arr; 

    }
}