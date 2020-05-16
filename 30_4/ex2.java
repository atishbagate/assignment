//double data type

class ex2
{
	public static void main(String[] args) 
	{
	
	System.out.println("main starts ..");

	double arrayex2[] = {1.4,2.5,5.6,8.3,9.7}; //declaration of array and initialization of array double type.

	arrayex2(arrayex2);

	System.out.println("main ends..");	
	}

	public static double[] arrayex2(double[] arrayex2)
	{
		// print double type the array elements

	for (int i = 0;i < arrayex2.length ;i++ )
	{
		System.out.println("double Element at index " + i + " : "+ arrayex2[i]);	
	}
	return arrayex2;

	}
}