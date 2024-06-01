class ExceptionExample25
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
			catch(NullPointerException npa)
			{
				System.out.println("Inner Catch");
			}
			finally
			{
				System.out.println("Inner Finally");
				System.out.println(10/0);
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
			System.out.println("Outer Finally");
		}
	}
}