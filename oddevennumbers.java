import java.util.*;
class oddeven
{
public static void main(String arg[])
{
int a;
System.out.println("enter the number");
Scanner s=new Scanner(System.in);
a=s.nextInt();
if(a>0)
{
if(a%2==0)
{
System.out.println(a+"is even");
}
else
{
System.out.println(a+"is odd");
}}
else
{
System.out.println(a+"is invalid");
}
}
}
