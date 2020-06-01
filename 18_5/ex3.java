//3 programs to demonstrate the application of constructor in practical example.

class A
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");

		Student sRef = new Student();
		sRef.intVal("atish",12,2,"science","basketball");
		sRef.showData();

		System.out.println("main ends");
		return;	
	}
}
class Student
{
	String name;
	int standard;
	int rollNo;
	String favSub;
	String favSports;


	public void intVal(String a1, int a2, int a3, String a4, String a5)
	{
		System.out.println("int val starts");

		name =  a1;
		standard = a2;
		rollNo = a3;
		favSub = a4;
		favSports = a5;

		System.out.println("int val ends");
		return;

	}

	public void showData()
	{
		System.out.println("showData starts");

		System.out.println("student name is = "+name);
		System.out.println("student studying in standard = "+standard);
		System.out.println("his roll no is = "+rollNo);
		System.out.println("his favorait subject is = "+favSub);
		System.out.println("his favorait sport is = "+favSports);
		System.out.println("showData ends");
		return;
	}
}
