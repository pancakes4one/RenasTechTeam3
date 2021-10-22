package Hamsa.classesAndsubclasses;

public class Book {
    public String title;
    public String author;
    public Double price;



    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
task1
create 3 class  book ,  Audiobook  ,PaperBook
    Audiobook should have
    title,author,price,length
    listen()
    tostring()

    PaperBook should have
    title,author,price,pages
    readBook()
    tostring()
 */




