class A
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");	

		Student s1  = new Student();
		s1.data("atish","12th",002);
		s1.show_data();


	
		System.out.println("main ends");
	}
}

class Student
{
	String name;
	String standard;
	int roll_number;

	public  void data(String name, String standard, int roll_number)
	{
		this.name = name;
		this.standard = standard;
		this.roll_number = roll_number;
	return;
	}

	public void show_data()
	{
		System.out.print("name of student is = "+name);
		System.out.print(" is in standard = "+standard);
		System.out.println(" and roll number is = "+roll_number);
	return;
	}
}