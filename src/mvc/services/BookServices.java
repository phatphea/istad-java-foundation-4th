package mvc.services;

import mvc.controller.dto.BookDetailsRespone;
import mvc.controller.dto.BookRequest;
import mvc.controller.dto.BookResponse;

import java.util.List;

public interface BookServices {

    void createBook(BookRequest bookRequest);

    BookDetailsRespone getBookByBookId(int bookId);

    List<BookResponse> getAllBooks();
}
