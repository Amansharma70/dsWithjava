import java.util.Scanner;
public class KthRoot {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        System.out.println("enter trhe test case-----");
        int t=s1.nextInt();
        while(t-->0)
        {
            System.out.println("enter the value of n and K");
            long n=s1.nextLong();
            long k=s1.nextLong();
            System.out.println("the k th rot square root is---" +kroot(n,k));
        }
    
        
    }
    public static long kroot(long n,long k)
    {
        long low=1;
        long high=n;
        long ans=0;
        while(low<=high)
        {
            long mid=low+(high-low)/2;
            if(Math.pow(mid,k)<=n)
            {
                ans=mid;
                low=mid+1;

            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    
}
