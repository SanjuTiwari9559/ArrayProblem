import java.util.*;
class pairSum{
public static List<List<Integer>> pairSumResult(int [] arr,int n)
{
List<List<Integer>> list=new ArrayList<>();

for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]+arr[j]==n)
{
	List<Integer> list1=new ArrayList<>();
list1.add(arr[i]);
list1.add(arr[j]);
list.add(list1);
}
}
}
return list;
}

public static void main(String args[])
{
int arr[]={1,2,3,7,5,8};
List<List<Integer>> list3= pairSumResult(arr,8);
System.out.println(list3);

  }
  }