class ExceptionExample14
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("Hi From Try");
			System.out.println(10/0);
			try
			{
				System.out.println("Inner Try ");
				System.out.println(10/0);
			}
			catch(NullPointerException a)
			{
				System.out.println("Inner ae Handled");
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Hi From Catch");
		}	
	}
}