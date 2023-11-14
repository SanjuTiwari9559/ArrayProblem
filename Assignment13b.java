import java.util.*;
class Assignment13b
{
public static void main(String args[])
{
int a,reverse=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number that u want to Reverse");
a=sc.nextInt();
if(a!=0)
{
int remainder=a%10;
reverse=reverse*10+remainder;
a=a/10;
}
else
System.out.println("Reverse of "+ a+ "is"+reverse);
}
}