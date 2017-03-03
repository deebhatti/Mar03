package polymorphism;

public class Test {
	
	public static void main(String[] args) {
		Management Ram = new IT();
		Management Sham = new HR();
		Management Tim = new Accounts();
		Management Sam = new Security();		
		
		Ram.message();
		Sham.message();
		Tim.message();
		Sam.message();
		
		Ram.day();
		Sham.day();
		Tim.day();
		Sam.day();
		
		Ram.month();
		Sham.month();
		Tim.month();
		Sam.month();
		
		Management2 Superman = new HR();
		Management2 Batman = new Accounts();
		
		Superman.message2();
		Batman.message2();
		
		Accounts CaptainPlanet = new Accounts();
		CaptainPlanet.day();
		
		
		
		
		
	}

}
