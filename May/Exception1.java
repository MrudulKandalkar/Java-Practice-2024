import java.util.*;

class Exception1
{
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number  : ");
		int num =sc.nextInt();

		try 
		{
			System.out.println(num/0);
		}
		catch(Exception ae)
		{
			ae.printStackTrace();
		}
		System.out.println("Main Method Ends");
	}
}

//example for arithmatic exception