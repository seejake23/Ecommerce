package ecommerce;

public class Bath extends Product{

	public Bath(String name, double price, int quantity) {
		super(name, price, quantity);
	}

	@Override
	public void getDetails() {
		System.out.println("We sell organic bath products!");
	}
}
