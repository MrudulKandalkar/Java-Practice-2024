class Bottle
{
	String material;
	double cap;
	double weight;
	void displayBottle()
	{
		System.out.println(material + " "+cap+ " "+ weight);
	}
}
class BottleDriver
{
	public static void main(String[] args) 
	{
		Bottle obj1=new Bottle();
		obj1.displayBottle();6

		
	}
}