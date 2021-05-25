package com.learnspring.springwebapp.repositories;

import com.learnspring.springwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
