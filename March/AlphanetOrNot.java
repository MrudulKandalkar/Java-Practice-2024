//write a java program is whether character is alphabet or not 
import java.util.Scanner;

class AlphanetOrNot
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Character : ");
		char ch = sc.next().charAt(0);
		System.out.println(((ch>='A'&&ch<='Z')|| (ch>='a' && ch<'z'))?"Alphabet":"   Not Alphabet");
	}
}