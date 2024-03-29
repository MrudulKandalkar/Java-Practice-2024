import java.util.Scanner;

class SquareRoot
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter A Number : ") ;
		int num = sc.nextInt();
		boolean flag = false;
		int sqrrt=0;

		for (int i=1;i<=num/2;i++)
		{
			if(i*i==num){
				flag = true;
				sqrrt = i;
				break;
				                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
			
			}
		}
		if (flag){
			System.out.println(sqrrt + " is a perfect SquareRoot of num "+num);

		}else{
			System.out.println(num + " Do not have a perfect SquareRoot");
		}
	}
}