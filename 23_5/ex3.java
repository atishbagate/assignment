class Bike
{
	String brand;
	String name;
	int kms_run;
	int petrol_consume;

	double avg;

	public Bike(String brand,String name,
	int kms_run,int petrol_consume)
	{
		this.brand = brand;
		this.name = name;

		this.kms_run = kms_run;
		this.petrol_consume = petrol_consume;
	return;
	}
	public Bike(int kms_run, int petrol_consume)
	{
		avg = kms_run/petrol_consume;
	return;

	}

	public void show_data()
	{System.out.println("---------------- bike details ----------");

	System.out.println("brand name = "+brand+" and bike name is = "+name);

	System.out.println("kms bike run "+kms_run);
	System.out.println("petrol_consume by bike = "+petrol_consume);
	System.out.println("averege bike run"+avg);
	System.out.println("--------------------------------------------");
      
   return;
	}
}
class A
{
	public static void main(String[] args) {
		Bike b1 = new Bike("bullet","thunderbird",2000,40);
		b1.show_data();
	}
}