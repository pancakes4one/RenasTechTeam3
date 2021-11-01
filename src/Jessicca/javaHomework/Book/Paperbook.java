package Jessicca.javaHomework.Book;

public class Paperbook extends Book{
    /*
        PaperBook should have
    title,author,price,pages
    readBook()
     */

    public Paperbook(String title, String author, double price, int pages){
        this.title=title;
        this.author=author;
        this.price=price;
        this.pages=pages;
    }

    public void readBook(){
        System.out.println("Currently reading paper book "+title+" by "+author);
    }
}
