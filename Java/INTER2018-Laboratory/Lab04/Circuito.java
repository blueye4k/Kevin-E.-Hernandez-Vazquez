package feb20;

public class Circuito {
	
	public static double PI = 3.14;
	private int radius;
	
	public Circuito() {
		radius = 2;
	}
	
	public Circuito(int r) {
		radius = r;
	}
	
	public double circumferencia() {
		return 2*PI*radius;
	}
	
	public double area() {
		return PI*Math.pow(radius, 2);
	}
	
	public void setRadius(int x) {
		radius = x;
	}
	
	public int getRadius() {
		return radius;
	}

}
