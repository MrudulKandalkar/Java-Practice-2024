class ExceptionExample17
{
	public static void main(String[] args) 
	{
		System.out.println("Hello Starts");
		try 
		{
			Thread.sleep(2000);
		}
		catch(RuntimeException re)
		{
			System.out.println("RuntimeException Handled");
		}
		catch(InterruptedException ie) 
		{
			System.out.println("InterruptedException ");
		}
		System.out.println("Hello Ends");
	}
}