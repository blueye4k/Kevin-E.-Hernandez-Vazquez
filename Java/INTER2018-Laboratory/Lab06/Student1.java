package feb20;

public class Student1 extends Person1 {
	private int year;
	
	public Student1(String name, int age, int year) {
		super(name,age);
		this.year = year;
	}
	
	public double peso(int age) {return year*age;}
	
	public String getName() {return name;}
	
	public String toString() {
		return "\n---------STUDENT---------"+
			   "\nNAME: "+getName()+
			   "\nAGE: "+age+
			   "\nPESO: "+peso(age)+
			   "\nYEAR: "+year+
			   "\n---------------------------";
	}
	
	public void setYear(int year) {this.year = year;}
}
