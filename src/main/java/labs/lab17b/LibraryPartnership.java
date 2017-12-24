package labs.lab17b;

public class LibraryPartnership implements Displayable {
    private String director;
    private Library library1;
    private Library library2;

    public LibraryPartnership(String director, Library library1, Library library2) {
        this.director = director;
        this.library1 = library1;
        this.library2 = library2;
    }

    public Library getLibrary1() {
        return library1;
    }

    public Library getLibrary2() {
        return library2;
    }
    
	@Override
	public void display() {
        System.out.println("Director: Williams");
        System.out.println("\nLibrary 1 information");
        System.out.println("---------------------");
        library1.display();
        System.out.println("\nLibrary 2 information");
        System.out.println("---------------------");
        library2.display();
	}
}