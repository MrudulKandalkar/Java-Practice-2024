/*Write a program to check if the user entered percentage is eligible for appearing the Interview or not ?
Note: If the percentage is above 60 the student is eligible for
interview.
If the percentage is below 60 the student is not eligible interview.*/

import java.util.Scanner;

class EligibleForInterview

{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter percentage");

		float per=sc.nextFloat();

		if(per>=60)
		{
			System.out.println("Eligible for Interview");
		}
		else
		{
				System.out.println(" Not Eligible for Interview");
		}
	}
}