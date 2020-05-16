class A{

	public static void main(String[] args) {
		System.out.println("main starts...");
      
       String data = "StupidMorons";
        int countOfVowels = countOfVowels(data);
        System.out.println("The number of vowels in [ "+data+" ] = [ "+countOfVowels+" ]");
		System.out.println("main ends...");
		return;
	}
	public static int countOfVowels(String data){
        System.out.println("countOfVowels starts....");
         int countOfVowels = 1;
        for (int i = 0;i<data.length() ;i+=1 ) {
        	char c = data.charAt(i);
        	if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
        		countOfVowels+=1;
        	}
        }

        System.out.println("countOfVowels ends....");
        return countOfVowels;
	}
}