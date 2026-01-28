public class Book {
    /** Title of the book */
    private String title;
    /** Genre of the book */
    private String genre;


    /**
     * Creates a new Book object with the specified title and genre.
     * 
     * @param title The title of the book
     * @param genre The genre of the book
     */
    public Book(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    /** 
     * Gets the title of the book
     * 
     * @return The title of the book
     */
    public String getTitle() {
        return title;
    }
}