import java.util.*;
class ToLowerCaseMethod
{
	static String str;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A String : ");
		str=sc.nextLine();
		String op=userToLowerCase();
		System.out.println(str + " : "+ op );
	}
	public static String userToLowerCase()
	{
		String newStr="";
		for (int i=0;i<str.length();i++) 
		{
			char ch= str.charAt(i);
			if (ch>='A' && ch<='Z') 
			{
				newStr=newStr +(char)(ch+32);
			}
			else 
			{
				newStr=newStr+ch;
			}
		}
		return newStr;
	}
}