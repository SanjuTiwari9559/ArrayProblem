class nthLargestNumber{
public static void nthLargest(int arr[],int n){
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]<arr[j])
{
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
if(i==n-1)
{
System.out.println("nth Largest number is"+arr[i]);
break ;
}
}
}


public static void main(String args[])
{
int[] arr={1,5,7,9,6,10};
nthLargest(arr,3);
}
}