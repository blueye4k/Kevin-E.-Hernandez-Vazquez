package feb20;

public class Saving extends Account2 {
	public double interest;
	
	public Saving(int accnum, double interest) {
		super(accnum);
		this.interest = interest;
	}
	
	public Saving(int accnum) {
		super(accnum);
		interest=0.12;
	}
}
