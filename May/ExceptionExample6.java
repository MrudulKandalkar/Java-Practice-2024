//null pointer exception
import java.util.*;
class Mrudul
{
	 String exam;
} 

class ExceptionExample6
{
	static Mrudul m;
	public static void main(String[] args) 
	{
		System.out.println("Main Started");
		Scanner sc=new Scanner(System.in);
		System.out.print("Exam Name? :");

		try{
			m.exam=sc.nextLine();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Study for Exam");
		}
		System.out.println("Mrudul Exam is : "+ m.exam);
		System.out.println("Main Ended");
	}
}