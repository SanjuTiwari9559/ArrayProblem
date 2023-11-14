import java.util.*;
class removeDublicate{
public static void removeDublicateElement(int arr[])
{
Map<Integer,Integer> map=new HashMap<>();
for(int i=0;i<arr.length;i++)
{
if(map.containsKey(arr[i]))
{
map.put(arr[i],map.get(arr[i])+1);
}
else
map.put(arr[i],1);
}
map.forEach((k,v)->System.out.println(k+" "+v));
}
public static void main(String args[])
{
int [] arr={1,2,3,1,2,5,7};
removeDublicateElement(arr);
}
}
