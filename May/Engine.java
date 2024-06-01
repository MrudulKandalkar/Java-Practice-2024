class Engine
{
	double horsePower, capacity ,mileage;
	String engineType;
	int noOfPistons;


	Engine(double horsePower,double capacity, String engineType,double mileage ,int noOfPistons)
	{
		this.horsePower=horsePower;
		this.capacity=capacity;
		this.mileage=mileage;
		this.engineType=engineType;
		this.noOfPistons=noOfPistons;

	}

	public void displayEngine()
	{
		System.out.println("***Engine Details***");
		System.out.println("Horse Power : "+ this.horsePower);
		System.out.println("Capacity : "+ this.capacity);
		System.out.println("Mileage : "+ this.mileage + " km/l");
		System.out.println("Engine Type : "+ this.engineType);
		System.out.println("No Of Pistons : "+ this.noOfPistons);
	}
}


