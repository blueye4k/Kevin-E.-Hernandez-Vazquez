package feb20;

public class Student extends Person{
	private int midA,midB,midC,finalE;
	
	public Student(String fn, String ln, String adrs, String pn, 
		       int a) {
	super(fn,ln,adrs,pn,a);
	midA=43;midB=50;midC=50;finalE=100;
	}
	
	public void setGrades(int ma, int mb, int mc, int fe) {
		midA=ma;midB=mb;midC=mc;finalE=fe;
	}
	
	public double getGrade() {
		return ((float)(midA+midB+midC+finalE)/250)*100;
	}
	
	public String getStudentName() {
		return super.getName();
	}
	
}
