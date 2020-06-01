/*a]
create a class for a Collage and make sure the details of the callage 
can be initialized by a constructor, modified by a function and 
retrived by a function and deleted by a function. */

class CollageDetails{

    String collageName;
    int    collageCode;
    int    collageStrength;
    String collageLocation;


	//Constructor to create an collage object
	public CollageDetails(String cN,int cC,int cS,String cL){
		System.out.println("-----------------------------------------");
		System.out.println("Initializing the collage details...");
		collageName     = cN;
		collageCode     = cC;
		collageStrength = cS;
		collageLocation = cL;
		System.out.println("-----------------------------------------");
        return;
	}
    

    //Function to Modify collage details
    public void editCollageDetails(String cN,int cC,int cS,String cL){
    	System.out.println("-----------------------------------------");
    	System.out.println("Editing CollageDetails");
    	collageName     = cN;
		collageCode     = cC;
		collageStrength = cS;
		collageLocation = cL;
		System.out.println("-----------------------------------------");
        return;
    }

    //Function to modify collage Name
    public void editCollageName(String cN){
    	System.out.println("-----------------------------------------");
    	System.out.println("Editing Collage Name");
    	collageName     = cN;
    	System.out.println("-----------------------------------------");
        return;
    }

    //Function to modify collage Code
    public void editCollageCode(int cC){
    	System.out.println("-----------------------------------------");
    	System.out.println("Editing collageCode");
		collageCode     = cC;
		System.out.println("-----------------------------------------");
        return;
    }

    //Function to Modify collage Strength
    public void editCollageStrength(int cS){
    	System.out.println("-----------------------------------------");
    	System.out.println("Editing collageStrength");
		collageStrength = cS;
		System.out.println("-----------------------------------------");
        return;
    }

    //Function to Modify collage Location
    public void editCollageLocation(String cL){
    	System.out.println("-----------------------------------------");
    	System.out.println("Editing collageLocation");
		collageLocation = cL;
		System.out.println("-----------------------------------------");
        return;
    }

   //Function to Retrive Collage Name
    public String retriveCollageName(){
    	System.out.println("-----------------------------------------");
    	System.out.println("Retriving Collage Name");
    	System.out.println("-----------------------------------------");
    	return collageName;     
    }

    //Function to Retrive Collage Code
    public int retriveCollageCode(){
    	System.out.println("-----------------------------------------");
    	System.out.println("Retriving Collage Code");
    	System.out.println("-----------------------------------------");
    	return collageCode;     
    }

    //Function to Retrive Collage Strength
    public int retriveCollageStrength(){
    	System.out.println("-----------------------------------------");
    	System.out.println("Retriving Collage Strength");
    	System.out.println("-----------------------------------------");
    	return collageStrength;     
    }

    //Function to Retrive Collage Location
    public String retriveCollageLocation(){
    	System.out.println("-----------------------------------------");
    	System.out.println("Retriving Collage Location");
    	System.out.println("-----------------------------------------");
    	return collageLocation;     
    }

    //Function to delete collage details
    public void deletetCollageDetails(){
    	System.out.println("-----------------------------------------");
    	System.out.println("Deleteing CollageDetails");
    	collageName     = "";
		collageCode     = 0;
		collageStrength = 0;
		collageLocation = "";
		System.out.println("-----------------------------------------");
        return;
    }
    
    //Function to delete collage Name
    public void deletetCollageName(){
    	System.out.println("-----------------------------------------");
    	System.out.println("Deleteing CollageName");
    	collageName     = "";
    	System.out.println("-----------------------------------------");
        return;
    }

    //Function to delete collage Code
    public void deletetCollageCode(){
    	System.out.println("-----------------------------------------");
    	System.out.println("Deleteing CollageCode");
		collageCode     = 0;
		System.out.println("-----------------------------------------");
        return;
    }

    //Function to delete collage Strength
    public void deletetCollageStrength(){
    	System.out.println("-----------------------------------------");
    	System.out.println("Deleteing CollageStrength");
		collageStrength = 0;
		System.out.println("-----------------------------------------");
        return;
    }
 
    //Function to delete collage Location
    public void deletetCollageLocation(){
    	System.out.println("-----------------------------------------");
    	System.out.println("Deleteing CollageLocation");
		collageLocation = "";
		System.out.println("-----------------------------------------");
        return;
    }

    //Function to display collage details
    public void displaytCollageDetails(){
    	System.out.println("-----------------------------------------");
    	System.out.println("displaying CollageDetails");
    	System.out.println("Collage name =     ["+collageName+"]");
    	System.out.println("Collage Code =     ["+collageCode+"]");
    	System.out.println("collage Strength = ["+collageStrength+"]");
    	System.out.println("collage Location = ["+collageLocation+"]");
		System.out.println("-----------------------------------------");
        return;
    }

}
class Admin{

	public static void main(String[] args) {
		System.out.println("main starts...");

        CollageDetails cd1 = new CollageDetails("JGi",122,3000,"BLR");
        cd1.displaytCollageDetails();
        cd1.editCollageCode(123);
        cd1.displaytCollageDetails();
        String collageName = cd1.retriveCollageName();
        System.out.println("Retrived CollageName = "+collageName); 
        cd1.deletetCollageStrength();
        cd1.displaytCollageDetails();

		System.out.println("main ends...");
		return;
	}
}