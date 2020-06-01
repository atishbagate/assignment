class Custo_info
{
	String first_name;
	String last_name;
	int mobNo;
	String email;
	String address;

/*
*this constructor accept string,string,int,string,string arguments
* to create custo_info object by taking custo first name which is string date.
* custo info last name which is string data.
* custo info mob no which is int data.
* custo info email which is string data.
* custo info last address which is string data.

*/

	public Custo_info(String first_name,String last_name,int mobNo,String email,String address)
	{
		//1st
 	this.first_name = first_name;
	this.last_name = last_name;
	this.mobNo = mobNo;
	this.email = email;
	this.address = address;
	return;
	}

/*
*this constructor accept string,string,int,string,string arguments
* to create custo_info object by taking custo first name which is string date.
* custo info last name which is string data.
* custo info mob no which is int data.

*/

	public Custo_info(String first_name,String last_name,int mobNo)
	{
		//2st
 	this.first_name = first_name;
	this.last_name = last_name;
	this.mobNo = mobNo;
	return;
	}
/*
*this constructor accept string,string,int,string,string arguments
* to create custo_info object by taking custo first name which is string date.
* custo info last name which is string data.

*/

	public Custo_info(String first_name,String last_name)
	{
		//3st
 	this.first_name = first_name;
	this.last_name = last_name;
	return;
	}

	public void show_data()
	{
	System.out.println("-------------------------------------------");
  	System.out.println("Customer first name is = "+first_name);
  	System.out.println("Customer last name is = "+last_name);
  	System.out.println("Mobile Number is = "+mobNo+" with email address is = "+email);
  	System.out.println("and address is = "+address);
  	System.out.println("--------------------------------------------");
  	return;

	}

}
class A
{
	public static void main(String[] args) 
	{
	System.out.println("main starts");
  	System.out.println("--------------------------------------------");
	System.out.println("1st constructor called");

	Custo_info c1  = new Custo_info("sumit","bagate",87230912,"sumitbagate@gmail.com","hingoli - maharashtra");
	c1.show_data();

    System.out.println("--------------------------------------------");
	System.out.println("2st constructor called");
	Custo_info c2  = new Custo_info("sumit","bagate",87230912);
	c2.show_data();

	System.out.println("--------------------------------------------");
	System.out.println("3st constructor called");
	Custo_info c3  = new Custo_info("sumit","bagate");
	c3.show_data();

	System.out.println("main ends");	
	}
}