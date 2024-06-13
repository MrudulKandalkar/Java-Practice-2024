import java.util.*;
class TwodArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number of Rows    :");
		int rows=sc.nextInt();
		System.out.print("Enter the Number of Column  :");
		int cols=sc.nextInt();

		int [][]arr=new int[rows][cols];
		for (int i=0;i<rows;i++) 
		{
			for (int j=0;j<cols;j++) 
			{
				arr[i][j]=sc.nextInt();			
			}	
		}
		for (int i=0;i<rows;i++) 
		{
			for (int j=0;j<cols;j++) 
			{
				System.out.print(arr[i][j]+ " ");	
			}
			System.out.println();	
		}
		int c=0;
		int d=1;
		for (int [] a : arr) 
		{
			for (int b :a ) 
			{
				c=b+c;
				d=b*d;
			}
		}
		System.out.println("Sum is     : " +c);
		System.out.println("Product is : " + d);
	}
}