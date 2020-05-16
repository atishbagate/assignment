class A{

	public static void main(String[] args) {
		System.out.println("main starts...");
      
        String data = "This is a sentence";
        int index = 5;
        char character = find(data,index);
        System.out.println("The Character at index ["+index+"] in String ["+data+"] is = ["+character+"]");

		System.out.println("main ends...");
		return;
	}
	public static char find(String data , int index){
		System.out.println("find starts...");
 
        char character = data.charAt(index);

		System.out.println("find ends...");
		return character;
	}
}