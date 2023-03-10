 package ecommerce;

import java.util.Scanner;

public class Shop {

	static Product[] inventory = {
			new Apparel("Business Ritual Woman's Long Sleeve Top", 65.39, 4, 'L', "Blue"),
			new Book("The Art of Computer Programming", 190.54, 9, "Donald E. Knuth"),
			new Apparel("Men's Business Casual Shirt", 57.10, 2, 'M', "Teal"),
			new Bath("Organic Tumeric Soap", 11.25, 1),
			new Book("Head First Design Pattern", 37.35, 3, "Eric Freeman") };

	static double totalAmount = 0.0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userInput;
		do {
			displayMenu();
			userInput = sc.nextInt();
			if (userInput >= 0 && userInput <= 4) {
				if (inventory[userInput].buy()) {
					System.out.println("Your purchase was sucessful.");
					totalAmount += inventory[userInput].getPrice();
				} else {
					System.out.println("Sorry!! This product is out of stock.");
				}
			}
		} while (userInput >= 0 && userInput <= 4);
		System.out.println("Thank you for shopping with us! The total amount is " + totalAmount);

		sc.close();
	}

	static void displayMenu() {
		System.out.println(
				"\nEnter the product index (0 to 4) you want to buy. To exit the shapping cart, enter any number other than 0 to 4.");
		for (int i = 0; i < inventory.length; i++) {
			System.out.println(i + " " + inventory[i].getName());
		}
	}

}
