/*Write a program to check if the boy is eligible for marrying his girlfriend ?
Note: The boy must be 21+ and He must have property of
more than 1 crore (10000000) or your surname is
AMBANI.
If he fail in any of the condition, he is not eligible to marry that girl.*/


import java.util.Scanner;

class EligibleForMarraige
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Age Of Boy : ");
		int age=sc.nextInt();
		System.out.print("Enter The Property : ");
		double property=sc.nextDouble();
		System.out.print("Enter The Surname :");
		String surname = sc.next().toUpperCase();
        if((age>=21 && property>=10000000)||(surname.equals("AMBANI")))
		{
			System.out.println("Boy Is Eligible For Marraige");
		}
		else{
			System.out.println("Boy Is Not Eligible For Marraige");
		}
	}
}