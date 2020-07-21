import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<Book>();}

    public int collectionCount(){
        return this.collection.size();}

    public void addBookToCollection(Library library){
        if(library.bookCount() > 0){
            Book bookLoaned = library.lendBook();
            this.collection.add(bookLoaned);
        }
    }
}
