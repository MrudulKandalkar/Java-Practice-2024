class ForEachLoopArray
{
	public static void main(String[] args) 
	{
		int [][] a= {{10,20,30},{40,50},{60,70,80,90}};

		for(int [] i: a)
			for(int j:i)
				System.out.println(j);
	}
}