class AggregationDriver
{
	public static void main(String[] args) 
	{
		University obj=new University("SPPU","UNI123",1100,"Government",1950,300);
		obj.displayUniversity();
		obj.createInstanceOfCollege("MODERN COLLEGE","MCSPPU123","ShivajiNagar,Pune",10,100,'A');
		obj.college1.displayCollege();
		obj.college1.createInstanceOfDepartment("AI&ML","C A Ghune",8,8,48);
		obj.college1.department.displayDepartment();
		obj.college1.department.createInstanceOfTeacher("Sudarshan","JAVA",9090909090L,"MTECH",5.5);
		obj.college1.department.teacher.displayTeacher();

	}
}

class University
{
	String name;
	String uniCode;
	int noOfColleges;
	String type;
	int establishmentYear;
	int course;
	College college1;

	University(String name, String uniCode ,int noOfColleges , String type ,int establishmentYear,int course)
	{
		this.name=name;
		this.uniCode=uniCode;
		this.noOfColleges=noOfColleges;
		this.type=type;
		this.establishmentYear=establishmentYear;
		this.course=course;	
	}
	public void displayUniversity()
	{
		System.out.println();
		System.out.println("****University Details****");
		System.out.println("Name : "+this.name);
		System.out.println("University Code : "+this.uniCode);
		System.out.println("No Of Colleges : "+this.noOfColleges);
		System.out.println("Type : "+this.type);
		System.out.println("Establishment Year : "+this.establishmentYear);
		System.out.println("Number Of Courses : "+ this.course);
	}
	public void createInstanceOfCollege(String name, String collegeCode ,String address ,int noOfDept ,int staffCount,char grade)
	{
		 college1 =new College(name,collegeCode,address,noOfDept,staffCount,grade);
		
	}

}
class College
{
	String name;
	String collegeCode;
	String address;
	int noOfDept;
	int staffCount; 
	char grade;
	Department department;

	College(String name, String collegeCode ,String address ,int noOfDept ,int staffCount,char grade)
	{
		this.name=name;
		this.collegeCode=collegeCode;
		this.address=address;
		this.noOfDept=noOfDept;
		this.staffCount=staffCount;
		this.grade=grade;	
	}
	public void displayCollege()
	{
		System.out.println();
		System.out.println("**** College Details****");
		System.out.println("Name : "+this.name);
		System.out.println("College Code : "+this.collegeCode);
		System.out.println("Address : "+this.address);
		System.out.println("No Of Dept : "+this.noOfDept);
		System.out.println("Staff Count : "+this.staffCount);
		System.out.println("Grade : "+ this.grade);
	}
	public void createInstanceOfDepartment(String name, String head ,int classRoom ,int staff,int subjects)
	{
		department =new Department(name,head,classRoom,staff,subjects);
	}

}

class Department
{
	String name;
	String head;
	int  classRoom;
	int staff;
	int subjects; 
	Teacher teacher;
	

	Department(String name, String head ,int classRoom ,int staff,int subjects)
	{
		this.name=name;
		this.head=head;
		this.classRoom=classRoom;
		this.staff=staff;
		this.subjects=subjects;
	}
	public void displayDepartment()
	{
		System.out.println();
		System.out.println("**** Department Details****");
		System.out.println("Name : "+this.name);
		System.out.println("Head : "+this.head);
		System.out.println("ClassRoom : "+this.classRoom);
		System.out.println("Staff : "+this.staff);
		System.out.println("Subjects : "+this.subjects);
	}
	public void createInstanceOfTeacher(String name, String subject ,long phoneNumber ,String qualification,double experience)
	{
		 teacher =new Teacher(name,subject,phoneNumber,qualification,experience);
	}

}

class Teacher
{
	String name;
	String subject;
	long phoneNumber;
	String qualification;
	double experience; 
	

	Teacher(String name, String subject ,long phoneNumber ,String qualification,double experience)
	{
		this.name=name;
		this.subject=subject;
		this.phoneNumber=phoneNumber;
		this.qualification=qualification;
		this.experience=experience;
	}
	public void displayTeacher()
	{
		System.out.println();
		System.out.println("**** Teachers Details****");
		System.out.println("Name : "+this.name);
		System.out.println("Subject : "+this.subject);
		System.out.println("Phone Number: "+this.phoneNumber);
		System.out.println("Qualification : "+this.qualification);
		System.out.println("Experience : "+this.experience);
	}

}