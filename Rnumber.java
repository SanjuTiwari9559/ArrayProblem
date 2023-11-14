//Write the code for reverse the number
/*class Rnumber{
public static void main(String args[])
{
int num=569;
int rev=0;
while(num!=0)
{
rev=rev*10+num%10;
num=num/10;
}
System.out.println("Reverse Number is"+rev);
}
}
*/
//Write the code for reverse the string 
/*class Rnumber {
	public static void main(String args[])
	{
		String str="SANJAY";
		String rev="";
		int n= str.length();
		for(int i=n-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse the String"+rev);
	}
}
*/
//Write the code for reverse the string by using char Array method
/*class Rnumber {
	public static void main(String args[])
	{
		String str="ABND";
	   char [] arr=str.toCharArray();
	   int n =arr.length;
	   String str1="";
	   for(int i=n-1;i>=0;i--)
	   {
		   str1=str1+arr[i];
	   }
	   System.out.println("Reverse the string"+str1);
	}
}*/
/*always take care that length for finding the length of arr and length() is use for finding the length of string */
//write the code for checking prime number or not
/*class Rnumber{
	public static void main(String args[])
	{
		int n=856;
		boolean b=false;
		for(int i=2;i<856;i++)
		{
			if(n%i==0)
			{
				b=true;
			}
		}
		if(b==true)
		{
			System.out.println("Number is prime");
			
		}
		else
		System.out.println("Number is not prime");
	}
}*/
//Write the code for swap two number without using third variable
import java.util.*;
class Rnumber {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of a & b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before swaping a="+" "+a+"and b="+" "+b);
		 a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping a="+a+"and b is="+b);
	}
}
		
	