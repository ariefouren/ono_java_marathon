
public class Item {
	private String name;
	private double price;
	
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void giveDiscount(double discountRate)
	{
		price = price*(1 - discountRate); 
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return String.format(" name = %15s, price = %10.2f\n", name, price);
	}
	
	
	
	
	

}
