// create a program to save the contact details of a person and
// add he neccessary function to perform updation, retrival and deletion. 

class A
{
	public static void main(String[] args) 
	{
	System.out.println("main start");

	Contact sRef = new Contact();
	sRef.val("atish","bagate",496883,"atishbagate@gmail.com");
	sRef.showData();

	sRef.update("vaibhav","bagate",445937,"bagateatish@gmail.com");
	sRef.showData();

	sRef.delete();
	sRef.showData();

	System.out.println("main ends");

	}
}
class Contact
{
	String firstName;
	String lastName;
	int number;
	String email;


	public void val(String a1, String a2, int a3, String a4)
	{
		System.out.println("value initialization start");

		firstName = a1;
		lastName = a2;
		number = a3;
		email = a4;

		System.out.println("value initialization end");
		return;
	}

	public  void update(String a1, String a2, int a3, String a4)
	{
		System.out.println("update starts");

		firstName = a1;
		lastName = a2;
		number = a3;
		email = a4;

		System.out.println("update ends");
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

	public void delete()
	{
		System.out.println("delete start");


		firstName = null;
		lastName = null;
		number = 0;
		email = null;



		System.out.print("delete ends");
	}

}