import java.util.Scanner;

class DigitOrNot
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Character : ");
		//int ch = sc.nextInt();
		char ch = sc.next().charAt(0);
		System.out.println((ch>='0'&&ch<='9')?"Digit":"   Not Digit");
	}
}