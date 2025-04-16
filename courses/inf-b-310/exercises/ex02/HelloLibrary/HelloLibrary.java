public class HelloLibrary {
	public static void main(String[] args) {
	    Library lib = new Library();
	    Book b1 = new Book("Das Buch");
	    Book b2 = new Book("Das Buch - die Fortsetzung");

	    lib.register(b1);
	    lib.register(b2);
	}
}
