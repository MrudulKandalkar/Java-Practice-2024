class WhileLoopLable
{
	public static void main(String[] args) {
		ramesh:{
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=5)
			{
				if(j==3)
				{
					break ramesh;
				}
				System.out.println("i-"+i+" | "+"j-"+j);
				j++;
			}
			i++;
		  }
		}
	}
}