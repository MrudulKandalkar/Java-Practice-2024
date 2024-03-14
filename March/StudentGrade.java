import java.util.Scanner;


class StudentGrade
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Percentage : ");
		double percentage = sc.nextDouble();

		if(percentage>100)
			{System.out.println("Invalide Percentage");}
		else if(percentage > 90)
			{System.out.println("Student Gets First Class Distinction  with O Grade ");}
		else if ( percentage >= 75 && percentage<90 )
			{System.out.println("Student Gets Distinction with A+ Grade");}
		else if (percentage >=60 && percentage <75 )
		{
		System.out.println("Student Gets First Class with A Grade");
		}
		else if (percentage>=35 && percentage < 60 )
			{System.out.println("Student Gets Second Class  with B Grade");}
		else 
		{
			System.out.println("Student Fail");
		}


    
	}
}