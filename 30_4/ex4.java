//long data type

class ex4
{
	public static void main(String[] args) 
	{
		System.out.println("main starts..");
	
	double arrayex4[] ={1000l,2000l,3000l,4000l,5000l,6000l,7000l,8000l,9000l,10000l}; //declaration of array and data type float.

	arrayex4(arrayex4);

	System.out.println("main ends..");	

	}
	public static double[] arrayex4(double[] arrayex4)
	{
		for (int i = 0 ;i< arrayex4.length ;i++ ) //to access the value of array.
	{
	 	
	 System.out.println(" double element at index "+i+" : "+arrayex4[i]);
	
	}
	return arrayex4;
	}
}