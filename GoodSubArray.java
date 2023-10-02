import java.util.Scanner;
class GoodSubArray
{
    public static void main(String...a1)
    {
        Scanner s1= new Scanner(System.in);
       // int t=s1.nextInt();
       System.out.println("enter the size of array----");
        
            int n=s1.nextInt();
            int arr[]=new int[n];
            System.out.println("enter the elements inside the array------");
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=s1.nextInt();

            }
            System.out.println(GoodSubArray1(arr));
        }
    
    public static long GoodSubArray1(int arr[])

    {
        int n=arr.length;
        int sum=0;
        long frq[]=new long[n];
        frq[0]=1;
        for(int i=0;i<frq.length;i++)
        {
            sum+=arr[i];
            sum=sum%n;
            if(sum<0)
            {
               sum=sum+n;
            }
            frq[sum]=frq[sum]+1;
        }
        long ans=0;
         for(int i=0;i<frq.length;i++)
            {
            if(frq[i]>=2)
            {
                ans=ans+(frq[i]*(frq[i]-1))/2;
            }
        }
             return ans;


}

}