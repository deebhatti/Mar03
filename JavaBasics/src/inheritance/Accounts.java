package inheritance;

public class Accounts extends Management{
	
	
	
	int bonus = 8000;
	
	public static void main(String[] args) {
		Accounts Tim = new Accounts();
		
		System.out.println("Total annual Compensation of Tim = $" + (Tim.bonus+Tim.Salary) );
		
		Tim.day();
	}
	
}
