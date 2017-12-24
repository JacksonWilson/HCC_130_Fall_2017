package labs.lab30;

public class Book {
    private String title;
    private String isbn;
    private String[] chapterTitles;

    public Book(String title, String isbn, String[] chapterTitles) {
        this.title = title;
        this.isbn = isbn;
        this.chapterTitles = chapterTitles;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String[] getChapterTitles() {
        return chapterTitles;
    }

    public void setChapterTitles(String[] chapterTitles) {
        this.chapterTitles = chapterTitles;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Title: ")
        .append(title)
        .append(" ISBN: ")
        .append(isbn)
        .append(" Chapters:\n");
        for (String ct : chapterTitles) {
            sb.append("\t");
            sb.append(ct);
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Book) && isbn.equals(((Book)obj).isbn);
    }
}