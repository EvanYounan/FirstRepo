package week3lab;

import java.math.BigDecimal;

public class Book {

	private String bookTitle = "";
	private Author[] authors;
	private String ISBN = "";
	private int price = 0;
	
	Book(String title, Author[] auths, String ISBN, int price) {
		this.bookTitle = title;
		this.authors = auths;
		this.ISBN = ISBN;
		this.price = price;
	}
	
	public String getTitle() {
		return this.bookTitle;
	}
	
	public Author[] getAuthors() {
		return this.authors;
	}
	
	public String getISBN() {
		return this.ISBN;
	}
	
	public int getPrice() {
		return this.price;
	}

	public void setTitle(String newTitle) {
		this.bookTitle = newTitle;
	}
	
	public void setAuthors(Author[] newAuthors) {
		this.authors = newAuthors;
	}
	
	public void setISBN(String newISBN) {
		this.ISBN = newISBN;
	}
	
	public void setPrice(int newPrice) {
		this.price = newPrice;
	}
	
	public String toString() 
	{
		BigDecimal payment = new BigDecimal(this.price).movePointLeft(2);
		String finalString = this.bookTitle + " (" + this.ISBN + ", $" + payment + ", by ";
		for (int i = 0; i < authors.length; i++) 
		{
			if (i == authors.length-1) {
				finalString += authors[i];
			}
			else {
				finalString += authors[i] + " and ";
			}
		}
		finalString += ".";
		return finalString;
	}

}
