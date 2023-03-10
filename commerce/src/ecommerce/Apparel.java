package ecommerce;

public class Apparel extends Product {

	char size;
	String color;
	
	public Apparel(String name, double price, int quantity, char size, String color) {
		super(name, price, quantity);
		this.size = size;
		this.color = color;
	}

	@Override
	public void getDetails() {
		System.out.println("We sell differnt kinds of business clothes for both men and women.");
		
	}
	
	
	
	
	
}
