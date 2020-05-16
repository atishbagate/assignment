/*create a Vehicle class with features and functions.
create a Owner class who access the Vehicle functions and features 

1] In Vehicle class all the data and function members should be static.
2] In Vehicle class all the data and function members should be non-static.*/

class Himalayan
{
	static String  type = "adventure";
	static String Brand = " bullet ";
	static String Model = " himalayan ";
	static String BikeSpec = " 411cc engine ";
	static String Avereage = " 31 kms/ltr ";
	static int YearOfLaunch = 2020;
	static int Gear = 5;
	static String Price = " 2 lakhs ";
	

	public static void ABS()
	{
		System.out.println(" bike   have great ABS break System Dual side. " );
	}

	public static void engine()
	{
		System.out.println("bike has powerfull engine");
	}

	public static void FuelTank()
	{
		System.out.println(" best fuel tank of 15Ltr. ");
	}
}

class Owner
{
	public static void main(String[] args) 
	{
		System.out.println("name of bike is "+Himalayan.Model+ "of Brand"+Himalayan.Brand+ "and type is "+Himalayan.type+"is a best bike for trip");
		System.out.println("its specifications are as follows ===");
		System.out.println(" Milage " +Himalayan.Avereage+ "and"+Himalayan.Model+ "engine of "+Himalayan.BikeSpec+"with"+Himalayan.Gear);
		System.out.println("price is off showroom "+Himalayan.Price+ "Launched in Year "+Himalayan.YearOfLaunch);
		System.out.println("Funtions are as follows ");
		Himalayan.ABS();
		Himalayan.engine();
		Himalayan.FuelTank();

	}
}