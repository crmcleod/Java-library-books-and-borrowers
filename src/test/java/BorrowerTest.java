import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Library library;
    Book book;
    Borrower borrower;

    @Before
    public void before(){
        library = new Library(5);
        book = new Book("Ash", "James Herbert", "Horror");
        borrower = new Borrower();
    }
    @Test
    public void startsWithEmptyCollection(){
        assertEquals(0, borrower.collectionCount());
    }
    @Test
    public void canAddBookToCollectionSufficientStock(){
        library.addBook(book);
        borrower.addBookToCollection(library);
        assertEquals(1, borrower.collectionCount());}

    @Test
    public void canAddBookToCollectionInsufficientStock(){
        library.addBook(book);
        borrower.addBookToCollection(library);
        borrower.addBookToCollection(library);
        borrower.addBookToCollection(library);
        assertEquals(1, borrower.collectionCount());}
}
