import java.util.*;
class AddSub
{
public static void main(String args[])
{
int num1,num2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the num1 and num2");
num1=sc.nextInt();
num2=sc.nextInt();
int s=(num1>num2)?num1+num2:num2-num1;
System.out.println(s);
}
}