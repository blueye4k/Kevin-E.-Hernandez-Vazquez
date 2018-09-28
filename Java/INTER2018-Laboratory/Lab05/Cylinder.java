package feb20;

public class Cylinder extends Circle {

	private double height;
	
	public Cylinder() {
		height = 20;
	}
	
	
	public Cylinder(double r, double h) {
		super(r);
		height = h;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return getArea()*height;
	}
}
