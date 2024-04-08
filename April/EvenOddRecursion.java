

class EvenOddRecursion
{
	static int num =1;
	static int num1 =1;
	public static void main(String[] args) {
		evenNumber();
		System.out.println();
		oddNumber();
	}
	public static void evenNumber()
	{
		if (num%2==0) {
		    if (num>100)
				return;
			
	     	System.out.print( num + " ");
	     }
		num++;
		evenNumber();
	}
	public static void oddNumber()
	{
		if (num1%2!=0) {
		    if (num1>100)
				return;
			
	     	System.out.print( num1 + " ");
	     }
		num1++;
		oddNumber();
	}
}