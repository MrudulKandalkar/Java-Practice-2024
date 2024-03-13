import java.util.Scanner;
class Gratuity
{
	public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Subtotal Bill :");
		double subTotal = sc.nextDouble();
		System.out.print("Enter The Tip Rate :");
		double tipRate = sc.nextDouble();
		//System.out.println(subTotal +""+tipRate);

		double total= subTotal + tipRate*(subTotal/100);
		System.out.println("Subtotal is "+ subTotal + " and the tiprate is "+ tipRate + "total tip is " 
			+  total);
		
			}
}