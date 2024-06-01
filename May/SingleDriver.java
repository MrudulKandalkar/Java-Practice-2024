import java.util.*;
class ProgrammingLanguage
{
	String type;
	String level;
	int inventedYear;
	String foundername;
	double latestVersion;
	String extension;


ProgrammingLanguage(String type,String level,int inventedYear,String foundername,double latestVersion,String extension)
  {
	super();
	this.type=type;
	this.level=level; 
	this.inventedYear=inventedYear;
	this.foundername=foundername;
	this.latestVersion=latestVersion;
	this.extension=extension;
  }

public void displayProgrammingLanguage()
  {
  System.out.println();
	System.out.println("***PROGRAMMING LANGUAGE***");
	System.out.println("Type:"+this.type);
	System.out.println("Level:"+this.level);
	System.out.println("Invented Year:"+this.inventedYear);
	System.out.println("Founder Name:"+this.foundername);
	System.out.println("Latest Version:"+this.latestVersion);
	System.out.println("Extension:"+this.extension);
  }
}

class Java extends ProgrammingLanguage
{
	String [] features;
	boolean platformIndependent;

	Java(String [] features,boolean platformIndependent,String type,String level,int inventedYear,String foundername,double latestVersion,String extension)
	{
		super(type,level,inventedYear,foundername,latestVersion,extension);
		this.features=features;
		this.platformIndependent=platformIndependent;
	}

	public void displayJava()
	{
		System.out.println();
		System.out.println("**JAVA***");
		System.out.println("It is a platform Independent:"+this.platformIndependent);
		System.out.println("Features of java :" + Arrays.toString(this.features));
		System.out.println();
	}
}

class SingleDriver
{
	public static void main(String[] args)
	 {
	 	String [] features = {"1.MultiThearded" ,"2.Secure & Robust","3.Portable","4.Dyanamic"};
	 	Java obj = new Java(features,true,"Object Oriented","High level",1991,"James Gosling",22.1,".java");
	 	obj.displayProgrammingLanguage();
	 	obj.displayJava();

	 }
}