class Ball
{
	double radius;
	double diameter;
	double weight;
	String type;
	String color;
	String brand;
	public void displayball()
	{
		System.out.println("***Ball Details***");
		System.out.println("Radius : "+ radius+"cm");
		System.out.println("Diameter : " +diameter+"cm");
		System.out.println("Weight : "+ weight+"gram");
		System.out.println("Type : "+type);
		System.out.println("Color : "+color);
		System.out.println("Brand : "+brand);
	}	

}


class BallObjectDriver
{
	public static void main(String[] args) 
	{
		Ball obj=new Ball();
		obj.radius=3.5;
		obj.diameter=7;
		obj.weight=125;
		obj.type= "Tennis";
		obj.color= "Green";
		obj.brand= "Cosco";
		obj.displayball();

	}
}