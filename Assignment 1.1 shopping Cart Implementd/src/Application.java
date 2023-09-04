
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ShoppingCart cart = new ShoppingCart();

	        // Add some items to the cart
	        Item item1 = new Item("Apple", 4.99);
	        Item item2 = new Item("Pear", 3.59);
	        cart.addItem(item1);
	        cart.addItem(item2);
	              
	                
	        // Print the number of items in the cart
	        System.out.println("Number of items in the cart: " + cart.countItems());

	        // Print the total price of the items in the cart
	        System.out.println("Total price of items in the cart: " + cart.getTotalPrice());

	        // Use the clear() method to remove all items from the cart
	        cart.clear();

	        // Print the number of items in the cart again
	        System.out.println("Number of items in the cart: " + cart.countItems());
	        ShoppingCart cart1 = new ShoppingCart();

	        // Create five items
	        Item item11 = new Item("Nectorine", 3.88);
	        Item item21 = new Item("Asparagis", 2.85);
	        Item item3 = new Item("Lime", 0.79);
	        Item item4 = new Item("Mango", 1.29);
	        Item item5 = new Item("Brushell Sprouts", 5.66);

	        // Add the items to the cart
	        cart1.addItem(item11);
	        cart1.addItem(item21);
	        cart1.addItem(item3);
	        cart1.addItem(item4);
	        cart1.addItem(item5);
	        
	     // Display the items in the cart
	        System.out.println("Items in the cart:");
	        for (Item item : cart1.getItems()) {
	            System.out.println("- " + item.getDescription() + ": $" + item.getPrice());
	        }

	        // Print the number of items in the cart
	        System.out.println("Number of items in the cart: " + cart1.countItems());

	        // Print the total price of the items in the cart
	        System.out.println("Total price of items in the cart: " + cart1.getTotalPrice());
	        
	     
	        
	        // Remove the items from the cart one by one
	        cart.removeItem(item1);
            cart.removeItem(item2);
	        cart.removeItem(item3);
	        cart.removeItem(item4);
	        cart.removeItem(item5);

	        // Print the number of items in the cart
	        System.out.println("Number of items in the cart: " + cart.countItems());
	        // Display the items in the cart
	        System.out.println("Items in the cart:");
	        for (Item item : cart.getItems()) {
	            System.out.println("- " + item.getDescription() + ": $" + item.getPrice());
	        }
	        
	       
	}
	
	
}

	    
	    
	


