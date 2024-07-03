//wajp to convert firstletter into captital and restinto lower case
import java.util.*;
class StringLowerUpperMethod
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Name : ");
		String name=sc.nextLine().toLowerCase();

		String firstLetter=name.substring(0,1).toUpperCase();
		String remainingLetters=name.substring(1,name.length());
		String merge=firstLetter.concat(remainingLetters);

		System.out.println(merge);

		
	}
}