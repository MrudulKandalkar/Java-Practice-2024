import java.util.Scanner;

class ElectionIfElse
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Your Age : ");
		int age = sc.nextInt();
		if (age>=18){
			System.out.print("Do You Have a Voting Id (yes/no) : ");
			String voterId=sc.next().toLowerCase();
			if(voterId.equals("yes"))
			{
				System.out.println("***Welcome***");
				System.out.println("1.BJP");
				System.out.println("2.CONGRESS");
				System.out.println("3.AAP");
			    System.out.println("4.MNS");
			    System.out.println("5.SHIVSENA");
			    System.out.println("6.NCP");
			    System.out.println("7.NOTA");

			    System.out.print("Enter the Option to vote for your favorite party : ");
			    String vote =sc.next().toUpperCase();
			    if(vote.equals("BJP") || vote.equals("1")){
			    	System.out.println("You have Voted For BJP ");
			    }else if (vote.equals("CONGRESS") || vote.equals("2")) {
			    	System.out.println("You have Voted For CONGRESS ");
			    	
			    }else if (vote.equals("AAP") || vote.equals("3")){
			    	System.out.println("You have Voted For AAP ");
			    }else if (vote.equals("MNS")|| vote.equals("4")) {
			    	System.out.println("You have Voted For MNS ");
			    	
			    }else if (vote.equals("SHIVSENA") || vote.equals("5")) {
			    	System.out.println("You have Voted For SHIVSENA ");
			    	
			    }else if (vote.equals("NCP") || vote.equals("6")) {
			    	System.out.println("You have Voted For NCP ");
			    	
			    }else if (vote.equals("NOTA")|| vote.equals("7")) {
			    	System.out.println("You have Voted For NOTA ");
			    	
			    }else 
			    {System.out.println("Invalide Input ");}
			}else {System.out.println("Jaldi yaha se hato");}
		}else   
		{System.out.println("you are not matuare to vote try after "+ (18-age)+"years");}
	}
}