package feb20;

public class Circuito2 {

	public static void main(String[] args) {
		Circuito x = new Circuito();
		Circuito y = new Circuito(4);
		
		System.out.print("\tC1 \t| C2\n");
		System.out.print("-------------------------\n");
		System.out.printf("Area: \t%.2f\t| %.2f\n",x.area(),y.area());
		System.out.printf("Circ.: \t%.2f\t| %.2f\n",x.circumferencia(),y.circumferencia());
		System.out.print("-------------------------\n\n");
		
		System.out.print("C1:\nsetRadius(5)\n");x.setRadius(5);
		System.out.printf("getRadius: %d\n\n",x.getRadius());
		
		System.out.print("C2:\nsetRadius(1)\n");y.setRadius(1);
		System.out.printf("getRadius: %d\n\n",y.getRadius());
	}

}
