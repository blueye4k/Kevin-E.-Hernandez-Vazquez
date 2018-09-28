package feb20;

public class Calculation {
	
	private static int sum;
	
	static void sum(int a, int b) {
		sum = a+b;
	}
	
	static void sum(int a, int b, int c) {
		sum = a+b+c;
	}
	
	static int getSum() {
		return sum;
	}

	public static void main(String[] args) {
		int x=1,y=2,z=3;
		sum(x,y);
		System.out.printf("SUM #1: (%d + %d) = %d\n",x,y,getSum());
		sum(x,y,z);
		System.out.printf("SUM #2: (%d + %d + %d) = %d", x,y,z,getSum());
	}

}
