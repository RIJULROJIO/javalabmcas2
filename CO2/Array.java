import java.util.Scanner;
public class Array
{
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the size of the array:");
	 int l=sc.nextInt();
	 	 int arr[]=new int[l];

	 int i;
	 System.out.println("Enter the elements into the array:");
	 for(i=0;i<arr.length;i++)
	 {
		 arr[i]=sc.nextInt();
	 }
	 System.out.println("The array elements are:");
	 for(i=0;i<arr.length;i++)
	 {
		 System.out.println(arr[i]);
	 }
	 
	 System.out.println("Enter the array element to be searched:");
	 int val=sc.nextInt();
	 for(i=0;i<arr.length;i++)
	 {
		 if(arr[i]==val)
		 {
		 System.out.println("The element is found at:"+i+" position");
		 break;
		 }
	 }
	 int max=arr[i];
	  for ( i = 0; i < arr.length; i++) {  
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element in the  given array: " + max);  
    }  
}  
