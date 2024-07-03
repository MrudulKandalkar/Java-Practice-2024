class CodePointCountStringMethod
{
	static String str="ABCDEFGH";
	public static void main(String[] args) 
	{
		int indx=userCodePointCount(3,3);
		System.out.println(str + " "+indx);
	}
	public static int userCodePointCount(int startIndx,int endIndx)
	{
		if (startIndx>endIndx || startIndx<0 || endIndx<0 ||endIndx>str.length()-1||startIndx>str.length()-1) 
		{
			throw new StringIndexOutOfBoundsException("Wrong Index : ");
		}
		return endIndx-startIndx;
		

	}
}