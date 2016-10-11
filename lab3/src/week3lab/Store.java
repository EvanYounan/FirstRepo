package week3lab;

public class Store {

	public static void main(String[] args) {
		Author[] DJSAuthors = new Author[2];
		DJSAuthors[0] = new Author("Russel", "Winder");
		DJSAuthors[1] = new Author("Graham", "Roberts");
		String bookOne = "Developing Java Software";
		String ISBNOne = "978-0470090251";
		int priceDJS = 7995;
		
		Book firstBook = new Book(bookOne, DJSAuthors, ISBNOne, priceDJS);
		System.out.println(firstBook);
		
		Author[] ACBTAuthors = new Author[1];
		ACBTAuthors[0] = new Author("Evan", "Younan");
		String bookTwo = "A Creative Book Title";
		String ISBNTwo = "978-0470090252";
		int priceACBT = 5695;
		
		Book secondBook = new Book(bookTwo, ACBTAuthors, ISBNTwo, priceACBT);
		System.out.println(secondBook);
	}
}
