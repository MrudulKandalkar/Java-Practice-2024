class ExceptionExample23
{
	public static void main(String[] args) 
	{
		System.out.println("Exe Starts");
		m1();
		System.out.println("Exe Ends");
	}
	static void m1()
	{
		System.out.println("m1() starts");
		try 
		{
			System.out.println("try");
			return;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException Handled");
		}
		finally
		{
			System.out.println("Hello Finally");
		}
		System.out.println("m1() ends");
	}
}