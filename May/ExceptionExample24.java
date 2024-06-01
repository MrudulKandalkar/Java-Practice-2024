class ExceptionExample24
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Outer Try");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Outer Catch 1");
			try 
			{
				System.out.println("Inner Try");
				System.out.println(10/0);
			}
			catch(NullPointerException npe)
			{
				System.out.println("Inner Catch");
			}
			finally
			{
				System.out.println("Inner Finally");
			}
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