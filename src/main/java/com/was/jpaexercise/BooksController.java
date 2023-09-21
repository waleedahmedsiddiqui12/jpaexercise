package com.was.jpaexercise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("books")
public class BooksController {

@Autowired
private IBooksRepository _booksRepository;
 
     //Retrieve all books.
     @GetMapping("")
     public List<Books> GetAllBooks()
     {
        return _booksRepository.findAll();
        
     }

     //Retrieve a book by its ID.
     @GetMapping("/{id}")
     public Books GetBookById(@PathVariable long id)
     {
        return _booksRepository.getReferenceById(id);
     }

     //Add a new book.
     @PostMapping("add")
     public Books AddBook(@RequestBody Books t)
     {
        return _booksRepository.save(t);
     }

     //Update book information (title, author, or publication year).
     @PutMapping("Update")
     public Books UpdateTeam(@RequestBody Books t)
     {
         return _booksRepository.save(t);
     }
 
     //Remove a book by its ID.
     @DeleteMapping("delete/{id}")
     public String DeleteTeam(@PathVariable Long t)
     {
          _booksRepository.deleteById(t);
          return "Item Deleted";
     }





}
