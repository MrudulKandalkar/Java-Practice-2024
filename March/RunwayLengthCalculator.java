import java.util.Scanner;

class RunwayLengthCalculator 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Speed : ");
		double v = sc.nextDouble();
		System.out.print("Enter the Acceleration : ");
		double a = sc.nextDouble();
		double length = (v * v) / (2 * a);

		System.out.println("The minimum runway length for this airplane is " + length + " meters.");



	}
}