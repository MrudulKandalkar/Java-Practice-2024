class AuthorDriver
{
	public static void main(String[] args) 
	{
		Author obj = new Author("Mrudul","Indian",21,"Mrudul@gmail.com","Java","Tech",2024,"English",1200,1000000);
		obj.displayAuthor();
		obj.book.displayBook();
	}
}
//String name , String nationality , int age , String email
//String title , String genre ,int publishYear ,String language ,String noOfPages ,String price