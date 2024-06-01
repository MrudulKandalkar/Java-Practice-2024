class Parent
{
	String str1 ="HII FROM PARENT CLASS";
	void m1()
	{
		System.out.println("HELLO FROM PARENT m1()");
	}

	static void m3()
	{
		System.out.println("HELLO FROM m1() STATIC PARENT");
	}
}

class Child extends Parent
{
	String str2 ="HII FROM CHILD CLASS";
	void m2()
	{
		System.out.println("HELLO FROM CHILD CLASS m2()");
		m1();
		m3();
		System.out.println(super.str1);
	}

	static void m4()
	{
		System.out.println("HELLO FROM m4() STATIC CHILD");
	}
}

class InheritanceDriver
{
	public static void main(String[] args)
	 {
	 	Child obj = new Child();
	 	obj.m2();

	 	System.out.println(obj.str2);
	 	obj.m1();

	 	System.out.println(obj.str1);
	 	obj.m1();
		
	 }
	
}