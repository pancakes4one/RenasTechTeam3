package Hamsa.classesAndsubclasses;




public class BookObject {
    public static void main(String[] args) {

        Audiobook audioBook1 = new Audiobook("Learn Java","Timothy C. Needham",17.99,9);
        PaperBook paperBook1 = new PaperBook("Learn Java the Easy Way","Bryson Payne ",29.95,500);
        System.out.println(audioBook1);
        audioBook1.listen();
        System.out.println(paperBook1);
        paperBook1.readBook();
    }
}