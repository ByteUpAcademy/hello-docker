package br.com.byteup.hellodocker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.byteup.hellodocker.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
