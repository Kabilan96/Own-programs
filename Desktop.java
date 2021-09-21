package org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		
		String DesktopSize = "5.5 inch";
		System.out.println("Desktop Size:" + DesktopSize);
	}
     public static void main(String[] args) {
		
    	 Desktop d = new Desktop();
    	 d.desktopSize();
    	 d.computerModel();
	}
}


