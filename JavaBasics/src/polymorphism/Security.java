package polymorphism;

public class Security extends Management {
	
	@Override
	public void message() {
		System.out.println("All the employees will get 2 WFHs from next month onwards");
		
	}

	@Override
	public void day() {
		System.out.println("Today is Monday");
		
	}
	

}
