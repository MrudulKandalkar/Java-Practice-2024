//wajp to sort the the elemets in asending order

import java.util.*;

class AsendingArraySort
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size of Array : ");
		int size =sc.nextInt();
		int [] arr =new int[size];
		System.out.print("Enter the Values : ");
		for (int i=0;i<size ;i++ ) 
		{
			arr[i]=sc.nextInt();
		}
		int temp=0;
		for (int i=0;i<size;i++) 
		{
			for (int j=i+1;j<size ;j++) 
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
	}
}