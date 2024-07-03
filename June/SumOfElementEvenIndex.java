//wajp find sum of all element at even index 
class SumOfElementEvenIndex
{
	public static void main(String[] args) 
	{
		int arr[]={1,3,1,5,1,0,1,0,1};
		int sum=0;
		for (int i=0;i<arr.length;i++) 
		{
			if (i%2==0) 
			{
				sum=arr[i]+sum;
			}
		}
		System.out.println(sum);
	}
}