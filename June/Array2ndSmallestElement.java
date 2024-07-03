//wajp to fetch 2nd smallest element in the array
import java.util.*;

class Array2ndSmallestElement
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int size=sc.nextInt();
		int [] arr = new int[size];
		System.out.print("Enter the Values in Array : ");
		for (int i=0;i<size;i++) 
		{
			arr[i]=sc.nextInt();
		}
		int temp=0;
		int sencondSmallest;
		for (int i=0;i<arr.length;i++) 
		{
			for (int j=i+1;j<size;j++) 
			{
				if (arr[i]>arr[j]) 
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;							
				}
							
			}	
		}
		System.out.println(Arrays.toString(arr));

		sencondSmallest=arr[1];
		System.out.println(sencondSmallest);

	}
}