import java.util.Scanner;

class EvenAndOdd
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
        int num = sc.nextInt();
        System.out.println((num%2==0)?num + " Number is Even " :num + "Number is Odd ");
	}
}