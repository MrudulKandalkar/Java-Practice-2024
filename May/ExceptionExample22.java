class ExceptionExample22
{
	public static void main(String[] args) 
	{
		System.out.println("Exe Starts");
		m1();
		System.out.println("Exe Ends");
	}
	static void m1()
	{
		System.out.println("m1()");
		try 
		{
			System.out.println("Try");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException Handled");
			return;
		}
		finally
		{
			System.out.println("Hello Finally");
		}
		System.out.println("m1()");
	}
}