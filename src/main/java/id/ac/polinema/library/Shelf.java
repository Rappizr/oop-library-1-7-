package id.ac.polinema.library;

public class Shelf {
    private Book[] books;
    private int bookCount;

    public Shelf(){
        this.books = new Book[5];
        this.bookCount = 0;
    }

    public int getBookCount(){
        return bookCount;
    }

    public boolean addBook(Book book){
        if (book == null || bookCount >= 5) {
            return false;
        }
        books[bookCount++] = book;
        return true;
    }

    public Book findByIsbn(String isbn){
        if (isbn == null) return null;
        for (int i = 0; i < bookCount; i++) {
            if (books[i] != null && isbn.equals(books[i].getIsbn())) {
                return books[i];
            }
        }
        return null;
    }

    public int countAvailable(){
        int count = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i] != null && books[i].isAvailable()) {
                count++;
            }
        }
        return count;
    }
}
