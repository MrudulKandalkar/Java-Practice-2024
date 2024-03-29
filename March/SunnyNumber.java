import java.util.Scanner;

class SunnyNumber
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter A Number : ") ;
		int num = sc.nextInt();
		int nnum= num+1;
		boolean flag = false;
		int sqrrt=0;

		for (int i=1;i<=nnum/2;i++)
		{
			if(i*i==nnum){
				flag = true;
				sqrrt = i;
				break;
				                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
			
			}
		}
		if (flag){
			System.out.println(sqrrt + " is a  Sunny num of  "+num);

		}else{
			System.out.println(num + " Not a Sunny Num");
		}
	}
}