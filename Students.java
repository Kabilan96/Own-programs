package week3.day1;

public class Students {

	public void getStudentInfo(int ID) {
		
		System.out.println("Id:" + ID);
	}
	
	public void getStudentInfo(int ID, String Name) {
		
		System.out.println("Student ID:" + ID);
		System.out.println("Student Name:" + Name);
	}
	public void getStudentInfo(String Email,String PhoneNumber) {
		
		System.out.println("Student Email:" +Email);
		System.out.println("Student PhoneNUmber:" +PhoneNumber);
	}
	public static void main(String[] args) {
		
		Students A2 = new Students();
		
		A2.getStudentInfo(310514);
		A2.getStudentInfo(106016,"Kabilan");
		A2.getStudentInfo("kabilan.ila03@gmail.com","0123456789");
	}
}
