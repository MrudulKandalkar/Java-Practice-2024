class SingletonStudent
{
	String name;
	String branch;

	static SingletonStudent singletonObject=null;
	private SingletonStudent(String name,String branch)
	{
		this.name=name;
		this.branch=branch;
	}
	public static void main(String[] args) 
	{
		SingletonStudent obj=getInstance();
		System.out.println(obj);
		SingletonStudent obj1=getInstance();
		System.out.println(obj1);
	}
	public static SingletonStudent getInstance()
	{
		if (singletonObject == null) 
		{
			singletonObject =new SingletonStudent("Ramesh","Mech");
			return singletonObject;
		}else
		{
			return singletonObject;
		}
	}
}