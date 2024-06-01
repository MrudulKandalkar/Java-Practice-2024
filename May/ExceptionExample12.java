class ExceptionExample12
{
	public static void main(String[] args)
	{
		System.out.println("Hi");
		try
		{
			System.out.println("Outer Try");

			try
			{
				System.out.println("Inner Try");
				System.out.println(10/0);
			}
			catch(NullPointerException e)
			{
				System.out.println("Inner Catch Block");
			}
		}
		catch(ArithmeticException i)
		{
			System.out.println("ArithmeticException Handled Catch 1");
		}
		catch(Exception i)
		{
			System.out.println("Outer catch2");
		}
	}
}