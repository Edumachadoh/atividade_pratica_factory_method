public class Magazine extends LibraryItem{
    String firstItem;

    public Magazine(String title, String author, int publicationYear, String firstItem) {
       super(title, author, publicationYear);
       this.firstItem = firstItem;
    }

    @Override
    public void borrow() {
        System.out.println("Borrow magazine");
    }

    @Override
    public void returnItem() {
         System.out.println("Return magazine");
    }

    @Override
    public void showInfo() {
       System.out.println("Title: " + this.title + "\nAuthor: " + this.author  + "\n" + //
                        "Publication year: " + this.publicationYear +"\nFirst item: " + this.firstItem);
    }
}
