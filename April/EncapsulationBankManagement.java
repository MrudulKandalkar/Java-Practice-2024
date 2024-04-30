import java.util.*;

class Info
{
	private String accountHolderName; 
	private String address;
	private long adharNumber;
	private String panNumber;
	private int upiPin;
	private double balance;
	private long phoneNumber;

	Info(String accountHolderName, String address ,long adharNumber,String panNumber,int upiPin , double balance , long phoneNumber)
	{
		this.accountHolderName =accountHolderName;
		this.address=address;
		this.adharNumber=adharNumber;
		this.panNumber=panNumber;
		this.upiPin=upiPin;
		this.balance=balance;
		this.phoneNumber=phoneNumber;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	public void setAccountHolderName(String updateAccountHolderName)
	{
		this.accountHolderName=updateAccountHolderName;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String updateAddress)
	{
		 this.address=updateAddress;
	}
	public long getAdharNumber()
	{
		return adharNumber;
	}
	public String getPanNumber()
	{
		return panNumber;
	}
	public int getUpiPin()
	{
		return upiPin;
	}
	public void setUpiPin(int upiPin)
	{
		 this.upiPin=upiPin;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public long getPhoneNumber()
	{
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber)
	{
		this.phoneNumber=phoneNumber;
	}

}

class EncapsulationBankManagement
{
	static Info obj1=null;
	public static  void main(String[] args) 
	{
		boolean flag=true;

		
		for( ; ; )
		{
				System.out.println("***Bank Service***");
				System.out.println("1.Create Account ");
				System.out.println("2.Existing User");
				System.out.println("3.Exit");
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter the Option : ");
				int opt=sc.nextInt();
				if (opt==1) 
				{
					createAccount();
					
				}else if(opt==2)
				{
					existingUser();
				}else if(opt==3)
				{
					break;
				}else
				{
					System.out.println("Invalid Option");
				}
		}

	}
	public static  void createAccount()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Account Holder Name : ");
		String name= sc.next();
	
		System.out.print("Enter Address : ");
		String address= sc.next();
		
		System.out.print("Enter Adhar Number : ");
		long adharNumber=sc.nextLong();

		System.out.print("Enter Pan Number : ");
		String panNumber=sc.next();
		
		System.out.print("Enter UPI PIN : ");
		int upiPin=sc.nextInt();

		System.out.print("Deposit Balance : "); 
		double balance=sc.nextDouble();

		System.out.print("Enter PhoneNumber : ");
		long phoneNumber =sc.nextLong();

		System.out.println("Account Created Successfully");
		

	    obj1= new Info(name,address,adharNumber,panNumber,upiPin,balance,phoneNumber);

		

	}
	public static void existingUser()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Check Balance");
		System.out.println("2.Deposit Amount");
		System.out.println("3.Withdraw Amount");
		System.out.println("4.Update Account");
		System.out.println("5.LogOut");
		System.out.print("Enter The Option : ");
		int opt1= sc.nextInt();
		if (opt1==1) 
		{
			System.out.print("Enter Your Pin : ");
			int ePin=sc.nextInt();
			if (ePin==obj1.getUpiPin()) 
			{
				System.out.print("Your Bank Balance is " + obj1.getBalance());
			}else{
				System.out.print("Incorrect Pin");
			}

			
		}else if (opt1==2) 
		{
			System.out.print("Enter The Amount : ");
			int amount = sc.nextInt();
			obj1.setBalance(amount +obj1.getBalance());
		}else if(opt1==3)
		{
			System.out.print("Enter Your Pin : ");
			int ePin=sc.nextInt();

			if (ePin==obj1.getUpiPin()) 
			{
				System.out.print("Enter The Amount : ");
				int amount = sc.nextInt();
				if (amount<=obj1.getBalance()) 
				{
					obj1.setBalance(obj1.getBalance()-amount);
					System.out.println("Withdraw Successful ");

				}else{
					System.out.println("Insufficeint Amount (Garib Ho Tum)");
				}
			}else{
				System.out.println("Invalid PIN");
			}
			
		}else if(opt1==4)
		{
			System.out.print("Enter Your Pin : ");
			int ePin=sc.nextInt();

			if (ePin==obj1.getUpiPin())
			{
				System.out.println("1.Update Name");
				System.out.println("2.Update Address");
				System.out.println("3.Update UPI PIN");
				System.out.println("4.Update Phone Number");
				System.out.print("Enter the Option : ");
				int opt11=sc.nextInt();
				if (opt11==1) 
				{
					System.out.print("Enter Your Name : ");
					String updatedName=sc.next();
					obj1.setAccountHolderName(updatedName);
					System.out.print("Your Name Updated Successfully to "+ updatedName);

				}else if (opt11==2)
				{
					System.out.print("Enter Your Address : ");
					String updatedAddress=sc.next();
					obj1.setAddress(updatedAddress);
					System.out.print("Your Address Updated Successfully to "+ updatedAddress);
				}else if(opt11==3)
				{
					System.out.print("Enter Your PIN : ");
					int updatedPin=sc.nextInt();
					obj1.setUpiPin(updatedPin);
					System.out.print("Your Pin Updated Successfully  ");
				}
				else if (opt11==4) 
				{
					System.out.print("Enter Your Phone Number : ");
					int updatedNumber=sc.nextInt();
					obj1.setUpiPin(updatedNumber);
					System.out.print("Your Number Updated Successfully to "+ updatedNumber);
				}
			} 
			else{
				System.out.println("Invalid PIN");
			}	
		}else if(opt1==5)
		{
			System.exit(0);
		}
		
		
	}


}