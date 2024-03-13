import java.util.Scanner;

class LargerNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The 1st Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter The 2nd Number :");
        int num2 = sc.nextInt();
        int max= (num1<num2)?num2:num1;
        System.out.println(num1 + " , "+ num2 + " Larger among 2 number is "+ max);
	}
}