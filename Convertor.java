import java.util.*;
class Convertor
{public static void main(String args[])
{
double d;
Scanner s=new Scanner(System.in);
System.out.println("Enter the celcius temp");
d=s.nextDouble();
double c=d*9/5+32;
System.out.println(c);
}
}
