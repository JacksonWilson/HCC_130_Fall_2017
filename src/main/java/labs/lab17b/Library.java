package labs.lab17b;

public class Library implements Displayable {
    private String director;
    private String town;
    private String name;
    private Book book1;
    private Book book2;
    private Book book3;

    public Library(String director, String town, String name, Book book1, Book book2, Book book3) {
        this.director = director;
        this.town = town;
        this.name = name;
        this.book1 = book1;
        this.book2 = book2;
        this.book3 = book3;
    }

    public Book getBook1() {
        return book1;
    }

    public Book getBook2() {
        return book2;
    }

    public Book getBook3() {
        return book3;
    }

	@Override
	public void display() {
        System.out.println("Director:\t" + director);
        System.out.println("Town:\t" + town);
        System.out.println("Name:\t" + name);

        System.out.println("\nBook 1 information");
        System.out.println("------------------");
        getBook1().display();
        System.out.println("\nBook 2 information");
        System.out.println("------------------");
        getBook2().display();
        System.out.println("\nBook 3 information");
        System.out.println("------------------");
        getBook3().display();
	}
}