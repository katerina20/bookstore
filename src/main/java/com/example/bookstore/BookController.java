package com.example.bookstore;

import com.example.bookstore.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collection;

@RestController
public class BookController {

    @GetMapping("/{id}")
    public Book findById(@PathVariable long id) {
        return new Book(1, "First");
    }

    @GetMapping("/")
    public Collection<Book> findBooks() {
        return Arrays.asList(new Book(1, "First"), new Book(2, "Second"));
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Book updateBook(
            @PathVariable("id") final long id, @RequestBody final Book book) {
        return new Book(id, book.getName());
    }
}
