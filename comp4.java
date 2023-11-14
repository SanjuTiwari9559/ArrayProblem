 import java.util.*;
 class comp4
{


public static void main(String args[])
{
int Dist;
double hour;
double min;
double sec;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the distance");
Dist=sc.nextInt();
System.out.println("Enter the time in hour");
hour=sc.nextInt();
double d=(double)((Dist)/(hour*60*60));
System.out.println("Speed in m/s"+d);
/*System.out.println("Enter the time in min");
min=sc.nextInt();
double e=(Dist*60) / (min*1000);
System.out.println("Speed in km/hr"+e);
System.out.println("Enter the time in sec");
sec=sc.nextInt();
double f=(Dist*60) / (sec*1609);
System.out.println("Speed in mile/hr"+f);*/
}
}


