// char data type

class ex5
{
	public static void main(String[] args) 
	{
	System.out.println("main starts..");

	char arrayex5[] = {'a','b','c','d'}; // declaration of data type char array.

	arrayex5(arrayex5);
	System.out.println("main ends..");
	}
	public static char[] arrayex5(char[] arrayex5)
	{
		for (int i = 0;i < arrayex5.length ;i++ ) // array to access value inside the array
	{
	
	System.out.println("char element at index "+i+" : "+arrayex5[i]);	
	}
		return arrayex5;
	}
}