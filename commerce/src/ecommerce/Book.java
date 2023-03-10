package ecommerce;

public class Book extends Product {

	String author; 
	String genre;
	String isbn;
	
	public Book(String name, double price, int quantity, String author) {
		super(name, price, quantity);
		this.author = author;
	}
	
	public Book(String name, double price, int quantity, String author, String genre, String isbn) {
		super(name, price, quantity);
		this.author = author;
		this.genre = genre;
		this.isbn = isbn;
	}

	@Override
	public void getDetails() {
		System.out.println("We sell books on Software Development!");
	}
	
	
}
