import java.util.*;

class FascinatingNumber
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print(" Enter the number : ");
		int num= sc.nextInt();
		int num1 =num *2;
		int num2 = num*3;
		String concat= ""+num+num1+num2;
		boolean flag1=true;
		System.out.println(concat);
		//        1   
		for (char c='1';c<='9' ;c++ ) 
		{
			int count=0;
			 //           8<9                              384576192
			for (int i=0;i<concat.length();i++ ) 
			{
				char a= concat.charAt(i);// 8
                   //==1
				if(a==c)
					count++;	
			}
			if(count>1 || count==0)	
			{
				flag1 = false;
				break;
			}
		}
		if(flag1)
			System.out.println("Fascinating Number");
		else 
			System.out.println("Not Fascinating Number");

	}
}