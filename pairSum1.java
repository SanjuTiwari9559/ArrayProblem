import java.util.*;
class pairSum1{
public static List<List<Integer>> pairSum(int[] arr,int n)
{
List<List<Integer>> list=new ArrayList<>();
Set<Integer> set=new HashSet<>();
for(int i=0;i<arr.length;i++)
{
 int complement=n-arr[i]; 
if(set.contains(complement)){
List<Integer> list1=new ArrayList<>();
list1.add(arr[i]);
list1.add(complement);
list.add(list1);
}
set.add(arr[i]);
}
return list;
}

public static void main(String args[])
{
int arr[]={1,2,3,7,5,8};
 List<List<Integer>>pair5 =pairSum(arr,8);
 System.out.print(pair5);
 }
 }