import java.util.*;
class ConcatMethod
{
	static String str;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String 1 : ");
		str=sc.nextLine();
		System.out.print("Enter String to Concate: ");
		String nstr=sc.nextLine();
		String op=userConcat(nstr);
		System.out.print(op);

	}
	public static String userConcat(String nstr)
	{
		return str+nstr;
	}
}