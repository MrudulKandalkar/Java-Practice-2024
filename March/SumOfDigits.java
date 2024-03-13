/*Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer. For example, if an integer is 932, the sum of all its digits is 14.
Here is a sample run:
Enter a number between 0 and 1000: 999
The sum of the digits is 27 */


import java.util.Scanner;

class SumOfDigits 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000 : ");
		int number = sc.nextInt();

		 int sum = 0;
        while (number != 0) {
            sum += number % 10; 
            number /= 10; 
        }
		 System.out.print("The sum of the digits is " + sum);
	}
 }