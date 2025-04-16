public class Library {
	private Book[] myBooks;
	private int number;

	public Library() {
		myBooks = new Book[10];
		number = 0;
		System.out.println("Hello, I am a small library for at most 10 books.");
	}

	public Book loan(String title) {
		for (Book book : myBooks) {
			if (book == null) {
				continue;
			}
			if (book.toString().equals(title) && !book.isLent()) {
				book.loan();

				return book;
			}
		}

		return null;
	}

	public void register(Book book) {
		myBooks[number] = book;
		number += 1;
		System.out.println("A new book is registered: " + book);
	}

	public boolean search(String title) {
		for (Book book : myBooks) {
			if (book != null && book.toString().equals(title)) {
				return true;
			}
		}

		return false;
	}
}
