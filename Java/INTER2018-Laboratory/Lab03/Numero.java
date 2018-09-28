package feb20;

public class Numero {
	
	public int a;
	public float b;
	
	Numero() {
		a = 1;
		b = (float)2.3;
	}
	
	int getA() {return a;}
	float getB() {return b;}
	
	public static void main(String[] args) {
		Numero x = new Numero();
		
		System.out.printf("a = %d\nb = %2.1f",x.getA(), x.getB());
	}
}
