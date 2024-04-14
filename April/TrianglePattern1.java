//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *

class TrianglePattern1
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5;i++) 
		{
			for (int j=4;j>=i;j--) 
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i=1;i<=4;i++) 
		{
			for (int j=1;j<=i;j++) 
			{
				System.out.print(" ");
			}
			for (int j=4;j>=i;j--) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

// *
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *

// class TrianglePattern1
// {
// 	public static void main(String[] args) {
// 		int row=5;
// 		int n=4;
// 		for (int i=1;i<=5;i++) 
// 		{
// 			for (int j=1;j<=i;j++) 
// 			{
// 				System.out.print("* ");
				
// 			}
// 			System.out.println();
// 		}
// 		for (int i=1;i<=4;i++)
// 		{
// 			for (int j=1;j<=n;j++) 
// 			{
// 			System.out.print("* ");	
// 			}
// 			n--;
// 			System.out.println();
// 		}
		
// 	}
// }



//         *
//       * *
//     * * *
//   * * * *
// * * * * *
//   * * * *
//     * * *
//       * *
//         *
// class TrianglePattern1
// {
// 	public static void main(String[] args) 
// 	{
// 		int row=5;
// 		int n=4;
// 		for (int i=1;i<=row ;i++) 
// 		{
// 			for (int j=1;j<=row-i;j++) 
// 			{
// 				System.out.print("  ");	
// 			}
// 			for (int j=1;j<=i;j++) 
// 			{
// 				System.out.print("* ");	
// 			}
// 			System.out.println();
// 		}
// 		for (int i=1;i<=row-1;i++) 
// 		{
// 			for (int j=1;j<=i;j++) 
// 			{
// 				System.out.print("  ");	
// 			}
// 			for (int j=1;j<=n;j++) 
// 			{
// 				System.out.print("* ");
// 			}
// 			n--;
// 			System.out.println();
// 		}
		
// 	}
// }



 // * * * * *
 //  * * * *
 //   * * *
 //    * *
 //     *
 // class TrianglePattern1
 // {
 // 	public static void main(String[] args) 
 // 	{
 // 		int row=5;
 // 		int m=5;
 // 		for (int i =1;i<=row ;i++ ) 
 // 		{
 // 			for (int j=1;j<=i;j++) 
 // 			{
 // 				System.out.print(" ");
 // 			}
 // 			for (int j=1;j<=m;j++) 
 // 			{
 // 				System.out.print("* ");
 					
 // 			}
 // 			m--;
 // 			System.out.println();
 			
 // 		}
 // 	}
 // }



//      *
//     * *
//    * * *
//   * * * *
//  * * * * *
// * * * * * *
//  class TrianglePattern1 
//  {
//     public static void main(String args[]) 
//     {
//         int row = 6;
//         for (int i = 0; i < row; i++) 
//         {
//             // Print spaces
//             for (int j = row - i; j > 1; j--)
//             {
//                 System.out.print(" ");
//             }
//             // Print asterisks
//             for (int j = 0; j <= i; j++) 
//             {
//                 System.out.print("* ");
//             }
//             // Move to the next line
//             System.out.println();
//         }
//     }
// }


// * * * * *
//   * * * *
//     * * *
//       * *
//         *
// class TrianglePattern1
// {
// 	public static void main(String[] args) 
// 	{
// 		int n=5;
// 		int m=6;
// 		for (int i=1;i<=n;i++ ) 
// 		{
			
// 			for (int j=5;j>=m-i;j-- ) 
// 			{
// 			 System.out.print("  ");	
// 			}
// 			for (int j=5;j>=i ;j-- ) 
// 			{
// 				System.out.print("* ");
// 			}
// 			System.out.println();
// 		}
// 	}
// }

// * * * * *
//   * * * *
//     * * *
//       * *
//         *
// class TrianglePattern1
// {
// 	public static void main(String[] args) 
// 	{
// 		int n=5;
// 		for (int i=1;i<=n;i++ ) 
// 		{
// 			if(i == 1)
// 			{
// 				System.out.print("* * * * *");
// 				System.out.println();
// 			}else if (i==2) 
// 			{
// 				System.out.print("  * * * * ");
// 				System.out.println();
				
// 			}else if (i==3) 
// 			{
// 				System.out.print("    * * * ");
// 				System.out.println();
// 			}else if (i==4) 
// 			{
// 				System.out.print("      * * ");
// 				System.out.println();				
// 			}else 
// 			{
// 				System.out.print("        * ");
// 				System.out.println();			
// 			}
	
// 		}
// 	}
// }



//
//         *
//       * *
//     * * *
//   * * * *
// * * * * *
// class TrianglePattern1
// {
// 	public static void main(String[] args) 
// 	{
// 		int n=5;
// 		for (int i=1;i<=n;i++ ) 
// 		{
// 			for (int j=1;j<=n-i;j++ ) 
// 			{
// 			 System.out.print("  ");	
// 			}
// 			for (int j=1;j<=i ;j++ ) 
// 			{
// 			 System.out.print("* ");	
// 			}
// 			System.out.println();
// 		}
// 	}
// }


//
//         *
//       * *
//     * * *
//   * * * *
// * * * * *
// class TrianglePattern1
// {
// 	public static void main(String[] args) 
// 	{
// 		for (int i=1;i<=6 ;i++) 
// 		{
// 			for (int j=5;j>=i;j--) 
// 			{
// 				System.out.print("  ");
				
// 			}
// 			for (int j=1;j<=i-1 ;j++) 
// 			{
// 				System.out.print("* ");
// 			}
// 			System.out.println();
// 		}
// 	}
// }





//      *
//     * *
//    * * *
//   * * * *
//  * * * * *
// * * * * * *

// class TrianglePattern1
// {
// 	public static void main(String[] args) 
// 	{
// 		for (int i=1;i<=6 ;i++) 
// 		{
// 			for (int j=5;j>=i;j--) 
// 			{
// 				System.out.print(" ");
				
// 			}
// 			for (int j=1;j<=i ;j++) 
// 			{
// 				System.out.print("* ");
// 			}
// 			System.out.println();
// 		}
// 	}
// }





// * * * * *
// * * * *
// * * *
// * *
// *
// class TrianglePattern1
// {
// 	public static void main(String[] args) 
// 	{
// 		for (int i=1;i<=5 ;i++ ) 
// 		{
// 			for (int j=5;j>=i ;j--) 
// 			{
// 				System.out.print("* ");
// 			}
// 			System.out.println();
			
// 		}
// 	}
// }





// *
// * *
// * * *
// * * * *
// * * * * *
// class TrianglePattern1
// {
// 	public static void main(String[] args) 
//	{
// 		for (int i=1;i<=5 ;i++ ) 
// 		{
// 			for (int j=1;j<=i ;j++) 
// 			{
// 				System.out.print("* ");
// 			}
// 			System.out.println();
			
// 		}
// 	}
// }