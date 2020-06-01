//3 programs to demonstrate the application of constructor in practical example.

class A
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");

		Car sRef = new Car();
		sRef.setVal("mustang",2201,2020,2000000);
		sRef.viewData();

		System.out.println("main ends");	
		return ;
	}

}

class Car
{
	String name;
	int modelNo;
	int yearOfLaunch;
	int price;

	public void setVal(String n, int a1,int a2,int a3)

	{
		System.out.println("setVal starts");
		name = n;
		modelNo = a1;
		yearOfLaunch = a2;
		price = a3;
		System.out.println("setVal ends");
		return;

	}

	public void viewData()
	{
		System.out.println("viewData starts");
		System.out.println("name of car = "+name);
		System.out.println("car model name = "+modelNo);
		System.out.println("year Of Launch = "+yearOfLaunch);
		System.out.println("price = "+price);
		System.out.println("viewData ends");
		return ;
	}

}