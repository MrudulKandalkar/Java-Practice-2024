//WAJP to get sum and product in single  dimension Array
import java.util.*;
class SumProdArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Array Size : ");
		int size=sc.nextInt();
		System.out.print("Enter Array Elemnets : ");
		int [] arr=new int[size];

		int sum=0;
		int prod=1;

		for (int i=0;i<size;i++) 
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
			prod=prod*arr[i];
		}
		System.out.println("Sum     : "+sum);
		System.out.println("Product : "+ prod);
	}
}