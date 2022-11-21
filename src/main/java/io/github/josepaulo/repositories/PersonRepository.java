package io.github.josepaulo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.josepaulo.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {}