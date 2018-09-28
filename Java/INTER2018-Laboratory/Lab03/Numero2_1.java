package feb20;

public class Numero2_1 {
	public static void main(String[] args) {
		Numero2 x = new Numero2();
		
		x.setA(123);
		x.setB(243.34);
		
		System.out.printf("a = %d",x.getA());
		System.out.printf("\nb = %2.1f",x.getB());
	}
}
