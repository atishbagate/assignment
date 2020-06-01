class Contact
{
	String firstName;
	String lastName;
	int number;
	String email;


	public void val(String a1, String a2, int a3, String a4)
	{
		System.out.println("-----------------------------------------");
		System.out.println("value initialization start");

		firstName = a1;
		lastName = a2;
		number = a3;
		email = a4;

		System.out.println("value initialization end");
		System.out.println("-----------------------------------------");
		return;
	}
	public  void update(String a1, String a2, int a3, String a4)
	{
		System.out.println("-----------------------------------------");
		System.out.println("update starts");

		firstName = a1;
		lastName = a2;
		number = a3;
		email = a4;

		System.out.println("update ends");
		System.out.println("-----------------------------------------");
		return;
	}
     //edit information 
	public Void editfirstName(String a1)
	{
		System.out.println("-----------------------------------------");
		System.out.println("editfirstName");
		firstName = a1;
		System.out.println("-----------------------------------------");
		return;
	}
	public Void editlastName(String a1)
	{
		System.out.println("-----------------------------------------");
		System.out.println("editlastName");
		lastName = a2;
		System.out.println("-----------------------------------------");
		return;
	}
	public void editnumber(int a3)
	{
		System.out.println("-----------------------------------------");
		System.out.println("edit Number");
		number = a3;
		System.out.println("-----------------------------------------");
		return;
	}
	public void editemail(String a4)
	{
		System.out.println("-----------------------------------------");
		System.out.println("email edit");
		email = a4;
		System.out.println("-----------------------------------------");
		return;
	}

	//function to retrival of information 
	public String retrivefirstName()
	{
		System.out.println("-----------------------------------------");
    	System.out.println("Retriving first Name");
    	System.out.println("-----------------------------------------");
    	return firstName; 
	}
	public String retrivelastName()
	{
		System.out.println("-----------------------------------------");
    	System.out.println("Retriving last Name");
    	System.out.println("-----------------------------------------");
    	return lastName; 
    }
    public int retriveNumber()
    {
    	System.out.println("-----------------------------------------");
    	System.out.println("Retriving Number");
    	System.out.println("-----------------------------------------");
    	return number; 
	}
	public String retriveemail()
    {
    	System.out.println("-----------------------------------------");
    	System.out.println("Retriving email");
    	System.out.println("-----------------------------------------");
    	return email; 
	}

public void delete()
	{
		System.out.println("-----------------------------------------");
		System.out.println("delete start");

		firstName = null;
		lastName = null;
		number = 0;
		email = null;

		System.out.print("delete ends");
		System.out.println("-----------------------------------------");
		return;
	}

//function to delete info 
	public void deletefirstName()
	{
		System.out.println("-----------------------------------------");
    	System.out.println("Deleteing firstName");
    	firstName   = "";
    	System.out.println("-----------------------------------------");
        return;

	}
	public void deletelastName()
	{
		System.out.println("-----------------------------------------");
    	System.out.println("Deleteing lastName");
    	lastName     = "";
    	System.out.println("-----------------------------------------");
        return;
	}
	public void deletenumber()
	{
		System.out.println("-----------------------------------------");
    	System.out.println("Deleteing number");
    	number = 0;
    	System.out.println("-----------------------------------------");
        return;
	}

	public Void deleteemail()
	{
		System.out.println("-----------------------------------------");
    	System.out.println("Deleteing email");
    	email     = "";
    	System.out.println("-----------------------------------------");
        return;
	}

		public void showData()
	{
		System.out.println("showData starts");

		System.out.println("first Name is = "+firstName);
		System.out.println("last Name is = "+lastName);
		System.out.println("numer is  = "+number);
		System.out.println("email is = "+email);
		System.out.println("showData ends");
		return;
	}

}

class A
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");

		 Contact ref = new Contact();

		 ref.val("atish","bagate",496883,"atishbagate@gmail.com");
		 ref.showData();

		ref.update("vaibhav","bagate",445937,"bagateatish@gmail.com");
		ref.showData();

		ref.editnumber(1234);
		ref.retriveNumber();

		ref.editfirstName("sumit");
		ref.retrivefirstName();

		ref.delete();
		ref.showData();


		System.out.println("main ends");	
	}
}