import java.util.*;
class ToCharArrayMethod
{	
	static String str;
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter A String : ");
		str=sc.nextLine();

		char [] arr=userToCharArray();
		System.out.print(Arrays.toString(arr));
	}
	public static char[] userToCharArray()
	{
		char [] arr=new char[str.length()];

		for (int i=0;i<str.length();i++) 
		{
			arr[i]=str.charAt(i);
		}
		return arr;
	}

}