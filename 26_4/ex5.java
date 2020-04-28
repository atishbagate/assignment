/*[e->] Design a function to return the peremeter of cone and print it in main function. 

 peremeter of cone = 1/3 * (22/7 or 3.14) * (radius of the cone)^2 * height of the cone*/

class ex5 
{       
    public static double peremeterOfCone(Double radius, Double height)
    {   
        System.out.println("function starts...");
        double peremeterOfCone;

        peremeterOfCone = 0.3333 * 3.14 *radius*radius * height; 



        System.out.println("function end...");
        return peremeterOfCone;
    }
    
    
    
    public static void main(String[] args) 
    {
        System.out.println("class starts...");

        double radius = 20.4;
        double height = 12.4;

        double peremeterOfCone;
        peremeterOfCone = peremeterOfCone(20.4,12.4);
        System.out.println("peremeter Of Cone ");
        
        System.out.println(peremeterOfCone);

        System.out.println("class end...");
        return;
        
    }

    
}