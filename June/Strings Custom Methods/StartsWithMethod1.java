import java.util.*;
class StartsWithMethod1
{
	static String str;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A String : ");
		str=sc.nextLine();
		System.out.print("Enter A String To Check : ");
		String str1=sc.nextLine();
		System.out.print("Enter A Index : ");
		int searchIndx=sc.nextInt();
		boolean op=userStartsWith(str1,searchIndx);
		System.out.print(str +" : "+op);
		
	}

	public static boolean userStartsWith(String str1,int startIndx)
	{
		if (startIndx<0 || startIndx>str.length()-1) 
		{
			throw new StringIndexOutOfBoundsException("Wrong Index "+startIndx);
		}
		boolean flag=true;
		for (int i=startIndx ;i<str1.length();i++) 
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