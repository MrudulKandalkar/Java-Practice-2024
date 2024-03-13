/*Q. Write a program to check if the user given number is
POSITIVE or NEGATIVE (NATURAL NUMBER) ?
Note: If the number is more than 0 it is POSITIVE and
If the number is less than 0 it is NEGATIVE.*/

import java.util.Scanner;
class PositiveOrNegative
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		double num = sc.nextDouble();

		if (num >0 )
		{
			System.out.println(" The Number is Positive ");

		}
		else if (num <0)
		{
			System.out.println("The Number is Negative" );

		}
		else 
		{
			System.out.println("The Number is Neutral Number");

		}



	}
}