
import java.util.Scanner;

	public class ElectricBike extends Bicycle {
	    Scanner s = new Scanner(System.in);
	    
	    private String brand;
	    double weight;
 		
	    ElectricBike(){
	    	super();
	    	this.brand = "ElectricBike";
	    	
	    	System.out.print("Enter weight: ");
	    	this.weight=s.nextDouble();
	    	this.brand = s.nextLine();
	    }
	    
	    public String getBrand() {
			return this.brand;
		}
		public double weight() {
			return this.weight;
		}
		
}