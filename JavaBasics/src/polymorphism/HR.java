package polymorphism;

public class HR extends Management implements Management2{

	@Override
	public void message() {
		System.out.println("All the employees will get 4 WFHs from next month onwards");
		
	}

	@Override
	public void day() {
		System.out.println("Today is Saturday");
		
	}

	@Override
	public void message2() {
		System.out.println("Do all the formalities related to pay-hike");
		
	}
	
	
	

}
