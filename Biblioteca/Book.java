public class Book extends LibraryItem{
    int numPages;

    public Book(String title, String author, int publicationYear, int numPages) {
       super(title, author, publicationYear);
       this.numPages = numPages;
    }

    @Override
    public void borrow() {
        System.out.println("Borrow book");
    }

    @Override
    public void returnItem() {
        System.out.println("Return book");
    }

	@Override
	public void showInfo() {
		System.out.println("Title: " + this.title + "\nAuthor: " + this.author  + "\n" + //
                        "Publication year: " + this.publicationYear +"\nNum pages: " + this.numPages);
	}
}
