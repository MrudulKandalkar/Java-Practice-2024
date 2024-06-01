class ExceptionExample30
{
	public static void main(String[] args) 
	{
		System.out.println("Exec Starts");
		try
		{
			System.out.println("try");
			System.out.println(10/0);
		}
		catch(ArithmeticException i)
		{
			System.out.println("ArithmeticException Handled");
			System.exit(0);
		}
		finally
		{
			System.out.println("HELLO FROM finally");
		}
		System.out.println("Exe Ends");
	}
}