package run;
import models.Book;

public class BookDescription {
    public static void main(String[] args) {

        Book book = new Book();

        book.bookNumPages = 403;
        book.bookAuthor = "Gloria Elena Espinoza";
        book.bookName = "La casa de los Mondragon";

        System.out.println("Showing a Book Description");

        System.out.println(book.showBookData());
    }

}
