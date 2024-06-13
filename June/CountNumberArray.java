import java.util.*;

class CountNumberArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size : ");

		int size=sc.nextInt();
		int [] arr=new int[size];
		System.out.print("Enter the Values : ");
		for (int i=0;i<size ;i++ ) 
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the number to get the count of it : ");
		int num=sc.nextInt();

		int count=0;

		for (int i=0;i<size;i++) 
		{
			if (arr[i]==num) 
			{
				count++;
			}
		}
		System.out.println("Count of Number repeated is : "+ count);
	}
}