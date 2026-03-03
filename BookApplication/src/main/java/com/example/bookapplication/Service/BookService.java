package com.example.bookapplication.Service;

import com.example.bookapplication.Entity.Book;
import com.example.bookapplication.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService  {
    @Autowired
    BookRepository bookRepository;
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public Book getBookByTitle(String bookName) {
        return bookRepository.findBookByTitle(bookName);
    }

    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBookById(Integer bookId) {
        bookRepository.deleteById(bookId);
    }
}
