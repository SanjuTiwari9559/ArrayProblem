import java.util.Scanner;
class Assignment6
{
public static void main(String args[])
{
int a;
Scanner s=new Scanner(System.in);
System.out.println("Enter year");
a=s.nextInt();
if(a%4==0)
{System.out.println("Year is leap");
}
else
{
System.out.println("Year is normal");
}
}
}