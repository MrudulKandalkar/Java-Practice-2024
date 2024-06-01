
class AssaultRifle
{
	String type;
	String calibers;

	AssaultRifle(String type,String calibers)
	{
		super();
		this.type=type;
		this.calibers=calibers;
	}
	void displayAssaultRifle()
	{
		System.out.println();
		System.out.println("***Assault Rifle Details***");
		System.out.println("Type Of AR : "+this.type);
		System.out.println("Caliber : "+ this.calibers);
	}
}

 
class M416 extends AssaultRifle
{
	String rateOfFireM4;
	double effectiveRangeM4;
	double weightM4;
	double overallLengthM4;
	double magazineCapacityM4;

	M416(String rateOfFireM4,double effectiveRangeM4 ,double weightM4,double overallLengthM4,double magazineCapacityM4,String type,String calibers)
	{
		super( type,calibers);
		this.rateOfFireM4=rateOfFireM4;
		this.effectiveRangeM4=effectiveRangeM4;
		this.weightM4=weightM4;
		this.overallLengthM4=overallLengthM4;
		this.magazineCapacityM4=magazineCapacityM4;
	}
	void displayM416()
	{
		System.out.println();
		System.out.println("*****M416 Details*****");
		System.out.println("Rate Of Fire : "+this.rateOfFireM4+" Per Minute.");
		System.out.println("Effective Range : "+this.effectiveRangeM4+" Meters.");
		System.out.println("Weight Of AR : "+ this.weightM4 +" KG.");
		System.out.println("Overall Length Of Gun : "+ this.overallLengthM4 + " Cm.");
		System.out.println("Magazine Capacity : "+this.magazineCapacityM4 + " Rounds.");
		System.out.println("________________________________________________________________________________________");
	}

}

class AKM extends AssaultRifle
{
	String rateOfFireAkm;
	double effectiveRangeAkm;
	double weightAkm;
	double overallLengthAkm;
	double magazineCapacityAkm;

	AKM(String rateOfFireAkm,double effectiveRangeAkm ,double weightAkm,double overallLengthAkm,double magazineCapacityAkm,String type,String calibers)
	{
		super(type,calibers);
		this.rateOfFireAkm=rateOfFireAkm;
		this.effectiveRangeAkm=effectiveRangeAkm;
		this.weightAkm=weightAkm;
		this.overallLengthAkm=overallLengthAkm;
		this.magazineCapacityAkm=magazineCapacityAkm;
	}
	void displayAKM()
	{
		System.out.println();
		System.out.println("*****AKM Details*****");
		System.out.println("Rate Of Fire : "+this.rateOfFireAkm+" Per Minute.");
		System.out.println("Effective Range : "+this.effectiveRangeAkm+" Meters.");
		System.out.println("Weight Of AR : "+ this.weightAkm +" KG.");
		System.out.println("Overall Length Of Gun : "+ this.overallLengthAkm + " Cm.");
		System.out.println("Magazine Capacity : "+this.magazineCapacityAkm + " Rounds.");
		System.out.println("________________________________________________________________________________________");
	}

}

class M16A4 extends AssaultRifle
{
	String rateOfFireM16a4;
	double effectiveRangeM16a4;
	double weightM16a4;
	double overallLengthM16a4;
	double magazineCapacityM16a4;

	M16A4(String rateOfFireM16a4,double effectiveRangeM16a4,double weightM16a4,double overallLengthM16a4,double magazineCapacityM16a4,String type,String calibers)
	{
		super(type,calibers);
		this.rateOfFireM16a4=rateOfFireM16a4;
		this.effectiveRangeM16a4=effectiveRangeM16a4;
		this.weightM16a4=weightM16a4;
		this.overallLengthM16a4=overallLengthM16a4;
		this.magazineCapacityM16a4=magazineCapacityM16a4;
	}
	void displayM16A4()
	{
		System.out.println();
		System.out.println("*****M16A4 Details*****");
		System.out.println("Rate Of Fire : "+this.rateOfFireM16a4+" Per Minute.");
		System.out.println("Effective Range : "+this.effectiveRangeM16a4+" Meters.");
		System.out.println("Weight Of AR : "+ this.weightM16a4 +" KG.");
		System.out.println("Overall Length Of Gun : "+ this.overallLengthM16a4 + " Cm.");
		System.out.println("Magazine Capacity : "+this.magazineCapacityM16a4 + " Rounds.");
		System.out.println("________________________________________________________________________________________");
	}

}

class AssaultRifleDriver
{
	public static void main(String[] args) 
	{
		M416 obj= new M416("700-900 Rounds",600,2.98,88,30,"Gas-Operated ","5.56x45mm ");
		obj.displayAssaultRifle();
		obj.displayM416();

		AKM obj1= new AKM("600 Rounds",400,3.1,88,30,"Gas-Operated ","7.62x39mm ");
		obj1.displayAssaultRifle();
		obj1.displayAKM();
		//String rateOfFireM16a4,double effectiveRangeM16a4,double weightM16a4,double overallLengthM16a4,double magazineCapacityM16a4,String type,String calibers

		M16A4 obj2= new M16A4("700-950 Rounds",800,3.26,100,30,"Gas-Operated ","5.56x45mm ");
		obj2.displayAssaultRifle();
		obj2.displayM16A4();
	}
}	