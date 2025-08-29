package models;

public class Book
{
    public String bookName;
    public String bookAuthor;
    public int bookNumPages;

    public String showBookData()
    {
        return "The book '" + bookName + "' was written by the author '"
                + bookAuthor + "' and had a total of " + bookNumPages + " pages.";
    }
}