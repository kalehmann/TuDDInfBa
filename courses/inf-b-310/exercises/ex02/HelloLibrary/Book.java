public class Book {

	private String title;

	private boolean is_lent;

	public Book(String title) {
		this.is_lent = false;
		this.title = title;
	}

	public boolean isLent() {
		return this.is_lent;
	}

	public void loan() {
		this.is_lent = true;
	}

	public String toString() {
		return title;
	}
}
