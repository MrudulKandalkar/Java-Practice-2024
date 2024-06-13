class SmallestElementArray
{
	public static void main(String[] args) 
	{
		int [] arr = {2,3,5,7,9,1,0};
		int min=arr[0];
		for (int a : arr ) 
		{
			if (a<min) 
			{
				min = a;
			}
		}
		System.out.println(min);
	}
} 