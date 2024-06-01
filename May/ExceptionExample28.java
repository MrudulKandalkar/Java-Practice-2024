class ExceptionExample28
{
	public static void main(String[] args) 
	{
		System.out.println("Exec Starts");
		try
		{
			Thread.currentThread().join();
		}
		catch(InterruptedException i)
		{
			System.out.println("InterruptedException Handled");
		}
		finally
		{
			System.out.println("HELLO FROM finally");
		}
		System.out.println("Exe Ends");
	}
}