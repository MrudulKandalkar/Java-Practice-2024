import java.util.*;

class ArrayValueFetchLoops
{
	public static void main(String[] args) 
	{
		int  arr [] = {10,20,30,40};


		System.out.print("For Loop     : ");
		for (int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.print("While Loop   : ");
		int i=0;
		while(i<=arr.length-1)
		{
			System.out.print(arr[i++] + " ");
		}
		System.out.println();

		System.out.print("DoWhile Loop : ");

		int j=0;
		do
		{
			System.out.print(arr[j++] + " ");

		}while(j<arr.length);
		System.out.println();

		System.out.print("ForEach Loop : ");
		for(int k:arr)
		{
			System.out.print(k +" ");
		}


	}
}