class Bank
{
	String name;
	String branch_name;
	String address;
	String ifsc_code;
	int pin_code;
	int number_of_customers;

/*
* this constructor accept string,string,string,string,int,int arguments
* To create bank object by taking bank name which is string data.
* bank branch_name which is string data.
* bank address which is string data.
* bank ifsc code which is string data.
* bank pin code which is int data.
* bank number which is int data.
*/



	public Bank( String name,String branch_name,String address,
	String ifsc_code,int pin_code,int number_of_customers)
	{ //1st
		this.name = name;
		this.branch_name = branch_name;
		this.address = address;
		this.ifsc_code = ifsc_code;
		this.pin_code = pin_code;
		this.number_of_customers = number_of_customers;
		return;
	}

/*
* this constructor accept string,string,string,string,int,int arguments
* To create bank object by taking bank name which is string data.
* bank branch_name which is string data.
* bank address which is string data.
* bank ifsc code which is string data.
*/



	public Bank( String name,String branch_name,String address,
	String ifsc_code)
	{ //2nd
		this.name = name;
		this.branch_name = branch_name;
		this.address = address;
		this.ifsc_code = ifsc_code;
		return;
	}

/*
* this constructor accept string,string,string,string,int,int arguments
* To create bank object by taking bank name which is string data.
* bank branch_name which is string data.

*/



	public Bank( String name,String branch_name)
	{ //3nd
		this.name = name;
		this.branch_name = branch_name;
		return;
	}

	public void show_data()
	{
	System.out.println("-------------------------------------------");
  	System.out.println("bank name is = "+name);
  	System.out.println("branch name is = "+branch_name);
  	System.out.println("branch address is = "+address+" with IFSC code = "+ifsc_code);
  	System.out.println("and pin code is = "+pin_code);
  	System.out.println("branch having daily customers about = "+number_of_customers);
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
	 Bank b1 = new Bank("SBI BANK","market_palace","main market city road","SBIN000123",123987,1080);
	 b1.show_data();


	 System.out.println("--------------------------------------------");
	System.out.println("2st constructor called");
	 Bank b2 = new Bank("SBI BANK","market_palace","main market city road","SBIN000123");
	 b2.show_data();

	 System.out.println("--------------------------------------------");
	System.out.println("3st constructor called");
	 Bank b3 = new Bank("SBI BANK","market_palace");
	 b3.show_data();

	 


	System.out.println("main ends10");
	return;
	}
}