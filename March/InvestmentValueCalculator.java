import java.util.Scanner;

class InvestmentValueCalculator 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Investment amount : ");
		double investment= sc.nextDouble();
		System.out.print("Enter Annual Interest Rate  : ");
		double interestRate= sc.nextDouble();
		System.out.print("Enter Number Of Years : ");
		double years= sc.nextDouble();
        double futureValue = investment + (((investment/100)*interestRate)*years) ;
		//double futureValue = investment *(1+interestRate);
		System.out.println("Future Investement Value Is : "+ futureValue); 
		
		

	}
}