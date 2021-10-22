package Hamsa.classesAndsubclasses;

public class PaperBook extends Book{

    int pages;

    public PaperBook(String title,String author,Double price,int pages){
        this.title=title;
        this.author=author;
        this.price=price;
        this.pages=pages;
    }

    public void readBook(){
        System.out.println("the book I am reading is : "+title+" by - "+author+" has "+pages+" pages");
    }

}
