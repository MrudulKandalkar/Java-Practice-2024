import java.util.Scanner;//importing scanner class
class ScannerExample 
{
 public static void main(String[] args)
  {
		Scanner sc =new Scanner(System.in);//creating an obj of scanner
		System.out.print("Enter Your Name :");
		String name = sc.next().toLowerCase();//util the methods of scnner ref variables
		char ch =name.charAt(0);//extracting the charater which is at 0th index
		System.out.println("Hi My Name IS "+name+" And My First Character is "+ch);
		if(ch=='a' || ch=='e'|| ch=='i' || ch=='o'  || ch=='u')
		{
			System.out.println("Character"+ ch+" Is a Vowel");
		}else {
			System.out.println("Character"+ch+" Is a Cnsonent");
		}
	}
}