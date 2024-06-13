//wajp to fetch 2nd largest element in the array
import java.util.*;
class Arraynd2ndLargestElement
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int size=sc.nextInt();
		System.out.print("Enter the values in Array :");
		int [] arr = new int[size];
		for (int i=0;i<size;i++) 
		{
			arr[i]= sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
	}
}