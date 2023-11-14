import java.util.*;
class collectZeroByCollection{
public static void collectZero(int arr[])
{
List<Integer> list1=new ArrayList<>();
List<Integer> list2=new ArrayList<>();
for(int i=0;i<arr.length;i++)
{
if(arr[i]==0)
{
list1.add(arr[i]);
}
else
list2.add(arr[i]);
}
list1.addAll(list2);
for(int i:list1)
{
System.out.print(i+",");
}
}
public static void main(String ags[])
{
int arr[]={1,0,1,0,1,0,0};
collectZero(arr);
}
}