package methodOverloading;

public class Calculator {
	
	//fields eliminated
	//constructor eliminated
	
	public void add(int a, int b){
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c){
		System.out.println(a+b+c);
		
	}
	
	public static void main(String[] args) {
		Calculator basicCal = new Calculator();
		basicCal.add(10, 5);
		basicCal.add(10,20,30);
	}

}
