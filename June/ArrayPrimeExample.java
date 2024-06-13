import java.util.*;
class ArrayPrimeExample
{
	public static void main(String[] args) 
	{
		int [] arr={2,3,4,5,6,7,8,9,10,11,12,13,14};
		int count =0;		
		for (int i : arr ) 
		{
			if (isPrime(i)) 
			{
				count++;	
			}
		}
		int [] primeNumber=new int[count];
		int indx=0;
		for (int i : arr) 
		{
			if(isPrime(i))
			{
				 primeNumber[indx++] = i;
			}
		}
		System.out.println(Arrays.toString(primeNumber));
		System.out.println("Total Prime Number In Array : " + count);
	}
	public static boolean isPrime(int num)
	{
		if(num<=1)
			return false;
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