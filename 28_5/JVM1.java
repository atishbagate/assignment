class Java
{
	public static void main(String[] args) 
	{
	System.out.println("main starts..");

	System.out.println("static value val1 = "+Python.val1);
	Python p1 = new Python();

	System.out.println("non static val2 = "+p1.val2);

	Python p2 = new Python();

	p2.cotlin();

	System.out.println("main ends");
	return;	
	}
}

class Python
{
	static int val1 = 200;
	int val2 = 100;

	public static void python()
	{

		System.out.println("vvalue is = "+val1);
	return;
	}

	public void cotlin()
	{
		System.out.println("cotlin language is used.");
		return;
	}
}

