class ExceptionExample29
{
	public static void main(String[] args) 
	{
		System.out.println("Exec Starts");
		try
		{
			System.out.println("try");
			Thread.sleep(1000);
		}
		catch(InterruptedException i)
		{
			System.out.println("InterruptedException Handled");
			System.exit(0);
		}
		finally
		{
			System.out.println("HELLO FROM finally");
		}
		System.out.println("Exe Ends");
	}
}