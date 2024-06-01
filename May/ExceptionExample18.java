class ExceptionExample18
{
	public static void main(String[] args) 
	{
		System.out.println("Hi From Try ");
		try 
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie)
		{
			System.out.println("InterruptedException Handle");
		}
		catch(Exception e)
		{
			System.out.println("Exception Handle");
		}
		catch(RuntimeException re)
		{
			System.out.println("RuntimeException Handle");
		}
	}
}