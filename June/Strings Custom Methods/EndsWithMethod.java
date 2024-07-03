import java.util.*;
class EndsWithMethod
{
	static String str;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A String : ");
		str=sc.nextLine();
		System.out.print("Enter A String To Check : ");
		String str1=sc.nextLine();
		boolean op=userEndsWith(str1);
		System.out.print(str +" : "+op);
		
	}
	
	public static boolean userEndsWith(String str1) 
	{
    	if (str1.length() > str.length()) 
    	{
        	return false;
    	}
    	int strIndex = str.length() - 1;
   		for (int i = str1.length() - 1; i >= 0; i--) 
   		{
        	if (str1.charAt(i) != str.charAt(strIndex)) 
        	{
            	return false;
        	}
       	 strIndex--;
   		}
    	return true;
	}
	
}