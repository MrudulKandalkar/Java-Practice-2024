import java.util.Scanner;

class VowelsIfElse
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Character : ");
		String ch= sc.next();

		if (ch.length()==1)
		{
		 if (ch.equals("A") ||ch.equals("E")||ch.equals("I") || ch.equals("O")||ch.equals("U")||ch.equals("a")||ch.equals("e")||ch.equals("i")||ch.equals("o")||ch.equals("u"))
		      {
			System.out.println("Character is Vowel");
		      }else
		     {
			System.out.println("Character is Consonant");
		     }
		}else 
		{
			System.out.println("Please enter only one character.");
		}

	}
}