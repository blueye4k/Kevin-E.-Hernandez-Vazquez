package feb20;

public class Teacher extends Person1 {
	
	private String nameSchool;
	private static final double PI=3.14;
	
	public Teacher(String name, int age, String nameSchool) {
		super(name, age);
		this.nameSchool = nameSchool;		
	}
	
	public double peso(int age) {return PI*age;}
	
	public String getName() {return name;}
	
	public String toString() {
		return "\n----------TEACHER----------"+
			   "\nNAME: "+getName()+
			   "\nAGE: "+age+
			   "\nPESO: "+peso(age)+
			   "\nSCHOOL: "+nameSchool+
			   "\n---------------------------";
	}
	
	public void setNameSchool(String n) {n = nameSchool;}
}
