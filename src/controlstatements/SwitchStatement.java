package controlstatements;

public class SwitchStatement {
	
	 public static void main(String[] args) {
		 
		 String browser = "Chrome";
		 
		 switch(browser) {
		 case "Chrome" : System.out.println("Chrome is opening");
		 break;
		 
		 case "firefox" : System.out.println("firefox is opening");
		 break;
		 
		 case "edge" : System.out.println("Edge is opening");
		 break;
		 
		 default: System.out.println("Invalid browser");
		 }
	 }
	 
}

	 
	 