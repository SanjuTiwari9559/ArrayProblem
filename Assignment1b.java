import java.util.Scanner;
class Assignment1b
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
n=s.nextInt();
String check=(n%2==0)?"true":"false";
System.out.println("The number is"+check);
}
}
