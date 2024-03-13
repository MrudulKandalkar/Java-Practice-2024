import java.util.Scanner;

class TripCostCalculator 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Driving Distance :");
		double distance = sc.nextDouble();
		System.out.print("Miles Per Gallon :");
		double miles = sc.nextDouble();
		System.out.print("Price Per Gallon :");
		double price = sc.nextDouble();

		double totalCost=(distance/miles)*price ;
		System.out.println(" Total Cost Of Driving is : "+" $ " +totalCost);

	}
}