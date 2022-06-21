package entities;

public class Rectangle {

	public double width;
	public double height;
	
	public double area() {
		double area = width * height;
		return area;
	}
	
	public double perimeter() {
		double p = (2 * width) + (2 * height);
		return p;
	}
	
	public double diagonal() {
		double d = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		return d;
	}
	
	public String toString() {
		return "AREA = " + String.format("%.2f", area()) + "\n" + "PERIMETRO = " + String.format("%.2f", perimeter()) +  "\n" + "Diagonal = " + String.format(".2f", diagonal());
	}
	
}
