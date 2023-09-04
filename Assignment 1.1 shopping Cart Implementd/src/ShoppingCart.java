import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public int countItems() {
        return this.items.size();
    }

    public double getTotalPrice() {
        double total = 0;
        for (Item item : this.items) {
            total += item.getPrice();
        }
        return total;
    }

	public ArrayList<Item> getItems() {
		// TODO Auto-generated method stub
		return  this.items ;
	}

	public void clear() {
		// TODO Auto-generated method stub
		 this.items.clear();
	}
}
