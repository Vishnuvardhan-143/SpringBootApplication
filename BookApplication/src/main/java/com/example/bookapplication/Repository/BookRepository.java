package com.example.bookapplication.Repository;

import com.example.bookapplication.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
    public Book findBookByTitle(String title);
}
