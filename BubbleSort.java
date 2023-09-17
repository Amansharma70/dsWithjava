import java.util.Scanner;
public class BubbleSort
{
public static void printArray(int arr[])
{
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]+" ");
}
}

public static void bubbleSort(int a[])
{
    //5
    //int n=a.length;
    int temp;
for( int i=1;i<a.length;i++)
{
for(int j=0;j<a.length-i;j++)
{
if(a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
} 

public static void main(String...a1)
{
    int size;
System.out.println("enter the size of array----");
Scanner s1=new Scanner(System.in);
size=s1.nextInt();
int arr[]=new int[size];

System.out.println("enter the value inside a Array---------");
Scanner s2=new Scanner(System.in);
for(int i=0;i<arr.length;i++)
{
arr[i]=s2.nextInt();
}
System.out.println("Before Sorting-------");
printArray(arr);
bubbleSort(arr);
System.out.println("After Sorting---------");
printArray(arr);
}
}


