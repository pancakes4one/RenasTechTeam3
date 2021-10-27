package Jessicca.homework.Book;

public class Book {

    /*
task1
create 3 class  book ,  Audiobook  ,PaperBook
    tostring()
 */

        public String title;
        public String author;
        public double price;
        public int pages;

        public String toString() {
                return "Book" + "\n" + "{ " +
                        "Title = " + title + "\n" +
                        "Author = " + author + "\n" +
                        "Price = $" + price + "\n" +
                        "Length = " + pages + " pages }" ;
        }


}
