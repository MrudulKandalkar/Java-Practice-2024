class StringIsEmptyMethod
{
	static boolean flag=false;

	public static void main(String[] args) 
	{
		String str="";
		String str1=null;
		isEmpty(str);
	


	}
	public static boolean isEmpty(String str)
	{
		if (str==null || str.length()==0) 
		{
			flag=true;
			throw new NullPointerException("String Is Empty ");
			
		}
		else 
		{
			System.out.println("String Is Not Empty");
			flag=false;
			return flag;
		}

	}
}