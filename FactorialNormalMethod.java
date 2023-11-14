import java.util.Scanner;
class FactorialNormalMethod{
 static int temp=1;
public static void Factorial(int n)
{
	if(n>=0)
	{
for(int i=1;i<=n;i++)
{
temp=temp*i;
}
}
else 
	System.out.println("Please Enter Positive Integer value");
}

public static void main(String args[])
{
	Scanner Sc=new Scanner(System.in);
	int i=0 ;
	try {
	 i=Sc.nextInt();
	}
	catch(Exception e)
	{
		System.out.println("Plese Enter integer value");
	}
	Factorial(i);
//Factorial(10);
System.out.println(temp);
}
}
