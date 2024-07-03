//wajp to get aski values all the character of all the charater from the string dynamycally
import java.util.*;
class AscciValueStringMethod
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Name : ");
		String name=sc.nextLine();

		for (int i=0;i<name.length();i++) 
		{
			System.out.println(name +" - " + name.charAt(i) +" : " + name.codePointAt(i));
		}
	}
}