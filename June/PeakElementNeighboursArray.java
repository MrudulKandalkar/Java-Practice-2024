class PeakElementNeighboursArray
{
	public static void main(String[] args) 
	{
		int [] a={10,20,15,2,23,90,67};
		int n=a.length;

		for (int i=1;i<n-1;i++ ) 
		{
			if (a[i-1]<a[i] && a[i+1]<a[i]) 
			{
				System.out.println("Peak Element Which Have Neighbour Value Less Than Itself Is : " +a[i]);
			} 
		}
	}
}