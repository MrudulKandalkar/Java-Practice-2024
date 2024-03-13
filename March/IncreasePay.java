/*Write an program that increases the pay of employee by 3% if his monthly target score is greater than 90,
 otherwise increases pay by 1%*/

import java.util.Scanner;

class IncreasePay
{
public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	System.out.print("Monthly Target Score : ");
	double targetScore= sc.nextDouble();
	System.out.print("Monthaly Pay :");
	double pay = sc.nextDouble();

	if (targetScore>90)
	{
		pay= pay+pay*3/100;

	}
	else 
	{
		pay= pay+pay*1/100;
	}
	System.out.print("the monthaly payment is  "+ pay);
  }
}