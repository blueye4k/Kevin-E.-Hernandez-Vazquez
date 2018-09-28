package feb20;

public class Estadistica {
	
	int[] array = new int[6];
	
	public Estadistica(int[] array) {
		this.array = array;
	}
	
	public int getSum() {
		int sum=0;
		for(int i: array) {sum+=i;}
		return sum;
	}
	
	public double getMean(int sum, int datalength) {
		return ((float)sum/datalength);
	}
	
	public double getStandardDeviation(int mean) {
		int numerator=0, 
			denominator=array.length-1;
		double standardDeviation;
		for(int i=0;i<array.length;i++) {
			numerator+=Math.pow((array[i]-mean),2);
		}
		standardDeviation = Math.sqrt((numerator/denominator));
		return standardDeviation;
	}
	
	public int getMax() {
		int max=array[0];
		for(int i=1;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		return max;
	}
	
	public int getMin() {
		int min=array[0];
		for(int i=0;i<array.length;i++) {
			if(min>array[i]) {
				min=array[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		
		int[] datasetOne = {2,6,9,1,3,7};
		int[] datasetTwo = {7,1,9,10,8,12};
		
		Estadistica x = new Estadistica(datasetOne);
		Estadistica y = new Estadistica(datasetTwo);
		
		System.out.print("     DataSet #1\t| DataSet #2\n");
		System.out.print("--------------------------------------\n");
		System.out.printf("Sum: \t%d\t|    %d",x.getSum(),y.getSum());
		System.out.printf("\nMean: \t%2.1f\t|    %2.1f", x.getMean(x.getSum(), 6), y.getMean(y.getSum(), 6));
		System.out.printf("\nSD:  \t%2.1f\t|    %2.1f", x.getStandardDeviation(3),y.getStandardDeviation(3));
		System.out.printf("\nMax: \t%d\t|    %d", x.getMax(), y.getMax());
		System.out.printf("\nMin: \t%d\t|    %d", x.getMin(), y.getMin());
	}
}
