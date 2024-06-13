//WAJP to fetch negative number in array

class ArrayNegativeNumberFetch
{
	public static void main(String[] args) 
	{
		int arr[]={7,-8,-10,8,55,-58,100,-100};
		for (int i=0;i<arr.length ;i++) 
		{
			if (arr[i]<0) 
			{
				System.out.println("Negative Number : "+ arr[i] );
			}
		}
	}
}