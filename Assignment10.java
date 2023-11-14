import java.util.*;
class Assignment10
{
public static void main(String args[])
{
int n,sum=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
n=s.nextInt();
while(n>0)
{
 int m=n%10;
 sum=sum+m;
 n=n/10;
 }
 System.out.println("The sum of Digite is"+sum);
 }
 }

