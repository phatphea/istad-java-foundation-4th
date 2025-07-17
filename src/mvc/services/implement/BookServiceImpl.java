package mvc.services.implement;

import mvc.controller.dto.BookDetailsRespone;
import mvc.controller.dto.BookRequest;
import mvc.controller.dto.BookResponse;
import mvc.model.Book;
import mvc.repository.BookRepository;
import mvc.services.BookServices;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookServices {

    static int bookId = 1;
    private BookRepository bookRepository = new BookRepository();

    @Override
    public void createBook(BookRequest bookRequest) {
        Book book = new Book();
        book.setBookId(bookId);
        book.setTitle(bookRequest.title());
        book.setAuthor(bookRequest.author());

        bookRepository.save(book);
        bookId++;
    }

    @Override
    public BookDetailsRespone getBookByBookId(int bookId) {

        Book book = bookRepository.getById(bookId);

        BookDetailsRespone bookDetailsRespone = new BookDetailsRespone(
                book.getBookId(),
                book.getTitle(),
                book.getAuthor()
        );

        return bookDetailsRespone;
    }

    @Override
    public List<BookResponse> getAllBooks() {

        List<Book> books = bookRepository.getAllBook();
        List<BookResponse> bookResponses = new ArrayList<>();

        for(int i=0; i<books.size(); i++){
            BookResponse bookResponse = new BookResponse(
                    books.get(i).getTitle(),
                    books.get(i).getAuthor()
            );
            bookResponses.add(bookResponse);
        }

        return bookResponses;
    }
}
