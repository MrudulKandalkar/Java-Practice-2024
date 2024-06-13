//print a 1d  for/while/for each
class Array2D
{
	public static void main(String[] args) 
	{	
		int [][] a={{10,20},{30,40,50},{60,70,80}};

		System.out.print("For Loop     : ");
		for (int i=0;i<a.length;i++) 
		{
			for (int j=0;j<a[i].length;j++ ) 
			{
				System.out.print(a[i][j] +" ");
			}
		}
		System.out.println();
		System.out.print("While Loop   : ");
		int i=0;
		while(i<a.length)
		{
			int j=0;
			while(j<a[i].length)
			{
				System.out.print(a[i][j] + " ");
				j++;
			}
			i++;
		}
		System.out.println();
		System.out.print("ForEach Loop : ");
		for (int [] b :a ) 
		{
			for (int c : b ) 
			{
				System.out.print(c + " ");
			}
		}
		System.out.println();
		System.out.print("DoWhile Loop : ");
		int j=0;
		do 
		{
			int k=0;
			do
			{
				System.out.print(a[j][k] + " ");
				k++;
			}while(k<a[j].length);
			j++;
		}while(j<a.length);




	}
}