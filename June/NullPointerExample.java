import java.util.*;
class UserNPE extends RuntimeException 
{
	UserNPE(String desc)
	{
		super(desc);
	}
}
class Student
{
	String name;
	String nplace;
	Student(String name,String nplace)
	{
		this.name=name;
		this.nplace=nplace;
	}
}
class NullPointerExample
{
	public static void main(String[] args) 
	{
		Student obj=new Student("Ramesh","Pune");
		System.out.println(obj.name);
		Student obj1=null;

		if (obj1==null) 
		{
			try
			{
			   throw new UserNPE("Object Is null");

			}
			catch(UserNPE np)
			{
				np.printStackTrack();
			}
		}
		else 
		{
			System.out.println(obj1.name);
		}
	}
}