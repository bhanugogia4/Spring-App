package com.learnspring.springwebapp.repositories;

import com.learnspring.springwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
