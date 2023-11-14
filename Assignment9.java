 import java.util.Scanner;
 class Assignment9
 {
 public static void main(String args[])
 {
 int a;
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the number");
 a=s.nextInt();
 System.out.print("factor of numberi is");
 for(int i=1;i<=a;i++)
 {if(a%i==0)
 {System.out.print(i+"hii");
 }
 }
 }
 }
 


