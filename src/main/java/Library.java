import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    public Library(int capacity){
        this.stock = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int bookCount(){ return this.stock.size();}

    public void addBook(Book book){
        if (!stockFull())
        this.stock.add(book);}

    public boolean stockFull(){
        if (bookCount()>=capacity) {return true;}
        else return false;
    }
    public Book lendBook(){
        Book loanedBook = null;
        if(this.bookCount() > 0){
            loanedBook = this.stock.remove(0);}
        return loanedBook;}

}

