class A{
	public static void main(String[] args) {
		System.out.println("main starts...");

        String data = "Donald";//"pmurTdlanoD"
        String rs = reverse(data);
        System.out.println("Reverse of [ "+data+" ] = [ "+rs+" ] ");
        System.out.println("main ends...");
        return;
	}
	public static String reverse(String data){
		System.out.println("reverse starts...");
		String rs = "" ;
		for (int i = data.length()-1;i >= 0;i-=1) {
		    rs = rs+data.charAt(i);               
		}
		System.out.println("reverse ends...");
		return rs;
	}
}