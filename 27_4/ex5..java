/*[e->] Design a function to return the peremeter of cone
 to calling function by taking the required inputs from calling menthod
  and print the result in a dedicated printvalue function.  
*/


  class ex5
  {
  	public static void main(String[] args)  //calling function
  	{
  	
  	System.out.println("main class starts..");

  	double radious, pi, height, peremeterOfCone;

  	radious = 10;
  	height = 20;
  	pi = 3.14;

  	peremeterOfCone = peremeterOfCone(radious,height,pi); //sending  values and retriving it back.

  	System.out.println("main class ends..");	
  	return;
  	}

  	public static double peremeterOfCone(double radious, double height,double pi) //callig and called function both.
  	{
  		System.out.println("peremeterOfCone starts..");

  		double peremeterOfCone;

		peremeterOfCone = 0.3333*pi*(radious*radious)*height; //operation for req output

  		printvalue(peremeterOfCone); //sending values to print function.
  		System.out.println("peremeterOfCone ends..");
  		return peremeterOfCone;
  	}

  	public static double printvalue(double peremeterOfCone) //called function
  	{
  		System.out.println("printvalue starts..");


  		System.out.println("peremeterOfCone inside printvalue"+peremeterOfCone);
  		System.out.println("printvalue ends..");
  		return printvalue;//sending values to print function.
  	}
  }