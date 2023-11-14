import java.util.*;
class sumofdigit
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number between 10 to 1000");
int n=sc.nextInt();
int sum=0;
if(n>10&&n<1000)
{
while(n!=0)
{int m=n%10;
sum=sum+m;
n=n/10;
}
System.out.println(sum);
}
else
	System.out.println("we can not calculate sum");
}
}



