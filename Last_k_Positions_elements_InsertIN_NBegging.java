class Last_k_Positions_elements_InsertIN_NBegging
{
    public static void RotataeArray(int arr[],int k)
    {
        k=k % arr.length;
        int n=arr.length;
        reverse(arr,0,n-1);//reverse Hole array----
        reverse(arr,0,k-1);//reverse starting K elements-----
        reverse(arr,k,n-1);

    }
    public static void reverse(int arr[],int i,int j)
    {
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
        }

    }
    public static void main(String...a1)
    {
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        RotataeArray(arr, k);
       for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+"");
        } 
    }
}