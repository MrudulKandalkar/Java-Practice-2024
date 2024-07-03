//wajp to store first ten prime numbers in a new array
import java.util.*;
class First10PrimeNumberArray
{
	public static void main(String[] args) 
	{
		int count=0;
		int []arr=new int[10];
		for (int i=1;i<100;i++ ) 
		{
			if (isPrime(i)&&count<10) 
			{
				//System.out.println(i);
				arr[count]=i;
				count++;

			}
		}
		System.out.println(Arrays.toString(arr));


	}
	public static boolean isPrime(int num)
	{
		if (num<=1) 
		{
			return false;
		}
		for (int i=2;i<num;i++) 
		{
			if (num%i==0) 
			{
				return false;
			}
		}
		return true;
	}
}