package mvc.repository;

import mvc.controller.dto.BookResponse;
import mvc.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    //Crud : Create, Read, Update, Delete
    static List<Book> books = new ArrayList<>();

    public void save(Book book){
        books.add(book);
    }

    public void saveAll(List<Book> book){
        books.addAll(book);
    }

    public void delete(int bookId){
        books.removeIf(book -> book.getBookId() == bookId);
    }

    public Book getById(int bookId){

        for(var book : books){
            if(book.getBookId() == bookId){
                return book;
            }
        }

        return null;
    }

    public List<Book> getAllBook(){
        return books;
    }

}
