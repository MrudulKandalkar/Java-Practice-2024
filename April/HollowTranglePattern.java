//     *
//    * *
//   *   *
//  *     *
// *       *
//  *     *
//   *   *
//    * *
//     *

class HollowTranglePattern
{
	public static void main(String[] args) 
	{
		int n=4;
		int m=4;
		for (int i=1;i<=5;i++) 
		{
			for (int j=1;j<=n;j++) 
			{
				System.out.print(" ");
			}
			n--;
			for (int j=1;j<=i;j++) 
			{
				if (j==1 || i==j) 
				{
					System.out.print("* ");
				}else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
					
		}
		for (int i=1;i<=4;i++) 
		{
			for (int j=1;j<=i;j++) 
			{
				System.out.print(" ");
			}
			for (int j=1;j<=m;j++) 
			{
				if (j==1 || i+j==5) 
				{
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}

			}
			m--;
			System.out.println();
		}
			
	}
}


// *
// * *
// *   *
// *     *
// *       *
// *     *
// *   *
// * *
// *

// class HollowTranglePattern
// {
// 	public static void main(String[] args) 
// 	{
// 		int n=4;
// 		for (int i=1;i<=5;i++) 
// 		{
// 			for (int j=1;j<=i;j++) 
// 			{
// 				if (j==1 || i==j ) 
// 				{
// 					System.out.print("* ");
// 				}else 
// 				{
// 					System.out.print("  ");
// 				}
// 			}
// 			System.out.println();
// 		}
// 		for (int i=1;i<=4;i++) 
// 		{
// 			for (int j=1;j<=n;j++) 
// 			{
// 				if (j==1 ||  i+j==5) 
// 				{
// 					System.out.print("* ");
// 				}else
// 				{
// 					System.out.print("  ");
// 				}
// 			}
// 			n--;
// 			System.out.println();
// 		}

// 	}
// }


//         *
//       * *
//     *   *
//   *     *
// *       *
//   *     *
//     *   *
//       * *
//         *
// class HollowTranglePattern
// {
// 	public static void main(String[] args) 
// 	{
// 		int n=5;
// 		int m=4;
// 		for (int i=1;i<=5;i++) 
// 		{
// 			for (int j=1;j<=n-1;j++) 
// 			{
// 				System.out.print("  ");
// 			}
// 			n--;
// 			for (int j=1;j<=i;j++) 
// 			{
// 				if (j==1 || j==i) 
// 				{
// 					System.out.print("* ");			
// 				}else
// 				{
// 					System.out.print("  ");
// 				}			
// 			}
// 			System.out.println();
// 		}
// 		for (int i=1;i<=4;i++) 
// 		{
// 			for (int j=1;j<=i;j++) 
// 			{
// 				System.out.print("  ");
// 			}
// 			for (int j=1;j<=m;j++) 
// 			{
// 				if (j==1 || i+j==5) 
// 				{
// 					System.out.print("* ");
// 				}else
// 				{
// 					System.out.print("  ");
// 				}
// 			}
// 			m--;
// 			System.out.println();
// 		}
// 	}
// }

 // * * * * *
 //  *     *
 //   *   *
 //    * *
 //     *
// class HollowTranglePattern
// {
// 	public static void main(String[] args) 
// 	{
// 		int n=5;
// 		for (int i=1;i<=5;i++) 
// 		{
// 			for (int j=1;j<=i;j++) 
// 			{
// 				System.out.print(" ");
// 			}
// 			for (int j=1;j<=n;j++) 
// 			{
// 				if (i==1 || j==1 ||i+j==6) 
// 				{
// 					System.out.print("* ");
// 				}else 
// 				{
// 					System.out.print("  ");
// 				}
// 			}
// 			n--;
// 			System.out.println();
// 		}
// 	}
// }

  // * * * * *
  //   *     *
  //     *   *
  //       * *
  //         *

 // class HollowTranglePattern
 // {
 // 	public static void main(String[] args) 
 // 	{
 // 		int n=5;
 // 		for (int i=1;i<=5;i++) 
 // 		{
 // 			for (int j=1;j<=i;j++ ) 
 // 			{
 // 				System.out.print("  ");
 // 			}
 // 			for (int j=1;j<=n;j++) 
 // 			{
 // 				if (i==1 || j==1 ||i+j==6) 
 // 				{
 // 				 System.out.print("* ");
 // 				}else
 // 				{
 // 					System.out.print("  ");
 // 				}
 // 			}
 // 			n--;
 // 			System.out.println();
 // 		}
 		
 // 	}
 // } 



  //           *
  //         * *
  //       *   *
  //     *     *
  //   *       *
  // * * * * * *
// class HollowTranglePattern
// {
// 	public static void main(String[] args) 
// 	{
		
// 		int n=6;
// 		for (int i=1;i<=6 ;i++) 
// 		{
// 			for (int j=1;j<=n;j++) 
// 			{
// 				System.out.print("  ");
// 			}
// 			n--;
// 			for (int j=1;j<=i;j++) 
// 			{
// 				if (j==1|| i==6 || i==j  ) 
// 				{
// 					System.out.print("* ");
// 				}else 
// 				{
// 					System.out.print("  ");
// 				}
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
// class HollowTranglePattern
// {
// 	public static void main(String[] args) 
// 	{
// 		int n=6;
// 		for (int i=1;i<=6 ;i++) 
// 		{
// 			for (int j=1;j<=n;j++) 
// 			{
// 				System.out.print(" ");
// 			}
// 			n--;
// 			for (int j=1;j<=i;j++) 
// 			{
// 				if (j==1 || i==6 || i==j ) 
// 				{
// 					System.out.print("* ");
// 				}else 
// 				{
// 					System.out.print("  ");
// 				}
// 			}
// 			System.out.println();
// 		}
// 	}
// }



// * * * * *
// *     *
// *   *
// * *
// *
// class HollowTranglePattern
// {
// 	public static void main(String[] args) 
// 	{
// 		int nn=5;
// 		for (int i=1;i<=5;i++) 
// 		{
// 			for (int j=1;j<=nn;j++) 
// 			{
// 				if (j==1|| i==1 || i+j==6 ) 
// 				{
// 					System.out.print("* ");
// 				}else 
// 				{
// 					System.out.print("  ");
// 				}
			
// 			}
// 			nn--;
// 			System.out.println();
// 		}
		
// 	}
// }





// *
// * *
// *   *
// *     *
// * * * * *
// class HollowTranglePattern
// {
// 	public static void main(String[] args) {
// 		for (int i=1;i<=5 ;i++ ) 
// 		{
// 			for (int j=1;j<=i ;j++ ) 
// 			{
// 			   if (i==5 ||i==j || j==1) 
// 			    {
// 			   		System.out.print("* ");
// 			   	}else 
// 			   	{
// 			   		System.out.print("  ");
// 			   	}
// 			}
// 			System.out.println();
// 		}
// 	}
// }