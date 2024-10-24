package com.javabasics.com_syed_sir_classes_concepts;

//This is the Rectangle class used for educational purpose only.

public class Rectangle {
	static int l, b;

	private class Square {
		//Rectangle rect = new Rectangle();
		//System.out.println("Recatnagle object in square hascode is ::" + rect.hashCode());

		//int a = 2;
		int l,b;
		
		void displaySquare() {
			// displaySide(); --this will work as inner class can access outer class member
			// method
			System.out.println("Rectangle side in square method is ::" + Rectangle.l);
			System.out.println("Rectangle side in square method is ::" + Rectangle.b);
			if (this.l == this.b) {
				System.out.println("Square Side : " + l);
			} else {
				System.out.println("Rectangle Side lxb " + l + b);
			}
		}
	}

	void displaySide() {
		// we cannot directly call displaySquare without square object.
		Square sq = this.new Square();
		sq.displaySquare();
	}
	
	void displaySideRectangle() {
		
		System.out.println("Rectangle length is ::" + this.l);

		System.out.println("Rectangle breadth is ::" + this.b);

	}

	public static void main(String args[]) {
		/*
		 * Triangle tr = new Triangle();
		 * tr.a = 2;
		 * tr.b = 3;
		 */
		//Rectangle.main(args);
		Rectangle rect = new Rectangle();
		System.out.println("Recatnagle object in main hascode is ::" + rect.hashCode());
		//this.l = 5;
		//this.b = 5;
		Rectangle.l = 5;
		Rectangle.b = 15;
		rect.displaySideRectangle();
		Square sq = rect.new Square();
		sq.l = 56;
		sq.b = 56;
		//rect.displaySide();
		sq.displaySquare();


		// System.out.println("Rectangle lxb : " + l);
	}
}
