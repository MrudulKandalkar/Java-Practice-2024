 // 1 2 3 4 5 6
 //  2 3 4 5 6
 //   3 4 5 6
 //    4 5 6
 //     5 6
 //      6
 //     5 6
 //    4 5 6
 //   3 4 5 6
 //  2 3 4 5 6
 // 1 2 3 4 5 6
class NumberPattern1
{

	public static void main(String[] args) {
		int n=6;
		for (int i=1;i<=6 ;i++) 
		{
			for (int j=1;j<=i;j++) 
			{
			System.out.print(" ");	
			}
			int num=i;
			for (int k=1;k<=n;k++) 
			{
				System.out.print(num + " ");
				num++;

			}
			n--;
			System.out.println();
		}
		int m=5;
		int num1 =5;
		for (int i=1;i<=5;i++) 
		{
			
			for (int j=1;j<=m;j++) 
			{
				System.out.print(" ");
			}
			m--;
			int num=num1;
			for (int j=1;j<=i+1;j++) 
			{
				
				System.out.print(num+ " ");
				num++;
			}
			num1--;
			 System.out.println();
		}
	}
}


//     1
//    1 1
//   1 2 1
//  1 3 3 1
// pascal triangle
// class NumberPattern1
// {
// 	public static void main(String[] args) 
// 	{
// 		int n=4;
// 		for (int i=1;i<=4;i++) 
// 		{
// 			int num=1;
// 			for (int j=1;j<=n ; j++) 
// 			{
// 				System.out.print(" ");
// 			}
// 			n--;

// 			for (int j=1;j<=i ;j++ ) 
// 			{
// 				System.out.print(num + " ");
// 				num=num*(i-j)/j;
// 			}
// 			System.out.println();
// 		}
// 	}
// }


// 1
// 0 1
// 1 0 1
// 0 1 0 1


// class NumberPattern1
// {
// 	public static void main(String[] args) 
// 	{
		
// 		for (int i=1;i<=4;i++) 
// 		{
// 			int num=0;

// 			for (int j=1;j<=i;j++) 
// 			{
// 				if ((i+j)%2==0) 
// 				{
// 					System.out.print("1 ");
					
// 				}else {
// 					System.out.print("0 ");
// 				}
				
// 			}
			

// 			System.out.println();
// 		}
// 	}
// }

// 3
// 44
// 555
// 6666
// 77777
// class NumberPattern1
// {
// 	public static void main(String[] args) 
// 	{
// 		int num=3;
// 		for (int i=1;i<=5 ;i++ ) 
// 		{
			
// 			for (int j=1;j<=i ;j++ ) 
// 			{
// 				System.out.print(num);

// 			}
// 			System.out.println();
// 			num++;

// 		}
// 	}
// }


// 1 3 5 7 9
// 1 3 5 7
// 1 3 5
// 1 3
// 1
// class NumberPattern1
// {
// 	public static void main(String[] args) 
// 	{
// 		int n=5;

// 		for (int i=1;i<=5 ;i++ ) 
// 		{
// 			int num=1;

// 			for (int j=1;j<=n ;j++) 
// 			{
				
// 				System.out.print(num + " ");
// 				num=num+2;
// 			}
// 			n--;
// 			System.out.println();
// 		}
// 	}
// }


// 5 4 3 2 1
// 5 4 3 2
// 5 4 3
// 5 4
// 5
// class NumberPattern1
// {
// 	public static void main(String[] args) 
// 	{
// 		int n=5;

// 		for (int i=1;i<=5 ;i++ ) 
// 		{
// 			int m=5;

// 			for (int j=1;j<=n ;j++) 
// 			{
				
// 				System.out.print(m +" ");
// 				m--;
// 			}
// 			n--;
// 			System.out.println();
// 		}
// 	}
// }