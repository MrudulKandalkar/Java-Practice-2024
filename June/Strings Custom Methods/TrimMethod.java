import java.util.*;
class TrimMethod
{	
	static String str;
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter A String : ");
		str=sc.nextLine();

		String op=userTrimMethod();
		//System.out.println("Trimmed string: " + op);;

	}
	public static String userTrimMethod()
	{
		String op=" ";
		int indx=0;
		for (int i=0;i<str.length();i++) 
		{
			if (str.charAt(i)!=' ') 
			{
				indx=i;
				break;
			}
		}
		op=str.substring(indx);
		for (int i=str.length()-1;i>=0;i--) 
		{
			if (str.charAt(i)!=' ') 
			{
				indx=i;
				break;
			}
		}
		op=op.substring(0,indx-1);
		System.out.print(op +" : "+(op.length()));
		return op;
	}

}


