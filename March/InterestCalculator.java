import java.util.Scanner;

class InterestCalculator 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Balance : ");
		double balance= sc.nextDouble();
	    System.out.print("Enter the Anuual Intereset Rate : ");
	    double annualInterestRate= sc.nextDouble();

	    double nextMonthInterest=balance*(annualInterestRate/1200);
	    System.out.println("Next Month Interest Is : "+ nextMonthInterest);



	}
}