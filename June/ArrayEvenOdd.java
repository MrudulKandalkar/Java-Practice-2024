class ArrayEvenOdd
{
	public static void main(String[] args) 
	{
		int arr[]={1,7,8,9,14,18,21,25,28,29,55,101};

		for (int i=0;i<arr.length;i++ ) 
		{
			if (arr[i]%2==0) 
			{
				System.out.println("Even : "+ arr[i]);
			}
			// else 
			// {
			// 	System.out.println("Odd  : "+ arr[i]);
			// }
		}
		for (int i=0;i<arr.length;i++ ) 
		{
			if (arr[i]%2!=0) 
			{
				System.out.println("Odd  : "+ arr[i]);
			}

		}
	}

}