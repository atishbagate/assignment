class A{

	public static void main(String[] args) {
	System.out.println("main starts...");
      
       String s1 = "IDIOTS";
       String s2 = "idiots";
      
       boolean check1 = check1(s1,s2);
       System.out.println("comparing ["+s1+"] with ["+s2+"] by not ignoring case = ["+check1+"]");
       boolean check2 = check2(s1,s2);
       System.out.println("comparing ["+s1+"] with ["+s2+"] by ignoring case = ["+check2+"]");

	System.out.println("main ends...");
		return;
	}
	public static boolean check1(String s1,String s2){
        System.out.println("check1 starts...");
          boolean check1 = false;

          check1 = s1.equals(s2);
         
        System.out.println("check1 ends...");
        return check1;
	}
	public static boolean check2(String s1,String s2){
        System.out.println("check2 starts...");
          boolean check2 = false;

          check2 = s1.equalsIgnoreCase(s2);

        System.out.println("check2 ends...");
        return check2;
	}
}