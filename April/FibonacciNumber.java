class FibonacciNumber
{
	static int num = 0;
	static int num1 =1;
	static int output=0;
	static int count =0;
	public static void main(String[] args) {
		fibonacci();
		
	}
	public static void fibonacci()
	{
		if (output<=100) {
			System.out.println(output + " ");
			output=num+num1;
			
			num=num1;
			num1=output;
			count++;
	
			if (count>9) {
				return;
			}
		}
		else
			return;
		fibonacci();

	}
}