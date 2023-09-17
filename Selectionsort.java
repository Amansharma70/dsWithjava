import java.util.Scanner;
public class Selectionsort {

public static void print(int arr[],int size)
{
for(int i=0;i<size;i++)
{
System.out.println(arr[i]+"");
}
}
public static void selection(int arr[],int n)
{
int temp,index;
for(int i=0;i<=n-1;i++)
{ 
index=i;
for(int j=i+1;j<n;j++)
{
if(arr[j]<arr[index])
{
index=j;
}
}
temp=arr[i];
arr[i]=arr[index];
arr[index]=temp;
}
}




public static void main(String...a1)
    {
        int arr[]=new int[100];
      
      int size,element;
      System.out.println("Enter the size of array...????");
      Scanner s=new Scanner(System.in);
    size=s.nextInt();
    System.out.println("Okie!!!!!... now you enter the value inside the array----");

    Scanner s1=new  Scanner(System.in);
for(int i=0;i<size;i++)
{
arr[i]=s1.nextInt();
}
        System.out.println("before selection sort");

print(arr,size);

        
        selection(arr,size);
        System.out.println("After selection sort");

       
print(arr,size);



    }
    
}
