package polymorphism;

public class Accounts extends Management implements Management2 {
	
	@Override
	public void message() {
		System.out.println("All the employees will get 3 WFHs from next month onwards");
		
	}

	@Override
	public void day() {
		System.out.println("Today is Sunday");
		
	}

	@Override
	public void message2() {
		System.out.println("Estimate the budget due to pay-hike");
		
	}
	
	//Management Tim = new Accounts();
	
	//Management2 Batman = new Accounts();
	

}
