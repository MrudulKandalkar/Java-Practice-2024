import java.util.Scanner;

class k
{
	static String ename;
	static int eid;
	static String erole;
	static double esal;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("****Welcome****");
		System.out.println();
		features:
		for (; ; ) {
			System.out.println("FEATURES ****");
			System.out.println("1. Add New Employee");
			System.out.println("2. View All Employee");
			System.out.println("3. Edit Employee");
			System.out.println("4. Exit");
			System.out.println();
			System.out.print("Enter the Option : ");
			int opt =sc.nextInt();
			switch(opt)
			{
				case 1:{
					addNewEmployee();
					break;
				}
				case 2:{
					System.out.println("Enter the Employee Id : ");
					int eid1 = sc.nextInt();
					viewEmployee(eid1);
					break;
				}
				case 3:{
					System.out.print("Enter Employee Id : ");
					int eid1 =sc.nextInt();
					updateEmployee(eid1);
					break;
				}
				case 4:{
					System.exit(0);
					break;
				}
			    default :{
			    	System.out.println("Incorrect Option ");
			    }
			}
			
		}
	}
	public static void addNewEmployee() {
		Scanner sc =new Scanner(System.in);
		System.out.println("** Enter New Employee Data **");
		System.out.print("Employee Name : ");
		ename = sc.nextLine();
		System.out.print("Employee Id : ");
		eid = sc.nextInt();
		Scanner s =new Scanner(System.in);
		System.out.print("Employee Role : ");	
		erole=s.nextLine();
		System.out.print("Employee Salary : ");
		esal=s.nextDouble(); 
 

	}


	public static void viewEmployee(int eid1)
	{
		if (eid==eid1) {
		System.out.println("Employee Data");
		System.out.println("Name :  "+ ename);
		System.out.println("Id :  "+ eid);
		System.out.println("Role :  "+ erole);
		System.out.println("Salary:  "+ esal);
			
		}else {
			System.out.println(" Wrong EID");
		}
	}
	public static void updateEmployee(int eid1)
	{
		Scanner sc =new Scanner(System.in);
	 if (eid==eid1)
	 	 {       
                update:
	 		  	for (; ; ) {
	 				System.out.println("1.Edit Name");
	 				System.out.println("2.Update Role");
	 				System.out.println("3.Revice Salary");
	 				System.out.println("4.Exit");
	 				int opt1 =sc.nextInt();
	 				switch (opt1) {
	 					case 1 :{ System.out.print("Enter New Name :");
	 						      sc.nextLine();
	 					         String nname = sc.nextLine();
	 					         ename = nname;
	 					         System.out.println("Edit Successful ");
	 					         System.out.println();
	 					         break update;
	 					     	}
	 					case 2 :{ System.out.print("Enter New Role :");
	 						      sc.nextLine();
	 					         String nrole = sc.nextLine();
	 					         erole=nrole;
	 					         System.out.println("Update Successful ");
	 					         System.out.println();
	 					         break update;
	 					     	}
	 		         	case 3 :{ System.out.print("Enter Revice Salary :");
	 						      sc.nextLine();
	 					         double nsal = sc.nextDouble();
	 					         esal = nsal;
	 					         System.out.println("Update  Successful ");
	 					         System.out.println();
	 					         break update;
	 					     	}
	 					case 4:{
								System.exit(0);
									break;
						    	}
						default :{
								   System.out.println("Incorrect Option ");
								 }


	 			 	}

	 			
	 			}
		 }else {
		 	System.out.println("Invalied Input");
		 }	
	}
}


