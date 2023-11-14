import java.util.*;
 class Compound
{
public static void main(String args[])
{
long LA=50000000;
int n=5;
double r=10.75;
double CA=LA*(Math.pow((1+r/100),n));
System.out.println("Compound interest will be after 5 year"+ CA);
}
}