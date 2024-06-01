class ExceptionExample11
{
	public static void main(String[] args) 
	{
		System.out.println("Hi");
		try
		{
			System.out.println("Outer try");
			System.out.println(10/0);
		}
		catch(ArithmeticException i)
		{
			System.out.println("Outer Catch 1");
			try
			{
				System.out.println("Inner Try");
				System.out.println(10/0);
			}
			catch(NullPointerException ie)
			{
				System.out.println("Inner Catch");
			}
		}
		catch(Exception i)
		{
			System.out.println("Outer Catch 2");
		}
	}
}
