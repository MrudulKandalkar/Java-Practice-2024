class NonStaticExample
{
	String str1="Hi I am from NonStaticExample class ";

	public static void main(String[] args) 
	{
		System.out.println("Hello From Main");
		NonStaticExample1 obj = new NonStaticExample1();
		obj.m1();
	}
}

class  NonStaticExample1
{
	static NonStaticExample obj = new NonStaticExample();
	void m1()
	{
		System.out.println("Hi From m1()");
		System.out.println(obj.str1);
		m2();
	}
	void m2()
	{
		System.out.println("Hi From m2");
		System.out.println(obj.str1);
		m3();
	}
	static void m3()
	{
		System.out.println("Hi From m3() static");
		System.out.println(obj.str1);
	}
} 