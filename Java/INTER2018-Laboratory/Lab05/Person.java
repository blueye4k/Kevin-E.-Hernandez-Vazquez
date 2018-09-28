package feb20;

public class Person {
	private String first_name, last_name, address, phone_number;
	private int age;
	
	public Person(String fn, String ln, String adrs, String pn, int a) {
		first_name = fn;last_name = ln;
		address = adrs;phone_number = pn;age = a;
	}
	
	public String getName() {
		return first_name+" "+last_name;
	}
	
	public String getInfo() {
		return "First Name: "+first_name+"\nLast Name: "+last_name
				+"\nAge: "+age+"\nAddress: "+address+"\nPhone Number: "
				+phone_number;
	}
	
	
	public void menu() {
		System.out.print("---------------MAIN-MENU---------------\n");
		System.out.print("A. Student Grades\n");
		System.out.print("B. Personal Information\n");
		System.out.print("C. Exit\n");
		System.out.print("---------------------------------------\nEnter option: ");
	}

}
