class CodePointBeforeStringMethod
{
	static String str="ABCDEFGH";
	public static void main(String[] args) 
	{
		int indx=userCodePointBefore(1);
		System.out.println(str + " "+indx);
	}
	public static int userCodePointBefore(int indx)
	{
		if (indx<1 || indx >str.length()) 
		{
			throw new StringIndexOutOfBoundsException("Wrong Index : "+indx);
		}
		return str.charAt(indx-1);
		

	}
}