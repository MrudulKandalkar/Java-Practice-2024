/*Write a program that prompts the user to enter the minutes (e.g., 1 billion), and displays the number of years and days for the minutes. 
For simplicity, assume a year has 365 days.
Here is a sample run:
Enter the number of minutes: 1000000000
1000000000 minutes is approximately 1902 years and 214 days*/


import java.util.Scanner;
class MinutuesToYears 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Value In Minutes : ");
		long minutes = sc.nextLong();
		
	    long years = minutes / (60 * 24 * 365);
        long days = (minutes % (60 * 24 * 365)) / (60 * 24);

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
	}
}