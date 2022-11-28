package io.github.josepaulo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.josepaulo.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	

}
