package feb20;

public class Circle {
	private double radius;
	private String color;
	private double PI=3.14;
	
	public Circle() {
		radius = 2;
		color = "Blue";
	}
	
	public Circle(double r) {
		radius = r;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getArea() {
		return PI*Math.pow(radius, 2);
	}
}
