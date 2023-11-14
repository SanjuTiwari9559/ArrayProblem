import java.util.*;
class arrangeZeroAndOneAndTwo{
 public static void arrange(int []arr){
  int zeroCounter=0;
  int oneCounter=0;
  for(int i=0;i<arr.length;i++)
  {
  if(arr[i]==0)
  {
  zeroCounter++;
  }
  else if(arr[i]==1){
  oneCounter++;
  }
  }
   for(int i=0;i<zeroCounter;i++)
   {
   arr[i]=0;
   }
   for(int i=zeroCounter;i<(zeroCounter+oneCounter);i++)
   {
   arr[i]=1;
   }
   for(int i=(zeroCounter+oneCounter);i<arr.length;i++)
   {
   arr[i]=2;
   }
  /* for(int i:arr)
   {
   System.out.print(i+" ");
   }
   }
   */
   System.out.println(Arrays.toString(arr));
}
 
public static void main(String args[])
{
int arr[]={1,0,2,0,1,0,2,1};
  arrange(arr);
}
}