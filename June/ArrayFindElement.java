//Wajp to find element in array
class ArrayFindElement
{
	public static void main(String[] args) 
	{
		int arr []={1,9,7,4,8};
		int findElement=10;
		boolean flag=true;


		for (int i=0;i<arr.length;i++) 
		{
			if(findElement==arr[i])
			{
				System.out.println("Element Found In Position : " + (i+1));
				flag=false;
				break;
			} 
			
		}
		if (flag) 
		{
			System.out.println("Element Is Not Found In Any Position");
		}
			
	}	
}