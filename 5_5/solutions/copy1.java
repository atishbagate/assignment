class A
{public static void main(String[] args) {
	
System.out.println("main starts..");

String data = "this is the string";

int index = 2;

char character = find(data,index);

System.out.println(character);

System.out.println("main ends..");
	
	}

	public static char find(String data, int index)
	{
		System.out.println("find starts..");

	char character = data.charAt(index);

		System.out.println("find ends..");
		return character;
	}
}