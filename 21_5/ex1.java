//THIS keyword use 

class A
{ public static void main(String[] args) 
	{
		System.out.println("main start");

		Home h1 = new Home();

		h1.info("2_BHK","mumbai",300000);
		h1.show_date();

		Home h2 = new Home();

		h2.info("1BHK","chennai",400000);
		h2.show_date();

		System.out.println("main ends");

    }

}

class Home
{
	String type;
	String location;
	int price;

	public void info(String type, String location, int price)
	{
		this.type = type;
		this.location = location;
		this.price = price;
	return;
	}

	public void show_date()
	{
		System.out.println("_ _ _ __ _ _ __ _ _ __ _ _ __ _ _ __ _ _ _");

		System.out.println("house name is = "+type);
		System.out.println("Location is = "+location);
		System.out.println("price is = "+price);

		System.out.println("_ _ _ __ _ _ __ _ _ __ _ _ __ _ _ __ _ _ _");
	return;
	}


}


 /* ______________     
   |              |<-----H1
   | non - static |<-----this
   |   variables  |
   | non - static | 
   |   functions  | 
   |______________|  */ 

   /*______________     
   |              |<-----H2
   | non - static |<-----this
   |   variables  |
   | non - static | 
   |   functions  | 
   |______________|  */ 
