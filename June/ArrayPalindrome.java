//WAJP to check array value is palindrome or not
import java.util.*;
class ArrayPalindrome
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size : ");
		int size=sc.nextInt();

		System.out.println("Enter Array Elements : ");

		char [] arr=new char[size];

		for (int i =0;i<size;i++) 
		{
			arr[i]=sc.next().charAt(0);
		}
		char [] reversedArray=new char[size];

		int temp=0;

		for (int i=arr.length-1;i>=0 ;i-- ) 
		{
			reversedArray[temp]=arr[i];
			temp++;
		}
		if (Arrays.equals(arr,reversedArray)) 
		{
			System.out.println("It is Palindrome  ");
		}else 
		{
			System.out.println("Not Palindrome  ");

		}
	}
}