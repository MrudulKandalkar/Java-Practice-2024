class HollowTranglePattern1
{
	public static void main(String[] args) {
		for (int i=5;i>=1 ;i-- ) 
		{
			for (int j=1;j>=i ;j-- ) 
			{
			   if (i==5 ||j==5 || j+i==6 ) 
			    {
			   		System.out.print("* ");
			   	}else
			   	{
			   		System.out.print("  ");
			   	}
			}
			System.out.println();
		}
	}




	// public static void main(String[] args) {
	// 	for (int i=5;i>=1 ;i-- ) 
	// 	{
	// 		for (int j=1;j<=i ;j++ ) 
	// 		{
	// 		   if (i==5 ||j==i || j==1) 
	// 		    {
	// 		   		System.out.print("* ");
	// 		   	}else 
	// 		   	{
	// 		   		System.out.print("  ");
	// 		   	}
	// 		}
	// 		System.out.println();
	// 	}
	// }
}