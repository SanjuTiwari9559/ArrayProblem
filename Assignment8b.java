import java.util.Scanner;
class Assignment8b
{
public static void main(String args[])
{
int number,m,n,count=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter number");
number=s.nextInt();
m=number;
while(number>=0)
{
number=number/10;
count++;
}
while(m>0)
{
 n=m%10;
System.out.println("Digit at place"+count+"is:"+n);
m=m/10;
count--;
}
}
}
