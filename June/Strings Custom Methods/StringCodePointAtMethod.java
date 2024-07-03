class StringCodePointAtMethod
{
	static String str="Mrudul";
	public static void main(String[] args) 
	{
		for (int i=0;i<str.length();i++) 
		{
			System.out.println(str.charAt(i)+" : "+codePointerAt(i));
		}
	}
	public static int codePointerAt(int indx)
	{
		if (indx <0 || indx>=str.length()) 
		{
			throw new StringIndexOutOfBoundsException("Wrong Index");
		}
		char [] arr=new char[str.length()];
		int unicode=0;
		for(int i = 0; i < str.length(); i++)
		{
			arr[i]=str.charAt(i);			
		}

		unicode=(int)arr[indx];
		

		return unicode;
	}

}
