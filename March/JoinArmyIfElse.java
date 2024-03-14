/*Write a program to check if the user is able to join army or not ?
NOTE: Age should be more than 18+ and height should be
at least 162 cm and weight must be more than 56 kg.*/

import java.util.Scanner;

class JoinArmyIfElse
{
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter the age of user : ");
		int age =sc.nextInt();
		if (age>=18)
		{
			System.out.print("Enter the height in Cm : ");
			double height= sc.nextDouble();
			System.out.print("Enter the weight in Kg : ");
			double weight=sc.nextDouble();
			if (height>=162 && weight>=56)
			{
				System.out.println("User is Eligible to Join the Army");

			}else{
				System.out.println("User is Not Physically Eligible For Army");
			}

		}else {
			System.out.println("User is Not Eligible for Army Try After "+(18-age) + "years");
		}

	}
}