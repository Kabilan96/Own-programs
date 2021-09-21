package week3.day1;

public class StringJustify {

	public static void main(String[] args) {
		
		String str1 = new String("Appu");
		String str2 = new String("Appu");
		if(str1==str2) {
			System.out.println("Same Text in this method 1");
		}
		else 
			System.out.println("Different Text in this method 1");
		
		System.out.println("********************************");

		if (str1.equals(str2)) {
			System.out.println("Same Text in this method 2");
		}
		else 
			
			System.out.println("Different Text in this method 2");
	}

}
