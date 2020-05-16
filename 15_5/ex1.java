//Point 1] 
//When two reference variables are pointing towards two different objects
// then the changes done to one object from one reference variable will not affect the other object
// when accessed from another reference variable. 


class Travel
{
	String bikeName;
	double kms;

	public void creatBikeName(String bike)
	{
		System.out.println("created Bike Name strat");

		bikeName = bike; //assign bike name;

		System.out.println("created Bike Name ends");
	return;
	}

	public void addKms(int kms1) //enter kms to add total
	{
		System.out.println("addKms strat");
		kms = kms + kms1; //added Kms
		System.out.println("addKms ends");
	return; 
	}

	public void showKms() //to show kms total
	{
		System.out.println("show Kms Starts");

		System.out.println(" your trip on bike "+bikeName+ "has done "+kms+" Kms");

		System.out.println("show Kms ends");
	return;
	}

}
class Owner
{
	public static void main(String[] args) 
	{
		System.out.println("main starts..");

		Travel atish = new Travel();//created a memory for new Travel

		atish.creatBikeName(" bullet "); //enter bike name to new account.
		System.out.println(" atish bike address "+atish); //address to new trip bike


		Travel bharat = new Travel(); //another memory created for new trip 
		bharat.creatBikeName(" Impulse "); //enter new name of bike to new Trip
		System.out.println(" bharat bike address "+bharat);//address of trip is different

		//now putting values
		atish.addKms(10000);
		atish.showKms();


		bharat.addKms(20000);
		bharat.showKms();

		//now adding values
		atish.addKms(10000);
		atish.showKms();


		bharat.addKms(20000);
		bharat.showKms();




		System.out.println("main ends..");
		
	}
}

/*

  /*___________________
   |                   |<---- atish
   |bike name ="bullet"| 
   |trip =   20000 KMS |
   | cA,dep,with       | 
   |  and sB           | 
   |___________________|*/

      

  /*____________________     
   |                    |<---- bharat
   |bike name ="Impulse"| 
   |trip = 40000 KMS    |
   | cA,dep,with        | 
   |  and sB            | 
   |____________________|*/

