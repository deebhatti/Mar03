package demo;

public class IFElseDemo {
	public static void main(String[] args) {
		String time  = "Afternoon";
		
		if (time.equals("Morning")){
			System.out.println("I will have breakfast");
		}
		
		else if (time.equals("Afternoon")){
			System.out.println("I will have lunch");
		}
		
		else {
			System.out.println("I will have dinner");
		}
	}

}
