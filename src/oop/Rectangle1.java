package oop;

public class Rectangle1 {
	  
	int length;
	int breadth;
	    
	void printArea () {
		int Area = length*breadth;
		System.out.println("the Area= "+Area);
		
	}
	void printPerimeter() {
		int Perimeter =2*length*breadth;
		System.out.println("the perimeter= "+Perimeter);
	}
	public static void main(String[] args) {
		Rectangle1  r =  new Rectangle1();
		r.length=2;
		r.breadth=3;
		r.printArea();
		r.printPerimeter();
	}

}
