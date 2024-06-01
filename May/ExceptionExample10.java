class ExceptionExample10
{
	static Mobile m;
	public static void main(String[] args) 
	{
		 System.out.println("Main Started");
		 try
		 {
		 	ExceptionExample10.m.games=true;
		 	ExceptionExample10.m.playGames(ExceptionExample10.m.games);
		 }
		 catch(Exception e)
		 {
		 	e.printStackTrace();
		 	try 
		 	{
		 		Mobile m=new Mobile();
		 		m.games=true;
		 		m.playGames(m.games);
		 	}
		 	catch(Exception e2) 
		 	{
		 		e2.printStackTrace();
		 	}
		 }
		  try
		 {
		 	ExceptionExample10.m.reels=true;
		 	ExceptionExample10.m.watchReels(ExceptionExample10.m.reels);
		 }
		 catch(Exception e5)
		 {
		 	e5.printStackTrace();
		 	try 
		 	{
		 		Mobile m=new Mobile();
		 		m.reels=true;
		 		m.watchReels(m.reels);
		 	}
		 	catch(Exception e22) 
		 	{
		 		e22.printStackTrace();
		 	}
		 }

		 System.out.println("Main Ends");
	}
}
class Mobile
{
	boolean games;
	boolean reels;

	public void playGames(boolean games)
	{
		this.games= games;
		if (games=true) 
		{
			System.out.println("Game Starts");
		}
		else
		{
			System.out.println("Game Not Starting");
		}
	}
	public void watchReels(boolean reels)
	{
		this.reels=reels;
		if (reels) 
		{
			System.out.println("Watching Reels");	
		}
		else 
		{
			System.out.println("Not Watching Reels");
		}
	}
}