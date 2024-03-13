import java.util.Scanner;

class LargerNumberBetween3Number

{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The 1st Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter The 2nd Number :");
        int num2 = sc.nextInt();
        System.out.print("Enter The 3nd Number :");
        int num3 = sc.nextInt();
        int max1= (num1<num2)?((num2<num3)?num3:num2):((num1<num3)?num3:num1);
        
       //int max1= (num1<num2)?num2:num1;
       //int max2= (num3<max1)?max1:num3;
        System.out.println(num1 + " , "+ num2  + ", "+num3+ " Larger among 3 number is "+ max1);
	}
}