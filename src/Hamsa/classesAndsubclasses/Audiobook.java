package Hamsa.classesAndsubclasses;

public class Audiobook extends Book{
 int length;

    public Audiobook(String title,String author,Double price,int length){
        this.title=title;
        this.author=author;
        this.price=price;
        this.length=length;
    }

    public void listen(){
        System.out.println("I do like to listen to Audiobook : "+title+" by - "+author+"--"+length+"hours");
    }


}

