import java.util.*;
class StartsWithMethod
{
	static String str;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A String : ");
		str=sc.nextLine();
		System.out.print("Enter A String To Check : ");
		String str1=sc.nextLine();
		boolean op=userStartsWith(str1);
		System.out.print(str +" : "+op);
		
	}
	public static boolean userStartsWith(String str1)
	{
		boolean flag=true;
		for (int i=0 ;i<str1.length();i++) 
		{
			char ch=str1.charAt(i);
			if ((ch!=str.charAt(i))) 
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
	
}