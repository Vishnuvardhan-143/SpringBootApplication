package com.example.bookapplication.Controller;

import com.example.bookapplication.Entity.Book;
import com.example.bookapplication.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book/v1")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        final Book savedBook = bookService.addBook(book);
        return ResponseEntity.ok(savedBook);
    }

    @GetMapping("/getBook/{bookName}")
    public ResponseEntity<Book> getBookByName(@PathVariable String bookName) {
        final Book bookByName = bookService.getBookByTitle(bookName);
        return ResponseEntity.ok(bookByName);
    }

    @PutMapping("/updateBook")
    public ResponseEntity<Book> updateBook(@RequestBody Book book) {
        final Book updatedBook = bookService.updateBook(book);
        return ResponseEntity.ok(updatedBook);
    }

    @DeleteMapping("/deleteBook/{bookId}")
    public ResponseEntity<Book> deleteBook(@PathVariable Integer bookId) {
        bookService.deleteBookById(bookId);
        return ResponseEntity.ok().build();
    }
}
