/*[d->] Design a function to the volume of sphere and 
print it in main function by taking the required inputs from calling menthod 
and also print the result in a dedicated printvalue function.  */

class ex4
{
	public static void main(String[] args) //calling function
	{
		System.out.println("main class started..");

		double pi, radious,volumeOfSphere;

		pi = 3.14;
		radious = 10;

		
		volumeOfSphere = volumeOfSphere( pi, radious); //sending and calling value from function.

		System.out.println("volumeOfSphere in main class ");
		System.out.println(volumeOfSphere);

		System.out.println("main class ends..");
		return;
		
	}

	public static double volumeOfSphere(double pi, double radious) //called and callling function.
	{
		System.out.println("volumeOfSphere starts..");

		double volumeOfSphere;
		
		volumeOfSphere = 1.334*pi*(radious*radious*radious);

		printvalue(volumeOfSphere); //sending value to print value function.

		System.out.println("volumeOfSphere ends..");
		return volumeOfSphere;

	}
	public static double printvalue( double volumeOfSphere) //called function
	{
		System.out.println("printvalue starts..");

		System.out.println("volumeOfSphere inside printvalue "+volumeOfSphere);
		System.out.println("printvalue ends..");
		return volumeOfSphere; //sending value to main function
	}
}