
public class Item {
	 private String description;
	   private double    price;
	   
		public Item(String productDescription, double d) 
		{
	      description = productDescription;
	      price = d;
		} // end constructor
		
		public String getDescription() 
		{
	      return description;
		} // end getDescription

		public double getPrice() 
		{
	      return price;
		} // end getPrice
		
		public String toString() 
		{
	      return description + "\t$" + price / 100 + "." + price % 100;
		} // end toString
}
