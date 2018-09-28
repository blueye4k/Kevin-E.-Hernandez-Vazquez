package feb20;

import java.util.Scanner;

public class Test {

	public static void print(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Circle x = new Circle();
		Cylinder y = new Cylinder();
		
		print("************Circle************\n\tRadius: "+x.getRadius()+"\n\tColor: "+x.getColor()+"\n\tArea: "+x.getArea()+"\n******************************\n");
		print("***********Cylinder***********\n\tRadius: "+y.getRadius()+"\n\tHeight: "+y.getHeight()+"\n\tArea: "+y.getArea());
		System.out.printf("\tVolume: %2.2f\n******************************\n",y.getVolume());
		print("\nEnter letter to continue...");
		char c = s.next().charAt(0);
		Cylinder z = new Cylinder(5,2);
		print("\n\n\n\n");
		print("Values: (5,2)\n");
		print("***********Cylinder***********\n\tRadius: "+z.getRadius()+"\n\tHeight: "+z.getHeight()+"\n\tArea: "+z.getArea());
		System.out.printf("\tVolume: %2.2f\n******************************\n",z.getVolume());
	}

}
