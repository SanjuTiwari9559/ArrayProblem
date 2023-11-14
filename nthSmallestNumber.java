class nthSmallestNumber{
public static void nthSmallest(int arr[],int n)
{
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]>arr[j])
{
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
if(i==n-1)
{
System.out.println(n+"th smallest number is"+arr[i]);
break;
}
}
}
public static void main(String args[])
{
int arr[]={1,5,7,3,9,6};
nthSmallest(arr,3);
}
}