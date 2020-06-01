class A
{
	public static void main(String[] args) 
	{
		System.out.println("main starts ");
		Bike ref = new Bike();

		ref.Val("bullet",12,"mountain_road");
		ref.showdata();

		ref.update("hero",125,"city_road");
		ref.showdata();

		ref.update_brand("honda");
		ref.showdata();

		ref.delete_brand();
		ref.showdata();
		ref.show_brand();

		ref.delete_model();
		ref.show_model();

		ref.delete_type();
		ref.show_type();

		ref.update("bajaj",220,"off_road");
		ref.showdata();

		System.out.print("main ends");	
	}
}

class Bike
{
	String brand;
	int model;
	String type;

	public void Val(String a1, int a2, String a3)
	{
		System.out.println("-----------------------------------------");
		System.out.println("Value initialiezed");

		brand = a1;
		model = a2;
		type = a3;
		System.out.println("-----------------------------------------");
		return;	
	}
//Value of brand changes seperately and delete it and show data seperately.
	public void update_brand(String a1)
	{
		System.out.println("-----------------------------------------");
		System.out.println("deleted value");
		brand = a1;

		System.out.println("-----------------------------------------");
		return;
	}
	public String delete_brand()
	{System.out.println("-----------------------------------------");
		System.out.println("deleted value");
		brand = "";
		System.out.println("-----------------------------------------");
		return brand;
	}
	public String show_brand()
	{System.out.println("-----------------------------------------");
		System.out.println("show_brand");
		System.out.println("-----------------------------------------");
		return brand;

	}

//Value of model changes seperately and delete it and show data seperately.
	public void update_model(int a2)
	{
		System.out.println("-----------------------------------------");
		System.out.println("deleted value");
		model = a2;

		System.out.println("-----------------------------------------");
		return;
	}
	public int delete_model()
	{System.out.println("-----------------------------------------");
		System.out.println("deleted value");
		model = 00;
		System.out.println("-----------------------------------------");
		return model;
	}
	public int show_model()
	{System.out.println("-----------------------------------------");
		System.out.println("show_brand");
		System.out.println("-----------------------------------------");
		return model;

	}

//Value of type changes seperately and delete it and show data seperately.
	public void update_type(String a3)
	{
		System.out.println("-----------------------------------------");
		System.out.println("deleted type");
		type = a3;

		System.out.println("-----------------------------------------");
		return;
	}
	public String delete_type()
	{System.out.println("-----------------------------------------");
		System.out.println("deleted value");
		type = "";
		System.out.println("-----------------------------------------");
		return type;
	}
	public String show_type()
	{System.out.println("-----------------------------------------");
		System.out.println("show_brand");
		System.out.println("-----------------------------------------");
		return type;

	}




	public void update(String a1, int a2, String a3)
	{
		System.out.println("-----------------------------------------");

		System.out.println("updated Value");

		brand = a1;
		model = a2;
		type = a3;

		System.out.println("-----------------------------------------");
		return;
	}
	public void delete()
	{
		System.out.println("-----------------------------------------");
		System.out.println("deleted Value");
		brand = "";
		model = 0;
		type = "";
		System.out.println("-----------------------------------------");
		return;
	}

	public void showdata()
	{
		System.out.println("-----------------------------------------");
		System.out.println("show data");
		System.out.println("brand = "+brand);
		System.out.println("model = "+model);
		System.out.println("type = "+type);
		return;
	}


}