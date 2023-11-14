import java.util.*;
class removeDublicateBySet{
public static void removeDublicate(int arr[]){
Set<Integer> set=new HashSet<>();
for(int i=0;i<arr.length;i++)
{
set.add(arr[i]);
}
set.forEach((element)->System.out.print(Arrays.toString(element)));
}

public static void main(String args[])
{
int arr[]={1,2,3,1,2,3,5};
 removeDublicate(arr);
}
}