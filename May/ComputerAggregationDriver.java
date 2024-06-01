class ComputerAggregationDriver
{
	public static void main(String[] args) 
	{
		Cpu obj=new Cpu(8,512,"i5","Nvidia GTX 1650");
		obj.displayCpu();
		//String brand, String displayType, String size ,String resolution
		Monitor obj1=new Monitor("LG","LED","32inch","1920x1080");
		obj1.displayMonitor();
		//String brand,String type,String buttons ,boolean scroll
		Mouse obj2=new Mouse("Logitech","Wireless",3,true);
		obj2.displayMouse();
		//String  brand, int noOfKeys,boolean backlight,String type
		Keyboard obj3=new Keyboard("Logitech",104,true,"Gaming");
		obj3.displayKeyboard();
		//String brand,String type, String noOfSpeakers,String watt
		Speaker obj4=new Speaker("JBL","BLUETOOTH",3,20);
		obj4.displaySpeaker();

	}
}
class Cpu
{
	int ram;
	int rom;
	String processor;
	String graphicCard;

	Cpu(int ram,int rom,String processor,String graphicCard)
	{
		this.ram=ram;
		this.rom=rom;
		this.processor=processor;
		this.graphicCard=graphicCard;
	}
	public void displayCpu()
	{
		System.out.println();
		System.out.println("****CPU DETAILS****");
		System.out.println("Ram : "+ this.ram);
		System.out.println("Rom : "+ this.rom);
		System.out.println("Processor : "+ this.processor);
		System.out.println("Graphics Card : "+ this.graphicCard);
	}
}
class Monitor
{
	String brand;
	String displayType;
	String size;
	String resolution;

	Monitor(String brand, String displayType, String size ,String resolution)
	{
		this.brand=brand;
		this.displayType=displayType;
		this.size=size;
		this.resolution=resolution;
	}
	public void displayMonitor()
	{
		System.out.println();
		System.out.println("****Monitor Details****");
		System.out.println("Brand : "+ brand);
		System.out.println("Display Type : "+ displayType);
		System.out.println("Size : "+ size);
		System.out.println("Resolution : "+ resolution);
	}
}
class Mouse
{
	String brand;
	String type;
	int buttons ;
	boolean scroll;

	Mouse(String brand,String type,int buttons ,boolean scroll)
	{
		this.brand=brand;
		this.type=type;
		this.buttons=buttons;
		this.scroll=scroll;
	}
	public void displayMouse()
	{
		System.out.println();
		System.out.println("****Mouse Details****");
		System.out.println("Brand : "+ brand);
		System.out.println("Type : "+ type);
		System.out.println("Button : "+ buttons);
		System.out.println("Scroll : "+ scroll);
	}

}
class Keyboard
{
	String brand;
	int noOfKeys;
	boolean backlight;
	String type;

	Keyboard(String  brand, int noOfKeys,boolean backlight,String type)
	{
		this.brand=brand;
		this.noOfKeys=noOfKeys;
		this.backlight=backlight;
		this.type=type;
	}
	public void displayKeyboard()
	{
		System.out.println();
		System.out.println("**** Keyword Details****");
		System.out.println("Brand : "+brand);
		System.out.println("No Of Keys : "+noOfKeys);
		System.out.println("Backlight : "+backlight);
		System.out.println("Type : "+ type);

	}

}
class Speaker
{
	String brand;
	String type;
	int noOfSpeakers;
	double watt;

	Speaker(String brand,String type, int  noOfSpeakers,double watt)
	{
		this.brand=brand;
		this.type=type;
		this.noOfSpeakers=noOfSpeakers;
		this.watt=watt;
	}

	public void displaySpeaker()
	{
		System.out.println();
		System.out.println("****Speakers Details****");
		System.out.println("Brand : "+brand);
		System.out.println("Type : "+type);
		System.out.println("No Of Speakers : "+ noOfSpeakers);
		System.out.println("Watt : "+ watt);
	}
}