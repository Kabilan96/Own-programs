package week3.day1;

public class ReplaceString {

	public static void main(String[] args) {
		String str1 = "I am working with Java8";
		
		String replaceAll = str1.replaceAll("\\d","11");
		System.out.println("The Replaced String is:" + replaceAll);
		String substring = str1.substring(5, 11);
		System.out.println(substring);
		
	}

}
