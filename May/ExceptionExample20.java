class ExceptionExample20
{	
	public static void main(String[] args) 
	{
		System.out.println("Exe Starts");
		int i
		=1;
		while(i<=10);
		{
			System.out.println(i);
			i++;
		}
		try
		{
			System.out.println("Try bye");
			System.out.println(10/0);
		}
		finally
		{
			System.out.println("Hello From Finally");
		}		

	}
}