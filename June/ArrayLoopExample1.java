import java.util.*;
class ArrayLoopExample1
{
	public static void main(String[] args) 
	{
		int [][][] a = {{{10,20},{30}},{{40,50,60}}};

		System.out.print("For Loop     : ");
		for (int i=0;i<a.length;i++) 
		{
			for (int j=0;j<a[i].length;j++) 
			{
				for (int k=0;k<a[i][j].length;k++) 
				{
					System.out.print(a[i][j][k]+ " ");
				}
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
				int k=0;
				while(k<a[i][j].length)
				{
					System.out.print(a[i][j][k]+ " ");
					k++;

				}
				j++;
			}
			i++;
		}
		System.out.println();
		System.out.print("For Each     : ");
		for (int [][] b :a ) 
		{
			for (int [] c :b ) 
			{
				for (int d : c) 
				{
					System.out.print(d + " ");
				}
			}
		}
	}
}