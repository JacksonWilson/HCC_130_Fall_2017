package labs.lab11;

/*
 * Author:       Todd Simeone

 * Name:         Jackson Wilson
 *
 * Date Written:  1/16/2003
 * 
 * Date Modified: 12/21/2017
 */

 /*
 Attributes: length (double), width (double)
 Behaviors: getArea (returns the area), getPerimeter (returns the perimeter)
 */

class Rectangle {
		double length;
		double width;
		
		Rectangle() {
			length = 0;
			width = 0;
		}
		
		Rectangle(double l, double w) {
			length = l;
			width = w;
		}
		
		public double getArea() {
			return length * width;
		}
		
		public double getPerimeter() {
			return 2 * length + 2 * width;
		}
}