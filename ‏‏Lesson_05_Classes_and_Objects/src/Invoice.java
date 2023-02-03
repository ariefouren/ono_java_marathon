import java.util.ArrayList;

public class Invoice {
	
	private int invoiceNumber;
	private ArrayList<Item> items;
	
	public Invoice(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
		this.items = new ArrayList<Item>();
	}
	
	public void addItem(Item item)
	{
		items.add(item);
	}
	
	public double totalPrice()
	{
		double totalPrice = 0;
		for(Item x: items) 
		{
			totalPrice += x.getPrice();
		}
		return totalPrice;
		
	}
	
	public int numberOfItems()
	{
		return items.size();
	}
	
	public double averagePrice()
	{
		double averagePrice = 0;
		if(numberOfItems() != 0)
		{
			averagePrice = totalPrice()/ numberOfItems();
		}
		else
		{
			averagePrice = 0;
		}
		return averagePrice;
		
	}
	
	public Item find(String itemName)
	{
		for(Item x: items)
		{
			if(x.getName().equals(itemName))// x.getName() == itemName ?
			{
				return x;
			}
		}
		return null;
	}
	
	public void giveDiscount(String name, double discountRate)
	{
		Item x = find(name);
		if(x != null)
		{
			x.giveDiscount(discountRate);
		}
	}
	
	public void giveDiscount(double minPrice, double discountRate)
	{
		for(Item x: items)
		{
			if(x.getPrice() > minPrice)
			{
				x.giveDiscount(discountRate);
			}
		}
	}

	@Override
	public String toString() {
		
		String str = String.format("Invoice number: %7d\n", invoiceNumber);
		for(Item x: items)
		{
			str += x.toString();
		}
		
		str += String.format("Total price:        %7.2f\n", totalPrice());
		str += String.format("Number of items:    %7d\n", numberOfItems());
		str += String.format("Average price:      %7.2f\n", averagePrice());
				
		return str; 
	}
	
	

}
