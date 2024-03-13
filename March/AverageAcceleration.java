/* Average acceleration is defined as the change of velocity divided by the time taken to make the change, as shown in the following formula:
a = v1 - vo
Write a program that prompts the user to enter the starting velocity vo in meters/ second, the ending velocity v1 in meters/second, 
and the time span t in seconds, and displays the average acceleration.
Here is a sample run:
Enter vo, v1, and t: 5.5 50.9 4.5
The average acceleration is 10.0889*/


import java.util.Scanner;
class AverageAcceleration
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter vo, v1, and t: ");
        double vo = scanner.nextDouble();
        double v1 = scanner.nextDouble();
        double t = scanner.nextDouble();
        scanner.close();

        // Calculate average acceleration
        double acceleration = (v1 - vo) / t;

        System.out.println("The average acceleration is " + acceleration);
	}
}