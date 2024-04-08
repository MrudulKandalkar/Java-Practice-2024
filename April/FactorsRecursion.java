class FactorsRecursion
{   static int num =20;
    static int i = 1;
	public static void main(String[] args) {
		factor();
	}
	public static void factor()
	{
		if(num%i==0)
			{
				System.out.println(i + " "); 
				
			} else if (num<i)
			{
				return;
			}else
			{

			}
			i++;
			factor();

	}
} 