//wajp to fetch all the prime in an array
class ArrayPrimeNumber
{
	public static void main(String[] args) 
	{
		int [] arr = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};

		for (int i=0;i<arr.length;i++) 
		{
			int count=0;
			for (int j=1;j<=arr[i];j++) 
			{
				if (arr[i]%j==0) 
				{
					count++;
				}
			}
			if (count==2) 
			{
				System.out.print(arr[i]+ " ");
			}

			
		}
	}
}