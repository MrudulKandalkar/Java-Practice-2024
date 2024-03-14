/*Write a program to check if the user is able to donate blood or not ?
Donat
NOTE: User must be 20+ and must not consume cigarette
or alcohol in 24 hours before e donating blood and weight must be more than 50 kg.*/

import java.util.Scanner;

class BloodDonationIfElse
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The User Age : ");
		int age = sc.nextInt();

		if (age>=20 && age <=60 )
		{
			System.out.println("Enter IF User Have Consume Cigarette or Alcohol in 24 hours (yes/no) : ");
			String consume= sc.next().toLowerCase();
			if (consume.equals("no"))
			{
				System.out.print("Enter User Weight : ");
				int weight=sc.nextInt();
				if(weight>=50)
				{
					System.out.print(" User is Eligible For Donation.");
				}else {
					System.out.println("User is Unhealthy.");
				}

			}else
		      {System.out.println("User is Not Eligible Cause blood is unhealthy ");}

		}else{System.out.println("User is not Eligible for Donation Try After " + (20-age)+"  years. ");}
	}
}