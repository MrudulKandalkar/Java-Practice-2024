//wajp to store the fibunnacci series of any terms in an array

import java.util.*; 
class First10FibonacciNumber
{
	static int []arr=new int[10];
	public static void main(String[] args) 
	{
		int fT=0;
		int sT=1;

		for(int i=0;i<10;i++)
		{	
			
			System.out.print(fT+" ");
			arr[i]=fT;
			int nT=fT+sT;
			fT=sT;
			sT=nT;
			
		}
		System.out.print(Arrays.toString(arr));
	}
}
