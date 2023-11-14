import java.util.Scanner;
class FindAllFactor{
public static void FindFactor(int number)
{
System.out.print("Factor of "+number +" "+"are");
for(int i=1;i<=number;i++)
{
if(number%i==0)
{
System.out.print(i+",");
}
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
FindFactor(number);
}
}
