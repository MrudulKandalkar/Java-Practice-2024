class Book 
{
	String title;
	String genr	int publishYear;
	String language;
	int noOfPages;
	double price;


	Book(String title , String genre ,int publishYear ,String language ,int noOfPages ,double price)
	{
		this.title=title;
		this.genre=genre;
		this.publishYear=publishYear;
		this.language=language;
		this.noOfPages=noOfPages;
		this.price=price;
	}
	public void displayBook()
	{
		System.out.println("****Book Details ****");
		System.out.println("Title : " + this.title);
		System.out.println("Genre : "+ this.genre);
		System.out.println("PublishYear : " + this.publishYear);
		System.out.println("Language : " + this.language);
		System.out.println("No Of Pages : " + this.noOfPages);
		System.out.println("Price : " + this.price);
	}
}