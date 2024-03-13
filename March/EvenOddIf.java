/*Q. Write a program to check if the user entered number is
EVEN or ODD ?
/Note : If the number is divisible by 2, it is EVEN number.
If the number is not divisible by 2 then it is ODD number*/

import java.util.Scanner;
class EvenOddIf
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number");
        int num=sc.nextInt();
        if((num%2)==0)
        {
        	System.out.println("Even");
        }
        else
        {
        	System.out.println("Odd");
        }
		

	}
}