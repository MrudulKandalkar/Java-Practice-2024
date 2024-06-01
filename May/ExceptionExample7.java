
//write a java program to show a usage of null pointer exception and arithmatic exception using nested try catch block
import java.util.Scanner;
class Demo111
{
	int num;
}
class ExceptionExample7
{
	static Demo111 d;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the Number : ");
			Demo111 d=new Demo111();
			d.num=sc.nextInt();

			System.out.println(d.num/0);

			ExceptionExample7.d.num=67;
			System.out.println(ExceptionExample7.d.num);
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		catch(NullPointerException npe)
		{
			npe.printStackTrace();

		}
	}
}