//wajp to store even and odd element in two different arrays 
import java.util.*;
class EvenOddArrayStoring
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size Of Array        : ");
		int size=sc.nextInt();
		System.out.print("Enter the Numbers of Array : ");

		int [] arr=new int[size];
		for (int i=0;i<size;i++)		
		{
				arr[i]=sc.nextInt();			
			
		}

		 int evenCount=0;
		 int oddCount=0;
		 for (int i=0;i<size;i++) 
		 {
		 	if (arr[i]%2==0) 
		 	{
		 		evenCount++;
		 	}
		 	else 
		 	{
		 		oddCount++;
		 	}
		 }

		 int evenArray[]=new int[evenCount];
		 int oddArray[]=new int[oddCount];
		 int itt1=0;
		 int itt2=0;
		  for (int i=0;i<size;i++) 
		 {
		 	if (arr[i]%2==0) 
		 	{
		 		evenArray[itt1++]=arr[i];
		 	}
		 	else 
		 	{
		 		oddArray[itt2++]=arr[i];
		 		
		 	}
		 }
			System.out.println("Even Array: " +Arrays.toString(evenArray));
			System.out.println("Odd Array : "+ Arrays.toString(oddArray));


	}
}