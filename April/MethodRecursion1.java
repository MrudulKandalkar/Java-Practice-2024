
class MethodRecursion1
{
	static int number =1;
	public static void main(String[] args) {
		printNumber();
		
	}
	public static void printNumber()
	{
		System.out.println(number);
		number++;


			if(number==10) 
			{			System.out.print(number);
			}			return;
			
		
		printNumber();

	}
}