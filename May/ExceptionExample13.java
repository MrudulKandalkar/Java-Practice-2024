class ExceptionExample13
{
	public static void main(String[] args) 
	{
		System.out.println("Hi");
		try 
		{
			System.out.println("Outer Try");
			try
			{
				String [] arr =new String[0];
				System.out.println(arr[1]);

			}
			catch(ClassCastException cce)
			{
				System.out.println("Inner Catch ");
			}
		}
		catch(NullPointerException npe)
		{
			System.out.println("Outer Catch 1");
		}
		catch(RuntimeException re)
		{
			System.out.println("Outer catch 2");
		}
	}
}