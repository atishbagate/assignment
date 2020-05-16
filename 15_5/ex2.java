//Point 2] 
//When two reference variables are pointing towards same object then 
//the changes done to the object from one reference variable will affect the object 
//when accessed from another reference variable.
class Schoolfees
{
	String rollno;
	int fees;

	public void createRollNo(String rN)
	{System.out.println("createRollNo start");

	rollno = rN;
	System.out.println("your rollno is created "+rollno);
	System.out.println("createRollNo ends");
	return;
	}

	public void addFees(int fees1)
	{System.out.println("addFees start");

	fees = fees+fees1;
	System.out.println("current fees = "+fees);
	System.out.println("addFees ends");
	return;
	}
	public void feesremain(int fees1)
	{
		System.out.println("feesremain start");
		fees = fees - fees1;
		System.out.println("current fees = "+fees);
		System.out.println("feesremain ends");
	return;
	}
	public void showFees()
	{
		System.out.println("fees remaing to pay starts ");

		System.out.println("fess have to pay "+fees);

		System.out.println("fees remaing to pay ends");
	}
}
class student
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");


		Schoolfees atish = new Schoolfees();
		atish.createRollNo(" roll no 1 ");

		System.out.println(" new roll no address is "+atish);

		Schoolfees atishParents = atish;
		System.out.println(" atishParents have same address that of atish "+atishParents);	
	

		//now data giving

		atish.addFees(10000);

		atish.showFees();


		atishParents.addFees(20000);
		atish.showFees();

		atishParents.feesremain(30000);
		atish.showFees();

		System.out.println("main ends");

	}

}

/* _____________________    
   |                   |<---- atish
   |rollno ="roll no 1"|<---- atishparents
   |remain fees 0 rs   |
   | cA,dep,with       | 
   |  and sB           | 
   |___________________|*/
