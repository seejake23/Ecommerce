package ecommerce;

public abstract class Product {

	private String name;
	private double price;
	private int quantity;

	
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// buy method to check if the item is in stock, if so, reduce the amount in stock
	public boolean buy() {
		if(this.quantity > 0) {
			this.quantity -= 1;
			return true;
		}
		else {
			return false;
		}	
	}
	//this is an abstract method from Products. It must be used in each child class, but use can be different for each child class.
	public abstract void getDetails();	
}
