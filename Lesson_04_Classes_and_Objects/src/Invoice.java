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
		for(Item x: items) {
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
	
	

}
