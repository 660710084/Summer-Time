package Encapsulation1.BookRecord.BookRecord5;

import java.util.ArrayList;

class Book{

    public String isbn;
    public String title;
    public String type;
    public double price;
    public ArrayList<Book> books = new ArrayList<>();

    Book(String isbn, String title, String tpye, double price){
        
        this.isbn = isbn;
        this.title = title;
        this.type = tpye;
        this.price = price;
        
    }

}

public class BookStore {

    ArrayList<Book> books = new ArrayList<Book>();

    void addBook(String isbn, String title, String tpye, double price){

        books.add(new Book(isbn, title, tpye, price));
        
    }
     
}