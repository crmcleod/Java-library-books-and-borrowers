import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;

    @Before
    public void before() {
        library = new Library(5);
        book1 = new Book("The colour of magic", "Terry Pratchett", "Fantasy");
        book2 = new Book("Nobody True", "James Herbert", "Horror");
        book3 = new Book("The Bridge", "Iain Banks", "Thriller");
        book4 = new Book("House of Leaves", "Mark Danielewski", "Horror");
        book5 = new Book("The Green Mile", "Stephen King", "Fantasy");
    }

    @Test
    public void bookCountStartsEmpty() {
        assertEquals(0, library.bookCount());}
    @Test
    public void canAddBookToLibrary(){
        library.addBook(book1);
        assertEquals(1, library.bookCount());}
    @Test
    public void checkIfStockFullFalse(){
        assertEquals(false, library.stockFull());
    }
    @Test
    public void checkIfStockFullTrue(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        assertEquals(true, library.stockFull());
    }

}