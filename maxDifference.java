class maxDifference{
public static void difference(int []arr)
{
for(int i=0;i<arr.length;i++)
{
int arr1[];
for(int j=i+1;j<arr.length;j++)
{
 arr1=arr[j]-arr[i];
}
System.out.print(Arrays.toString(arr1));
}
}
public static void main(String args[])
{
int arr[]={1,5,7,3,6,9};
difference(arr);
}
}