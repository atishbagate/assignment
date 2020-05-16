// int data type 
class ex1  
{
	public static void main(String[] args) 
	{

		System.out.println("maini started...");


		int arrayex1[] = {1,2,3,4}; //declatation array int data type and initialization of values.

	arr(arrayex1);

		System.out.println("main ends...");
	}
	public static int[] arr(int[] arrayex1)
	{

		System.out.println("int array");

		// accessing the elements of the specified array
for (int i = 0; i < arrayex1.length; i++)
  System.out.println("int Element at index " + i + 
                                " : "+ arrayex1[i]);
return arrayex1;
	}
	
}