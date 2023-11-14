class PrintOneToTen{
public static void Print(int i)
{
if(i<=10){
System.out.print(i);
Print(i+1);
}
}
public static void main(String args[])
{
Print(1);
}
}
