//create a class for a college and make sure the details of the college can be initialized by a constructior,
//modify by a fuction and retrived by a function and  deleted by a function.

class A
{
	public static void main(String[] args) 
	{
	System.out.println("main start");

	College sRef = new College();
		sRef.intVal("RLT college",12,2);
		sRef.showData();
		sRef.modify("LRT College",13,2);
		sRef.showData();

		sRef.del();
		sRef.showData();

	System.out.println("main ends");		
	}
}

class College
{
	String name;
	int standard;
	int branch;

	public void intVal(String a1, int a2, int a3)
	{
		System.out.println("int val starts");

		name =  a1;
		standard = a2;
		branch = a3;
		
		System.out.println("int val ends");
		return;

	}

	public void modify(String a1, int a2,int a3)
	{
		System.out.println("modify starts");

		name =  a1;
		standard = a2;
		branch = a3;
		
		System.out.println("modify ends");
		return;

	}

	public void showData()
	{
		System.out.println("showData starts");

		System.out.println("College name is = "+name);
		System.out.println("College standard is = "+standard);
		System.out.println("College has branches  = "+branch);
		System.out.println("showData ends");
		return;
	}

	public void del()
	{
		System.out.println("delete start");

		name =  null;
		standard = 0;
		branch = 0;

		System.out.println("delete ends");
	}


}