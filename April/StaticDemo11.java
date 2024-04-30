class StaticDemo11
{
	public static void main(String[] args) 
	{
		System.out.println("Hello From Main");
	 StaticDemo11 obj= new StaticDemo11();
	 	obj.m1(); 
	}
	public void m1()
	{
		System.out.println("Hello From Demo11 M1");
		StaticDemo12 obj= new StaticDemo12(); 
		obj.m2();

	}
}
class StaticDemo12
{
	
	public void m2 ()
	{
		System.out.println(" Hello From  Demo12 M2");
		m3();
	}
	public void m3 ()
	{
		System.out.println("Hello From Demo12 M3");
	}
}