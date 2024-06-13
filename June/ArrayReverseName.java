//wajp to reverse name in array

class ArrayReverseName
{
	public static void main(String[] args) 
	{
		String arr[]={"Mrudul","Vishal","Yash","Aditya","Juhi"};
		for (int i=arr.length-1;i>=0;i--) 
		{
			System.out.print(arr[i]+ " ");
		}
	}
}