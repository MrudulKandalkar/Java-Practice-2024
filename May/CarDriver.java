class CarDriver
{
	public static void main(String[] args) 
	{
		Car obj=new Car("TATA","NEXON","SUV",900000,5,(new Engine(120,1.2,"Petrol",16,4)));
		obj.displayCar();
		obj.engine.displayEngine();
	}
}