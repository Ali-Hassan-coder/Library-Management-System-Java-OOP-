public class Book {

   private String title;
  private  String author;
  private  String isbn;
   private String publishingYear;

    public Book(String title, String author, String isbn, String publishingYear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publishingYear = publishingYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(String publishingYear) {
        this.publishingYear = publishingYear;
    }
}
public String toString(){
    return "Title:"+ title + "Author: "+author+"ISBN: "+isbn+"Publishing year: "+publishingYear;

}
