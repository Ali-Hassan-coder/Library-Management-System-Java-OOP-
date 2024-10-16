import Practice.Book;
import Practice.Library;

public class Main{

    public static void main(String[] args) {

        Library mylibrary = new Library();

            mylibrary.addBook(new Book("mocking Bird","jd salinger","12345",1945) ,0);
        mylibrary.addBook(new Book("sloth","jd salinger","12125",1945) ,1);
        mylibrary.addBook(new Book("alchemist","jd salinger","12342",1945) ,2);
        mylibrary.addBook(new Book("in a war","jd salinger","12145",1945) ,3);
        mylibrary.addBook(new Book("in the fire","jd salinger","464465",1945) ,4);


        mylibrary.printBooks();
        mylibrary.searchBookbyTitle("sloth");
        mylibrary.searchByIsbnBook("12145");
        mylibrary.removeBook(3);
        mylibrary.printBooks();


        }


    }


