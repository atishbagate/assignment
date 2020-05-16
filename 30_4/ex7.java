
//short data type
class ex7
{
	public static void main(String[] args) 
	{
		System.out.println("main starts..");


		short arrayex7[] = {124,-234,345,-456,677,-789,-890};

		arrayex7(arrayex7);
		System.out.println("main ends..");	
	}
	public static short[] arrayex7(short[] arrayex7)
	{
		for (int i = 0 ;i < arrayex7.length ;i++ ) 
		{
			System.out.println("float element at index " + i + " : "+arrayex7[i]);	
		}
		return arrayex7;
	}
}