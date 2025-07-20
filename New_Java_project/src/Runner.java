import com.java.tutorial.Plumber;
import com.java.tutorial.HR;

public class Runner {

	public static void main(String[] args) {
//		System.out.println("Plumber calling..");
//		Plumber Navin = new Plumber(5);
//		Navin.fixTap();
//		System.out.println("---------------------------------");
//		Navin.fixTap(200);
//		Plumber Abhishek = new Plumber();
//		System.out.println("---------------------------------");
//		Abhishek.fixTap(400);
		
//		Plumber Abhishek = new Plumber();
//		System.out.println("---------------------------------");
//		int returnedAmount = Abhishek.fixTap1(400);
//		System.out.println("Returned amount is " + returnedAmount);
		
		HR Vinod = new HR();
//		boolean status = Vinod.isEmployeeAllowed(7, "Formal", false);
//		boolean status = Vinod.isEmployeeAllowed(4, "Formal", false);
//		boolean status = Vinod.isEmployeeAllowed(2, "Formal", true);
//		boolean status = Vinod.isEmployeeAllowed(2, "ABC", false);
		boolean status = Vinod.isEmployeeAllowed("ABC", "Formal", true);
//		boolean status = Vinod.isEmployeeAllowed(7, "Formal", false);
		System.out.println("Status " + status);
		
		
	}

}
