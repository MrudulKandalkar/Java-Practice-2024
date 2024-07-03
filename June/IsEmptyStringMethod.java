import java.util.*;

class IsEmptyStringMethod
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Karthiks Gf Name if there is any: ");
		String karthikGF=sc.nextLine();
		System.out.print("Enter the Karthik wife Name if there is any : ");
		String karthikWife=sc.nextLine();

		if (karthikGF.isEmpty()) 
		{
			try 
			{
				throw new KarthikGFException("Karthik Does not have any girl friend");
			}
			catch(Exception e)
			{
				e.printStackTrace();
				if (karthikWife.isEmpty()) 
				{
					System.out.println("Karthik Does not have Wife");
				}
				else
				{
					System.out.println("Wife name : "+karthikWife);
				}
			}
		}
	}
}
class KarthikGFException extends Exception
{
	String message;
	KarthikGFException(String message)
	{
		super(message);
	}
}