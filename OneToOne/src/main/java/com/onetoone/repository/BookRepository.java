package com.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetoone.model.Book;

public interface BookRepository extends JpaRepository<Book,Long> {

}
