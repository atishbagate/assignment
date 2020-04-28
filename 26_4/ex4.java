

/*[d->] Design a function to return the volume of sphere and print it in main function.

volume = 4/3 pi* (r*r*r);
*/

public class ex4 
{
    public static double volumOfSphere(double pi, Double radious)
    {
        System.out.println("class starts...");

        double volumOfSphere;
       

         volumOfSphere =  1.334 * pi *radious*radious*radious;
        System.out.println(volumOfSphere);
      
        
        
        
        System.out.println(volumOfSphere);
        System.out.println("function end...");


        return volumOfSphere;



    }

    public static void main(String[] args) 
    
    {    System.out.println("class starts...");

        double pi = 3.14;
        double radious = 2.3;
        double volumOfSphere;

        volumOfSphere = volumOfSphere(3.14,2.3);

        System.out.println("volum Of Sphere");
        System.out.println(volumOfSphere);
    

        System.out.println("class ends...");
        return ;

        

    }

    
}