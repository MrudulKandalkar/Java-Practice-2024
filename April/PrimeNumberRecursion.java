import java.util.*;

class PrimeNumberRecursion
 {
 	static int num = 2;
 	static int i =2;
 	static boolean flag = true;
 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter the Number : ");
 		num = sc.nextInt();
 		prime();
 		System.out.print(flag?"Prime":"Not Prime ");
 	}

 	public static void prime()
 	{
 		if (i==num) {
 			return;
 		}
 		if (num%i==0)
 		{
 			flag = false;
 		    return;
 		}
 		i++;
 		if (i==num) {
 			return;
 		}
 		prime();
 	}
}







// 	static int num =0;
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter the Number :");
// 		num = sc.nextInt();

// 		primeNumber();
// 	}

// 	public static void primeNumber()
// 	{  boolean flag = true;
//         for (int i = 2; i < num; i++) {
//             if (num % i == 0) {
//                 flag = false;
//                 break;
//             }
//         }
//         if (flag) {
//             System.out.println(num + " is Prime");
//         } else {
//             System.out.println(num + " is Not Prime");
//         }
// 	}

}