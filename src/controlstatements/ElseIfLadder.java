package controlstatements;

public class ElseIfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "Chrome";
		
		if(browser == "Safari") {
			System.out.println("Safari is open");
		}
		
		else if(browser == "Edge") {
			System.out.println("Edge is open");
		}
		
		else if(browser == "Chrome") {
			System.out.println("Chrome is opening");
		}
		
		else if(browser == "Firefox") {
			System.out.println("Firefox is open");
		}
		
		else {
			System.out.println("Invalid Browser");
		}

	}

}
