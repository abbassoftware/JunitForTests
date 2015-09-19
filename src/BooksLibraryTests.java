
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BooksLibraryTests {


    private BooksLibrary booksLibrary = null; 

    //@Before
    public void setup() {
        booksLibrary = new BooksLibrary();
        
        Book book1 = new Book();
        book1.setIsbn("1338029991");
        book1.setTitle("Harry Potter");
        book1.setAuthor("Scholastic");
        book1.setQuantity(1);
        
        Book book2 = new Book();
        book2.setIsbn("0312510780");
        book2.setTitle("First 100 Words");
        book2.setAuthor("Roger");
        book2.setQuantity(4);
        
        Book book3 = new Book();
        book3.setIsbn("1607747308");
        book3.setTitle("The Life-Changing Magic of Tidying Up");
        book3.setAuthor("Marie");
        book3.setQuantity(2);
        
        booksLibrary.addBook(book1);
        booksLibrary.addBook(book2);
        booksLibrary.addBook(book3);
    }
    
    @Test
    public void testAddingABookToLibrary() {
       Book book = new Book();
       book.setIsbn("1338029991");
       book.setTitle("Harry Potter");
       book.setAuthor("Scholastic");
       book.setQuantity(1);
       
       BooksLibrary booksLibrary = new BooksLibrary();
       booksLibrary.addBook(book);
       assertEquals(booksLibrary.size(), 1);
    }
    
    

    //@Test
    public void testFindBookFromLibrary() {
        Book book = booksLibrary.findBook("1607747308");
        assertNotNull(book);
        assertEquals(book.getQuantity(), 2);

    }

    //@Test
    public void testFindBookWithMaximumQuantity() {
        Book book = booksLibrary.findBookWithMaximumQuantity();
        assertNotNull(book);
        assertEquals(book.getIsbn(), "0312510780");
    }
    
    //@Test
    public void testAddingBookWithNegativeQuantity1() {
        try {
            Book book = new Book();
            book.setIsbn("1338029992");
            book.setTitle("Harry Potter 2");
            book.setAuthor("Scholastic");
            book.setQuantity(-1);
            booksLibrary.addBook(book);
            fail("Should have got an UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Pass - UnsupportedOperationException is expected.
        }

    }

    //@Test(expected = UnsupportedOperationException.class)
    public void testAddingBookWithNegativeQuantity2() {
        Book book = new Book();
        book.setIsbn("1338029992");
        book.setTitle("Harry Potter 2");
        book.setAuthor("Scholastic");
        book.setQuantity(-1);
        booksLibrary.addBook(book);
    }

    
    //@After
    public void cleanup() {
        booksLibrary = null;
    }
}
