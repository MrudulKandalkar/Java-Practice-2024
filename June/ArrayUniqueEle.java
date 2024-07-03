import java.util.*;
class ArrayUniqueEle
{

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter an size of an array ");
		byte size=sc.nextByte();
		System.out.println("Enter the elements of an array");
        byte uniqIndex=0;

		int[]arr=new int[size];

		for (int i=0;i<size ;i++ ) 
		{
			arr[i]=sc.nextInt();
      
		}
		int target=0;
		for (int i=0;i<arr.length;i++) 
		{
			for (int j=0;j<arr.length;j++) 
			{
				if (arr[i]<arr[j]) 
				{
					target=arr[i];
					arr[i]=arr[j];
					arr[j]=target;
				}
			}

		}
		System.out.print("Sort: "+Arrays.toString(arr));

		int count=0;
		for (int i=0;i<arr.length;i++ ) 
		{
			
			boolean isUnique=true;
			for (int j=0;j<i ;j++ ) 
			{

				if(arr[i]==arr[j])
				{
					isUnique=false;
					break;
				}				
			}
			if(isUnique)
			{
				count++;
			}
			
		}
		int uniqArr[]=new int[count];
		for (int i=0;i<arr.length;i++ ) 
		{
			boolean isUnique=true;
			for (int j=0;j<i ;j++ ) 
			{

				if(arr[i]==arr[j])
				{
					isUnique=false;
					break;
				}				
			}
			if(isUnique)
			{
				
				uniqArr[uniqIndex++]=arr[i];
			
			}
			
		}
		System.out.print("Original Array :");
		for (int value: arr ) 
		{
			System.out.print(value+" ");
			
		}
		System.out.println();

		System.out.println("uniq array");
		 for (int a :uniqArr ) 
		 {
		 	 System.out.print(a + " ");		 	
		 }
	}
	
}