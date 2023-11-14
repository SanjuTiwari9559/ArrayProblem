import java.util.*;
class GCD2
{
public static void main(String args[])
{
int a=40,b=32;
while(a!=b)
{
if (a>b)
{
a=(a-b);
}
else
b=a-b;
}
System.out.println("HCF will be "+b);
}
}