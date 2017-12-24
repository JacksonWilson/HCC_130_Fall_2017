package labs.lab17b;

public class Driver {
    public static void main(String[] args) {
        Book book1 = new Book("Ender\'s Game", "Card", 226, "Tor Books", true);
        Book book2 = new Book("A Spell for Chameleon", "Anthony", 344, "Ballantine Books & Del Rey", true);
        Book book3 = new Book("Infinity and the Mind", "Rucker", 342, "Birkhauser", false);
        
        Library library1 = new Library("Smith", "Normal", "Normal Public Library", book1, book2, book3);
        Library library2 = new Library("Jones", "Bloomington", "Bloomington Public Library", book1, book2, book3);

        LibraryPartnership libraryPartnership = new LibraryPartnership("Williams", library1, library2);

        System.out.println("Library Partnership information");
        System.out.println("-------------------------------");
        libraryPartnership.display();

        libraryPartnership.getLibrary1().getBook1().setIsCheckedOut(false);
        
        System.out.println("Book 1 of Library 1 status changed to:");
        System.out.println("--------------------------------------");
        libraryPartnership.getLibrary1().getBook1().display();
    }
}