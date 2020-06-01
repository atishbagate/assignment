class Television
{
	String brand;
	String manifacutre_place;
	String store_address;
	String store_name;
	int store_code;
	int number_of_buyers;

/*
* this constructor accept string,string,string,string,int,int arguments
* To create Television object by taking Television brand which is string data.
* Television manifacutre_place which is string data.
* Television store_address which is string data.
* Television store name  which is string data.
* Television store code which is int data.
* Television number buyers which is int data.
*/



	public Television( String brand,String manifacutre_place,String store_address,
	String store_name,int store_code,int number_of_buyers)
	{ //1st
		this.brand = brand;
		this.manifacutre_place = manifacutre_place;
		this.store_address = store_address;
		this.store_name = store_name;
		this.store_code = store_code;
		this.number_of_buyers = number_of_buyers;
		return;
	}

/*
* this constructor accept string,string,string,string,int,int arguments
* To create Television object by taking Television brand which is string data.
* Television manifacutre_place which is string data.
* Television store_address which is string data.
* Television store name which is string data.
*/



	public Television( String brand,String manifacutre_place,String store_address,
	String store_name)
	{ //2nd
		this.brand = brand;
		this.manifacutre_place = manifacutre_place;
		this.store_address = store_address;
		this.store_name = store_name;
		return;
	}

/*
* this constructor accept string,string,string,string,int,int arguments
* To create Television object by taking Television brand which is string data.
* Television manifacutre_place which is string data.

*/



	public Television( String brand,String manifacutre_place)
	{ //3nd
		this.brand = brand;
		this.manifacutre_place = manifacutre_place;
		return;
	}

	public void show_data()
	{
	System.out.println("-------------------------------------------");
  	System.out.println("Television brand is = "+brand);
  	System.out.println("Television brand manifactore place = "+manifacutre_place);
  	System.out.println("Television store_address is = "+store_address+" with store_name is = "+store_name);
  	System.out.println("and STORE code is = "+store_code);
  	System.out.println("Television BUY by customers till now = "+number_of_buyers);
  	System.out.println("--------------------------------------------");
  	return;

	}

}


class A
{
	public static void main(String[] args) {
		
	System.out.println("main starts");

	System.out.println("--------------------------------------------");
	System.out.println("1st constructor called");
	 Television b1 = new Television("samsung Television","market_palace","baswantgudi market city road","ravi electronics",123987,1080);
	 b1.show_data();


	 System.out.println("--------------------------------------------");
	System.out.println("2st constructor called");
	 Television b2 = new Television("samsung Television","market_palace","baswantgudi market city road","ravi electronics");
	 b2.show_data();

	 System.out.println("--------------------------------------------");
	System.out.println("3st constructor called");
	 Television b3 = new Television("samsung Television","market_palace");
	 b3.show_data();

	 


	System.out.println("main ends");
	return;
	}
}