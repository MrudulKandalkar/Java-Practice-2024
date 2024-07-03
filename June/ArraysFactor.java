//wajp to fetch all the factors in an array
//wajp to find the factors of a number and store all the all the factor in an array
import java.util.*;
class ArraysFactor

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num=sc.nextInt();
		int count=0;
		for (int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		int []arr=new int[count];
		int itt=0;
		for (int j=1;j<num ;j++) 
		{
			if (num%j==0) 
			{
				arr[itt++]=j;
			}
		}
		System.out.println(Arrays.toString(arr));


	}
}