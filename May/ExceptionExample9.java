class ExceptionExample9
{
	public static void main(String[] args) {
		System.out.println("Hi");
		try{
			System.out.println("Outer Try");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Outer Catch");
			try{
				System.out.println("Inner Try");
				System.out.println(10/0);
			}
			catch(NullPointerException ie)
			{
				System.out.println("Inner CAtch");
			}
		}
		catch(Exception e)
		{
			System.out.println("Outer Catch 2");
		}
	}
}