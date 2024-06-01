class Animal
{
	String species;
	String eatingType;

	Animal(String species,String eatingType)
	{
		super();
		this.species=species;
		this.eatingType=eatingType;
	}
	void eat()
	{
		System.out.println(this.species +" is able to eat  ");
	}
	void displayAnimal()
	{
		System.out.println("***Animal Details****");
		System.out.println("Species : "+this.species);
		System.out.println("Eating Type : "+this.eatingType);
	}
}
class Dog extends Animal
{
	String breed;
	String originatedFrom;
	int lifeSpan;

	Dog(String breed, String originatedFrom ,int lifeSpan,String species,String eatingType)
	{
		super(species, eatingType);
		this.breed=breed;
		this.originatedFrom=originatedFrom;
		this.lifeSpan=lifeSpan;
	}

	void displayDog()
	{
		System.out.println();
		System.out.println("****DOG Details****");
		System.out.println("Breed : "+ this.breed);
		System.out.println("Originated From : "+ this.originatedFrom);
		System.out.println("LifeSpan : "+ this.lifeSpan);

	}
}

class Husky extends Dog
{
	String name;
	String color;
	double age;
	boolean previouslyOwned;

	Husky(String name, String color ,double age , boolean previouslyOwned,String breed, String originatedFrom ,int lifeSpan,String species,String eatingType)
	{
		super( breed,  originatedFrom , lifeSpan, species,eatingType);
		this.name=name;
		this.color=color;
		this.age=age;
		this.previouslyOwned=previouslyOwned;
	}

	void displayHusky()
	{
		System.out.println();
		System.out.println("****Husky Detail****");
		System.out.println("Name : "+ this.name);
		System.out.println("Age : "+this.age);
		System.out.println("Color : "+this.color);
		System.out.println("Previously Owned or Not : "+ this.previouslyOwned);
	}
}

class AnimalDriver
{
	public static void main(String[] args) 
	{
		Husky obj = new Husky("Rockey","Black and White Mix",1.2,true,"Husky","Siberia",15,"Dog","Omniverous");
		obj.displayAnimal();
		obj.eat();
		obj.displayDog();
		obj.displayHusky();
		//String name, String color ,double age , boolean previouslyOwned,String breed, String originatedFrom ,int lifeSpan,String species
	}
}	