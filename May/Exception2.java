import java.util.*;

class Exception2
{
	static Exception3 p;
	public static void main(String[] args) {
		System.out.println("Main Method Started");

		try 
		{
			System.out.println(p.a);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
		System.out.println("Main Method Ends");
	}
}

