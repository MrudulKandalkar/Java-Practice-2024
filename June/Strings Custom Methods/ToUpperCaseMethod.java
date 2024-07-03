import java.util.*;
class ToUpperCaseMethod
{
	static String str;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A String : ");
		str=sc.nextLine();
		String op=userToUpperCase();
		System.out.println(str +" : "+op);	
	}
	public static String userToUpperCase()
	{
		String newstr="";
		for (int i=0;i<str.length() ;i++) 
		{
			char ch=str.charAt(i);
			if (ch>='a' && ch<='z') 
			{
				newstr=newstr + (char)(ch-32);	
			}
			else 
			{
				newstr=newstr+ch;
			}
		}
		return newstr;
	}
}