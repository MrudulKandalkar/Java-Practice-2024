import java.util.Scanner;

class CheckAlphabetCase
{
	public static void main(String[] args) {

	  Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        String type = (ch >= 'A' && ch <= 'Z') ? "uppercase" : ((ch >= 'a' && ch <= 'z') ? "lowercase" : "not an alphabet");

        System.out.println(ch + " is " + type + " alphabet.");

	}
}