import java.util.Scanner;
class CheckLeapYear{
public static void CheckYear(int number)
{
if(((number%4)==0 && (number%100)!=0 )|| (number%400)==0){
System.out.println("This year "+number +"Is leapYear");
}
else
System.out.println("This is not a leapYear");
}

public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int number=sc.nextInt();
CheckYear(number);

}
}
