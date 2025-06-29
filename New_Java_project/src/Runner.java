import com.java.tutorial.Plumber;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Plumber calling..");
		Plumber Navin = new Plumber(5);
		Navin.fixTap();
		System.out.println("---------------------------------");
		Navin.fixTap(200);
		Plumber Abhishek = new Plumber();
		System.out.println("---------------------------------");
		Abhishek.fixTap(400);
		
	}

}
