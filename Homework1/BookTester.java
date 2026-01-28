// 

public class BookTester {
    public static void main(String[] args) {
        Book book1 = new Book("The Heart of The Betrayed", "Crime");
        Book book2 = new Book("One of a Kind", "Science Fiction");

        System.out.println(book1.getTitle());
        System.out.println(book2.getTitle());

        
        Book books[] = new Book[2];
        books[0] = book1;
        books[1] = book2;

        // IDK which loop you wanted me to use so I did both
        // For each loop
        for (Book book : books) {
            System.out.println(book.getTitle());
        }

        // For loop
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getTitle());
        }
    }
}