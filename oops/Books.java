package oops;

public class Books {

	static int totalBooks;

	String title, author, isbn;

	boolean isBorrowed;

	static {
		totalBooks = 0;
	}
	{
		totalBooks++;
	}

	Books(String title, String author, String isbn) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}

	static int getTotalBoos(int totalBooks) {
		return totalBooks;
	}

	void borrowBook() {
		if (isBorrowed) {
			System.out.println("This book is already borrowed");
		} else {
			this.isBorrowed = true;
			System.out.println("enjoy " + this.title);
		}
	}

	void returnbook() {
		if (isBorrowed) {
			this.isBorrowed = false;
			System.out.println("hope you enjoyed, please leave a review");
		} else {
			System.out.println("This book is already in the library");
		}

	}

	public static void main(String[] args) {
		Books richDadPoorDad = new Books("richDadPoorDad", "samir", "01");
		Books PoorDad = new Books("PoorDad", "samir", "02");

		System.out.println(Books.getTotalBoos(totalBooks));
		PoorDad.borrowBook();
		PoorDad.returnbook();
		richDadPoorDad.borrowBook();
		System.out.println(Books.getTotalBoos(totalBooks));

	}

}
