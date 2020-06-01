class Student
{
public static void main(String[] args) 
 {
	System.out.println("main starts..");

	new Info();

	System.out.println("main ends..");	
 
 }
}

class Info
{
	static int rollno;
			String name;
			int standard;


		public static void subject()
		{
			System.out.println("fav subject is sports..");
			return;
		}

		public void address()
		{
			System.out.println("student is from latur dist, maharashtra.");
			return;
		}

	static
	{
		System.out.println("static block starts..");

		rollno = 201;

		Info info1 = new Info();

		info1.name = "ramesh";

		info1.standard = 12;

		System.out.println("rollno is static = "+rollno);

		System.out.println("non static name = "+info1.name);

		System.out.println("non static standard = "+info1.standard);

		subject();

		info1.address();


		System.out.println("static block ends..");
	}

}