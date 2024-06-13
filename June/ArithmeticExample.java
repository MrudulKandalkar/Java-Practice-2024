import java.util.*; 
class UserArithematicException extends RuntimeException
{
	UserArithematicException(String desc)
	{
		super(desc);
	}
}

class ArithmeticExample
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter Num 2 :");
		int num2 = sc.nextInt();

		if(num2==0)
		{
			try{
				throw new UserArithematicException("Dividing a number by zero..");
			}
			catch(UserArithematicException i)
			{
				System.out.println(i.getMessage());
			}
		}
		else 
		{
			System.out.println(num1/num2);
		}

	}
}