//wajp to merge arrays into one single array
import java.util.*;
class ArrayMerging
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size Of Array1        : ");
		int size1=sc.nextInt();
		System.out.print("Enter the Numbers of Array1 : ");
		int [] arr1=new int[size1];
		for (int i=0;i<size1;i++)		
		{
				arr1[i]=sc.nextInt();			
			
		}
		System.out.print("Enter Size Of Array2        : ");
		int size2=sc.nextInt();
		System.out.print("Enter the Numbers of Array2 : ");
		int [] arr2=new int[size2];
		for (int i=0;i<size2;i++)		
		{
				arr2[i]=sc.nextInt();			
			
		}
		int [] arr3=new int[size1+size2];
		int j=0;
		for (int i=0;i<arr3.length;i++) 
		{
			if (i<size1) 
			{
				arr3[i]=arr1[i];
				continue;
			}
			arr3[i]=arr2[j++];
		}
		System.out.println("First Array  : " +Arrays.toString(arr1));
		System.out.println("Second Array : " +Arrays.toString(arr2));
		System.out.println("Merged Array : " +Arrays.toString(arr3));


	}
}
