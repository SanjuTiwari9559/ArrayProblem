class Assignment13 
{
public static void main(String args[])
{
int a=5252, reverse=0;
while(a!=0)
{
int remainder=a%10;
reverse=reverse*10+remainder;
a=a/10;
}
System.out.println("Reverse of given number is"+  reverse);
}
}
