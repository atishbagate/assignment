//3 programs to demonstrate the application of constructor in practical example.

class A
{
	public static void main(String[] args) 
	{
		System.out.println("main start");
		Bank sRef = new Bank();
		sRef.valIn("SBI","mini complex","latur","SBI000243",120987);
		sRef.showData();
	
		System.out.println("main ends");	
	}
}

class Bank
{
	String bankName;
	String bankBranch;
	String location;
	String iFSC_code;
	int branchCode;

	public void valIn(String a1, String a2, String a3, String a4,int a5)
	{
		System.out.println("valIn start");
		bankName = a1;
		bankBranch = a2;
		location = a3;
		iFSC_code = a4;
		branchCode = a5;
		System.out.println("valIn ends");
		return;
	}
	public void showData()
	{
		System.out.println("showData starts");
		System.out.println("Bank Name is = "+bankName);
		System.out.println("Bank Branch = "+bankBranch);
		System.out.println("Location of Branch = "+location);
		System.out.println("IFSC_code of Branch = "+iFSC_code);
		System.out.println("Branch Code = "+branchCode);
		System.out.println("showData ends");
	}
}