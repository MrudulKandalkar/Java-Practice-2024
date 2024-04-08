public class DemoExample
{
	public static void main(String[] args) {
		System.out.println("HI From DemoExample");
		DemoExample.m1();
		DemoExample1.m2();
	}
	public static void m1()
	{
		System.out.println("Hi From M1 Method");
	}
}
class DemoExample1
{
	public static void main(String[] args) {
		System.out.println("Hi From DemoExample1");
		DemoExample1.m2();
	}
	public static void m2() {
		System.out.println("Hi From M2 Method");
		
	}
}