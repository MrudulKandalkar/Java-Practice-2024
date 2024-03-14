/*Write a program to check if the person is eligible for driving licences ?
NOTE: Must have completed 18+ and should have
passed the RTO test with more than 60 marks if not re-appeared for the test again.*/

import java.util.Scanner;

class EligibleForDrivingLic
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the age Of Person : ");
		int age = sc.nextInt();
       
        if (age >= 18)
        {
        	System.out.print("Enter the Marks Of RTO test : ");
        	double marks= sc.nextDouble();
        	if(marks >= 60)
        	{
        		System.out.println("Person has passed the Test ");
        	}else {
        		System.out.println("Person is Fail the Test And need to Re-appeared for the test ");
        	}
        }else
        {
        	System.out.println("Person is not Eligible for Licence");
        }

	}
}