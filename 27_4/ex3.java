/*[c->] Design a function to return
 the surfacearea of cylinder
 and print it in main function by taking the 
required inputs from calling menthod. 
surface area of cylinder is A = 2*pi r^2 + 2 pi r h.

*/

class ex3
{   public static double areaOfCylinder(double pi, double radious,double height)//called function
    {
        System.out.println("areaOfCylinder starts..");

        double areaOfCylinder;

        areaOfCylinder = (2*pi*(radious*radious)) + (2*pi*radious*height); //method

        printvalue(areaOfCylinder);

        System.out.println("areaOfCylinder ends..");
        return areaOfCylinder;


    }

    public static double printvalue(double areaOfCylinder) //calling function
    {
        System.out.println("printvalue starts..");
        //printed in maini function
        System.out.println("area of cylinder is "+areaOfCylinder);

        System.out.println("printvalue ends..");
        return areaOfCylinder; //return value and pointer.
    }


    public static void main(String[] args) //calling function.
    {
        System.out.println("main function starts..");
       double pi,radious,height,areaOfCylinder;

       pi = 3.14;
       radious = 10.3;
       height = 13.5;
       

       areaOfCylinder = areaOfCylinder(pi,radious,height);

       System.out.println("areaOfCylinder inside main function");
        System.out.println(areaOfCylinder); 
        System.out.println("main function ends..");
        return;   
    
    }



}