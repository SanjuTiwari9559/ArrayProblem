import java.util.*;
class Assignment3b
{
public static void main(String args[])
{
int num=8;
if(num>=0)
{
int factorial=calculation( num);
System.out.println("The factorical of the given number is"+factorial);
}
else
System.out.println("factorial is not possible");
}
public static int calculation(int num)
{
if(num==0)
return 1;
else
if(num==1)
return 1;
else
return num*calculation((num-1));
}
}
 