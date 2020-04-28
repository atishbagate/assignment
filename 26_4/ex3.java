/*[c->] Design a function to return the surfacearea of cylinder and print it in main function. 

surface area of cylinder is A = 2*pi r^2 + 2 pi r h
*/

class ex3 
{   
   public static double areaOfCylinder(Double pi, Double radious,Double height)

    {
        
        System.out.println("function start...");

        double areaOfCylinder;

        double a1 = 2*pi*radious*radious;
        double a2 = 2*pi*radious*height;

        areaOfCylinder = a1 + a2;
       

       /* System.out.println(" area of Cylinder ");
        System.out.println(areaOfCylinder);

        System.out.println("function ends...");*/

        System.out.println("function end...");


        return areaOfCylinder;


    }
    




    public static void main(String[] args) 
    {   System.out.println("class starts...");

        double pi = 3.14;
        double radious = 10.3;
        double height = 13.5;
        double areaOfCylinder;

        areaOfCylinder = areaOfCylinder(3.14,10.3,13.5);

        System.out.println("area Of areaOfCylinder");
        System.out.println(areaOfCylinder);
    
    
        System.out.println("class ends...");
        return ;


        
    }
    
}