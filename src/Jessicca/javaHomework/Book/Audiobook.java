package Jessicca.javaHomework.Book;

public class Audiobook extends Book {
//    Audiobook should have
//            title,author,price,length
//    listen()
//    tostring()


    public Audiobook(String title, String author, double price, int pages) {
        this.title= title;
        this.author= author;
        this.price= price;
        this.pages= pages;
    }
    public void listen(){
        System.out.println("Currently listening to audiobook "+title+" by "+author);
    }

}
