 import java.util.*;

 class EvenStringBigWordInSen
 {
 	public static void main(String[] args) 
 	{
 		Scanner sc=new Scanner(System.in);
 		System.out.print("Enter a String : ");
 		String str=sc.nextLine();

 		String [] words=str.split(" ");
 		int max=0;
 		String op="";
 		for (String i : words ) 
 		{
 			int len=i.length();
 			if (max<len &&len%2==0) 
 			{
 				max=len;
 				op=i;				
 			}
 		}
 		System.out.print(str + " : "+ op);
 	}
 }
