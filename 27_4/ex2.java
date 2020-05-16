/*[b->] Design a function to find the area of 
trapizium and print it in main function by 
taking the required inputs from calling 
menthod and print the result in a dedicated 
printvalue function. */

 class ex2{

 	public static void main(String[] args) {/*calling function*/
 		System.out.println("main starts..");
 
        double ubase = 10;
        double lbase = 20;
        double height = 30;
        double areaOfTrapizium = areaOfTrapizium(ubase,lbase,height);
        System.out.print("[main function]areaOfTrapizium = ");
        System.out.println(areaOfTrapizium);

 		System.out.println("main ends..");
 		return;
 	}

 	public static double areaOfTrapizium(double ubase,double lbase,double height){/*called function*/
 		System.out.println("areaOfTrapizium starts..");

        double areaOfTrapizium = ((ubase+lbase)/2)*height;
        printvalue(areaOfTrapizium); // this is the logic to transker value to printvalue function.

        System.out.println("areaOfTrapizium ends...");
        return areaOfTrapizium;/*returning the result*/
 	}
 	
 	public static void printvalue(double areaOfTrapizium){
 		System.out.println("printvalue starts..");
 		System.out.print("[printvalue func]areaOfTrapizium = ");
 		System.out.println(areaOfTrapizium);
 		System.out.println("printvalue ends...");
 		return;
 	}
 }