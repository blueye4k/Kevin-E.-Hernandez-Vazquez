package feb20;

public abstract class Person1 {
	
	public String name;
	public int age;
	
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
	public abstract String getName();
	public abstract double peso(int age);

}
