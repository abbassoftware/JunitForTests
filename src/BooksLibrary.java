import java.util.ArrayList;
import java.util.List;

public class BooksLibrary {

    private List<Book> books = new ArrayList<Book>();

    /**
     * This method adds a book to the book library.
     * @param book
     */
    public void addBook(Book book) {
        if (book.getIsbn() == null || book.getTitle() == null || book.getAuthor() == null || book.getQuantity() <= 0) {
            throw new UnsupportedOperationException();
        }
        books.add(book);
    }

    /**
     * This method finds a book with a given ISBN.
     * @param isbn
     * @return - Book if it exists in the library or else null
     */
    public Book findBook(String isbn) {
        Book returnBook = null;
        for (int i = 0; i < books.size(); i++) {
            if (isbn.equalsIgnoreCase(books.get(i).getIsbn())) {
                returnBook = books.get(i);
            }
        }
        return returnBook;

    }

    /**
     * This function finds the book with maximum quantity.
     * @return - The book which has maximum quantity.
     */
    public Book findBookWithMaximumQuantity() {
        Book returnBook = books.get(0);
        for (int i = 1; i < books.size(); i++) {
            if (returnBook.getQuantity() < books.get(i).getQuantity()) {
                returnBook = books.get(i);
            }
        }
        return returnBook;
    }
    
    /**
     * @return - The number of book in the library.
     */
    public int size() {
        return books.size();
    }

}
