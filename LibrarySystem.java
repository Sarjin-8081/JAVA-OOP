interface LibraryItem {
    String getTitle();
    String getAuthor();
    int getYear();
    boolean isAvailable();
}

class Book implements LibraryItem {
    private String title;
    private String author;
    private int year;
    private boolean available;

    Book(String title, String author, int year, boolean available) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = available;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem book1 = new Book("Atomic Habits", "James Clear", 2018, true);

        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Year: " + book1.getYear());
        System.out.println("Available: " + (book1.isAvailable() ? "Yes" : "No"));
    }
}
