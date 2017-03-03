package demo;

public class Shapes {
	
	int length;  //Variable at the class level (which is not inside a method) is called as a Field.
	int breadth;
	
	public Shapes(){
		length = 3;
		breadth = 2;
	}
	
	public Shapes(int a, int b){
		length = a;
		breadth = b;
	}
	
	public void area(){
		System.out.println("Area of rectangle = " + (length*breadth) + " cm.sq.");
	}
	
	public static void figureShape(){
		System.out.println("Shape of the figure = Rectangle");
	}
	
	public static void main(String[] args) {
		Shapes rectangle = new Shapes();
		rectangle.area();
		figureShape();
		
//		Shapes rectangle2 = new Shapes(10,5);
//		rectangle2.area();
//		figureShape();
		
	}

}
