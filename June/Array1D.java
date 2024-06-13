//print a 1d  for/while/for each

class Array1D
{
	public static void main(String[] args) 
	{
		int [] a ={10,20,30,40,50};

		System.out.print("For Loop     : ");
		for (int i=0;i<a.length;i++ ) 
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.print("While Loop   : ");
		int i=0;
		while(i<a.length)
		{
			System.out.print(a[i] +" ");
			i++;
		}
		System.out.println();
		System.out.print("ForEach Loop : ");
		for (int  b: a ) 
		{
			System.out.print(b + " ");
		}
	}
}