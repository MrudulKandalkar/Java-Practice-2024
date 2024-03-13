import java.util.Scanner;

class HexagonAreaCalculator
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Length Of Side : ");
		double sideLength=sc.nextDouble();
		//double area = (3 * Math.sqrt(3) / 2) * Math.pow(sideLength, 2);
		double area= 3*(1.73205080757/2)*(sideLength*sideLength);
		System.out.println("The area of the hexagon is " + area);
	}
}