public abstract class LibraryItem implements IBorrowable{
    String title;
    String author;
    int publicationYear;

    public LibraryItem(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

   
}
 