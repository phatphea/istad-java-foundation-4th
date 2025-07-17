package mvc.controller;

import mvc.controller.dto.BookDetailsRespone;
import mvc.controller.dto.BookRequest;
import mvc.controller.dto.BookResponse;
import mvc.model.Book;
import mvc.services.BookServices;
import mvc.services.implement.BookServiceImpl;

import java.util.List;
import java.util.Scanner;

public class BookController {

    static BookServices bookServices = new BookServiceImpl();

    public static void createBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Book Author: ");
        String author = scanner.nextLine();
        bookServices.createBook(new BookRequest(title, author));
    }

    public static void getById(int bookId){
        BookDetailsRespone book = bookServices.getBookByBookId(bookId);
        System.out.println(book.title());
        System.out.println(book.author());
        System.out.println("===========================");
    }

    public static void getAll(){
        List<BookResponse> bookResponseList = bookServices.getAllBooks();
        for(var book : bookResponseList){
            System.out.println(book.title());
            System.out.println(book.author());
            System.out.println("===========================");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

       a: while (true){
            System.out.print("Enter option (1-create book, 2-get all book, 3-get by id): ");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    createBook();
                    break;
                case 2:
                    getAll();
                    break;
                case 3:
                    System.out.println("Enter Id: ");
                    int id = scanner.nextInt();
                    getById(id);
                default:
                    break a;
            }
        }
    }
}
