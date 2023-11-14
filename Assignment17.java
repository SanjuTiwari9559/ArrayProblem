import java.util.*;
class Assignment17
{
public static void main(String args[])
{
int number=525;
System.out.println("Given number is"+" "+number);
int reverse=0;
while(number>0)
{
int a=number%10;
reverse=reverse*10+a;
number=number/10;
}
System.out.println("Reverse of given number is"+" "+reverse);
number=525;
if(reverse==number)
System.out.println("This is palindrome");
else
System.out.println("This is not palindrome");
}
}
