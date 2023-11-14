import java.util.*;
class GCD
{
public static void main (String args[])
{
int a=32,b=40,hcf=0;
 for(int i=1;i<=32;i++)
 {
 if (a%i==0&&b%i==0)
 hcf=i;
 }
System.out.println("HCF equal"+hcf);
}
}