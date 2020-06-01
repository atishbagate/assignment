class A
{
	public static void main(String[] args) 
	{
	System.out.println("main start");

  	Laptop l1	= new Laptop();

  	l1.laptop("insperon","Dell","gaming");
  	l1.show_data();



	System.out.println("main ends");	
	}
}
class Laptop
{
	String name;
	String brand;
	String type;

	public void laptop(String name, String brand, String type)
	{
		this.name = name;
		this.brand = brand;
		this.type = type;
	return;
	}
	public void show_data()
	{
		System.out.println("name of laptop is = "+name);
		System.out.println("brand is  = "+brand);
		System.out.println("type of laptop = "+type);
	return;
	}
}