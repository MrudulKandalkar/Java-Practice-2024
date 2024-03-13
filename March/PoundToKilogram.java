/*Write a program that converts pounds into kilograms. The program prompts the user to enter a number in pounds, converts it to kilograms, and displays the result. One pound is
0.454 kilograms.
Here is a sample run:
Enter a number in pounds: 55.5 55.5 pounds is 25.197 kilograms*/


import java.util.Scanner;
class PoundToKilogram
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Values in Pound: ");
		double pound = sc.nextDouble();
		double kilogram = pound * 0.45359237;
		System.out.println( pound + " pound is " + kilogram + " kilogram");
	}
}