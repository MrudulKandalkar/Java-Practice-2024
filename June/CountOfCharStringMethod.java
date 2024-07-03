import java.util.*;
class  CountOfCharStringMethod

{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String : ");
		String str= sc.nextLine();
		System.out.print("Enter the Char to Get Count : ");
		char str1=sc.next().charAt(0); 
		int count=0;
		for (int i=0 ;i<str.length();i++) 
		{
			if (str.charAt(i)==str1) 
				{
					count++;
				}
		}
		System.out.println(count);
	}
}