public class Library {
    Book[] books;

    public Library(Book[] books) {
        Book[] books = new Book[books.length];
    }
    public void addBook(Book book, int index) {
        if(index<=books.length && index>=0) {
            books[index] = book;
        }
    }
    public void printBooks() {
        for(Book book : books) {
            System.out.println(book);
        }
    }
}
