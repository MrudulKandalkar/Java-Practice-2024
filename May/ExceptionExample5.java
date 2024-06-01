//write a java program to get any kind of exception and handdle that exception by genrating solutiion by compiler 
class ExceptionExample5
{
	public static void main(String[] args) 
	{
		System.out.println("Hi");
		try{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
			e.printStackTrace();
			
		}
		System.out.println("Bye");
	}
}