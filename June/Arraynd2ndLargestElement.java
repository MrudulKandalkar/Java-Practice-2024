//wajp to fetch 2nd largest element in the array
import java.util.*;
class Arraynd2ndLargestElement
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int size=sc.nextInt();
		System.out.print("Enter the values in Array :");
		int [] arr = new int[size];
		for (int i=0;i<size;i++) 
		{
			arr[i]= sc.nextInt();
		}
		int temp=0;
		for (int i=0;i<size;i++) 
		{
			for (int j=i+1;j<size ;j++) 
			{
				if (arr[i]<arr[j]) 
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int largest2nd=arr[1];

	   System.out.println(Arrays.toString(arr));
	   System.out.print("Second Largest In Array is : "+ largest2nd);

	}
}