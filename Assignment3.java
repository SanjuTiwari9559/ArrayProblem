 import java.util.*;
 class Assignment3
{
public static void main(String args[])
{
int num1, num2;
Scanner sc=new Scanner(System.in);
num1=sc.nextInt();
num2=sc.nextInt();
int c=(num1>num2)?(num1+num2):(num1-num2);
System.out.println(c);
}
}


