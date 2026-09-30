package tasks;

public class NestedSwitchworkk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.SCHOOL OF COMPUTER SCIENCE");
		System.out.println("a)Department of informatics \t b)Department of machine learning");
		System.out.println("2.SCHOOL OF BUSINESS");
		System.out.println("a)Department of commerce \t b)Department of purchasing");
		System.out.println("3.SCHOOL OF ENGINEERING");
		System.out.println("a)Department of mechanical engineering \t b)Department of mechatronics engineering");
		
		int university=1;
		char department='a';
			
		switch(university) {
		case 1:System.out.println("1.SCHOOL OF COMPUTER SCIENCE");
		switch(department) {
		
		case 'a' :System.out.println("a.Department of informatics");
		break;
		
		case 'b' :System.out.println("b.Department of machine learning");
		break;
		}
		break;
		
		case 2:System.out.println("2.SCHOOL OF BUSINESS");
		switch(department) {
		
		case 'a' :System.out.println("a.Department of commerce");
		break;
		
		case 'b' :System.out.println("b.Department of purchasing");
		break;
		}
		break;
		
		case 3:System.out.println("2.SCHOOL OF ENGINEERING");
		switch(department) {
		
		case 'a' :System.out.println("a.Department of mechanical engineering");
		break;
		
		case 'b' :System.out.println("b.Department of mechatronics engineering");
		break;
		}
		break;
		
		}
	}

}


