import java.util.*;
class arrayOfArray{
public static void main(String args[])
{
List<List<Integer>>list=new ArrayList<>();
List<Integer> list1=new ArrayList<>();
list1.add(5);
list1.add(10);
list.add(list1);
System.out.println(list);
 /*for( List<Integer> l:list)
 {
   System.out.println(l);
   }*/
   }
   }