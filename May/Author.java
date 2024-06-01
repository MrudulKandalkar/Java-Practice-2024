class Author
{
	String name;
	String nationality;
	int age;
	String	email;
	Book book;

	Author(String name , String nationality , int age , String email,String title , String genre ,int publishYear ,String language ,int noOfPages ,double price)
	{
		this.name = name;
		this.nationality=nationality;
		this.age=age;
		this.email=email;
		this.book=new Book( title , genre , publishYear ,language,noOfPages ,price);

	}
	public void displayAuthor()
	{
		System.out.println("**** Author Details ****");
		System.out.println("Name : "+ this.name );
		System.out.println("Nationality : "+ this.nationality);
		System.out.println("Age Of Author : "+this.age );
		System.out.println("Email : "+ this.email);
	}
}
