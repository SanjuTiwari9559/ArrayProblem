class segrigateZero{
public static int[] segrigateAllZero(int []arr)
{
int count=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]==0)
{
arr[count++]=arr[i];
}
}
while(count<arr.length)
{
arr[count++]=1;
}
return arr;
}

public static void main(String args[])
{
int [] arr={0,1,0,1,0};
int [] arr2=segrigateAllZero(arr);
for(int item :arr2){
System.out.print(item+",");
}
}
}