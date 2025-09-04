public class Digitalmedia extends LibraryItem{
    String size;

     public Digitalmedia(String title, String author, int publicationYear, String size) {
       super(title, author, publicationYear);
       this.size = size;
    }

    @Override
    public void borrow() {
         System.out.println("Borrow digital media");
    }

    @Override
    public void returnItem() {
          System.out.println("Return digital media");
    }

    @Override
    public void showInfo() {
        System.out.println("Title: " + this.title + "\nAuthor: " + this.author  + "\n" + //
                        "Publication year: " + this.publicationYear +"\nSize: " + this.size);
    }
}
