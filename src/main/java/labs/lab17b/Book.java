package labs.lab17b;

public class Book implements Displayable {
    private String title;
    private String author;
    private int numPages;
    private String publisher;
    private boolean isCheckedOut;

    public Book(String title, String author, int numPages, String publisher, boolean isCheckedOut) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        this.publisher = publisher;
        this.isCheckedOut = isCheckedOut;
    }

    public void setIsCheckedOut(boolean isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
    }

	@Override
	public void display() {
        System.out.println("Title:\t" + title);
        System.out.println("Author:\t" + author);
        System.out.println("Pages:\t" + numPages);
        System.out.println("Publisher:\t" + publisher);
        System.out.println("Checked out:\t" + isCheckedOut);
	}
}