

/*[b->] Design a function to return 
the area of trapizium and print it in main function. 
*/
class ex2 
{
    public static int areaOfTrapizium(final int b1, final int b2, final int h) 
    {
        System.out.println("function start...");

        int areaOfTrapizium;

        areaOfTrapizium = (b1 + b2 / 2) * h;

        System.out.println(" area of trapizium ");
        System.out.println(areaOfTrapizium);

        System.out.println("function ends...");
        return areaOfTrapizium;

    }



public static void main(final String[] args) 
{
    System.out.println("class start...");

    int areaOfTrapizium,b1,b2,h;

    b1 = 5;
    b2 = 7;
    h = 4;

    areaOfTrapizium = areaOfTrapizium(5,7,4);

    System.out.println("area Of Trapizium");
    System.out.println(areaOfTrapizium);


    System.out.println("class ends...");
    return ;
    
}
}


