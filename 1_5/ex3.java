/*c] design a function which will
 take all your semisters percentages
 as infut and create an array by storing them all with  decimal values.
eg->i/p 50.545,50,87
    o/p [50.545,50.0,87.0]*/

    class ex3
    {
    	public static void main(String[] args) // calling function
    	{
    		System.out.println("main starts..");

    		float[] arrayex3 = percentages(); //ddeclarationn of an array and transfering info to percenage method

    		for (int i = 0;i < arrayex3.length ;i++ ) //condition to print values in array .
	{
	
	System.out.println("percentages in semisters "+i+" is = "+arrayex3[i]);	
	}



    		System.out.println("main ends..");
    	}

    	public static float[] percentages() //called function
    	{
    		System.out.println("percentages starts..");

    		float arrayex3[] = {55.60f,58.80f,60.10f,61.20f,64.30f,68.40f,70.30f,80.00f}; //entering info into array.

    	
    		System.out.println("percentages ends..");

    		return arrayex3;
    	}
    }