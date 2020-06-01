class Bank
{
	public static void main(String[] args) {
		System.out.println("main starts..");
			
		new Branch(); // loading Branch.class file to jvm memory

		System.out.println("main ends..");

	}
}

class Branch
{
	static int branch_code;
		String branch_address;



	static
	{
		System.out.println("static block starts..");

		branch_code = 32092323; // initializing a static variable.

		Branch b1 = new Branch();

		b1.branch_address = "SBI bank banglore"; //initializing a non- static variable

		System.out.println("non static value branch_address = "+b1.branch_address);
		System.out.println("static value branch_code = "+branch_code);


		
	}
}