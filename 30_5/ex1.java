class Cartoon
{
	public static void main(String[] args) {
		System.out.println("main starts");

		new Child();
	
		System.out.println("main ends");
	return;
	}
}

class Child
{
	String fav_char;


	{
		fav_char = "doremon";
		System.out.println("fav char of child is = "+fav_char);
	
	}
}