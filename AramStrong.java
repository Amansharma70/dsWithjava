import java.util.Scanner;
class Aramstrong
{
public static void main(String...a1)
{ int a,x,y,z,num;
Scanner s1=new Scanner(System.in);
System.out.println("Enter three digit Number");
a=s1.nextInt();
x=a/100;
y=a/10%10;
z=a%10;
x=x*x*x;           
y=y*y*y;
z=z*z*z;
num=x+y+z;
if(a==num)
{
System.out.println("number is ArmStrong");
}
else
{
System.out.println("number is not ArmStrong");
}
}
}