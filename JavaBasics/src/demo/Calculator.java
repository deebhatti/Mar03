package demo;

public class Calculator {
	String brand;
	String model;
	
	public Calculator(){
		 brand = "Casio";
		 model = "X95";		 
	}
	

	public int add(int a, int b) {
		return (a+b);
	}

	public void subtract(int a, int b) {
		System.out.println(a - b);
	}

	public void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public void divide(int a, int b) {
		System.out.println(a / b);
	}

	public static void main(String[] args) {

		Calculator basicCal = new Calculator();

		int total = basicCal.add(10, 20);
		
		System.out.println(total);
		
		basicCal.subtract(90, 10);
		basicCal.multiply(5, 4);
		basicCal.divide(80, 20);

	}

}
