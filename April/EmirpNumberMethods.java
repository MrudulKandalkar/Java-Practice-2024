import java.util.*;

class EmirpNumberMethods
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		if (isPrime(num))
		{
			int rev = reverseNumber(num);
			System.out.println(isPrime(rev)?"Emirp":"Not Emirp");
			
		}else
		{
			System.out.println("Not Emirp");
		}
	}
	public static boolean isPrime(int num)
	{
		if(num<=1){
			return false;
		}
		boolean flag =true;
		for (int i=2;i<num ;i++ ) 
		{
			if (num%i==0) 
			{
				flag=false;
				break;
				
			}
			
		}
		return flag;
	}
	public static int reverseNumber(int num)
	{
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev =rev*10+rem;
			 num /=10;
		}
		return rev;
	}
}