// write the code for printing the  even and odd number from the given Array
/*class EvenOdd{
public static void main(String args[])
{
 int []arr={5,10,12,15,25};
 for(int i=0;i<arr.length;i++)
 {
 if(arr[i]%2==0)
 {
 System.out.println(arr[i]+" "+"Number is even");
 }
 else
 {
 System.out.println(arr[i]+" "+"Number is odd");
 }
 }
 }
 }
 */
 //Write the code for finding the missing number from the range of the array
 /*class EvenOdd{
	 public static void main(String args[])
	 {
		 int [] arr1={1,2,3,4,5,7,8,9,10};
		 int sum=0;
		 for(int i=0;i<arr1.length;i++)
		 {
			 sum=sum+arr1[i];
		 }
		 System.out.println("Sum of given array"+sum);
		  int sum1=0;
		  for(int i=1;i<=10;i++)
		  {
			  sum1=sum1+i;
		  }
		  System.out.println("Missing number is"+" "+(sum1-sum));
	 }
	 
 
 */
 /*class EvenOdd{
	 public static void main(String args[])
	 {
		 int [] arr2={1,2,3,4,6,7,8,9,10};
		 for(int i=0;i<=arr2.length;i++)
		 {
			 if(arr2[i]==(i+1))
			 {
				 break;
			 }
			 else
			 {
				 System.out.println("Missing element is"+(i+1));
				 continue;
			 }
		 }
	 }
 }
 */
  //write the code for finding duplicate from a given array
  /*class EvenOdd{
	  public static void main(String args[])
	  {
		  int [] arr={10,52,45,58,85,45};
		  int n=arr.length;
		  boolean b= false;
		  for(int i=0;i<n;i++)
		  {
			  for(int j=i+1;j<n;j++)
			  {
				  if(arr[i]==arr[j])
				  {
					 b=true;
				  }
			  }
		  }
			  if(b==true)
				  System.out.println("Dublicate found");
			   else
				   System.out.println("Dublicate not found");
		  }
	  }
	  */
	  //Check the array equal or not 
	  import java.util.Arrays;
	  class evenOdd{
		  public static void main(String args[])
		  {
			  int[] arr1={1,5,6,7,8};
			    Arrays.sort(arr1);
			  int[] arr2={1,6,5,8,7};
		         Arrays.sort(arr2);
			   boolean b=Arrays.equals(arr1,arr2);
			   if(b==true)
			System.out.println("Equal array");
		else
			System.out.println("Not equal Array");
		  }
	  }
			   
	   
  
	
				  
		 
 