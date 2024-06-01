class ExceptionExample27
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("Outer Try");
			try
			{
				System.out.println("Inner Try");
			}
			finally 
			{
				System.out.println("Inner finally");
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Outer Catch 1");
		}
		catch(Exception e)
		{
			System.out.println("Outer Catch 2");
		}
		finally
		{
			System.out.println("Outer finally");
			System.out.println(10/0);
		}
	}

}