//wajp to find the count of vowels and consonets in a given array
import java.util.*;
class ArrayVowelAndConsonent
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size : ");
		int size=sc.nextInt();
		char [] arr=new char[size];
		System.out.print("Enter the Values : ");
		for (int i=0;i<size ;i++ ) 
		{
			arr[i]=sc.next().charAt(0);
		}
		int vCount=0;
		int cCount=0;
		for (int i=0;i<size;i++) 
		{
			if (arr[i]=='a' || arr[i]=='e'||arr[i]=='i' || arr[i]=='o'||arr[i]=='u' || arr[i]=='A'||arr[i]=='E' || arr[i]=='I'||arr[i]=='O' || arr[i]=='U') 
			{
				vCount++;
			}
			else 
			{
				cCount++;
			}
		}
		System.out.println("Vowels Count    : "+ vCount);
		System.out.println("Consonent Count : "+cCount);
	}
}