class Sport
{
	public static void main(String[] args) {
		System.out.println("main starts");

		new Student();
	
		System.out.println("main ends");
	return;
	}
}


class Student
{	
	String name;
	String fav_game;


	{	name = "atish";
		fav_game = "basketball";
		System.out.println("name od student is = "+name);
		System.out.println(" fav game of Child is = "+fav_game);
		
		non_static();
	}

	public void non_static()
	{
		System.out.println("non_static executed");
	return;
	}
}