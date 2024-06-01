class ExceptionExample16
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Hello From Try");
			String str=null;
			System.out.println(str.isEmpty());
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException Handled");
		}
		catch(RuntimeException re)
		{
			System.out.println("RuntimeException Handled");
		}
		catch(NullPointerException npe)
		{
			System.out.println("NullPointerException Handled");
		}
	}
}