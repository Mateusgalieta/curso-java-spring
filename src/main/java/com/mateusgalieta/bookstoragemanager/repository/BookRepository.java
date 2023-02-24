package com.mateusgalieta.bookstoragemanager.repository;

import com.mateusgalieta.bookstoragemanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
