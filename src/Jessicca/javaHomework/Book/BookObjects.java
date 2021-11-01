package Jessicca.javaHomework.Book;

public class BookObjects {
    public static void main(String[] args) {
        Audiobook audiobook1=new Audiobook ("The Beauty and the Beast",
                "Gabrielle-Suzanne Barbot de Villinueve", 14.99, 352);

        audiobook1.listen();
        System.out.println(audiobook1);
        System.out.println();

        Paperbook paperbook1=new Paperbook("To Kill a Mockingbird",
                "Harper Lee", 8.97, 281);


        paperbook1.readBook();
        System.out.println(paperbook1);

    }
}
