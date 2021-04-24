import java.util.Scanner;

public class Bicycle {

	private String Brand;
	private String Colour;
	private String Type;
	private double Weight;
	private double Price;
	private int Quantity;
	private double TotalPrice;
		
		//default constructor
		Scanner s = new Scanner(System.in);

		Bicycle(){
			
			System.out.print("Enter bike brand : ");
			this.Brand = s.nextLine();
			
			System.out.print("Enter colour: ");
			this.Colour = s.nextLine();
			
			System.out.print("Enter type of the bike: ");
			this.Type = s.nextLine();
			
			System.out.print("Enter bike weight: ");
			this.Weight = s.nextDouble();
			
			System.out.print("Enter bike price:RM");
			this.Price = s.nextDouble();
			
			System.out.print("Enter Quantity: ");
			this.Quantity = s.nextInt();
			
			this.TotalPrice = this.Price*this.Quantity;
			System.out.print("Total price is: RM" + this.TotalPrice);
			System.out.println();
		} 
		

		public String getBrand() {
			return this.Brand;
		}
		public String getColour() {
			return this.Colour;
		}
		public String getType() {
			return this.Type;
		}
		public Double getWeight() {
		    return this.Weight;
        }
		public Double getPrice() {
			return this.Price;
		}
		public Integer getQuantity() {
			return this.Quantity;
		}
		public Double getTotal() {
			return this.TotalPrice;
		}
}


