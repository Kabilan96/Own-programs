package week3.day1;

public class CompareString {

	public static void main(String[] args) {
		String str1="I am Learning Java";
		String str2="I am Learning Java";
		
		if (str1==str2) {
			System.out.println("Same in Operator Method");
		}
		else System.out.println("Different in Operator Method");
		
		System.out.println("********************************");
		
		if(str1.equals(str2)) {
			System.out.println("Same in Equals Method");
		}
		else System.out.println("Different in Equals Method");
		
		System.out.println("*********************************");
		
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("Same in EqualsIgnore Method");
		}
		else {
			System.out.println("Different in EqualsIgnore Method");
		}
		
		
	}

}
