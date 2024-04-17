class Car
{
	String brand;
	String model;
	String engine;
	String type;
	double mileage;
	byte seatingCapacity;
	double price;
	int noAirbags;
	public void displayCarDetails()
	{
		System.out.println("***Car Details***");
		System.out.println("Brand : "+ brand);
		System.out.println("Model : " +model);
		System.out.println("Engine : "+ engine);
		System.out.println("Type : "+type);
		System.out.println("Mileage : "+mileage);
		System.out.println("Seating Capacity : "+ seatingCapacity);
		System.out.println("Price : "+ price);
		System.out.println("No. Of Air Bags : "+ noAirbags);

	}	

}


class CarDriver
{
	public static void main(String[] args) 
	{
		Car obj=new Car();
		obj.brand="Hundai";
		obj.model="Venue";
		obj.engine="SI";
		obj.type= "SUV";
		obj.mileage= 18;
		obj.seatingCapacity= 5;
		obj.noAirbags=5;
		obj.price=1400000;
		obj.displayCarDetails();

	}
}